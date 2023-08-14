package exercise;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    public static void save(Path path, Car car){
        String serialazed = car.serialize();
        try {
            FileWriter fw = new FileWriter(path.toString());
            fw.write(serialazed);
            fw.close();
        }catch (IOException e){
            System.out.println("Error");
        }

    }
    @SneakyThrows
    public static Car extract(Path path){

            BufferedReader br = new BufferedReader(new FileReader(path.toString()));
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
