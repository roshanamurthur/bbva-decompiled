package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class Exceptions {
    public Exceptions() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static RuntimeException propagate(@NonNull Throwable th2) {
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public static void throwIfFatal(@NonNull Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
