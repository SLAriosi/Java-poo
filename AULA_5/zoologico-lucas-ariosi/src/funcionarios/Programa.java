package funcionarios;

public class Programa {
    public static void main(String[] args) {
        Funcionarios[] funcionarios = new Funcionarios[5];
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Cadastro do Funcionário " + (i + 1));
            funcionarios[i] = Funcionarios.CriandoOsMenino();
        }

        System.out.println("Lista de Funcionários:");
        for (Funcionarios funcionario : funcionarios) {
            funcionario.ListaDosFuncionarios();
            System.out.println();
        }
    }
}