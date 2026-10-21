package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(String str, @NonNull Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }

    public OnErrorNotImplementedException(@NonNull Throwable th2) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2);
    }
}
