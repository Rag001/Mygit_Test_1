package com.sb.dto;

import java.util.List;

public class SBPayment {
	
	private String sbPaymentName;
	
	private String sbPaymentId;
	
	private List<SBPrice> sbPriceList;

	public String getSbPaymentName() {
		return sbPaymentName;
	}

	public void setSbPaymentName(String sbPaymentName) {
		this.sbPaymentName = sbPaymentName;
	}

	public String getSbPaymentId() {
		return sbPaymentId;
	}

	public void setSbPaymentId(String sbPaymentId) {
		this.sbPaymentId = sbPaymentId;
	}

	public List<SBPrice> getSbPriceList() {
		return sbPriceList;
	}

	public void setSbPriceList(List<SBPrice> sbPriceList) {
		this.sbPriceList = sbPriceList;
	}
	
}
