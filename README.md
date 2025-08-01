# Bootcamp Java Developer - Projeto Orientado a Objetos
Este projeto simula a estrutura de um Bootcamp para desenvolvedores, com foco nos conceitos de Programação Orientada a Objetos (POO) em Java.
O sistema permite:
- Criar cursos e mentorias com XP personalizados
- Inscrever devs em bootcamps
- Acompanhar progresso
- Calcular XP total obtido por cada dev.
  
📚 Conceitos Utilizados
- Abstração: através da classe abstrata Conteudo
- Herança: Curso e Mentoria herdam de Conteudo
- Polimorfismo: sobrescrita do método calcularXp()
- Encapsulamento: uso de getters e setters

🧱 Estrutura das Classes
- Conteudo: classe base abstrata
- Curso: define carga horária e XP baseado em horas
- Mentoria: define data e XP fixo adicional
- Bootcamp: agrupa conteúdos e devs inscritos
- Dev: controla progresso e cálculo de XP
- Main: ponto de entrada para simulação

✅ Exemplo de Saída:

Desenvolvedor: Juliana Oliveira

 Conteúdos Inscritos:
- Curso: Java Básico - Curso introdutório de Java (8h)
- Curso: Orientação a Objetos - Entenda POO com Java (10h)
- Mentoria: Mentoria de Carreira - Como iniciar na programação (Data: 01/08/2025)

Conteúdos Concluídos:
- Curso: Java Básico - Curso introdutório de Java (8h)
- Curso: Orientação a Objetos - Entenda POO com Java (10h)
- Mentoria: Mentoria de Carreira - Como iniciar na programação (Data: 01/08/2025)

XP Total: 210.0🚀

Feito com ❤️ e ☕ em Java.
