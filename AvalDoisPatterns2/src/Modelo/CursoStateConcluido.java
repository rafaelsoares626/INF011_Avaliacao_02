package Model;

public class CursoStateConcluido extends CursoStateAbstract implements CursoStateIF {
	
	@Override
	public String getCertificado() {
		return "\n                Certificado:\n"
				+ "\nCertifico que Fulano de Tal concluiu o curso!!!\n"
				+ "\n               Rawphi Dhiónson"
				+ "\n              Diretor de Curso"
				+ "\n          Escola Thanks, Wikipedia";
	}
	
	@Override
	public String getEstado(){
		return "O curso foi concluido!";
	}
	
}
