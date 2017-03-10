package com.fun.tree;

import com.fun.controller.JsonReader;
import com.fun.model.NavigationItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Created by Ira on 3/10/2017.
 */
public class ReadJSONTest {

    private JsonReader jsonReader;

    @Before
    public void before(){
        ClassLoader classLoader = getClass().getClassLoader();
        jsonReader = new JsonReader(new File(classLoader.getResource("tree.json").getFile()));
    }

    @Test
    public void testReadToList(){
        List<NavigationItem> items = jsonReader.readToList(NavigationItem.class);

        items.forEach(System.out::println);

        Assert.assertFalse(items.isEmpty());
    }
}
