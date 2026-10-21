package ak;

import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes12.dex */
public class c extends LazyKt__LazyJVMKt {
    @InlineOnly
    private static final <T> T getValue(Lazy<? extends T> lazy, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return lazy.getValue();
    }

    @NotNull
    public static <T> Lazy<T> lazyOf(T t10) {
        return new InitializedLazyImpl(t10);
    }
}
