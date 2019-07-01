import static org.junit.Assert.*;

import com.stackroute.junitdemo.InputRepeat;
import org.junit.Test;

public class InputRepeatTest
{
    @Test
    public void givenStringShouldReturnStringPattern()
    {
        InputRepeat obj=new InputRepeat();
        String result;
        result=obj.repeat("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}
