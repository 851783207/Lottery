package com.example.demo;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/lottery")
public class lottery {
    @Resource
    private com.example.demo.dao.lotteryMapper lotteryMapper;
    @Resource
    private com.example.demo.dao.CardMapper cardMapper;
    @PostMapping("/lottery")
    public ResultVO lottery1(String name, String id){
        // 校验状态
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("姓名不能为空");
        }
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("奖品不能为空");
        }

        Lottery_en existingLottery = lotteryMapper.selectOne(
                new LambdaQueryWrapper<Lottery_en>()
                        .eq(Lottery_en::getName, name));

        if (existingLottery != null) {
            throw new RuntimeException("用户已存在");
        }
        Card card = cardMapper.selectOne(
                new LambdaQueryWrapper<Card>()
                        .eq(Card::getId, id));
        // 存储奖品信息
        Lottery_en lottery_en = new Lottery_en();
        lottery_en.setName(name.trim());
        lottery_en.setItem(card.getName());
        lotteryMapper.insert(lottery_en);
        // 修改卡片状态
        cardMapper.changeStatus(id);
        return ResultVO.success("恭喜抽中"+lottery_en.getItem());
    }

    @GetMapping("/getCard")
    public List<Card> getCard() {
        List<Card> cardList = cardMapper.getAll();
        return cardList;
    }
}
