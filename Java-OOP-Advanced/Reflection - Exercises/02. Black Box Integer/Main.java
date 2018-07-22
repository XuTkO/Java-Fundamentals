package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static final String className = "BlackBoxInt";
	public static final String classPath = "pr02PrivateClassFiddling.com.";
	public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		BlackBoxInt blackBoxInt;

		Class<?> blackBoxClass = Class.forName(classPath + className);
		Constructor<?> declaredConstructor = blackBoxClass.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		blackBoxInt = (BlackBoxInt) declaredConstructor.newInstance();

		while (!"END".equals(input)){
			String[] tokens = input.split("_");
			Method declaredMethod = blackBoxInt.getClass().getDeclaredMethod(tokens[0], int.class);
			declaredMethod.setAccessible(true);
			declaredMethod.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
			Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
			innerValue.setAccessible(true);

			System.out.println(innerValue.get(blackBoxInt));

			input = bf.readLine();
		}

	}
}
