/**
 * 
 */
package com.neml.stocktransfer.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Entity
@Data
public class BookingDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable = false, length = 50)
	private String bdTxnNo;
	@Column(nullable = false)
	private Timestamp bdTxnDate;
	@Column(nullable = true, length = 2)
	private String bdTxnStatus;
	@Column(nullable = false, length = 50)
	private String bdBhTxnNo;
	@Column(nullable = false, length = 10)
	private String bdBhTxnType;
	@Column(nullable = true, length = 200)
	private String bdInvDeatailNo;
	@Column(nullable = false, length = 2)
	private String bdStateCode;
	@Column(nullable = false, length = 50)
	private String bdWhCode;
	@Column(nullable = false, length = 20)
	private String bdStockType;
	@Column(nullable = false, length = 50)
	private String bdCommodityCode;
	@Column(nullable = false, length = 20)
	private String bdUom;
	@Column(nullable = true, length = 20)
	private String bdSeasonId;
	@Column(nullable = false, length = 20)
	private String bdClientCode;
	@Column(nullable = false, length = 10)
	private String bdPurposeCode;
	@Column(nullable = true, length = 50)
	private String bdPurposeDetailNo;
	@Column(nullable = true, length = 50)
	private String bdPackType;
	@Column(nullable = true, length = 22, precision = 10)
	private BigDecimal bdBookedQuantity;
	@Column(nullable = true, length = 22, precision = 10)
	private BigDecimal bdServedQuantity;
	@Column(nullable = true, length = 22, precision = 10)
	private BigDecimal bdReleasedQuantity;
	@Column(nullable = true)
	private Timestamp bdCreatedDate;
	@Column(nullable = true, length = 20)
	private String bdCreatedBy;
	@Column(nullable = true, length = 3)
	private String bdCreatedUserCat;
	@Column(nullable = true, length = 20)
	private String bdCreatedUserOrgId;
	@Column(nullable = true)
	private Timestamp bdModifiedDate;
	@Column(nullable = true, length = 20)
	private String bdModifiedBy;
	@Column(nullable = true, length = 100)
	private String bdLocationCode;
	@Column(nullable = true, length = 50)
	private String bdParentHeaderTxn;
	@Column(nullable = true, length = 1)
	private String bdSyncStatus;
	@Column(nullable = true)
	private Timestamp bdSyncDate;
	@Column(nullable = true, length = 255)
	private String doPath;
	@Column(nullable = true, length = 255)
	private String doFileName;
	@Column(nullable = true, length = 20)
	private String bdBuyerId;
	@Column(nullable = true, length = 22, precision = 10)
	private BigDecimal bdNoOfBags;
}
