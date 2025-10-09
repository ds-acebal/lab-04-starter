package es.uniovi.eii.ds.forms;

import java.io.*;

public class NumericField implements Field {

	private String label;
	private String value;

	public NumericField(String label) {
		this.label = label;
	}

	@Override
	public void edit() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		boolean isValid = false;
		do {
			try {
				System.out.print(label + ": ");
				value = console.readLine();
				isValid = true;
				for (char ch : value.toCharArray()) {
					if (!Character.isDigit(ch)) {
						isValid = false;
						break;
					}
				}
				if (!isValid) {
					System.out.println("Please enter digits only.");
				}
			} catch (IOException e) {
				System.out.println("Error reading input. Please try again.");
			}
		} while (!isValid);
	}

	@Override
	public String label() {
		return label;
	}

	@Override
	public String value() {
		return value;
	}
}
