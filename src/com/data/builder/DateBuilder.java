package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.fluttercode.datafactory.impl.DataFactory;

public class DateBuilder implements DataBuilder{

	@Override
	public void createHeader(FileWriter writer) throws IOException {
		writer.append("DateId");
		writer.append("|");
		writer.append("Year");
		writer.append("$");
		writer.append("Quarter");
		writer.append("$");
		writer.append("Month");
		writer.append("$");
		writer.append("DayOfWeek");
		writer.append("$");
		writer.append("DayOfMonth");
		writer.append("\n");	
		
	}

	@Override
	public void generateData(String path) throws IOException {
		FileWriter writer = new FileWriter(path);
		//createHeader(writer);
		int count = 1;
		DataFactory dataFactory = new DataFactory();
		Date date = dataFactory.getDate(2015, 01, 01);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		while (count < 366) {
			writer.append(String.valueOf(count));
			writer.append("|");
			writer.append(String.valueOf(calendar.get(Calendar.YEAR)));	
			writer.append("|");
			writer.append(String.valueOf((calendar.get(Calendar.MONTH)/3) + 1));
			writer.append("|");
			writer.append(String.valueOf(calendar.get(Calendar.MONTH)+1));
			writer.append("|");
			writer.append(String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)));
			writer.append("|");
			writer.append(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			writer.append("\n");
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			count++;
		}
		writer.flush();
		writer.close();
		
	}

}
