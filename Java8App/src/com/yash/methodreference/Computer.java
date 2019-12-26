package com.yash.methodreference;
@FunctionalInterface
public interface Computer<T,R> {
	public abstract R compute(T tax);
}
