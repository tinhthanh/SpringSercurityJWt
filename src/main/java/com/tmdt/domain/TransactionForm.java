package com.tmdt.domain;

/**
 * <p>
 * Domain class cho table HINH_THUC_GIAO_DICH
 * </p>
 * 
 * @author ttlang
 *
 */
public class TransactionForm {
	private String transactionFormID;
	private String transactionFormName;
	private String transactionFormDecription;

	public TransactionForm(String transactionFormID, String transactionFormName, String transactionFormDecription) {
		super();
		this.transactionFormID = transactionFormID;
		this.transactionFormName = transactionFormName;
		this.transactionFormDecription = transactionFormDecription;
	}

	public String getTransactionFormID() {
		return transactionFormID;
	}

	public void setTransactionFormID(String transactionFormID) {
		this.transactionFormID = transactionFormID;
	}

	public String getTransactionFormName() {
		return transactionFormName;
	}

	public void setTransactionFormName(String transactionFormName) {
		this.transactionFormName = transactionFormName;
	}

	public String getTransactionFormDecription() {
		return transactionFormDecription;
	}

	public void setTransactionFormDecription(String transactionFormDecription) {
		this.transactionFormDecription = transactionFormDecription;
	}

	@Override
	public String toString() {
		return "TransactionForm [transactionFormID=" + transactionFormID + ", transactionFormName="
				+ transactionFormName + ", transactionFormDecription=" + transactionFormDecription + "]";
	}

}
