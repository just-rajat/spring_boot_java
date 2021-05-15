/**
 * 
 */
package com.neml.stocktransfer.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Entity
@Data
public class WithdrawalDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
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
	private BigDecimal wdtlBags;
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
}
