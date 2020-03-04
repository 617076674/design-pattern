package creational.builder.demo2;

public class SimplePatternBuilder extends PatternBuilder {
    @Override
    public void buildMenu() {
        pattern.setMenu("精简模式菜单");
    }

    @Override
    public void buildPlayList() {
        pattern.setPlayList("精简模式播放列表");
    }

    @Override
    public void buildMainWindow() {
        pattern.setMainWindow("精简模式主窗口");
    }

    @Override
    public void buildControlBar() {
        pattern.setControlBar("精简模式控制条");
    }

    @Override
    public boolean displayMenu() {
        return false;
    }

    @Override
    public boolean displayPlayList() {
        return false;
    }
}