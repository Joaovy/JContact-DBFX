package model.services;

import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){

        // MOCK retornar os dados de mentira para test
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "book"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Shoes"));
        list.add(new Department(4, "technology"));
        list.add(new Department(5, "food"));

        return list;
    }

}
