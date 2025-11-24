package src.util;

import java.io.IOException;

public class Utility {

    public static void clearScreen() {
        if (System.getProperty("os.name").contains("Windows")){
            try{
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        else
            try{
                Runtime.getRuntime().exec("clear");
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
    }

}
