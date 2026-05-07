package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartment extends Department {
    private List<Department> children =
            new ArrayList<Department>();

    public CompositeDepartment(String name) {
        super(name);
    }

    public CompositeDepartment add(Department department){
        children.add(department);
        return this;
    }

    public CompositeDepartment remove(Department department){
        children.remove(department);
        return this;
    }

    public void print(){
//        for (int i = 0; i < children.size(); i++) {
//            Department child = children.get(i);
//            child.print();
//        }
        children.forEach(Department::print);
    }
}
