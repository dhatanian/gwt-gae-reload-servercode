package hatanian.david.gwt.client;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import hatanian.david.gwt.shared.model.Message;

public class AppEngineDemo implements EntryPoint {

    private DemoServiceAsync demoService = GWT.create(DemoService.class);

    @Override
    public void onModuleLoad() {
        Button button = new Button("Get the server's message");

        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                demoService.getMessage(new AsyncCallback<Message>() {

                    @Override
                    public void onSuccess(Message result) {
                        Window.alert(result.getMessage());
                    }

                    @Override
                    public void onFailure(Throwable caught) {
                        GWT.log("Error when checking session", caught);
                    }
                });
            }
        });
        RootPanel.get().add(button);
    }

}
