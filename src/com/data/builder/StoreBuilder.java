package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import org.fluttercode.datafactory.impl.DataFactory;

import com.helper.CountryHelper;

public class StoreBuilder implements DataBuilder{

	@Override
	public void generateData(String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		//createHeader(writer);
		int count = 1;
		DataFactory dataFactory = new DataFactory();
		while (count < 50) {
			writer.append(UUID.randomUUID().toString());
			writer.append("|");
			writer.append(dataFactory.getBusinessName());
			writer.append("|");
			writer.append(dataFactory.getAddress());
			writer.append("$");
			writer.append(CountryHelper.getState());
			writer.append("$");
			writer.append(CountryHelper.getCountry());
			writer.append("$");
			writer.append(dataFactory.getNumberText(5));
			writer.append("\n");
			count++;
		}
		writer.flush();
		writer.close();
	}

	@Override
	public void createHeader(FileWriter writer) throws IOException {
		writer.append("StoreId ");
		writer.append("|");
		writer.append("StoreName ");
		writer.append("|");
		writer.append("StoreAddress ");
		writer.append("$");
		writer.append("State");
		writer.append("$");
		writer.append("Country");
		writer.append("$");
		writer.append("ZipCode");
		writer.append("\n");	
	}

}
