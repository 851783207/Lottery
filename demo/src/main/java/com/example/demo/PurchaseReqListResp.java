package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class PurchaseReqListResp {
    /**
     * 采购申请行ID
     */
    private String purReqDetailId;
    /**
     * 采购申请单号
     */
    private String oddNumber;

    /**
     * 处理状态  0待受理 1待处理 2部分处理3 已处理 4已转自采 9已关闭
     */
    private String processingStatus;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 法人主体
     */
    private String legalCode;

    /**
     * 物料编码
     */
    private String itemCode;

    /**
     * 采购内容
     */
    private String itemName;

    /**
     * 规格型号
     */
    private String spec;

    /**
     * 是否加急 1否 2是
     */
    private Integer ifExpress;

    /**
     * 品类
     */
    private String categoryName;
    /**
     * 采购品类id
     */
    private Long categoryId;
    /**
     * 采购品类类型
     */
    private String categoryType;

    /**
     * 申请数量
     */
    private Double applyQty;

    /**
     * 单位
     */
    private String unit;
    /**
     * 库存总量
     */
    private String zkczl;
    /**
     * 申请单价
     */
    private Double preis;

    /**
     * 申请金额 （申请单价*申请数量）
     */
    private BigDecimal totalAmount;
    /**
     * 币种
     */
    private String currency;
    /**
     * 已采数量
     */
    private Double changeQTY;
    /**
     * 已采金额
     */
    private String amountConvertedToOrder;
    /**
     * 期望到货日期
     */
    private Date needDate;
    /**
     * 采购原因
     */
    private String buyReason;
    /**
     * 需求备注
     */
    private String detailRemark;

    /**
     * 收货地点
     */
    private String receiveAddress;

    /**
     * 详细地址
     */
    private String receiveAddressDesc;
    /**
     * 使用人
     */
    private String demander;
    /**
     * 使用部门
     */
    private String department;
    /**
     * 需求提报人
     */
    private String userName;
    /**
     * 需求提报日期
     */
    private Date commitDate;
    /**
     * 寻源编号
     */
    private String sourcingProjectNo;
    /**
     * 寻源标识
     */
    private String usedSystem;
    /**
     * 来源需求单
     */
    private String planNo;
    /**
     * 归口评估（是否存在） 1否 2是
     */
    private Integer belongEvaluation;

    /**
     * 放行原因
     */
    private String releaseReason;
    /**
     * 采购执行人员
     */
    private String purchasingExecutive;
    /**
     * 0.未转交 1.转交中
     */
    private Integer transferState;
    /**
     * 转交人工号
     */
    private String transferorCode;
    /**
     * 被转交人
     */
    private String transfereeCode;
    /**
     * 权限工号列表
     */
    private List<String> codeList;
    /**
     * 是否为转交管理员 1否 2是
     */
    private Integer isTransmitAdministrator;
    /**
     * 拟定中采购订单数量
     */
    private Integer DraftOrderNum;
}
