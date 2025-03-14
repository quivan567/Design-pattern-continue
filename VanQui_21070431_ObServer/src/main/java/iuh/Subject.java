package iuh;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<ObServer> obServers = new ArrayList<>();

    public void attach(ObServer obServer) {
        obServers.add(obServer);
    }
    public void detach(ObServer obServer) {
        obServers.remove(obServer);
    }
    public void notifyAllObServer(String message)  {
        for (ObServer obServer : obServers) {
            obServer.update(message);
        }
    }
}
