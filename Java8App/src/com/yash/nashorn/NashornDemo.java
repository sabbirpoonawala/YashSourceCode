package com.yash.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			engine.eval("print('Hello World!');");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ScriptEngine engine1 = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			engine1.eval(new FileReader("d:\\js\\script.js"));
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Invocable invocable = (Invocable) engine1;

		Object result=null;
		try {
			result = invocable.invokeFunction("fun1", "Sabbir Poonawala");
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println(result.getClass());


	}

}
