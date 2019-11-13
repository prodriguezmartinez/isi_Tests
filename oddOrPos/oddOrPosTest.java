import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest {
    @Test public void all_positive ()
    {
       int arr[] = {2,7,5,9};
       assertEquals("all_positive",4, oddOrPos.oddOrPos(arr));
    }
    @Test public void with_zero ()
    {
       int arr[] = {2, 7,0,5,9};
       assertEquals("with_zero",4, oddOrPos.oddOrPos(arr));
    }
    @Test public void all_odd_and_positive ()
    {
       int arr[] = {3,5,7,9};
       assertEquals("all_odd_and_positive",4, oddOrPos.oddOrPos(arr));
    }
    @Test public void postive_and_odd ()
    {
       int arr[] = {3,5,6,7};
       assertEquals("all_odd",4, oddOrPos.oddOrPos(arr));
    }
    //this fails
    @Test public void with_negatives ()
    {
       int arr[] = {-3,-5,-6,-7};
       assertEquals("with_negatives",3, oddOrPos.oddOrPos(arr));
    }
}
