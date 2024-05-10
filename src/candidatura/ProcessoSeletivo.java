package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);

        selecaoCandidados();
        imprimirSelecionados();


    }

    static void imprimirSelecionados(){
        String[] candidados = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio",
                "Mirela", "Daniela", "Jose"};
        System.out.println("------------------------------------------------");
        System.out.println("Imprimindo candidatos informando o indice do elemento");

        for (int indice =0; indice < candidados.length;indice++){

            System.out.println("O candidato de n°" + (indice+1) + " é " + candidados [indice]);
        }
    }

    static void selecaoCandidados() {

        String[] candidados = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio",
                "Mirela", "Daniela", "Jose"};
        int candidatosselecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosselecionados <5 && candidatoAtual < candidados.length){
            String candidato = candidados [candidatoAtual];
            double  salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o valor de %.2f ",candidato,salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato foi selecionado para a vaga");
                candidatosselecionados ++;
            }
            else {
                System.out.println("O candidato nao foi selecionado");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditato");
        } else if (salarioBase == salarioPretendido) {

            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }

    }

}
