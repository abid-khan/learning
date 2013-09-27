package com.abid.learning.designpattern.behavioral.strategy;

public class DemoStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CorporateStrategy cs = new CorporateStrategy();
		
		StrategyContext sc = new StrategyContext(cs);
		sc.getResult();
		
		
		PublicStrategy pc = new PublicStrategy();
		sc.setStrategy(pc);
		sc.getResult();
		
	}

}
