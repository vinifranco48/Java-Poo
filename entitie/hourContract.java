package entitie;

import java.util.Date;

public class hourContract {
private Date date;
private Double valuePerHour;
private Integer hours;

public hourContract() {
	
}

public hourContract(Date date, Double valuePerHpur, Integer hours) {
	super();
	this.date = date;
	this.valuePerHour = valuePerHpur;
	this.hours = hours;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Double getValuePerHour() {
	return valuePerHour;
}

public void setValuePerHpur(Double valuePerHpur) {
	this.valuePerHour = valuePerHpur;
}

public Integer getHours() {
	return hours;
}

public void setHours(Integer hours) {
	this.hours = hours;
}
public double totalValue() {
	return valuePerHour * hours;
}

}
