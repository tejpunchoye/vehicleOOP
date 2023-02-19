package oop;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) throws IOException {
		
		enum maneuve {
			right, left, forward, reverse;
		}
		enum vehicleType{
			car, boat, plane;
		}

		Car car = new Car();
		car.setVehicleType(vehicleType.car);
		car.setTransporting(4);
		
		
		String result = "A " + car.getVehicleType() + 
				" can transport " + car.getTransporting() +
				" number of passenger at a maximum speed of " + car.getMaxSpeed() + ". \n" +
				"The maximum loading capacity of a  " + car.getVehicleType() +
				" have the safety features like: " + " \n" + car.getSecurityFeatures();	
		
		IO io = new IO();
		
//		io.usingFileOutputStream("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt", result);
//		io.usingFileInputStream("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt");
		
//		io.usingFileWriter("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt", result);
//		io.usingFileReader("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt");
		
//		io.usingInputStreamReader("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt");
//		io.usingInputStreamWriter("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt", result);
		
//		io.usingBufferedReader("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt");
//		io.usingBufferedWriter("C:\\Users\\User\\Desktop\\IO\\fileOutputStream.txt", result);
	}
	

	
}
