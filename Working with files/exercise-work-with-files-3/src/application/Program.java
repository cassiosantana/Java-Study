package application;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        String pathIn = "in.txt";
        Map<String, Integer> inventoryCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();
            while (line != null) {
                inventoryCount.computeIfPresent(line, (key, value) -> value + 1);
                inventoryCount.putIfAbsent(line, 1);
                line = br.readLine();
            }

            for (Map.Entry<String, Integer> count : inventoryCount.entrySet()) {
                System.out.println(count.getKey() + "," + count.getValue());
            }

            String pathOut = "out.txt";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
                for (Map.Entry<String, Integer> count : inventoryCount.entrySet()) {
                    bw.write(count.getKey() + "," + count.getValue() + "\n");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Unexpected Error");
        }
    }
}
