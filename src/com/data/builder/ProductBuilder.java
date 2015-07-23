package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import com.helper.ProductHelper;
import com.helper.ProductHelper.ProductCategory;

public class ProductBuilder implements DataBuilder{

	@Override
	public void generateData(String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		//createHeader(writer);
		int count = 1;
		while (count < 20) {
			writer.append(UUID.randomUUID().toString());
			writer.append("|");
			ProductCategory productCategory = ProductHelper.getProductCategory();
			writer.append(ProductHelper.getProduct(productCategory));
			writer.append("|");
			writer.append(productCategory.getValue());
			writer.append("\n");
			count++;
		}
		writer.flush();
		writer.close();
	}

	@Override
	public void createHeader(FileWriter writer) throws IOException {
		writer.append("SKuId");
		writer.append("|");
		writer.append("SKUName");
		writer.append("|");
		writer.append("ProductCategory");
		writer.append("\n");	
		
	}

}
