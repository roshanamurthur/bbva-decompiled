package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: exceptionUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!Intrinsics.areEqual(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable e5) throws Throwable {
        Intrinsics.checkNotNullParameter(e5, "e");
        throw e5;
    }
}
