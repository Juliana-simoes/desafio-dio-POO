import br.com.fio.desafio.dominio.Bootcamp;
import br.com.fio.desafio.dominio.Curso;
import br.com.fio.desafio.dominio.Dev;
import br.com.fio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Java Básico");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso JavaScript");
            curso2.setDescricao("JavaScript Avançado");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java Master");
            mentoria.setDescricao("Mentoria Master para Java");
            mentoria.setData(LocalDate.now());

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Bootcamp foco em Java Avançado");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            System.out.println("----- DADOS DO DESENVOLVEDOR: JULIANA -----");
            Dev devJuliana = new Dev();
            devJuliana.setNome("Juliana");
            devJuliana.inscreverBootcamp(bootcamp);
            System.out.println("Nome: " + devJuliana.getNome());
            System.out.println("Conteúdos Matriculados (Antes de Progredir): " + devJuliana.getConteudosInscritos());

            System.out.println("\nProgredindo...");
            devJuliana.progredir();
            devJuliana.progredir();

            System.out.println("Conteúdos Matriculados (Após Progredir): " + devJuliana.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: " + devJuliana.getConteudosConcluidos());
            System.out.println("XP Total: " + devJuliana.calcularTotalXp());
            System.out.println("-------------------------------------------\n");

            System.out.println("----- DADOS DO DESENVOLVEDOR: HEBRAIN -----");
            Dev devHebrain = new Dev();
            devHebrain.setNome("Hebrain");
            devHebrain.inscreverBootcamp(bootcamp);
            System.out.println("Nome: " + devHebrain.getNome());
            System.out.println("Conteúdos Matriculados (Antes de Progredir): " + devHebrain.getConteudosInscritos());

            System.out.println("\nProgredindo...");
            devHebrain.progredir();
            devHebrain.progredir();
            devHebrain.progredir();

            System.out.println("Conteúdos Matriculados (Após Progredir): " + devHebrain.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: " + devHebrain.getConteudosConcluidos());
            System.out.println("XP Total: " + devHebrain.calcularTotalXp());
            System.out.println("-------------------------------------------\n");

        }

    }
