package l0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,746:1\n76#2:747\n102#2,2:748\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/MutableWindowInsets\n*L\n695#1:747\n695#1:748,2\n*E\n"})
public final class m2 implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f82700a;

    public m2() {
        this(0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return ((WindowInsets) this.f82700a.getValue()).getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return ((WindowInsets) this.f82700a.getValue()).getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return ((WindowInsets) this.f82700a.getValue()).getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return ((WindowInsets) this.f82700a.getValue()).getTop(density);
    }

    public m2(int i10) {
        WindowInsets initialInsets = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
        Intrinsics.checkNotNullParameter(initialInsets, "initialInsets");
        this.f82700a = SnapshotStateKt.mutableStateOf$default(initialInsets, null, 2, null);
    }
}
