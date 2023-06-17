package Animals;


public class Horses extends PackAnimals implements sayAble{


    public Horses(String id, String name, String sound) {
        super(id, name, sound);
    }

    @Override
    public String say() {
        return "igogoo";
    }
}
