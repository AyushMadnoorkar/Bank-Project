package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi{
	Account a=new Account();
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Enter your Account no");
		a.setAccNo(sc.nextInt());
		
		System.out.println("Enter your name");
		a.setName(sc.next());
		
		System.out.println("Enter your Mobile No");
		a.setMobNo(sc.next());
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
	}

	@Override
	public void displayAllDetails() {
		
	}

	@Override
	public void depositeMoney() {
		
		System.out.println("Enter money for deposit");
		int x = sc.nextInt();
		double y = a.getBalance()+ x;
		a.setBalance(y);
		System.out.println(y + ": Amount deposite successfully");
		}

	@Override
	public void withdrawal() {
		System.out.println("Enter money for withdraw");
		int w = sc.nextInt();
		double p = a.getBalance()-w;
		a.setBalance(p);
		System.out.println(w + ": Amount withdraw successfully");
		
	}

	@Override
	public void balanceCheck() {
		//System.out.println("Your current balance");
		//double b = sc.nextDouble();
		double c = a.getBalance();
		System.out.println(c + ": Current balance");
		
	}

}
