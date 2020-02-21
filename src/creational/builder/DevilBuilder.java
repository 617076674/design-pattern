package creational.builder;

/**
 * @author qianyihui
 * @date 2019-06-23
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        if (!isBareheader()) {
            actor.setHairstyle("光头");
        }
    }

    //覆盖钩子方法
    public boolean isBareheader() {
        return true;
    }
}
