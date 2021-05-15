package com.neml.stocktransfer.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.neml.stocktransfer.modelid.WhCommodityMapId;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@IdClass(WhCommodityMapId.class)
@Entity
@Data
public class WhCommodityMap implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String whCode;
	@Id
	private String commodityId;
	private String uom;
	private String isFreezed;
	private String isActive;
	private Timestamp createdOn;
	private String createdBy;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String invtType;
	private String isSeason;
	private String prePostAssaying;
	private String isDoWithdrawal;
	private String isGodownSilo;
	private String isBayStack;
	private String depositType;
	private String withdrawalType;
	private String isVehicleNo;
	private String isPackType;
	private String isNoBags;
	private String commodityCat;
	private String withdrawalInvtType;
	private String bookingType;
	private String isWeightReductionRequired;
	private String isImplicitWhrAtWdr;
	private String isWhrNoGnrtxn;
	private BigDecimal haircutPercent;
	private BigDecimal loanRoi;
	private BigDecimal cashLimit;
	private BigDecimal cashLimitPercent;
	private String isNegativeInvtAllowed;
	private String isBagScanReq;
	private String isQrFlow;
	private String is2LevelPaymentFlow;
}
