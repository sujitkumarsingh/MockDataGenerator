package com.main;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.data.builder.DataBuilder;

public class CreateData {
	private static final Logger LOGGER = Logger.getLogger(CreateData.class);
	static {
		System.out.println("Please enter first argument as the output path "
				+ ", the second argument as CardDetails/Product/Store/TransactionData "
				+ "and the third aurgument as the number of files "
				+ "that need to be generated");
	}



	public static void main(String[] args) {
		try {
			int count = 0;
			if (StringUtils.isNumeric(args[2])) {
				int totalCount = Integer.parseInt(args[2]);
				LOGGER.info("Generating csv files");
				while (count < totalCount) {
					Class<?> className;

					className = Class.forName("com.data.builder." + args[1] + "Builder");

					DataBuilder dataBuilder = (DataBuilder)className.newInstance();
					dataBuilder.generateData(args[0]+ args[1] + count + ".csv");
					count++;
				}
			} else {
				LOGGER.info("Please enter valid number");
			}
		} catch (ClassNotFoundException ex) {
			LOGGER.error("An exception has occurred :" + ex.getCause());
		} catch (InstantiationException ex) {
			LOGGER.error("An exception has occurred :" + ex.getCause());
		} catch (IllegalAccessException ex) {
			LOGGER.error("An exception has occurred :" + ex.getCause());
		} catch (IOException ex) {
			LOGGER.error("An exception has occurred :" + ex.getCause());
		}
	}
}
