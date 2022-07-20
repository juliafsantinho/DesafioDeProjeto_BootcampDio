import br.com.dio.santander.desafio.Curso;
import br.com.dio.santander.desafio.Mentoria;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java I");
        curso1.setDescricao("Básico Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java II");
        curso2.setDescricao("Intermediário Java");
        curso2.setCargaHoraria(12);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Inaugural");
        mentoria.setDescricao("Mentoria para iniciar a carreira em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
