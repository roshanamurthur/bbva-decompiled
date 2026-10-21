package com.fasterxml.jackson.databind.util;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkedNode<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f43514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedNode<T> f43515b;

    public LinkedNode(T t10, LinkedNode<T> linkedNode) {
        this.f43514a = t10;
        this.f43515b = linkedNode;
    }

    public static <ST> boolean contains(LinkedNode<ST> linkedNode, ST st) {
        while (linkedNode != null) {
            if (linkedNode.value() == st) {
                return true;
            }
            linkedNode = linkedNode.next();
        }
        return false;
    }

    public void linkNext(LinkedNode<T> linkedNode) {
        if (this.f43515b != null) {
            throw new IllegalStateException();
        }
        this.f43515b = linkedNode;
    }

    public LinkedNode<T> next() {
        return this.f43515b;
    }

    public T value() {
        return this.f43514a;
    }
}
