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
public class WhMstr implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(nullable=false,length = 10)
	private String whCode;
	@Column(nullable=false,length = 50)
	private String whName;
	private String whServiceProvider;
	private String locationCode;
	private String whCapacity;
	private String isFreezed;
	private String isActive;
	private String whType;
	private Timestamp dateOfBirth;
	private String panNo;
	private String whCategory;
	private String roAddress;
	private String roTel;
	private String roCity;
	private String roFax;
	private String roPincode;
	private String roAlternateTel;
	private String roTelex;
	private String caTel;
	private String caCity;
	private String caFax;
	private String caPincode;
	private String caAlternateTel;
	private String caContrPersonName;
	private String caDesignation;
	private String caMobileNo;
	private String caEmailId;
	private String asName;
	private String asTel;
	private String asDesignation;
	private String asAlternateTel;
	private String asAddress;
	private String asFax;
	private String asCity;
	private String asEmailId;
	private String asPincode;
	private String asPanName;
	private String asMobileNo;
	private String whDocumentType;
	private String whDocumentNumber;
	private String whPassword;
	private String createdBy;
	private Timestamp createdOn;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private String password;
	private String firstLoginFlag;
	private String tanNo;
	private String isAccredited;
	private String accreditationType;
	private String state;
	private String district;
	private String controlAgreement;
	private String requestId;
	private String requestStatus;
	private String asDistrict;
	private String asState;
	private String caDistrict;
	private String caState;
	private String caAddress;
	private String roDistrict;
	private String roState;
	private String wspBranchOfficeId;
	private String fileName;
	private String fileNameServer;
	private String whLotWhrType;
	private String isMill;
	private String doBranchAddress;
	private String doContactNo1;
	private String doContactNo2;
	private String doContactNo3;
	private String doEmailId;
	private String doGstno;
	private String doFax;
	private String whStorageType;
	private BigDecimal whCapacityQtls;
	private BigDecimal whAvailableCapacity;
	private String marketCode;
	private String submarketCode;
	private String isUmpIntegrated;
	private String dataUpldTxnNo;
	private String whLongitude;
	private String whLatitude;
	private String whGeoLocation;
}
