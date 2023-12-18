package com.filereader;

import java.io.IOException;

import com.configuration.Configuration_Reader;

public class FileReaderManager {

	private FileReaderManager() {

		// To restrict the object creation in any other class
	}

	
	public static FileReaderManager getInstanceFR() {
		
		FileReaderManager reader = new FileReaderManager();
		
		return reader;
	}
	
	public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader helper = new Configuration_Reader();
		
		return helper;
	}
	
}
