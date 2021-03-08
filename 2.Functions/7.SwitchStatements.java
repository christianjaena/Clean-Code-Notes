/**
	SWITCH STATEMENTS
*/

// This function has several problems.
// 1. It's large, and will grow eventually
// 2. It does more than one thing.
// 3. It violates the Single Responsibility Principle
// 4. It violates Open Closed Principle
// 5. It could have many forms of structure like this function. (isPayDay(), deliverPay())

public Money calculatePay(Employee e) throws InvalidEmployeeType {
	switch (e.TYPE) {
		case COMMISSIONED:
			return calculateCommissionedPay(e);
		case HOURLY:
			return calculateHourlyPay(e);
		case SALARIED:
			return calculateSalariedPay(e);
		default:
			throw new InvalidEmployeeType(e.type);
	}
}

// SOLUTION: Bury the switch statement in the basement of an ABSTRACT FACTORY, and never let anyone see it. The factory will use the switch statement to create appropriate instances of the derivatives of Employee, and the various functions, such as calculatePay, isPayday, and deliverPay will be dispatched polymorphically through the Employee interface.
// GENERAL RULE: switch statements can be tolerated if they appear only once, are used to create polymorphic objects, and are hidden behind an inheritance relationship so that the rest of the system can't see them.

public abstract class Employee {
	public abstract boolean isPayDay();
	public abstract Money calculatePay();
	public abstract void deliverPay(Money pay);
}

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

public class EmployeeFactoryImpl implements EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws Invalid EmployeeType {
		switch (r.type) {
			case COMMISSIONED:
				return new CommissionedEmployee(r);
			case HOURLY:
				return new HourlyEmployee(r);
			case SALARIED:
				return new SalariedEmployee(r);
			default:
				throw new InvalidEmployeeType(r.type);
		}
	}
}