package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalLayoutApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R+\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "insets", "initialInsets", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n81#2:675\n107#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n81#1:675\n81#1:676,2\n*E\n"})
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState insets;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getInsets().getBottom(density);
    }

    @NotNull
    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getInsets().getTop(density);
    }

    public final void setInsets(@NotNull WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<set-?>");
        this.insets.setValue(windowInsets);
    }

    public MutableWindowInsets(@NotNull WindowInsets initialInsets) {
        Intrinsics.checkNotNullParameter(initialInsets, "initialInsets");
        this.insets = SnapshotStateKt.mutableStateOf$default(initialInsets, null, 2, null);
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
