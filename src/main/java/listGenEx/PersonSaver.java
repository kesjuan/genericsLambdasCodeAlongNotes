package listGenEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver {
    private final RandomAccessFile file;
    public PersonSaver(File file) throws FileNotFoundException{
        this.file = new RandomAccessFile(file,"rw");
    }
    public void save(Person person) throws IOException{

        file.writeUTF(person.getClass().getName());
        file.writeUTF(person.getName());
        file.writeInt(person.getAge());
    }
    public void saveAll(final List<? extends Person> persons) throws IOException{
                                //!^^ can save a list of person or anything that is a subclass of person
        for(Person person: persons){
            save(person);
        }
    }
}
