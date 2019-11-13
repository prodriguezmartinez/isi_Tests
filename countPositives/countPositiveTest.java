import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{
   // this test passes
   @Test public void twopositives ()
   {
      int arr[] = {2, 7};
      assertEquals("two", 2, countPositive.countPositive(arr));
   }
   @Test public void one_positive_one_negative()
   {
      int arr[] = {2, -7};
      assertEquals("two", 1, countPositive.countPositive(arr));
   }
   // this test passes
   @Test public void zeropositives ()
   {
      int arr[] = {-2, -7};
      assertEquals("zero positives", 0, countPositive.countPositive(arr));
   }
   //this test doesnt pass
   @Test public void withzeronumber ()
   {
      int arr[] = {-2,-7,7,0};
      assertEquals("with zero ", 1, countPositive.countPositive(arr));
   }
   //this test passes
   @Test(expected = NullPointerException.class)
   public void nullList ()
   {
      int arr[] = null;
      countPositive.countPositive(arr);
   }
}
