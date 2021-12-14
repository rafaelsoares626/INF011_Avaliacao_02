package Model;

public class CursoStateCancelado extends CursoStateAbstract implements CursoStateIF {
	
	@Override
	public String getEstado(){
		return "O curso foi cancelado!!";
	}

}
