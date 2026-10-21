package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/AnimatedPaddingValues\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n88#2:747\n88#2:748\n154#3:749\n154#3:750\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/AnimatedPaddingValues\n*L\n674#1:747\n675#1:748\n677#1:749\n678#1:750\n*E\n"})
public final class b implements PaddingValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final State<Float> f82428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<Dp> f82429b;

    public b(@NotNull State<Float> animationProgress, @NotNull State<Dp> topPadding) {
        Intrinsics.checkNotNullParameter(animationProgress, "animationProgress");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        this.f82428a = animationProgress;
        this.f82429b = topPadding;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public final float getBottom() {
        return Dp.m4389constructorimpl(this.f82428a.getValue().floatValue() * SearchBarKt.getSearchBarVerticalPadding());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo302calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Dp.m4389constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public final float mo303calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Dp.m4389constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public final float getTop() {
        return Dp.m4389constructorimpl(this.f82428a.getValue().floatValue() * this.f82429b.getValue().m4403unboximpl());
    }
}
