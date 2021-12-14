package Model;

public interface ObserverIF {
	
	public void notificar(NotificacaoObserver notificacaoObserver);	
	public String getNomeNotificacao();
}
