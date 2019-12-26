package com.yash.functionalInterface;
import java.util.Optional;
import java.util.function.Consumer;
public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> optional1=Optional.of("sabbir");
		System.out.println(optional1.isPresent());
		
		Optional<String> optional2=null;
		System.out.println(Optional.ofNullable(optional2));
		
		Consumer<Optional<String>> consumer1=(s)->System.out.println(s.get().toUpperCase());
		consumer1.accept(Optional.ofNullable("hello"));
		
		Consumer<Optional<String>> consumer2=(s)->System.out.println(s.orElse("No String").toUpperCase());
		consumer2.accept(Optional.ofNullable(null));
		
	}
}
