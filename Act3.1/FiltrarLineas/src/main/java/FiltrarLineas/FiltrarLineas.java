package FiltrarLineas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiltrarLineas {
    public static void main(String[] args) {
        //Se declara el isr y el br para poder leer y mostrar las lineas
        InputStreamReader isr = null;
        BufferedReader br = null;

        try{
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            String linea = null;

            //Bucle para mostrar todas las Lineas
            while((linea = br.readLine())!=null){

                if(linea.length()>20){ //Comprobar que la linea tiene más de 20 caracteres
                    System.out.println(linea);
                }

            }

        }catch(IOException e){
            System.err.println(e.getMessage());
        }finally{
            try{
                br.close();
                isr.close();
            }catch(IOException e2){
                System.err.println(e2.getMessage());
            }
        }
    }
}
