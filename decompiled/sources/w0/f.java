package w0;

import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements BuildDrawCacheParams {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final f f94110p0 = new f();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f94111q0 = Size.INSTANCE.m2352getUnspecifiedNHjbRc();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final LayoutDirection f94112r0 = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Density f94113s0 = DensityKt.Density(1.0f, 1.0f);

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public final Density getDensity() {
        return f94113s0;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return f94112r0;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public final long mo2199getSizeNHjbRc() {
        return f94111q0;
    }
}
