package Animals;


public class Donkey extends PackAnimals implements sayAble{


    public Donkey(String id, String name, String sound) {
        super(id, name, sound);
    }

    @Override
    public String say() {
        return "iaa";
    }
}
