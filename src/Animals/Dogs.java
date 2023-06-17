package Animals;


public class Dogs extends HomeAnimals implements sayAble {


    public Dogs(String id, String name, String sound) {
        super(id, name, sound);
    }

    @Override
    public String say() {
        return "gav";
    }
}
