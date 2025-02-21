package interfacealert.before;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/*
new package private interface named AlertDAO, that contains same methods as MapAlertDAO,
MapAlertDAO implements AlertDAO interface
AlertService accepts AlertDAO in its constructor:
The raiseAlert and getAlertTime methods use AlertDAO passed through constructor
* */
class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}

class MapAlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}