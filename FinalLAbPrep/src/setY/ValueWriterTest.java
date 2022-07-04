package setY;

import org.junit.jupiter.api.Test;
import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ValueWriterTest {
    @Test
    public void write_validProperty() throws Exception {
        Book book = new Book("Baitullahr Musafir");
        ValueWriter writer = new ValueWriter();
        writer.write(book, "author", "Abu Taher Misbah");
        assertEquals("Abu Taher Misbah", book.author);
     
    }

    @Test
    public void write_invalidProperty() {
        Book book = new Book("Baitullahr Musafir");
        ValueWriter writer = new ValueWriter();

        assertThrows(NoSuchFieldException.class, ()->{
            writer.write(book, "who", "not sure");
        });
    }
   
	public static void main(String [] args) {
    		Book  Book  = new  Book("The Alchemist");
    	   Method[] methods = Book.getClass().getMethods();
           for(Method method: methods) {
           	System.out.println(method.getName());
        
           }
           Field[] fields=Book.getClass().getFields();
           int  mods = Book.getClass().getModifiers();
           System.out.println(Modifier.isPublic(mods));
           
           for (Field field: fields)
           {
        	   System.out.println(field);
           }
//           Constructor constructor = null;
//           Object constructor2 = null;
//           constructor = Book.getClass().getConstructor(new Class[] {Book.class)
    }
}
