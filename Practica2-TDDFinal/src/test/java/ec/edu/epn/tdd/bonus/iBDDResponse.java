package ec.edu.epn.tdd.bonus;

public class iBDDResponse {
    enum BDDStatus{
        OK,ERROR;
    }
    private BDDStatus status;

    public iBDDResponse(BDDStatus status) {
        this.status = status;
    }

    public BDDStatus getStatus() {
        return status;
    }
}
