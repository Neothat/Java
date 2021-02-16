package ru.neothat.Deque;

import ru.neothat.Queue.IQueue;

public interface IDeque<E> extends IQueue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
