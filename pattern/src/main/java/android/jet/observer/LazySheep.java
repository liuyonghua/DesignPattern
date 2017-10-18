package android.jet.observer;

/**
 * Created by Administrator on 2017/10/17.
 */

public class LazySheep implements Observer {

    @Override
    public String getName() {
        return "懒羊羊";
    }

    @Override
    public void update(String msg) {
        System.out.println("懒羊羊收到通知：" + msg);
    }

}
