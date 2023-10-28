package zoo.mamiferos;

public class Herbivoro extends Mamifero{

    @Override
    public void alimentar() {
        if (getFilhote()) super.alimentar();
        if (!getFilhote()) System.out.println(getNome() + " "+ "Vegetais");
    }
}
