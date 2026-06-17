package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ExportPurchaseResp extends PurchaseReqListResp {
    /**
     * 归口评估人
     */
    private String updateUserId;
    /**
     * 归口评估时间
     */
    private Date updateDate;
    /**
     * 评估意见
     */
    private String solution;
    /**
     * 放行执行人
     */
    private String releasePerson;
    /**
     * 关联采购单
     */
    private String orderNo;
}
