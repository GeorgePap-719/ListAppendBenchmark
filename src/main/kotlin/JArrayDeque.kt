package org.example

import java.util.*

// For the same of testing the implementation using the same benchmark.
class JArrayDeque<T> : ArrayDeque<T>(), MutableList<T> {
    override fun getFirst(): T {
        return super<ArrayDeque>.getFirst()
    }

    override fun getLast(): T {
        return super<ArrayDeque>.getLast()
    }
    override fun add(element: T): Boolean {
        addLast(element!!)
        return true
    }

    override fun add(index: Int, element: T) {
        TODO("Not yet implemented")
    }

    override fun set(index: Int, element: T): T {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: T): Int {
        TODO("Not yet implemented")
    }

    override fun addAll(index: Int, elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

    override fun listIterator(): MutableListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): MutableListIterator<T> {
        TODO("Not yet implemented")
    }

    override fun removeAt(index: Int): T {
        TODO("Not yet implemented")
    }

    override fun spliterator(): Spliterator<T> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
        TODO("Not yet implemented")
    }
}