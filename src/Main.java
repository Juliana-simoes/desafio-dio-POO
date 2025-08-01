import br.com.fio.desafio.dominio.Bootcamp;
import br.com.fio.desafio.dominio.Curso;
import br.com.fio.desafio.dominio.Dev;
import br.com.fio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("Java Básico");
            curso1.setDescricao("Curso introdutório de Java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Orientação a Objetos");
            curso2.setDescricao("Entenda POO com Java");
            curso2.setCargaHoraria(10);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de Carreira");
            mentoria.setDescricao("Como iniciar na programação");
            mentoria.setData(LocalDate.now());

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Aprenda Java do zero ao avançado");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev dev = new Dev();
            dev.setNome("Juliana Oliveira");
            dev.inscreverBootcamp(bootcamp);

            System.out.println("Desenvolvedor: " + dev.getNome());
            System.out.println("Conteúdos Inscritos:");
            dev.getConteudosInscritos().forEach(c -> System.out.println("- " + c));

            while (!dev.getConteudosInscritos().isEmpty()) {
                    dev.progredir();
            }

            System.out.println("\nConteúdos Concluídos:");
            dev.getConteudosConcluidos().forEach(c -> System.out.println("- " + c));

            System.out.println("\nXP Total: " + dev.calcularTotalXp());
        }

    }
