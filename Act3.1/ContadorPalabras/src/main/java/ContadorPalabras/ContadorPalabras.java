package ContadorPalabras;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContadorPalabras {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            //Se declaran para recibir datos de la consola
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            String linea;
            int totalPalabras = 0;

            //Declaramos while para mostrar las líneas
            while ((linea = br.readLine()) != null) {
                int numPalabras = 0;

                // Usamos StringTokenizer para convertir las palabras en tokens y contarlos
                StringTokenizer st = new StringTokenizer(linea);
                numPalabras = st.countTokens();
                totalPalabras += numPalabras;

                System.out.println("Línea: \"" + linea + "\" → Palabras: " + numPalabras);
            }
            //
            System.out.println("\nTotal de palabras ingresadas: " + totalPalabras);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {//Se cierran los abiertos
                br.close();
                isr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
