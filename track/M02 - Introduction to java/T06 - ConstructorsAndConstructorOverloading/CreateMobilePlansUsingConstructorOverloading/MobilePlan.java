
class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }

}
