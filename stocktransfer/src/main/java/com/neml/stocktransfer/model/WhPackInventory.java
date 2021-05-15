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
public class WhPackInventory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stateCode;
	@Id
	private String whCode;
	@Id
	private String comCode;
	@Id
	private String clientId;
	@Id
	private String seasonId;
	@Id
	private String packType;
	private String stockType;
	private String uom;
	private String lastInvtTxnNo;
	private BigDecimal physicalActualQuantity;
	private BigDecimal physicalActualBags;
	private BigDecimal bookedQuantity;
	private BigDecimal servedQuantity;
	private BigDecimal servedBags;
	private BigDecimal releasedQuantity;
	private Timestamp createdDt;
	private String createdBy;
	private String createdCat;
	private String createdOrgId;
	private Timestamp modifiedDate;
	private String modifiedBy;
}
