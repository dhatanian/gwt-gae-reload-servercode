package hatanian.david.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import hatanian.david.gwt.shared.model.Message;

public interface DemoServiceAsync {
	void getMessage(AsyncCallback<Message> async);
}
