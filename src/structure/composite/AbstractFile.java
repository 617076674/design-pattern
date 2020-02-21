package structure.composite;

/**
 * @author qianyihui
 * @date 2019-06-17
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}
