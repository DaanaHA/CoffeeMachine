package coffeemachine;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

public class FileLogger implements Logger{
    
    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter("logger.log" , true);
            fw.write(msg);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Something wrong!!");
        }
    }
    
}
