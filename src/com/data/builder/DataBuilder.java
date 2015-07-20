package com.data.builder;

import java.io.FileWriter;
import java.io.IOException;

public interface DataBuilder {
	public void createHeader(FileWriter writer) throws IOException;
	public void generateData(String path) throws IOException;
}
