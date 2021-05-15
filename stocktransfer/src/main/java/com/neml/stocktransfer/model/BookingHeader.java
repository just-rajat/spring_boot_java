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
public class BookingHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String bhTxnNo;
	private Timestamp bhTxnDate;
	private String bhTxnStatus;
	private String bhStateCode;
	private String bhWhCode;
	private String bhStockType;
	private String bhCommodityCode;
	private String bhUom;
	private String bhSeasonId;
	private String bhClientCode;
	private String bhPurposeCode;
	private String bhPurposeDetailNo;
	private String bhBookedType;
	private BigDecimal bhBookedQuantity;
	private BigDecimal bhServedQuantity;
	private BigDecimal bhReleasedQuantity;
	private Timestamp bhCreatedDate;
	private String bhCreatedBy;
	private String bhCreatedUserCat;
	private String bhCreatedUserOrgId;
	private Timestamp bhModifiedDate;
	private String bhModifiedBy;
	private String bhLocationCode;
	private String bhParentHeaderTxn;
	private String bhSyncStatus;
	private Timestamp bhSyncDate;
	private String doPath;
	private String doFileName;
	private String bhBuyerId;
	private String bhLotId;
	private BigDecimal bhSaleQuantity;
	private BigDecimal bhDoGeneratedQty;
	private BigDecimal bhDoCount;

}
