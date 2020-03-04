package creational.builder.demo2;

public class MemoryPatternBuilder extends PatternBuilder {
    @Override
    public void buildMenu() {
        pattern.setMenu("记忆模式菜单");
    }

    @Override
    public void buildPlayList() {
        pattern.setPlayList("记忆模式播放列表");
    }

    @Override
    public void buildMainWindow() {
        pattern.setMainWindow("记忆模式主窗口");
    }

    @Override
    public void buildControlBar() {
        pattern.setControlBar("记忆模式控制条");
    }
}