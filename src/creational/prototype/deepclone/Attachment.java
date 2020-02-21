package creational.prototype.deepclone;

import java.io.Serializable;

/**
 * @author qianyihui
 * @date 2019-06-24
 */
public class Attachment implements Serializable {
    private String name;    //附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
