package r2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T> extends g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f92906a;

    public c(@NotNull Throwable readException) {
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f92906a = readException;
    }
}
