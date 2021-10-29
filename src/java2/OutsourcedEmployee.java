package java2;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment () {
        return super.payment() + additionalCharge * 1.1;
    } // sobreescreveu o metodo em uma classe que foi herança de employee pq tinha o adicional em um certo caso

}
