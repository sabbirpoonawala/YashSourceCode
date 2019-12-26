package com.yash.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import com.yash.entity.Employee;

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Hint[] hints=
				Employee.class.getAnnotationsByType(Hint.class);
        System.out.println(Arrays.toString(hints));
        System.out.println(hints.length);
	}

}
