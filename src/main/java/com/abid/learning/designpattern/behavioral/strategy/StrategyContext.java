package com.abid.learning.designpattern.behavioral.strategy;

public class StrategyContext {

	Strategy strategy;

	public StrategyContext(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}
	

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void  getResult() {
		strategy.describe();
	}
}
