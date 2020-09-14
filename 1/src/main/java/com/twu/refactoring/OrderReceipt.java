package com.twu.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		final String header = "======Printing Orders======\n";
		output.append(header);

		// print date, bill no, customer name
		output.append(order.getDate());
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
        output.append(order.getCustomerLoyaltyNumber());

		// prints lineItems
		double totSalesTx = 0d;
		double tot = 0d;
		printLineItems(output, totSalesTx, tot);
		return output.toString();
	}

	public void printLineItems(StringBuilder output, double totSalesTx, double tot) {
		for (LineItem lineItem : order.getLineItems()) {
			outputAppendStrings(output.append(lineItem.getDescription()), '\t');
			outputAppendStrings(output.append(lineItem.getPrice()), '\t');
			outputAppendStrings(output.append(lineItem.getQuantity()), '\t');
			outputAppendStrings(output.append(lineItem.totalAmount()), '\n');

			// calculate sales tax @ rate of 10%
			double taxRate = .10;
            double salesTax = lineItem.totalAmount() * taxRate;
            totSalesTx += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            tot += lineItem.totalAmount() + salesTax;
		}

		// prints the state tax
		output.append("Sales Tax").append('\t').append(totSalesTx);

		// print total amount
		output.append("Total Amount").append('\t').append(tot);
	}

	public void outputAppendStrings(StringBuilder append, char c) {
		append.append(c);
	}
}