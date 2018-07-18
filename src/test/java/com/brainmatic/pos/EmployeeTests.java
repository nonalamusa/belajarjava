package com.brainmatic.pos;

import com.brainmatic.pos.core.Employee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTests {

    @Test
    public void default_employee_age_should25(){
        Employee e = new Employee();
        assertEquals(25,e.getAge());
    }
}
