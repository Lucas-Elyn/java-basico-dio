package candidatura;

import java.util.Random;

public class ProcessoSeletivoTentativas {
    public static void main(String[] args) {
        String [] candidatos = {"Lucas","Kallebe", "Nathalia", "Yanka", "Hygor"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentantivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            //Precisam sofrer alterações
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentantivasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentantivasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentantivasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tantativas " + tentantivasRealizadas + " realizadas");
        }
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Lucas","Kallebe", "Nathalia", "Yanka", "Hygor"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n°" + (indice++) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
    }
}
