package nj;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: ActionDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends c<Action> {
    @Override // nj.c
    public final void a(@NonNull Action action) {
        try {
            action.run();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }
}
