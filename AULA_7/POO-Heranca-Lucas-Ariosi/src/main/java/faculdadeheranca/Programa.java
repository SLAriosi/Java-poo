    package faculdadeheranca;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Programa {
        public static void main(String[] args) {
            System.out.println("UniALFA faculdade");

            List<Docente> docentes = new ArrayList<>();
            List<Assistente> assistentes = new ArrayList<>();
            List<Tecnico> tecnicos = new ArrayList<>();
            List<Coordenador> coordenadores = new ArrayList<>();

            cadastrarFuncionarios(docentes, assistentes, tecnicos, coordenadores);


            imprimirListas(docentes, assistentes, tecnicos, coordenadores); //Cntrl + Alt + "M".

        }

        private static void cadastrarFuncionarios(List<Docente> docentes, List<Assistente> assistentes, List<Tecnico> tecnicos, List<Coordenador> coordenadores) {
            var scanner = new Scanner(System.in);
            do {

                System.out.println("Quem você deseja cadastrar: ");
                System.out.println("[d] Docente: ");
                System.out.println("[a] Assistente");
                System.out.println("[t] Técnico");
                System.out.println("[c] Coordenador");
                var tipoCadastro = scanner.nextLine();

                if (tipoCadastro.equals("d")) docentes.add(Docente.construir());
                if (tipoCadastro.equals("a")) assistentes.add(Assistente.construir());
                if (tipoCadastro.equals("t")) tecnicos.add(Tecnico.construir());
                if (tipoCadastro.equals("c")) coordenadores.add(Coordenador.construir());

                System.out.println("Continuar[1]");
            } while (scanner.nextLine().equals("1"));
        }

        private static void imprimirListas(List<Docente> docentes, List<Assistente> assistentes, List<Tecnico> tecnicos, List<Coordenador> coordenadores) {
            docentes.forEach(Docente::imprimir);
            assistentes.forEach(Assistente::imprimir);
            tecnicos.forEach(Tecnico::imprimir);
            coordenadores.forEach(Coordenador::imprimir);
        }

    }
