package qsoft.upstartup.app.rest;

/**
 * Created by p_val on 21.02.15.
 */
public class UpInvest {
    private String id;
    private String price;
    private String priceInOneYear;
    private String investorPart;
    private String investorPartPrice;

    public UpInvest() {
    }

    public UpInvest(String id, String price, String priceInOneYear, String investorPart, String investorPartPrice) {
        this.id = id;
        this.price = price;
        this.priceInOneYear = priceInOneYear;
        this.investorPart = investorPart;
        this.investorPartPrice = investorPartPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceInOneYear() {
        return priceInOneYear;
    }

    public void setPriceInOneYear(String priceInOneYear) {
        this.priceInOneYear = priceInOneYear;
    }

    public String getInvestorPart() {
        return investorPart;
    }

    public void setInvestorPart(String investorPart) {
        this.investorPart = investorPart;
    }

    public String getInvestorPartPrice() {
        return investorPartPrice;
    }

    public void setInvestorPartPrice(String investorPartPrice) {
        this.investorPartPrice = investorPartPrice;
    }

    @Override
    public String toString() {
        return "UpInvest{" +
                "id='" + id + '\'' +
                ", price='" + price + '\'' +
                ", priceInOneYear='" + priceInOneYear + '\'' +
                ", investorPart='" + investorPart + '\'' +
                ", investorPartPrice='" + investorPartPrice + '\'' +
                '}';
    }
}
