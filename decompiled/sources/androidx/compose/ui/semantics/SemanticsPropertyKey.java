package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001e\b\u0002\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ExifInterface.GPS_DIRECTION_TRUE, "", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, T, T> mergePolicy;

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class a extends Lambda implements Function2<T, T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17571p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final T invoke(@Nullable T t10, T t11) {
            return t10 == null ? t11 : t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String name, @NotNull Function2<? super T, ? super T, ? extends T> mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.name = name;
        this.mergePolicy = mergePolicy;
    }

    @NotNull
    public final Function2<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return (T) SemanticsPropertiesKt.access$throwSemanticsGetNotSupported();
    }

    @Nullable
    public final T merge(@Nullable T parentValue, T childValue) {
        return this.mergePolicy.invoke(parentValue, childValue);
    }

    public final void setValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        thisRef.set(this, value);
    }

    @NotNull
    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f17571p0 : function2);
    }
}
