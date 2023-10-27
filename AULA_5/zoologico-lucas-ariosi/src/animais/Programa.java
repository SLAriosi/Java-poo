package animais;

public class Programa {
    public static void main(String[] args) {
        Animal[] animais = new Animal[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os dados do animal " + (i + 1) + ":");
            animais[i] = Animal.CriarAnimal();
        }

        System.out.println("");
        System.out.println("Lista de animais cadastrados:");
        System.out.println("");
        for (Animal animal : animais) {
            animal.ListinhadosAnimal();
            System.out.println();
        }
    }
}


