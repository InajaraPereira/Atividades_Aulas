package desafio01;

import java.util.ArrayList;

public class AppCorrida {
    public static void main(String[] args) {

        ArrayList<Participante> participantes = new ArrayList<Participante>();

        Participante participante01 = new Participante(01L, 35, "João", "Silva",
                "1.234.567", 38, "48999658412", "988653214", "AB+",
                "avancado");

        Participante participante02 = new Participante(02L, 36, "Marcelo", "Souza",
                "1.789.632", 23, "000000000", "988653214", "O+",
                "medio");

        Participante participante03 = new Participante(03L, 37, "Maria", "Castro",
                "9.654.321", 15, "000000000", "988653214", "B+",
                "medio");

        Participante participante04 = new Participante(04L, 38, "Silvia", "Ferreira",
                "8.123.654", 36, "9999999999", "988653214", "A-",
                "pequeno");

        participantes.add(participante01);
        participantes.add(participante02);
        participantes.add(participante03);
        participantes.add(participante04);

        participante01.setValorInscricao(participante01.calculaIncricao(participante01));
        participante04.setValorInscricao(participante04.calculaIncricao(participante04));

        for (Participante participante: participantes) {
            if(participante.getCategoria().equals("medio"))
                System.out.println(participante);
        }

        for (Participante participante: participantes) {
            if(participante.getCategoria().equals("pequeno")) {
                participantes.remove(participante.getId());
            }
        }

        for (Participante participante: participantes) {
            if(participante.getCategoria().equals("medio"))
            System.out.println(participante);
        }

    }
}
