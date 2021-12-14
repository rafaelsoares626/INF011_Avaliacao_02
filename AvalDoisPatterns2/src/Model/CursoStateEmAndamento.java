package Model;

import Model.Curso.Situacao;

public class CursoStateEmAndamento extends CursoStateAbstract implements CursoStateIF  {

	@Override
	public CursoStateIF cancelar() {
		return new CursoStateCancelado();
	}

	@Override
	public CursoStateIF suspender() {
		return new CursoStateSuspenso();
	}
		
	@Override
	public CursoStateIF avancar(String disciplina, double percentual, Curso curso) {
		for (Disciplina d : curso.getDisciplinas()) {
			if (d.getNome().equals(disciplina)) {
				d.setPctCumprido(percentual + d.getPctCumprido());
			}
		}		
		if(curso.concluido()) {
			return new CursoStateConcluido();
		}
		return this;
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
	public void restoreState(Situacao situacao, Curso curso) {
		situacao.restore();
		for(ObserverIF obs : curso.observers) {			
			curso.enviarNotificacao("notificacao de restauramento.", obs.getNomeNotificacao(), curso.toString());
		}		
	}
}
