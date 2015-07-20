package com.bean;

import java.math.BigDecimal;

public class TransactionData {
	
	private String pos_TransactionNumber;
	
	private String cc_Number;
	
	private BigDecimal amount;
	
	private BigDecimal tax;
	
	private int quantity;
	
	private long timepStamp;
	
	private int reward_Points;
	
	private CardHolder cardHolder;
	
	private POS storeInfo;
	
	private Product productInfo;

	public String getPos_TransactionNumber() {
		return pos_TransactionNumber;
	}

	public void setPos_TransactionNumber(String pos_TransactionNumber) {
		this.pos_TransactionNumber = pos_TransactionNumber;
	}

	public String getCc_Number() {
		return cc_Number;
	}

	public void setCc_Number(String cc_Number) {
		this.cc_Number = cc_Number;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getTimepStamp() {
		return timepStamp;
	}

	public void setTimepStamp(long timepStamp) {
		this.timepStamp = timepStamp;
	}

	public int getReward_Points() {
		return reward_Points;
	}

	public void setReward_Points(int reward_Points) {
		this.reward_Points = reward_Points;
	}

	public CardHolder getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(CardHolder cardHolder) {
		this.cardHolder = cardHolder;
	}

	public POS getStoreInfo() {
		return storeInfo;
	}

	public void setStoreInfo(POS storeInfo) {
		this.storeInfo = storeInfo;
	}

	public Product getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(Product productInfo) {
		this.productInfo = productInfo;
	}

}
