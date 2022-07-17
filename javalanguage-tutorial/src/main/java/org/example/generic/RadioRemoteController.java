package org.example.generic;

public class RadioRemoteController {
    private RemoteController<Radio> remoteController;

    public RadioRemoteController(Radio connectedDevice) {
        remoteController = new RemoteController<>(connectedDevice);
    }

    public Radio getConnectedDevice() {
        return remoteController.getConnectedDevice();
    }
}
