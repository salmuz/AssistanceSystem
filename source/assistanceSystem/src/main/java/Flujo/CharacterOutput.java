
package Flujo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class CharacterOutput {
    
    private FileOutputStream fos;
    private ObjectOutputStream output;
    
    /** Creates a new instance of CharacterOutput */
    public CharacterOutput() {
        this.fos = null;
        this.output = null;
    }
    
    //Abrir el fichero
    public void open(File file) throws IOException{
        fos = new FileOutputStream(file);
        output = new ObjectOutputStream(fos);
    }
    
    // cerrar el archivo
    public void close() throws IOException{
        if ( output != null)
            output.close();
    }
    
    // Escribir en el fichero
    public void write(Object obj) throws IOException{
        if (output != null)
            output.writeObject(obj);
    }
}
