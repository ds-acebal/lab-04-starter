package es.uniovi.eii.ds.forms;

public interface Field {
	void edit(); // Asks the user to enter a value for the field.
	String label();
	String value();
}
