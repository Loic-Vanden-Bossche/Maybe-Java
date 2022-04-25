package fr.esgi.maybetp;

public class Value implements Maybe{
    Integer value;

    protected Value(Integer value) {
        this.value = value;
    }

    @Override
    public Boolean is(Predicate predicate){
        return predicate.perform(value);
    }

    @Override
    public void then(Consumer consumer){
        consumer.perform(value);
    }
}
