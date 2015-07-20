package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import org.fluttercode.datafactory.impl.DataFactory;

import com.helper.CountryHelper;

public class CardDetailBuilder implements DataBuilder{

	@Override
	public void generateData(String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		createHeader(writer);
		int count = 1;
		DataFactory dataFactory = new DataFactory();
		while (count < 20) {
			writer.append(UUID.randomUUID().toString());
			writer.append("|");
			writer.append("XXXXXXXXXXXX" + dataFactory.getNumberText(4));
			writer.append("|");
			writer.append(dataFactory.getNumberBetween(1, 12) +", "+ dataFactory.getNumberBetween(13, 15));
			writer.append("|");
			writer.append(dataFactory.getNumberBetween(1, 12) +", "+ dataFactory.getNumberBetween(16, 18));
			writer.append("|");
			writer.append(dataFactory.getFirstName());
			writer.append("|");
			writer.append(dataFactory.getLastName());
			writer.append("|");
			writer.append(dataFactory.getAddress());
			writer.append("|");
			writer.append(CountryHelper.getState());
			writer.append("|");
			writer.append(CountryHelper.getCountry());
			writer.append("|");
			writer.append(dataFactory.getNumberText(5));
			writer.append("\n");
			count++;
		}
		writer.flush();
		writer.close();
	}

	@Override
	public void createHeader(FileWriter writer) throws IOException {
		writer.append("Card_ID");
		writer.append("|");
		writer.append("Card_number");
		writer.append("|");
		writer.append("Issued_on");
		writer.append("|");
		writer.append("Expires_on");
		writer.append("|");
		writer.append("FirstName");
		writer.append("|");
		writer.append("LastName");
		writer.append("|");
		writer.append("Address");
		writer.append("|");
		writer.append("State");
		writer.append("|");
		writer.append("Country");
		writer.append("|");
		writer.append("Zipcode");
		writer.append("\n");	
	}

}
