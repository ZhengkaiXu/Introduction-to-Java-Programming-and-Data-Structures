public class TV {
    int channel = 1; // Default channel is 1
    int volumnLevel = 1; // Default volumn level is 1
    boolean on = false; // TV is off

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolumn(int newVolumnLevel) {
        if (on && newVolumnLevel >= 1 && newVolumnLevel <= 7) {
            volumnLevel = newVolumnLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumnUp() {
        if (on && volumnLevel < 7) {
            volumnLevel++;
        }
    }

    public void volumnDown() {
        if (on && volumnLevel > 1) {
            volumnLevel--;
        }
    }


}
















