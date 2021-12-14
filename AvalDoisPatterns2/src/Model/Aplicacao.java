package Model;

import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

public class Aplicacao {
	
	public static TipoProduto PRODUTO = TipoProduto.DISCIPLINA;
	private ProdutoFactory factory;	
	
	public Aplicacao() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {		
		this.factory = (ProdutoFactory) (Class.forName(Aplicacao.PRODUTO.getFactoryName()).getDeclaredConstructor().newInstance());		
	}
	
	//Questao 01 => Memento
	//Questao 02 => Observer
	//Questão 03 => State	
	public void segundaAvalicao() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ProdutoFactory factory = (ProdutoFactory) (Class.forName(Aplicacao.PRODUTO.getFactoryName()).getDeclaredConstructor().newInstance());
		Stack<Curso.Situacao> situacoes = new Stack<Curso.Situacao>();
		
		//Criacionais
		Disciplina disciplinaA = (Disciplina)factory.getProduto("Factory Method", "DISFAC");
		Disciplina disciplinaB = (Disciplina)factory.getProduto("Builder", "DISCBUI");
		Disciplina disciplinaC = (Disciplina)factory.getProduto("Singleton", "DISCSIN");
		Disciplina disciplinaD = (Disciplina)factory.getProduto("Prototype", "DISCPRO");
		
		Curso cursoCriacionais = CursoBuilder.reset()
				.addNomeCurso("Criacionais")
				.addCodigoCurso("CRI001")
				.addDisciplina(disciplinaA)
				.addDisciplina(disciplinaB)
				.addDisciplina(disciplinaC)
				.addDisciplina(disciplinaD)
				.addLivro(new Livro("LIVFAC", "Factory Method", 20, "ISBNFAC"))
				.addLivro(new Livro("LIVBUI", "Builder", 10, "ISBNBUI"))
				.addLivro(new Livro("LIVPRO", "Prototype", 5, "ISBPRO"))
				.build();
		
		//Adicionando observers
		cursoCriacionais.adicionarObserver(new NotificacaoEmailObserver());
		cursoCriacionais.adicionarObserver(new NotificacaoSMSObserver());
		cursoCriacionais.adicionarObserver(new NotificacaoWhatsappObserver());	
		
		//Avanco inicial na carga horaria
		cursoCriacionais.avancar("Factory Method", 0.3);
		cursoCriacionais.avancar("Builder", 0.4);
		cursoCriacionais.avancar("Singleton", 0.5);
		cursoCriacionais.avancar("Prototype", 0.6);
		System.out.println(" ");		
		System.out.println(cursoCriacionais.toString());
		//Salvando checkpoint
		situacoes.push(cursoCriacionais.checkpoint());
		//System.out.println("===========================================================================");
		
		//Avancando 10% em cada disciplina
		cursoCriacionais.avancar("Factory Method", 0.1);
		cursoCriacionais.avancar("Builder", 0.1);
		cursoCriacionais.avancar("Singleton", 0.1);
		cursoCriacionais.avancar("Prototype", 0.1);		
		System.out.println(" ");		
		System.out.println("Avancando 10% em cada disciplina...\n");
		System.out.println(cursoCriacionais.toString());
		System.out.println("===========================================================================");
		
		System.out.println(" ");	
		cursoCriacionais.restore(situacoes.pop());
		System.out.println(" ");
		System.out.println("Restaurando para o ultimo estado válido...");
		System.out.println(" ");
		System.out.println(cursoCriacionais.toString());
		System.out.println("===========================================================================");

		//Testes para os estados
		//cursoCriacionais.cancelar();
		//cursoCriacionais.suspender();
		//cursoCriacionais.ativar();
		
		//Avancando 20% em cada curso, para testar o estado "Em andamento"
		/*System.out.println("Avancando 20% em cada disciplina...\n");
		cursoCriacionais.avancar("Factory Method", 0.2);
		cursoCriacionais.avancar("Builder", 0.2);
		cursoCriacionais.avancar("Singleton", 0.2);
		cursoCriacionais.avancar("Prototype", 0.2);*/
		
		//Avancando 80% em cada curso, para testar o estado "Concluido"
		cursoCriacionais.avancar("Factory Method", 0.8);
		cursoCriacionais.avancar("Builder", 0.8);
		cursoCriacionais.avancar("Singleton", 0.8);
		cursoCriacionais.avancar("Prototype", 0.8);	
		System.out.println(" ");
		System.out.println("Avancando 80% em cada disciplina...\n");
		System.out.println(cursoCriacionais.toString());
		System.out.println("===========================================================================");
		
		System.out.println(cursoCriacionais.getEstado());
		System.out.println(" ");
		System.out.println(cursoCriacionais.emitirCertificado());
		
	}
	
	public static void main(String[] args) throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Aplicacao app = new Aplicacao();
		app.segundaAvalicao();
	}
}
