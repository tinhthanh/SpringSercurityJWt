package com.tmdt.domain;
/**
 * <p>Domain class cho table LICH_SU_GIAO_DICHC</p>
 * @author ttlang
 *
 */

import java.time.LocalDateTime;

public class TransactionHistory {
	private String transactionHistoryID;
	private LocalDateTime transactionDate;
	private TransactionForm transactionForm;
	private Integer debt;
	private Integer balance;

	public TransactionHistory(String transactionHistoryID, LocalDateTime transactionDate,
			TransactionForm transactionForm, Integer debt, Integer balance) {
		super();
		this.transactionHistoryID = transactionHistoryID;
		this.transactionDate = transactionDate;
		this.transactionForm = transactionForm;
		this.debt = debt;
		this.balance = balance;
	}

	public String getTransactionHistoryID() {
		return transactionHistoryID;
	}

	public void setTransactionHistoryID(String transactionHistoryID) {
		this.transactionHistoryID = transactionHistoryID;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionForm getTransactionForm() {
		return transactionForm;
	}

	public void setTransactionForm(TransactionForm transactionForm) {
		this.transactionForm = transactionForm;
	}

	public Integer getDebt() {
		return debt;
	}

	public void setDebt(Integer debt) {
		this.debt = debt;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "TransactionHistory [transactionHistoryID=" + transactionHistoryID + ", transactionDate="
				+ transactionDate + ", transactionForm=" + transactionForm + ", debt=" + debt + ", balance=" + balance
				+ "]";
	}

}
