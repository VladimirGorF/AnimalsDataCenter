import Animals.Animals;

import java.util.List;

public interface Repos_Interface {
   List<Animals> getAllAnimals();
    List  getAllCommands();
    void CreateAnimal(Animals animal);
    void createCommand(List commands);
    void deleteAnimal(List animals);

}

