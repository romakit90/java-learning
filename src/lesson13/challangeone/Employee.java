package lesson13.challangeone;

public class Employee extends Worker{

    private String employmentDate;
    private String position;

    public Employee(String name, int age, String contactPhone, String email, String employmentDate, String position) {
        super(name, age, contactPhone, email);
        this.employmentDate = employmentDate;
        this.position = position;
    }

    @Override
    public double calculateSalary() {
        String normalizedPosition = (position == null) ? "" : position.toLowerCase();
        return switch (normalizedPosition) {
            case "manager" -> super.calculateSalary() + 2000.0;
            case "developer" -> super.calculateSalary() + 1500.0;
            case "designer" -> super.calculateSalary() + 1200.0;
            default -> super.calculateSalary();
        };
    }

    public int calculateMonthsWorked(String startDate, String endDate) {
        String[] startParts = startDate.split("/");
        String[] endParts = endDate.split("/");

        int startMonth = Integer.parseInt(startParts[0]);
        int startYear = Integer.parseInt(startParts[2]);
        int endMonth = Integer.parseInt(endParts[0]);
        int endYear = Integer.parseInt(endParts[2]);

        return (endYear - startYear) * 12 + (endMonth - startMonth);
    }

    public String paymentHistory() {
        String currentDate = "04/22/2026";
        int monthsWorked = calculateMonthsWorked(employmentDate, currentDate);
        StringBuilder history = new StringBuilder();
        for (int i = 1; i <= monthsWorked; i++) {
            history.append(String.format("Payment for Month %d: $%.2f\n", i, calculateSalary()));
        }
        return history.toString();
    }

    public String getPaymentSummary() {
        double summaryPayed = calculateMonthsWorked(employmentDate, "04/22/2026") * calculateSalary();
        return String.format("Total Paid to %s: $%.2f", getName(), summaryPayed);
    }

    @Override
    public String toString() {
        return """
               Employee: %s
               Age: %d
               Phone: %s
               Email: %s
               Employment Date: %s
               Position: %s
               Salary: $%.2f""".formatted(getName(), getAge(), getContactPhone(), getEmail(), employmentDate, position, calculateSalary());

    }
}
