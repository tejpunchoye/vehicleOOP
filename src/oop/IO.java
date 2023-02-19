package oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IO {

//	SA stream is a sequence of data that can be read from or written to.
//	Byte streams: are used to read and write binary data - implemented using the InputStream and OutputStream classes. FileInputStream.
//	Character streams are used to read and write textual data - implemented using the Reader and Writer classes. FileOutputStream.
	
	public void usingFileOutputStream(String path, String data) throws IOException{
		FileOutputStream fo = new FileOutputStream(path);
		
		byte[] bytes = data.getBytes();
		fo.write(bytes);
		fo.close();
	}
	
	public void usingFileInputStream(String path) throws IOException {
		FileInputStream fi = new FileInputStream(path);
		byte[] bytes = fi.readAllBytes();
		String content = new String(bytes);
		System.out.println(content);
	}
	
	
	//Reader and writer are character streams to read from and write to
	//Readers: FileReader, InputStreamReader, BufferedReader
	//Writers: FileWriter, OutputStreamWriter, BufferedWriter
	
	public void usingFileWriter(String path, String data) throws IOException{
		FileWriter fw = new FileWriter(path);
		fw.write(data);
		fw.close();	
	}
	
	public void usingFileReader(String path) throws IOException{
		FileReader fr = new FileReader(path);
		int character;
		StringBuilder content = new StringBuilder();
		while ((character = fr.read()) != -1){
			 content.append((char) character);
		}
		fr.close();
		System.out.println(content.toString());
	}
	
	public void usingInputStreamWriter(String path, String data) throws IOException {
		OutputStream os = new FileOutputStream(path);
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(data);
		osw.close();		
	}
	
	public void usingInputStreamReader(String path) throws IOException {
		InputStream is = new FileInputStream(path);
		
		InputStreamReader isr = new InputStreamReader(is);
		
		int character;
		StringBuilder content = new StringBuilder();
		while((character = isr.read()) != -1) {
			content.append((char) character);
		}
		isr.close();
		System.out.println(content.toString());
	}
	public void usingBufferedWriter(String path, String data) throws IOException{
		File f = new File(path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(data);
		bw.flush();
		bw.close();
		
	}
	public void usingBufferedReader(String path) throws IOException{
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line;
		StringBuilder st = new StringBuilder();
		while ((line  = br.readLine()) != null) {
			st.append(line);
			st.append(System.lineSeparator());			
		}
		br.close();
		System.out.println(st.toString());
		
	}
	
	
}
