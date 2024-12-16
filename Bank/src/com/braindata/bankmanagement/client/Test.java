package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.serviceImpl.*;
import com.braindata.bankmanagement.service.*;
public class Test {
	public static void main(String[] args) {
		Rbi r =new Sbi();
		r.depositeMoney();
		r.withdrawal();
		r.balanceCheck();
	}

}
