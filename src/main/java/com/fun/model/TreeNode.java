package com.fun.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ira on 3/10/2017.
 */
public class TreeNode<T> {

    private TreeNode<T> root;
    private List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();
    private T data;

    public TreeNode(T data){
        this.data = data;
    }

    public void setRoot(TreeNode<T> root){
        this.root = root;
    }

    public void addChild(TreeNode<T> child){
        children.add(child);
    }

    public List<TreeNode<T>> getChildren(){
        return children;
    }

    public T getData() {
        return data;
    }
}
