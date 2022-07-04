package setY;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ValueWriter {


    public void write(Book book, String author, String value) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        boolean propertyNotFound=true;
        Field[] fields=book.getClass().getFields();
       
        for (Field field: fields)
        {
            if(field.getName() == author)
            {
                field.set(book,value);
                propertyNotFound=false;
            }
        }
        if (propertyNotFound)
            throw new NoSuchFieldException();
    }
    
}
