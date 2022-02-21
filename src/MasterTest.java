
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class MasterTest {


    @Test
    public void testCharacter(){

        String toMorse="Suzan";
        DataCheck1 data=new DataCheck1();
        data.ReadChar(toMorse);
        String actual=data.ReadChar(toMorse);
        String expected= ("... ..- --.. .- -. ");
        assertEquals(expected, actual);





    }

    @Test
    public void testMorse(){

        String toMorse="... ..- --.. .- -.";
        DataCheck1 data=new DataCheck1();
        data.morse(toMorse);
        String actual=data.morse(toMorse);
        String expected= ("suzan");
        assertEquals(expected, actual);





    }

    @Test
    public void testEmptyValues(){

        String toMorse="";
        DataCheck1 data=new DataCheck1();
        data.morse(toMorse);
        String actual=data.morse(toMorse);
        String expected= ("Invalid kod");
        assertEquals(expected, actual);





    }

    @Test
    public void testEmpty(){

        String toMorse="&&";
        DataCheck1 data=new DataCheck1();
        data.ReadChar(toMorse);
        String actual=data.ReadChar(toMorse);
        String expected= ("Invalid data");
        assertEquals(expected, actual);





    }


}
