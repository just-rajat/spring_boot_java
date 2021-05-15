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
public class WithdrawalHeader implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String wdrTxnNo;
	
	private Timestamp wdrTxnDate;
	private String wdrTxnStatus;
	private String wdrTxnType;
	private String wdrStateCode;
	private String wdrWhCode;
	private String wdrCommodityCode;
	private String wdrClientCode;
	private String wdrSeasonId;
	private String wdrUom;
	private String wdrInvtType;
	private String wdrStockType;
	private String wdrMode;
	private String wdrType;
	private String wdrPurposeCode;
	private String wdrPurposeDetailNo;
	private String wdrWithdrawerId;
	private String wdrBhTxn;
	private BigDecimal wdrTotalQuantity;
	private BigDecimal wdrTotalBags;
	private Timestamp wdrCreatedDate;
	private String wdrCreatedBy;
	private String wdrCreatedCat;
	private String wdrCreatedOrgId;
	private Timestamp wdrModifiedDate;
	private String wdrModifiedBy;
	private String wdrApprovedBy;
	private Timestamp wdrApprovedDate;
	private BigDecimal wdrAuctionPrice;
	private Timestamp wdrAuctionDate;
	private String wdrAuctionNumber;
	private String wdrServiceProvider;
}
