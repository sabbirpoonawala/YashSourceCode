package com.yash.methodreference;
@FunctionalInterface
public interface Converter<F,T> {
	public abstract T convert(F from);

}
