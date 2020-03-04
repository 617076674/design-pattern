package creational.builder.demo1;

public class Client {
    public static void main(String[] args) {
        ActorBuilder ab = (ActorBuilder) XMLUtil.getBean();
        Actor actor = ab.construct();
        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
