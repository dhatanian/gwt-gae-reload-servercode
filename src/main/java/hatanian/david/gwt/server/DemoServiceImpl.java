package hatanian.david.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import hatanian.david.gwt.client.DemoService;
import hatanian.david.gwt.shared.model.Message;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class DemoServiceImpl extends RemoteServiceServlet implements DemoService {


    @Override
    public Message getMessage() {
        Message message = new Message();
        //Change this part to check if server changes are reloaded
        message.setMessage("Hello you  !");
        return message;
    }
}
