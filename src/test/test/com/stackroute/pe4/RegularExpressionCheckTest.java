package com.stackroute.pe4;
import org.junit.*;
import static org.junit.Assert.*;

public class RegularExpressionCheckTest {

   RegularExpressionCheck regularExpressionCheck;
   @Before
   public void setUp() {
      regularExpressionCheck=new RegularExpressionCheck();
   }
   @After
   public void TearDown(){

   }
   @Test
   public void theGivenExpressionShouldGiveTrue(){
      boolean expectedValue=true;
      boolean actualValue=regularExpressionCheck.isRegularExpression("This is Harry");
   }
   @Test
   public void theGivenExpressionShouldGivefalse(){
      boolean expectedValue=true;
      boolean actualValue=regularExpressionCheck.isRegularExpression("This is Henry");
   }
}