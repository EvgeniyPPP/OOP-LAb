package lab1;

public class Visit {
    private String service;
    private String price;
    private Date visitDate;

    public Visit() {
    }

    public Visit(String service, String prise, Date visitDate) {
        this.service = service;
        this.price = prise;
        this.visitDate = visitDate;
    }

    public void printInfo() {
        System.out.printf("Visit info:  servise: %s, price: %s%n ", service, price);
        System.out.print("Visit date: ");
        visitDate.printInfo();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
