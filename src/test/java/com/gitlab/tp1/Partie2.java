package com.gitlab.tp1;

import fr.esgi.maybetp.Consumer;
import fr.esgi.maybetp.Maybe;
import fr.esgi.maybetp.Predicate;
import fr.esgi.maybetp.Value;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Partie2 {

  @Test
  void test5() {
    Value v = (Value) Maybe.of(12);
    Predicate odd = (a) -> a % 2 == 0;
    Assertions.assertTrue(
        v.is(odd)
    );
  }

  @Test
  void test6() {
    Value v = (Value) Maybe.of(12);
    Assertions.assertTrue(
        v.is((a) -> a % 2 == 0)
    );
  }

  @Test
  void test7() {
    Result result = new Result();
    Consumer consumer = (a) -> result.set(a.toString() + " * 3 = " + a * 3);

    Value v = (Value) Maybe.of(4);

    v.then(consumer);

    Assertions.assertEquals("4 * 3 = 12", result.get());

  }
}
