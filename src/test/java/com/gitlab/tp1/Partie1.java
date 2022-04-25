package com.gitlab.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Partie1 {

  @Test
  public void test1() {
    /*Result result = new Result();
    Consumer consumer = (Integer value) -> result.set("The value: " + value.toString());

    consumer.perform(12);

    Assertions.assertEquals("The value: 12", result.get());*/
  }

  @Test
  public void test2() {
    /*Result result = new Result();
    Consumer consumer = (a) -> result.set(a.toString() + " * 3 = " + a * 3);

    consumer.perform(4);

    Assertions.assertEquals("4 * 3 = 12", result.get());*/
  }

  @Test
  public void test3() {
    /*Predicate isPositive = (a) -> a > 0;
    Assertions.assertEquals(false, isPositive.perform(-4));
    Assertions.assertEquals(true, isPositive.perform(4));*/
  }

  @Test
  public void test4() {
    /*Predicate isOdd = (a) -> a  % 2 == 1;
    Assertions.assertEquals(false, isOdd.perform(4));
    Assertions.assertEquals(true, isOdd.perform(5));*/
  }
}
