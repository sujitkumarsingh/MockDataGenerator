package com.main;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import com.data.builder.DataBuilder;

public class CreateData {

	

	

	static {
		System.out.println("Please enter first argument as the output path "
				+ "and the second argument as the number of files "
				+ "that need to be generated");
	}
	
	

	public static void main(String[] args) {
		try {
		int count = 0;
		if (StringUtils.isNumeric(args[2])) {
			int totalCount = Integer.parseInt(args[2]);
			System.out.println("Generating csv files");
			while (count < totalCount) {
				Class<?> className;
				
					className = Class.forName("com.data.builder." + args[1] + "Builder");
				
				DataBuilder dataBuilder = (DataBuilder)className.newInstance();
				dataBuilder.generateData(args[0]+ args[1] + count + ".csv");
				count++;
			}
		} else {
			System.out.println("Please enter valid number");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
