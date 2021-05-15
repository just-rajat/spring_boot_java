/**
 * 
 */
package com.neml.stocktransfer.modelid;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Rajat
 *
 */
@Data
public class WhCommodityMapId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String whCode;
	private String commodityId;
}
