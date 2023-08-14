package exercise;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {


    public static void save(Path path, Car car){
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE)){
            writer.write(car.serialize());
            writer.flush();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        


    }

    public static Car extract(Path path){
        StringBuilder sb = new StringBuilder();
        try( BufferedReader br = Files.newBufferedReader(path)){

            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


        return Car.unserialize(sb.toString());
    }
}
// END
