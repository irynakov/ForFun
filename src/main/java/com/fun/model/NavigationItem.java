package com.fun.model;

import java.util.List;

/**
 * Created by Ira on 3/10/2017.
 */
public class NavigationItem {

    private String name;
    private List<NavigationItem> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NavigationItem> getChildren() {
        return children;
    }

    public void setChildren(List<NavigationItem> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "NavigationItem{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
