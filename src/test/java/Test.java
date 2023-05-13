

import org.example.objectcreator.example.DataObject;
import org.example.objectcreator.example.ReadTheFile;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void simpleTest(){
        String s = "test";

        assertEquals("test", s);
        assertTrue(s.equals("test"));


        List<DataObject> fileObject = ReadTheFile.createObjectFromCsv();

        //test the branch

        System.out.println("\nchecking if ANGELia is inside of the file:");
        assertEquals("Angelia MacGou",
                fileObject.stream().filter(o->o.getFullName().equals("Angelia MacGoun")).findAny().get().getFullName());

    }
}
