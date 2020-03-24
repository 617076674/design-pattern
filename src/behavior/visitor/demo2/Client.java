package behavior.visitor.demo2;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.countOfArticles = 3;
        student.accept((Checker) Objects.requireNonNull(XMLUtil.getBean()));
    }
}