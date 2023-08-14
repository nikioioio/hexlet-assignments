package exercise;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    @SneakyThrows
    public static void save(Path path, Car car){
        BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        writer.write(car.serialize());
        writer.flush();


    }
    @SneakyThrows
    public static Car extract(Path path){

            BufferedReader br = Files.newBufferedReader(path);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        return Car.unserialize(sb.toString());
    }
}
// END
