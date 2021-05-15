/**
 * 
 */
package com.neml.stocktransfer.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rajat
 *
 */
@RestController
@RequestMapping("/stocktransfer")
@Slf4j
public class StockTransferController {

	@RequestMapping(value="/getWhCommodityMapping",method = RequestMethod.GET)
	public List<String> getWhCommodityData() {
		log.info("Inside getWhCommodityData");
		List<String> returnList = new ArrayList<String>();
		returnList.add("Rajat");
		returnList.add("Prachi");
		return returnList;
	}
}
