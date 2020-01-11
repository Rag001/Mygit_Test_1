package com.sb.entity;

import java.util.List;

public class SBPrice {
	
	private String sbPriceName;

	private String sbPriceId;
	
	private List<SBTransaction> sbTransactionList;
	
	private SBStatus SBStatusList;

	public String getSbPriceName() {
		return sbPriceName;
	}

	public void setSbPriceName(String sbPriceName) {
		this.sbPriceName = sbPriceName;
	}

	public String getSbPriceId() {
		return sbPriceId;
	}

	public void setSbPriceId(String sbPriceId) {
		this.sbPriceId = sbPriceId;
	}

	public List<SBTransaction> getSbTransactionList() {
		return sbTransactionList;
	}

	public void setSbTransactionList(List<SBTransaction> sbTransactionList) {
		this.sbTransactionList = sbTransactionList;
	}

	public SBStatus getSBStatusList() {
		return SBStatusList;
	}

	public void setSBStatusList(SBStatus sBStatusList) {
		SBStatusList = sBStatusList;
	}
	
}
