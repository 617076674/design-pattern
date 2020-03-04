package creational.builder.demo2;

public abstract class PatternBuilder {
    protected Pattern pattern = new Pattern();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildMainWindow();

    public abstract void buildControlBar();

    public boolean displayMenu() {
        return true;
    }

    public boolean displayPlayList() {
        return true;
    }

    public boolean displayMainWindow() {
        return true;
    }

    public boolean displayControlBar() {
        return true;
    }

    public Pattern construct() {
        this.buildMenu();
        this.buildPlayList();
        this.buildMainWindow();
        this.buildControlBar();
        return pattern;
    }
}