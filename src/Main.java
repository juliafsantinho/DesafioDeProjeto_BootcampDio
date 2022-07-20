import br.com.dio.santander.desafio.*;

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

        //Conteudo conteudo = new Curso();      POLIMORFISMO

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Inaugural");
        mentoria.setDescricao("Mentoria para iniciar a carreira em Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        //criação do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //criando os devs
        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia" + devJulia.getConteudosIncritos());
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("------");

        System.out.println("Conteúdos Inscritos Julia" + devJulia.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Julia" + devJulia.getConteudosConcluidos());
        System.out.println("XP: " + devJulia.calcularTotalXp());

        System.out.println("\n-------------------------\n");

        Dev devClara = new Dev();
        devClara.setNome("Clara");
        devClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clara" + devClara.getConteudosIncritos());
        devClara.progredir();
        System.out.println("------");

        System.out.println("Conteúdos Inscritos Clara" + devClara.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Clara" + devClara.getConteudosConcluidos());
        System.out.println("XP: " + devClara.calcularTotalXp());



    }
}
