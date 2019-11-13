import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
    @Test public void onezero ()
    {
       int arr[] = {2, 7,0,9};
       assertEquals("one", 2, lastZero.lastZero(arr));
    }
    @Test public void twozeros ()
    {
       int arr[] = {2, 7,0,9,0};
       assertEquals("one", 4, lastZero.lastZero(arr));
    }
    @Test(expected = NullPointerException.class)
    public void nullList ()
    {
       int arr[] = null;
       lastZero.lastZero(arr);
    }
    @Test public void fivezeros ()
    {
       int arr[] = {2, 0,0,0,0,7,0,9};
       assertEquals("five zeros", 6, lastZero.lastZero(arr));
    }

}
