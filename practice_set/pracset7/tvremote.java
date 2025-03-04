interface tvremote1 {
    public void On_Tv();
    public void Off_tv();
}
interface SmartTvRemote extends tvremote1{ //here i was doing a mistake by using implement keyword instead of extends while inheriting an interface
    void change_channel();
}

class useremote implements SmartTvRemote{
    @Override
    public void On_Tv() {
        System.out.println("tv comes to life");
    }

    @Override
    public void Off_tv() {
        System.out.println("tv turning off");
    }

    @Override
    public void change_channel() {
        System.out.println("change the channel");
    }
}

public class tvremote {
    public static void main(String[] args) {
        SmartTvRemote remo = new useremote();
        remo.Off_tv();
        remo.On_Tv();
        remo.change_channel();
    }
}
