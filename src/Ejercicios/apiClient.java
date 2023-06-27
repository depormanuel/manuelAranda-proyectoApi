package Ejercicios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class apiClient {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=37.19&longitude=-3.61&hourly=temperature_2m");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int tiempoRespuesta = conn.getResponseCode();
			if(tiempoRespuesta != 200) {
				throw new RuntimeException("HTTPSResponseCode: "+tiempoRespuesta);
			} else {
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				sc.close();
				System.out.print(informacion);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
