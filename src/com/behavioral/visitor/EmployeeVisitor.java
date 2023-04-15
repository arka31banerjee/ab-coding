package com.behavioral.visitor;

public interface EmployeeVisitor {
	AbstractEmployee operateRequest(AbstractEmployee employee);
}
