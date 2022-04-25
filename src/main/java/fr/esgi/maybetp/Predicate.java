package fr.esgi.maybetp;

@FunctionalInterface
public interface Predicate {
    Boolean perform(Integer value);
}
