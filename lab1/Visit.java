package lab1;

public class Visit {
    private String service;
    private String prise;
    private Date visitDate;

    public Visit() {
    }

    public Visit(String service, String prise, Date visitDate) {
        this.service = service;
        this.prise = prise;
        this.visitDate = visitDate;
    }

    public void printInfo() {
        System.out.printf("Visit info:  servise: %s, price: %s%n ", service, prise);
        System.out.println("Owner birthdate: ");
        visitDate.printInfo();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
