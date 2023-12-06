package net.mooctest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HeapItemTest {
    private final Random rng = new Random();

    @Test
    void getMultiWayAncestor() {
        var node = new Heap_Item<>(1);
        assertNull(node.getMultiWayAncestor());
        var anc = new Heap_Item<>(2);
        anc.setLeftSon(node);
        node.setAncestor(anc);
        assertEquals(node.getMultiWayAncestor(), anc);
    }

    @Test
    void getData() {
        var data = rng.nextInt();
        var node = new Heap_Item<>(data);
        assertEquals(node.getData(), data);
    }

    @Test
    void getSonByData() {
        var dataA = rng.nextInt();
        var dataB = rng.nextInt();
        while (dataB == dataA) dataB = rng.nextInt();
        var nodeA = new Heap_Item<>(dataA);
        var nodeB = new Heap_Item<>(dataB);
        var parent = new Heap_Item<Integer>();
        parent.setLeftSon(nodeA);
        parent.setRightSon(nodeB);
        assertSame(parent.getSonByData(dataA), nodeA);
        assertSame(parent.getSonByData(dataB), nodeB);
    }

    @Test
    void itIsLeftSon() {
        var nodeA = new Heap_Item<>(1);
        var nodeB = new Heap_Item<>(2);
        var parent = new Heap_Item<>(3);
        parent.setLeftSon(nodeA);
        parent.setRightSon(nodeB);
        assertTrue(parent.itIsLeftSon(nodeA));
        assertFalse(parent.itIsLeftSon(nodeB));
        assertFalse(nodeA.itIsLeftSon(parent));
    }
}