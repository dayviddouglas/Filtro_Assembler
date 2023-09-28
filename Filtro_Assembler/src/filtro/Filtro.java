package filtro;

import java.io.*;

import java.util.Scanner;

public class Filtro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
		String nomeArqDeEntrada = "arquivo_de_entrada.txt";
		String nomeArqDeSaida = "arquivo_de_saida.txt";
		InputStream inputStream;
		OutputStream outputStream;
	    
	     System.out.println("Em que formato você deseja receber "
	     		+ "os dados no arquivo de destino?\n"
	     		+ "1- Hexadecimal\n"
	     		+ "2- Binário\n"
	     		+ "3- Decimal");
	     
	        int escolhaUsuario = entrada.nextInt();
	        entrada.nextLine();
	        switch (escolhaUsuario) {
			case 1:
				try {
			    	  inputStream = new FileInputStream(nomeArqDeEntrada);
			          outputStream = new FileOutputStream(nomeArqDeSaida);
			          int byteRead = -1, contador_bytes=0, contador_linha = 0;
			          String conteudo = "";
			           
			          
			            
			          
			          while ((byteRead = inputStream.read()) != -1) {
			              contador_bytes = contador_bytes + 1;
			              if (contador_bytes == 1)  {
			                      conteudo = conteudo +"db " + Integer.toHexString(byteRead)  + ",";
			              }
			              // momento da quebra de linha
			              else if (contador_bytes %8 == 0)  {
			                  contador_linha++;
			                  // adiciona quebra de linha
			                  conteudo = conteudo +Integer.toHexString(byteRead) + " ; linha "+ (contador_linha-1) + " \ndb ";
			              }
			              else {
			                conteudo = conteudo + Integer.toHexString(byteRead) + ", ";
			            }
			              
			              
			               outputStream.write(conteudo.getBytes());   
			            conteudo = "";
			        }
			        outputStream.close();
			        entrada.close();
			        System.out.println("arquivo gerado com sucesso.");	
			    }catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				try {
			    	   inputStream = new FileInputStream(nomeArqDeEntrada);
			           outputStream = new FileOutputStream(nomeArqDeSaida);
			          int byteRead = -1, contador_bytes=0, contador_linha = 0;
			          String conteudo = "";
			           
			          
			            
			          
			          while ((byteRead = inputStream.read()) != -1) {
			              contador_bytes = contador_bytes + 1;
			              if (contador_bytes == 1)  {
			                      conteudo = conteudo +"db " + Integer.toBinaryString (byteRead)  + ",";
			              }
			              // momento da quebra de linha
			              else if (contador_bytes %8 == 0)  {
			                  contador_linha++;
			                  // adiciona quebra de linha
			                  conteudo = conteudo +Integer.toBinaryString (byteRead) + " ; linha "+ (contador_linha-1) + " \ndb ";
			              }
			              else {
			                conteudo = conteudo + Integer.toBinaryString (byteRead) + ", ";
			            }
			              
			              
			               outputStream.write(conteudo.getBytes());   
			            conteudo = "";
			        }
			        outputStream.close();
			        entrada.close();
			        System.out.println("arquivo gerado com sucesso.");	
			    }catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 3:
				
				try {
			    	  inputStream = new FileInputStream(nomeArqDeEntrada);
			          outputStream = new FileOutputStream(nomeArqDeSaida);
			          int byteRead = -1, contador_bytes=0, contador_linha = 0;
			          String conteudo = "";
			          
			           
			          
			            
			          
			          while ((byteRead = inputStream.read()) != -1) {
			              contador_bytes = contador_bytes + 1;
			              if (contador_bytes == 1)  {
			            	  
			                      conteudo = conteudo +"db " + byteRead  + ",";
			              }
			              // momento da quebra de linha
			              else if (contador_bytes %8 == 0)  {
			                  contador_linha++;
			                  // adiciona quebra de linha
			                  conteudo = conteudo +byteRead + " ; linha "+ (contador_linha-1) + " \ndb ";
			              }
			              else {
			                conteudo = conteudo + byteRead + ", ";
			            }
			              
			              
			               outputStream.write(conteudo.getBytes());   
			            conteudo = "";
			        }
			        outputStream.close();
			        entrada.close();
			        System.out.println("arquivo gerado com sucesso.");	
			    }catch (Exception e) {
					e.printStackTrace();
				}
				
				break;

			default:
				break;
			}
	       
	     
		
		
		
	    
	    
	    

	}

}
