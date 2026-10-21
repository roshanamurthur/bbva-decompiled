package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,674:1\n1#2:675\n*E\n"})
public final class r implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f94391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f94393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f94394d;

    public r(float f6, float f10, float f11, float f12) {
        this.f94391a = f6;
        this.f94392b = f10;
        this.f94393c = f11;
        this.f94394d = f12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Dp.m4394equalsimpl0(this.f94391a, rVar.f94391a) && Dp.m4394equalsimpl0(this.f94392b, rVar.f94392b) && Dp.m4394equalsimpl0(this.f94393c, rVar.f94393c) && Dp.m4394equalsimpl0(this.f94394d, rVar.f94394d);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo413roundToPx0680j_4(this.f94394d);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo413roundToPx0680j_4(this.f94391a);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo413roundToPx0680j_4(this.f94393c);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo413roundToPx0680j_4(this.f94392b);
    }

    public final int hashCode() {
        return Dp.m4395hashCodeimpl(this.f94394d) + androidx.camera.camera2.internal.compat.u.a(this.f94393c, androidx.camera.camera2.internal.compat.u.a(this.f94392b, Dp.m4395hashCodeimpl(this.f94391a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "Insets(left=" + ((Object) Dp.m4400toStringimpl(this.f94391a)) + ", top=" + ((Object) Dp.m4400toStringimpl(this.f94392b)) + ", right=" + ((Object) Dp.m4400toStringimpl(this.f94393c)) + ", bottom=" + ((Object) Dp.m4400toStringimpl(this.f94394d)) + RootService.CLOSE_BRACKET;
    }
}
