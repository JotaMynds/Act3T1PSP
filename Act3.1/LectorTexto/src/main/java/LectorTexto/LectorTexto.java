package LectorTexto;

import java.io.*;

public class LectorTexto{

    public static void main(String[] args) {
        //Metodo para que el try pueda conseguir la ruta del archivo entrada.txt como stream y mandarlo al buffer igual
        try(InputStream is = LectorTexto.class.getResourceAsStream("/entrada.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is))){

            String Linea = null;

            while((Linea = br.readLine()) != null){
                System.out.println(Linea);
            }

        }catch(IOException e){
        }
    }


}
