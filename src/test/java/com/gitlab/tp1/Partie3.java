package com.gitlab.tp1;

import fr.esgi.maybetp.Consumer;
import fr.esgi.maybetp.Maybe;
import fr.esgi.maybetp.None;
import fr.esgi.maybetp.Predicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Partie3 {
  @Test
  void test8() {
    /* Check that None.is always return false */
    Predicate odd = (a) -> true;
    None n = Maybe.nothing();
    Assertions.assertEquals(false, n.is(odd));
  }

  @Test
  void test9() {
    Result result = new Result();
    result.set("Hello");
    None n = Maybe.nothing();
    Consumer consumer = (Integer value) -> result.set("The value: " + value.toString());
    n.then(consumer);
    Assertions.assertEquals("Hello", result.get());
  }

  @Test
  void test10() {
    Assertions.assertTrue(Maybe.of(12).is((a) -> a.equals(12)));
    Assertions.assertFalse(Maybe.of(null).is((a) -> a.equals(12)));
    Assertions.assertFalse(Maybe.nothing().is((a) -> a.equals(12)));
  }
}
