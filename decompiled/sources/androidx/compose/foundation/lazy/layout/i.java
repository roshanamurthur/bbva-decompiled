package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    @Nullable
    public static Object a(LazyLayoutItemProvider lazyLayoutItemProvider, int i10) {
        return null;
    }

    public static int b(LazyLayoutItemProvider lazyLayoutItemProvider, @NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return -1;
    }

    @NotNull
    public static Object c(LazyLayoutItemProvider lazyLayoutItemProvider, int i10) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i10);
    }
}
