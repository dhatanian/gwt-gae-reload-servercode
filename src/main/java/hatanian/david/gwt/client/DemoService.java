package hatanian.david.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import hatanian.david.gwt.shared.model.Message;

@RemoteServiceRelativePath("demo")
public interface DemoService extends RemoteService {

    public Message getMessage();
}
