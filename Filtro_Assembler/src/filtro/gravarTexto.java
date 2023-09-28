package filtro;

import java.io.*;


public class gravarTexto {

	public static void main(String[] args) {
		try {
			
		 OutputStream output = new FileOutputStream("arquivo_de_entrada.txt");
		 String texto = "Hello World";
		 int count = 0;
		 
		  while(count < texto.length()) {
			  output.write(texto.charAt(count));
			  count++; 
		  }
		  output.close();
		  System.out.println("Arquivo criado com sucesso!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
