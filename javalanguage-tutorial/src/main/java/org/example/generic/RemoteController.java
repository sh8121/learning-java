package org.example.generic;

public class RemoteController {
    private Object connectedDevice;

    public RemoteController(Object connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    public Object getConnectedDevice() {
        return connectedDevice;
    }
}
