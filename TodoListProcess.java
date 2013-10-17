/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iss.todolist;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.util.Nonbinding;
import javax.faces.bean.NoneScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Deepak Pakhale
 */
@ManagedBean
@Named
@SessionScoped
public class TodoListProcess implements Serializable{

    
    private String name;
    private String task;
    private boolean selected;
    private ArrayList<TodoListElement>todolistitemList = new ArrayList<>();
     
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public ArrayList<TodoListElement> getTodolistitemList() {
        return todolistitemList;
    }
    public void setTodolistitemList(ArrayList<TodoListElement> todolistitemList) {
        this.todolistitemList = todolistitemList;
    }
    public void addToitemList(){
        TodoListElement todolistitem = new TodoListElement();
        
             
        todolistitem.setName(name);
        todolistitem.setTask(task);
        todolistitem.setSelected(selected);
        todolistitemList.add(todolistitem);
    }
    
}
