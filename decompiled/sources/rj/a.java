package rj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: ActionDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends f<Action> {
    @Override // rj.f
    public final void a(@NonNull Action action) {
        try {
            action.run();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
