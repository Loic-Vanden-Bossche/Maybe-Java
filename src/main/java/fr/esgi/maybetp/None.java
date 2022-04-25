package fr.esgi.maybetp;

public class None implements Maybe{

    protected None() {
    }

    @Override
    public void then(Consumer consumer) {
    }

    @Override
    public Boolean is(Predicate predicate) {
        return false;
    }
}
