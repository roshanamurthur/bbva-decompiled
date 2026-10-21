package r2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f92905a;

    public b(@NotNull Throwable finalException) {
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f92905a = finalException;
    }
}
