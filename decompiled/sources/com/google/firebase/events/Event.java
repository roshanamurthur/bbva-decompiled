package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public class Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f48395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f48396b;

    public Event(Class<T> cls, T t10) {
        this.f48395a = (Class) Preconditions.checkNotNull(cls);
        this.f48396b = (T) Preconditions.checkNotNull(t10);
    }

    public T getPayload() {
        return this.f48396b;
    }

    public Class<T> getType() {
        return this.f48395a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f48395a, this.f48396b);
    }
}
