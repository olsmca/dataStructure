package dataStructure.tree;

import dataStructure.Employee;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString
@Log
public class TreeBinaryImp implements Tree<Employee>{

    private Employee employee;
    private TreeBinaryImp left, right;
    private TreeBinaryImp father;


    private void addImp(Employee employee, TreeBinaryImp father) {
        if (this.isEmpty()){
            this.employee = employee;
            this.father = father;
        }else{
            if(employee.compareTo(this.employee)<0){
                if (this.left == null) this.left =new TreeBinaryImp();
                this.left.addImp(employee, this);
            }else if(employee.compareTo(this.employee)>0){
                if (this.right == null) this.right =new TreeBinaryImp();
                this.right.addImp(employee, this);
            }else{
                throw new RuntimeException("Duplicate item");
            }
        }
    }

    @Override
    public void add(Employee employee){
        addImp(employee, null);
    }

    @Override
    public boolean isExist(int id) {
        if (!this.isEmpty()){
            if (this.employee.getId()==id){
                return true;
            }else if(id < this.employee.getId() && this.left != null){
                return this.left.isExist(id);
            }else if(id > this.employee.getId() && this.right != null){
                return this.right.isExist(id);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public Employee get(int id) {
        if (!this.isEmpty()){
            if (this.employee.getId()==id){
                return this.employee;
            }else if(id < this.employee.getId() && this.left != null){
                return this.left.get(id);
            }else if(id > this.employee.getId() && this.right != null){
                return this.right.get(id);
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public boolean isLeaf() {
        return this.employee!=null && this.left ==null && this.right ==null;
    }

    @Override
    public boolean isEmpty() {
        return this.employee==null;
    }

    @Override
    public void preOrder() {
        if (this.employee != null){
            System.out.println(" "+this.employee);
            if(this.left != null) this.left.preOrder();
            if(this.right != null) this.right.preOrder();
        }
    }

    @Override
    public void postOrder() {
        if (this.employee != null){
            if(this.left != null) this.left.postOrder();
            if(this.right != null) this.right.postOrder();
            System.out.println(" "+this.employee);
        }
    }

    @Override
    public void inOrder() {
        if (this.employee != null){
            if(this.left != null) this.left.inOrder();
            System.out.println(" "+this.employee);
            if(this.right != null) this.right.inOrder();
        }
    }

    @Override
    public void delete(int id) {
        if(this.employee!=null){
            if(id == this.employee.getId()){
                deleteImpl(id);
            }else if(id < this.employee.getId() && this.left != null){
                this.left.delete(id);
            }else if(id > this.employee.getId() && this.right != null){
                this.right.delete(id);
            }
        }
    }

    private void deleteImpl(int id){
        if(this.left != null && this.right!=null){
            // delete with two son
            TreeBinaryImp minTree = this.right.min();
            this.employee = minTree.employee;
            this.right.delete(minTree.employee.getId());

            

        }else if(this.left != null || this.right != null){
            // delete with one son
            TreeBinaryImp aux = this.left !=null?this.left:this.right;
            this.employee= aux.employee;
            this.left = aux.left;
            this.right = aux.right;
        }else {
            //delete with zero son
            if (this.father!= null){
                if (this == this.father.left) this.father.left=null;
                if (this == this.father.right) this.father.right=null;
                this.father=null;
            }
            this.employee=null;
        }
    }

    private TreeBinaryImp min(){
        if (this.left !=null && !this.left.isEmpty()){
            return this.min();
        }else{
            return this;
        }
    }
}
