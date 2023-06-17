package Animals;


public class Cats extends HomeAnimals implements sayAble {


    public Cats(String id, String name, String sound) {
        super(id, name, sound);
    }

    @Override
    public String say() {
        return "myau";
    }



}
