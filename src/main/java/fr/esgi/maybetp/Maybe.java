package fr.esgi.maybetp;

public interface Maybe {
    void then(Consumer consumer);
    Boolean is(Predicate predicate);

    static Maybe of(Integer value) {
        if(value != null){
            return new Value(value);
        }
        return new None();
    }

    static None nothing() {
        return new None();
    }

}
