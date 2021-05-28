/**
 * 
 */
package com.neml.imsapp.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Data
public class WithdrawalDetailsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String wdtlTxnNo;
	
	private Timestamp wdtlTxnDate;
	
	private String wdtlTxnStatus;
	
	private String wdtlTxnType;
	
	private String wdtlWdrHeaderTxnNo;
	
	private String wdtlStateCode;
	
	private String wdtlWhCode;
	
	private String wdtlCommodityCode;
	
	private String wdtlClientCode;
	
	private String wdtlSeasonId;
	
	private String wdtlUom;
	
	private String wdtlInvtType;
	
	private String wdtlStockType;
	
	private String wdtlMode;
	
	private String wdtlType;
	
	private String wdtlPurposeCode;
	
	private String wdtlPurposeDetailNo;
	
	private String wdtlWithdrawerId;
	
	private String wdtlBhTxn;
	
	private String wdtlBdTxn;
	
	private String wdtlInvtDetailNo;
	
	private String wdtlPackType;
	
	private BigDecimal wdtlQuantity;
	
	private long wdtlBags;
	
	private String wdtlVehicleNo;
	
	private Timestamp wdtlReceiptDate;
	
	private Timestamp wdtlCreatedDate;
	
	private String wdtlCreatedBy;
	
	private String wdtlCreatedCat;
	
	private String wdtlCreatedOrgId;
	
	private Timestamp wdtlModifiedDate;
	
	private String wdtlModifiedBy;
	
	private String wdtlApprovedBy;
	
	private Timestamp wdtlApprovedDate;
	
	private BigDecimal ref_booked_qty;
	
	private long wdtlNoOfbags;
	
	private String wdtl_bh_txn; 
	
	private String wdtl_bd_txn;
	
	private String packType;
	
	private String is_season_mand;
	
	private BigDecimal wdtlServedQuantity;
	
    private String wtdlWhNm;
	
	private String wdtlClientNm;
	
	private String wdtlStateName;
	
	private String wdtlWithdrawerName;
	

}
