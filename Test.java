public class Test {
    public static void main(String[] args) {
        double price = 10000;

        PercentageDiscount percentageDiscount = new PercentageDiscount(20);
        ThresholdDiscount thresholdDiscount = new ThresholdDiscount(10000, 500);
        BestForCustomer bestForCustomer = new BestForCustomer(20, 10000, 500);

        double discountedPrice1 = percentageDiscount.discountedPrice(price);
        double discountedPrice2 = thresholdDiscount.discountedPrice(price);
        double discountedPrice3 = bestForCustomer.discountedPrice(price);

        System.out.println("Discounted Price (Percentage Discount): " + discountedPrice1);
        System.out.println("Discounted Price (Threshold Discount): " + discountedPrice2);
        System.out.println("Discounted Price (Best for Customer): " + discountedPrice3);
    }
}