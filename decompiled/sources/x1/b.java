package x1;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Density {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f94478p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f94479q0;

    public b(float f6, float f10) {
        this.f94478p0 = f6;
        this.f94479q0 = f10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f94478p0, bVar.f94478p0) == 0 && Float.compare(this.f94479q0, bVar.f94479q0) == 0;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f94478p0;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.f94479q0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f94479q0) + (Float.floatToIntBits(this.f94478p0) * 31);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
        return a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
        return a.b(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
        return a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
        return a.d(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
        return a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
        return a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final /* synthetic */ float mo415toPx0680j_4(float f6) {
        return a.h(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    public final /* synthetic */ Rect toRect(DpRect dpRect) {
        return a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
        return a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
        return a.k(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
        return a.l(this, f6);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f94478p0);
        sb2.append(", fontScale=");
        return u.i(sb2, this.f94479q0, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
        return a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
        return a.m(this, i10);
    }
}
