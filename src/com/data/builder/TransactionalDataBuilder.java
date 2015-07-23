package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.fluttercode.datafactory.impl.DataFactory;

import com.helper.CountryHelper;
import com.helper.ProductHelper;
import com.helper.ProductHelper.ProductCategory;

public class TransactionalDataBuilder implements DataBuilder{

	@Override
	public void createHeader(FileWriter writer) throws IOException {
		writer.append("POS_TransactionNumber");
		writer.append("|");
		writer.append("CC_Number");
		writer.append("|");
		writer.append("Amount");
		writer.append("|");
		writer.append("Tax");
		writer.append("|");
		writer.append("Quantity");
		writer.append("|");
		writer.append("PaymentDate");
		writer.append("|");
		writer.append("Reward_Points");
		writer.append("|");
		writer.append("FirstName");
		writer.append("|");
		writer.append("LastName");
		writer.append("|");
		writer.append("Address");
		writer.append("|");
		writer.append("City");
		writer.append("|");
		writer.append("State");
		writer.append("|");
		writer.append("Country");
		writer.append("|");
		writer.append("PostalCode");
		writer.append("|");
		writer.append("StoreName");
		writer.append("|");
		writer.append("StoreAddress");
		writer.append("|");
		writer.append("StoreCity");
		writer.append("|");
		writer.append("StoreState");
		writer.append("|");
		writer.append("StoreCountry");
		writer.append("|");
		writer.append("StorePostalCode");
		writer.append("|");
		writer.append("ProductName");
		writer.append("|");
		writer.append("Product_Category");
		writer.append("\n");
		
	}

	@Override
	public void generateData(String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		//createHeader(writer);
		int count = 1;
		DataFactory dataFactory = new DataFactory();
		while (count < 50) {
			writer.append(dataFactory.getNumberText(5));
			writer.append("|");
			writer.append("XXXXXXXXXXXX" + dataFactory.getNumberText(4));
			writer.append("|");
			int amount = dataFactory.getNumberBetween(30, 10000);
			writer.append(String.valueOf(amount));
			writer.append("|");
			//Set Tax for the product purchased
			writer.append(String.valueOf(amount * 0.14));
			writer.append("|");
			writer.append(String.valueOf(dataFactory
					.getNumberBetween(1, 10)));
			writer.append("|");
			Date minDate = dataFactory.getDate(2015, 1, 1);
			Date maxDate = new Date();
			Date purchaseDate = dataFactory.getDateBetween(minDate, maxDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(purchaseDate);
			writer.append(String.valueOf(calendar.getTimeInMillis()));
			writer.append("|");
			//Set Reward Points
			writer.append(dataFactory.getNumberText(4));
			writer.append("|");
			//Set CardHoder info
			writer.append(dataFactory.getFirstName());
			writer.append("|");
			writer.append(dataFactory.getLastName());
			writer.append("|");
			writer.append(dataFactory.getAddress());
			writer.append("|");
			writer.append(dataFactory.getCity());
			writer.append("|");
			writer.append(CountryHelper.getState());
			writer.append("|");
			writer.append(CountryHelper.getCountry());
			writer.append("|");
			writer.append(String.valueOf(dataFactory.getNumberText(6)));
			writer.append("|");
			//generate store names
			writer.append(dataFactory.getBusinessName());
			writer.append("|");
			writer.append(dataFactory.getAddress());
			writer.append("|");
			writer.append(dataFactory.getCity());
			writer.append("|");
			writer.append(CountryHelper.getState());
			writer.append("|");
			writer.append(CountryHelper.getCountry());
			writer.append("|");
			writer.append(String.valueOf(dataFactory.getNumberText(6)));
			writer.append("|");
			//generate product names
			ProductCategory productCategory = ProductHelper.getProductCategory();
			writer.append(ProductHelper.getProduct(productCategory));
			writer.append("|");
			writer.append(productCategory.getValue());
			writer.append('\n');
			count++;
		}
		writer.flush();
		writer.close();
		
	}

}
