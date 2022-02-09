package de.dagere.peass;

public class Callee {

   protected void method1(final int value) {
      innerMethod(value);
   }

   private void innerMethod(final int value) {
      try {
         if (value == 0) {
            Thread.sleep(1);
         } else {
            Thread.sleep(20);
         }
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected void method2() {
      // This change should not be detected by PeASS since it is not covered by a test
      System.out.println("This is a test");
   }

}