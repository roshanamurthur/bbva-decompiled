package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: storage.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StorageKt {
    @NotNull
    public static final <T> T getValue(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, @Nullable Object obj, @NotNull KProperty<?> p4) {
        Intrinsics.checkNotNullParameter(notNullLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        return notNullLazyValue.invoke();
    }

    @Nullable
    public static final <T> T getValue(@NotNull NullableLazyValue<? extends T> nullableLazyValue, @Nullable Object obj, @NotNull KProperty<?> p4) {
        Intrinsics.checkNotNullParameter(nullableLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        return nullableLazyValue.invoke();
    }
}
