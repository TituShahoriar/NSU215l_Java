interface Discountable {
    double discountedPrice(double price);
}

class PercentageDiscount implements Discountable {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double discountedPrice(double price) {
        return price - (price * (percentage / 100.0));
    }
}
class ThresholdDiscount implements Discountable {
    private double threshold;
    private double discount;

    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        if (price >= threshold) {
            return price - discount;
        } else {
            return price;
        }
    }
}

class BestForCustomer {
    private double percentage;
    private double threshold;
    private double discount;

    public BestForCustomer(double percentage, double threshold, double discount) {
        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        Discountable percentageDiscount = new PercentageDiscount(percentage);
        Discountable thresholdDiscount = new ThresholdDiscount(threshold, discount);

        double discountedPrice = percentageDiscount.discountedPrice(price);
        double finalPrice = thresholdDiscount.discountedPrice(discountedPrice);

        return finalPrice;
    }
}

