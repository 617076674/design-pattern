package creational.builder.demo2;

public class FullPatternBuilder extends PatternBuilder {
    @Override
    public void buildMenu() {
        pattern.setMenu("完整模式菜单");
    }

    @Override
    public void buildPlayList() {
        pattern.setPlayList("完整模式播放列表");
    }

    @Override
    public void buildMainWindow() {
        pattern.setMainWindow("完整模式主窗口");
    }

    @Override
    public void buildControlBar() {
        pattern.setControlBar("完整模式控制条");
    }
}