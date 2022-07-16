package org.example.generic;

public class RemoteController<Device> {
    private Device connectedDevice;

    public RemoteController(Device connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    public Device getConnectedDevice() {
        return connectedDevice;
    }
}
