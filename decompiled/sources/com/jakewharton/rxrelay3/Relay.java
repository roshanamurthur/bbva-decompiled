package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import qh.a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Relay<T> extends Observable<T> implements Consumer<T> {
    public abstract void accept(@NonNull T t10);

    public abstract boolean hasObservers();

    @CheckReturnValue
    @NonNull
    public final Relay<T> toSerialized() {
        return this instanceof a ? this : new a(this);
    }
}
