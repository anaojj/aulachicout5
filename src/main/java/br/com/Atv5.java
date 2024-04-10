package br.com;

import java.io.*;

public class Atv5 {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\JoanaDarc\\OneDrive\\ESTUDO\\JAVA\\aulachicout4\\meuarquivo.txt";
        String outputFilePath = "meuarquivo_python.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("Java", "Python");
                writer.write(line);
                writer.newLine();

                System.out.println(line);
            }
            writer.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        System.out.println("Arquivo salvo com sucesso!");
    }
}