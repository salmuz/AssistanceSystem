

package pe.edu.flujo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class CharacterInput {
    
    private FileInputStream fis;
    private ObjectInputStream input;
    
    /** Creates a new instance of CharacterInput */
    public CharacterInput() {
    }
    
    // abrir archivo
    public void open(File file) throws IOException{        
        fis = new FileInputStream(file);
        input = new ObjectInputStream(fis);
    }
    
    // cerrar archivo
    public void close() throws IOException{
        if ( input != null)
            input.close();
    }
    
    // leer del archivo
    public Object read() throws IOException, ClassNotFoundException {
        Object obj = null;
        if( input != null){
            obj = input.readObject();
        }
        return obj;
    }
}
