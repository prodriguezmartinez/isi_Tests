import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
    @Test public void number_not_in_first_position ()
    {
       int arr[] = {2, 7,0,9};
       int y =7;
       assertEquals("number_not_in_first_position", 1, findLast.findLast(arr,y));
    }
    @Test public void not_is_in_list ()
    {
       int arr[] = {2, 7,0,9};
       int y =3;
       assertEquals("not_is_in_list", -1, findLast.findLast(arr,y));
    }
    @Test public void number_in_last_position ()
    {
       int arr[] = {2, 7,0,9};
       int y =9;
       assertEquals("number_in_last_position", 3, findLast.findLast(arr,y));
    }
    @Test public void two_numbers ()
    {
       int arr[] = {2,9, 7,0,9};
       int y =9;
       assertEquals("two_numbers", 4, findLast.findLast(arr,y));
    }
    @Test(expected = NullPointerException.class)
    public void nullList ()
    {
       int arr[] = null;
       int y = 9;
       findLast.findLast(arr,y);
    }
    //este falla con el error sin arreglar
    @Test public void number_in_first_position ()
    {
       int arr[] = {2, 7,0,9};
       int y =2;
       assertEquals("number_in_first_position", 0, findLast.findLast(arr,y));
    }
}
