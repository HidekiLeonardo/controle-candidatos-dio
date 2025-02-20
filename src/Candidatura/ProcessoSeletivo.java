package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    // TODO: CASE 1
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    // TODO: CASE 2
    static void selecaoCandidatos() {
        String[] candidatos = {
                "Ana", "Bruno", "Carlos", "Daniela", "Eduardo",
                "Fernanda", "Gabriel", "Helena", "Igor", "Juliana",
                "Kleber", "Laura", "Marcos", "Natália", "Otávio",
                "Patrícia", "Ricardo", "Sara", "Tiago", "Vanessa"
        };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println(candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // TODO: CASE 3
    static void imprimirSelecionados() {
        String [] candidatos = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};
        /*for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ", n°" + (i + 1));
        }*/
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    // TODO: CASE 4
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato com " + candidato + " realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + ", tentativas realizadas " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", tentativas realizadas " + tentativasRealizadas);
        }
    }
}
