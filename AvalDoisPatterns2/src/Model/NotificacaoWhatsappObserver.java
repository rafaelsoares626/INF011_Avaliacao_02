package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotificacaoWhatsappObserver implements ObserverIF {

	@Override
	public void notificar(NotificacaoObserver notificacaoObserver) {
		SimpleDateFormat fd = new SimpleDateFormat("hh:mm:ss");
		String data = fd.format(new Date());		
		System.err.println("\nEnviando Whatsapp..." 
							+ "\nHora: " + data 
							+ "\nAssunto: " + notificacaoObserver.getTipoNotificacao()
							+ "\nConteudo: " + notificacaoObserver.getConteudoNotificacao()
							+ "\n===========================================================================");		
	}
	
	@Override
	public String getNomeNotificacao() {
		return "Whatsapp";
	}

}
