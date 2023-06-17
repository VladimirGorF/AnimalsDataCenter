package Animals;


public class Camels extends PackAnimals implements sayAble{


    public Camels(String id, String name, String sound) {
        super(id, name, sound);
    }

    @Override
    public String say() {
        return "grrr";
    }
}
