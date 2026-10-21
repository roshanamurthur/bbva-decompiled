package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    public boolean addThrowable(Throwable th2) {
        return ExceptionHelper.addThrowable(this, th2);
    }

    public boolean isTerminated() {
        return get() == ExceptionHelper.TERMINATED;
    }

    public Throwable terminate() {
        return ExceptionHelper.terminate(this);
    }
}
