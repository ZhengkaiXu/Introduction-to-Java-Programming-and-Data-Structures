public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumn(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumnUp();

        System.out.println("tv1's channel is " + tv1.channel
        + " and volumn level is " + tv1.volumnLevel);
        System.out.println("tv2's channel is " + tv2.channel
        + " and volumn level is " + tv2.volumnLevel);

    }
}
