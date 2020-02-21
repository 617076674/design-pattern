package behavior.responsibility;

/**
 * @author qianyihui
 * @date 2019-07-02
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批代购单" + this.name + "审批采购单：" + request.getNumber()
                + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
    }
}
