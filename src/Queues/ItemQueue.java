package Queues;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ItemQueue implements Queue<Item> {

    public ArrayDeque<Item> wow;

    public ItemQueue()
    {
        wow = new ArrayDeque<>();
    }

    public boolean add(Item item)
    {
        return wow.add(item);
    }

    public Item element()
    {
        return wow.element();
    }

    public boolean offer(Item item)
    {
        return wow.offer(item);
    }

    public Item peek()
    {
        return wow.peek();
    }

    public Item poll()
    {
        return wow.poll();
    }

    public Item remove()
    {
        wow.remove();
    }

    public void clear()
    {
        wow.clear();
    }

    public int size()
    {
        return wow.size();
    }

    public Iterator<Item> iterator()
    {
        return wow.iterator();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
