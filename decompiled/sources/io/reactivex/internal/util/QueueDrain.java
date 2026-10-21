package io.reactivex.internal.util;

import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public interface QueueDrain<T, U> {
    boolean accept(Subscriber<? super U> subscriber, T t10);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i10);

    long produced(long j10);

    long requested();
}
