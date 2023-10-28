package zoo.mamiferos;
import zoo.Animal;
public class Mamifero extends Animal{
    private Boolean filhote;
    public Mamifero(){
        this.filhote = Boolean.TRUE;
    }
    public Boolean getFilhote(){ return filhote;}

    public void setFilhote(Boolean filhote){
        this.filhote = filhote;
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }
    public void alimentar(){

        System.out.println(getNome() + " Leite materno");
    }
}
