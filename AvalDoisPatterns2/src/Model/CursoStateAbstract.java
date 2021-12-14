package Model;

import Model.Curso.Situacao;

public abstract class CursoStateAbstract implements CursoStateIF {
	
	@Override
	public CursoStateIF ativar() {
		return this;
	}
	
	@Override
	public CursoStateIF suspender() {
		return this;
	}
	
	@Override
	public CursoStateIF cancelar() {
		return this;
	}
	
	@Override
	public void restoreState(Situacao checkpoint, Curso curso) {
		return;
	}	
	
	@Override
	public Situacao checkpointState(Curso curso) {
		return null;
	}
		
	@Override
	public CursoStateIF avancar(String nomeDisciplina, double percentual, Curso curso) {
		return this;
	}
		
	@Override
	public String getEstado(){
		return "O curso esta em andamento!";
	}
	
	@Override
	public String getCertificado() {
		return "Voce nao tem direito a certificado, pois nao concluiu o curso. Va estudar!!!";
	}
	
}
