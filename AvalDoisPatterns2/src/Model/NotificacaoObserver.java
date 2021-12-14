package Model;

public class NotificacaoObserver {
	private String nomeNotificacao;
	private String disciplinas;
	private String tipoNotificacao;
	
	public NotificacaoObserver(String tipoNotificacao, String nomeNotificacao, String disciplinas) {
		this.nomeNotificacao = nomeNotificacao;
		this.disciplinas = disciplinas;
		this.tipoNotificacao = tipoNotificacao;
	}

	public String getNomeNotificacao() {
		return this.nomeNotificacao;
	}
	
	public String getTipoNotificacao() {
		return this.tipoNotificacao;
	}

	public String getConteudoNotificacao() {
		return "" + disciplinas;
	}
}
