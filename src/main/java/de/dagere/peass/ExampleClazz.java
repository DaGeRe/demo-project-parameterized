package de.dagere.peass;

public class ExampleClazz {

   protected void calleeMethod(final int value) {
      new Callee().method1(value);
   }

}