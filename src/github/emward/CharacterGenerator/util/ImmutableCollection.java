package com.projects.CharacterGenerator.util;

import java.util.Collection;
import java.util.Iterator;

public class ImmutableCollection<E> implements Collection<E> {

    private final Collection<E> immutable;

    public ImmutableCollection(Collection<E> immutable) {
        this.immutable = immutable;
    }

    @Override
    public int size() {
        return this.immutable.size();
    }

    @Override
    public boolean isEmpty() {
        return this.immutable.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.immutable.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return new ImmutableIterator(this.immutable.iterator());
    }

    @Override
    public Object[] toArray() {
        return this.immutable.toArray();
    }

    @Override
    public <V> V[] toArray(V[] a) {
        return this.immutable.toArray(a);
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.immutable.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public class ImmutableIterator implements Iterator<E> {

        private final Iterator<E> iterator;

        ImmutableIterator(Iterator<E> iterator) {
            this.iterator = iterator;
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public E next() {
            return iterator.next();
        }
    }
}
