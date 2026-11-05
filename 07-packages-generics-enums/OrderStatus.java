public enum OrderStatus {
    PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED;

    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println(status);
    }
}
