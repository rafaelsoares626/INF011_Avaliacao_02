package Model;

import Model.Curso.Situacao;

public class CursoStateSuspenso extends CursoStateAbstract implements CursoStateIF  {
	
	@Override
	public CursoStateIF ativar() {
		return new CursoStateEmAndamento();
	}
	
	@Override
	public CursoStateIF cancelar() {
		return new CursoStateCancelado();
	}
	
	@Override
	public Situacao checkpointState(Curso curso) {		
		Situacao checkpoint = new Curso().new Situacao(curso);
		for(ObserverIF obs : curso.observers) {			
			curso.enviarNotificacao("notificacao de salvamento.", obs.getNomeNotificacao(), curso.toString());
		}		
		return checkpoint;
	}
	
	@Override
	public String getEstado() {
		return "O curso esta suspenso!";
	}
	
}
