package com.example.elkholy.task_1;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by elkholy on 04/02/2017.
 */

public class group implements List<group> {
    String name;
    int imagurl;

    public group(String name, int imagurl) {
        this.imagurl = imagurl;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<group> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public void setImagurl(int imagurl) {
        this.imagurl = imagurl;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean add(group group) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends group> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends group> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public group get(int index) {
        return null;
    }

    @Override
    public group set(int index, group element) {
        return null;
    }

    @Override
    public void add(int index, group element) {

    }

    @Override
    public group remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<group> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<group> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<group> subList(int fromIndex, int toIndex) {
        return null;
    }
}
