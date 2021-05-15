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
public class WhInventoryTracking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String invtTxnNo;
	private Timestamp invtTxnDate;
	private String invtTxnStatus;
	private String headerRefNo;
	private String detailRefTxnNo;
	private String whInvtType;
	private String whInvDetailNo;
	private String whPackType;
	private String operationType;
	private String stateCode;
	private String whCode;
	private String comCode;
	private String clientId;
	private String stockType;
	private String uom;
	private String seasonId;
	private String purposeCode;
	private BigDecimal creditQuantity;
	private BigDecimal debitQuantity;
	private BigDecimal creditNoOfBags;
	private BigDecimal debitNoOfBags;
	private Timestamp createdDate;
	private String createdBy;
	private String createdCat;
	private String createdOrgId;
	private Timestamp modifiedDate;
	private String modifiedBy;
}
