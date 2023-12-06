package arrays;
import java.util.Scanner;

public class Invoice1 {
    private String invoiceId;
    private double invoicePrice;
    private String vendorName;
    private String invoiceName;
    private String location;

    public Invoice1() {
        // Default constructor
        invoiceId = "inv1";
        invoicePrice = 2300.50;
        vendorName = "vendor1";
        invoiceName = "abc ltd.";
        location = "Pune";
    }

    public void addInvoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Invoice ID: ");
        invoiceId = input.next();
        System.out.print("Enter Invoice Price: ");
        invoicePrice = input.nextDouble();
        System.out.print("Enter Vendor Name: ");
        vendorName = input.next();
        System.out.print("Enter Invoice Name: ");
        invoiceName = input.next();
        System.out.print("Enter Location: ");
        location = input.next();
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Invoice Price: " + invoicePrice);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Invoice Name: " + invoiceName);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of invoices to store: ");
        int n = input.nextInt();

        Invoice1[] invoices = new Invoice1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Invoice " + (i + 1) + ":");
            invoices[i] = new Invoice1();
            invoices[i].addInvoice();
        }

        System.out.println("\nDisplaying Invoice Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1) + ":");
            invoices[i].displayInvoice();
        }
    }
}
