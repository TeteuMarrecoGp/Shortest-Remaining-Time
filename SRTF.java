package escalonamento;

import java.io.*;
public class SRTF {
 public static void main(String args[]) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n;
      System.out.println("Por favor digite o número de processos: ");
       n = Integer.parseInt(br.readLine());
       int proc[][] = new int[n + 1][4];
       for(int i = 1; i <= n; i++)
       {
      System.out.println("Por favor, informe o horário de chegada do processo " + i + ": ");
      proc[i][0] = Integer.parseInt(br.readLine());
      System.out.println("Por favor, informe o tempo de burst para o processo " + i + ": ");
      proc[i][1] = Integer.parseInt(br.readLine());
     }
