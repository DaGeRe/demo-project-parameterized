package de.dagere.peass;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExampleTest {

   @Parameters
   public static Iterable<Object[]> data() {
      return Arrays.asList(new Object[][] { { 0 }, { 1 } });
   }

   private int value;

   public ExampleTest(final int value) {
      this.value = value;
   }

   @Test
   public void test() {
      final ExampleClazz exampleClazz = new ExampleClazz();
      exampleClazz.calleeMethod(value);
      assertNotNull(exampleClazz);
   }

}