package com.bridgelabz;

import org.junit.jupiter.api.*;
import java.util.*;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void shouldAddElementToTheList() {
        listManager.addElement(list, 3);

        // should match the size of the list after adding one element
        Assertions.assertEquals(1, list.size());
        Assertions.assertTrue(list.contains(3));
    }

    @Test
    public void shouldRemoveElementFromTheList() {
        listManager.addElement(list, 5);
        listManager.removeElement(list, 5);

        // should be empty after removing the only element
        Assertions.assertEquals(0, list.size());
        Assertions.assertFalse(list.contains(5));
    }
}
