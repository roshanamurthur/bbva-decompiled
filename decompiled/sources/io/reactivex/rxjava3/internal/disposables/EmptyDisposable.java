package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {
    private static final /* synthetic */ EmptyDisposable[] $VALUES;
    public static final EmptyDisposable INSTANCE;
    public static final EmptyDisposable NEVER;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        INSTANCE = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        NEVER = emptyDisposable2;
        $VALUES = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public EmptyDisposable() {
        throw null;
    }

    public static void complete(Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable th2, Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th2);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onComplete();
    }

    public static void error(Throwable th2, CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onError(th2);
    }

    public static void complete(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onComplete();
    }

    public static void error(Throwable th2, SingleObserver<?> singleObserver) {
        singleObserver.onSubscribe(INSTANCE);
        singleObserver.onError(th2);
    }

    public static void error(Throwable th2, MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onError(th2);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }
}
