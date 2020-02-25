package creational.prototype.demo2.deepclone;

import java.io.*;

public class Customer implements Serializable {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    protected Customer deepClone() throws IOException, ClassNotFoundException  {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
        return (Customer) ois.readObject();
    }
}