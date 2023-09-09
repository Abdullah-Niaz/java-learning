package oop.Principles.Inheritance.Real_Examples;

class RemoteControl {
    protected String deviceName;
    private boolean isOn;

    public RemoteControl(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(deviceName + " is now ON.");
        } else {
            System.out.println(deviceName + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(deviceName + " is now OFF.");
        } else {
            System.out.println(deviceName + " is already OFF.");
        }
    }
}

class TVRemote extends RemoteControl {
    public TVRemote(String deviceName) {
        super(deviceName);
    }

    public void changeChannel(int channel) {
        System.out.println(deviceName + " is changing to channel " + channel + ".");
    }
}

class ACRemote extends RemoteControl {
    public ACRemote(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(int temperature) {
        System.out.println(deviceName + " temperature set to " + temperature + "°C.");
    }
}

class DVDRemote extends RemoteControl {
    public DVDRemote(String deviceName) {
        super(deviceName);
    }

    public void playMovie(String movie) {
        System.out.println(deviceName + " is playing " + movie + ".");
    }
}

public class RemoteControlApp {
    public static void main(String[] args) {
        TVRemote tvRemote = new TVRemote("Samsung TV");
        ACRemote acRemote = new ACRemote("LG AC");
        DVDRemote dvdRemote = new DVDRemote("Sony DVD Player");

        tvRemote.turnOn();
        tvRemote.changeChannel(5);
        tvRemote.turnOff();

        acRemote.turnOn();
        acRemote.setTemperature(25);
        acRemote.turnOff();

        dvdRemote.turnOn();
        dvdRemote.playMovie("Inception");
        dvdRemote.turnOff();
    }
}
