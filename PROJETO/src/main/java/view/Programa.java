package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;
import model.CoordenacaoDeCurso;
import model.Curso;
import model.Disciplina;
import model.Distribuicao;
import model.HistoricoAluno;
import model.MandatoDeCoordenacao;
import model.Professor;
import model.Turma;

public class Programa {
	public static void main(String[] args) {		
		Aluno A1 = new Aluno(null, "Rogerio", "20-02-1977", "M");
		Aluno A2 = new Aluno(null, "Julia", "05-03-1996", "F");
		Aluno A3 = new Aluno(null, "João", "15-02-2002", "M");
		
		CoordenacaoDeCurso C1 = new CoordenacaoDeCurso(null, "junior@professor.iftm.edu.br", "9999-0000");
		CoordenacaoDeCurso C2 = new CoordenacaoDeCurso(null, "manoel@professor.iftm.edu.br", "9999-1111");
		CoordenacaoDeCurso C3 = new CoordenacaoDeCurso(null, "pedro@professor.iftm.edu.br", "9999-2222");
		
		Curso Cs1 = new Curso(null, "Licenciatura em Computação", "2º/2018", "Lic Comp");
		Curso Cs2 = new Curso(null, "Sistemas para Internet", "2º/2021", "Sis Int");
		Curso Cs3 = new Curso(null, "Medicina Veterinária", "2º/2021", "Med Vet");
		
		Disciplina D1 = new Disciplina(null, "Programação Orientada à Objetos");
		Disciplina D2 = new Disciplina(null, "Estrutura de Dados");
		Disciplina D3 = new Disciplina(null, "Estagio Supervisionado II");
		
		Distribuicao Dt1 = new Distribuicao(null);
		Distribuicao Dt2 = new Distribuicao(null);
		Distribuicao Dt3 = new Distribuicao(null);
		
		HistoricoAluno H1 = new HistoricoAluno(null, "62.50");
		HistoricoAluno H2 = new HistoricoAluno(null, "94.00");
		HistoricoAluno H3 = new HistoricoAluno(null, "55.00");
		
		MandatoDeCoordenacao MC1 = new MandatoDeCoordenacao(null, "01-01-2016", "31-12-2018");
		MandatoDeCoordenacao MC2 = new MandatoDeCoordenacao(null, "01-01-2018", "31-12-2020");
		MandatoDeCoordenacao MC3 = new MandatoDeCoordenacao(null, "01-01-2020", "31-12-2022");
		
		Professor P1 = new Professor(null, "Arinaldo");
		Professor P2 = new Professor(null, "Bruno");
		Professor P3 = new Professor(null, "Cricia");
		
		Turma T1 = new Turma(null, "Lic Comp", 2018);
		Turma T2 = new Turma(null, "Sis Int", 2020);
		Turma T3 = new Turma(null, "Med Vet", 2021);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao_academica_temp");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(A1);
		em.persist(A2);
		em.persist(A3);
		
		em.persist(C1);
		em.persist(C2);
		em.persist(C3);
		
		em.persist(Cs1);
		em.persist(Cs2);
		em.persist(Cs3);
		
		em.persist(D1);
		em.persist(D2);
		em.persist(D3);
		
		em.persist(Dt1);
		em.persist(Dt2);
		em.persist(Dt3);
		
		em.persist(H1);
		em.persist(H2);
		em.persist(H3);
		
		em.persist(MC1);
		em.persist(MC2);
		em.persist(MC3);
		
		em.persist(P1);
		em.persist(P2);
		em.persist(P3);
		
		em.persist(T1);
		em.persist(T2);
		em.persist(T3);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}