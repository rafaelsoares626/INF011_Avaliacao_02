package Model;

import Model.Curso.Situacao;

public interface CursoStateIF {
	public CursoStateIF ativar();
	public CursoStateIF suspender();
	public CursoStateIF cancelar();
	public String getCertificado();
	public String getEstado();
	public CursoStateIF avancar(String disciplina, double percentual, Curso curso);
	public Situacao checkpointState(Curso curso);
	public void restoreState(Situacao checkpoint, Curso curso);
}
