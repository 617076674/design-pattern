package structure.proxy.demo2;

public class SmallPicture extends Picture {
    BigPicture bigPicture;

    @Override
    public void show() {
        System.out.println("小图标");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bigPicture = new BigPicture();
                bigPicture.show();
            }
        };
        task.run();
    }
}