package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b3\u00104J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u0004*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u0003*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u0013*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001J\u001a\u0010\u001e\u001a\u00020\u0012*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001a\u0010!\u001a\u00020\b*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\b*\u00020\u000eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J\u001d\u0010!\u001a\u00020\b*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u00100\u001a\u00020/8WX\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/unit/LayoutDirection;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "intrinsicMeasureScope", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ IntrinsicMeasureScope f16563q0;

    public IntrinsicsMeasureScope(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.layoutDirection = layoutDirection;
        this.f16563q0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f16563q0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.f16563q0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @ExperimentalComposeUiApi
    public boolean isLookingAhead() {
        return this.f16563q0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final /* synthetic */ MeasureResult layout(int i10, int i11, Map map, Function1 function1) {
        return MeasureScope.CC.a(this, i10, i11, map, function1);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo412roundToPxR2X_6o(long j10) {
        return this.f16563q0.mo412roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo413roundToPx0680j_4(float f6) {
        return this.f16563q0.mo413roundToPx0680j_4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo404toDpGaN1DYA(long j10) {
        return this.f16563q0.mo404toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo405toDpu2uoSUM(float f6) {
        return this.f16563q0.mo405toDpu2uoSUM(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo407toDpSizekrfVVM(long j10) {
        return this.f16563q0.mo407toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo414toPxR2X_6o(long j10) {
        return this.f16563q0.mo414toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo415toPx0680j_4(float f6) {
        return this.f16563q0.mo415toPx0680j_4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f16563q0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo408toSizeXkaWNTQ(long j10) {
        return this.f16563q0.mo408toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo409toSp0xMU5do(float f6) {
        return this.f16563q0.mo409toSp0xMU5do(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo410toSpkPz2Gy4(float f6) {
        return this.f16563q0.mo410toSpkPz2Gy4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo406toDpu2uoSUM(int i10) {
        return this.f16563q0.mo406toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo411toSpkPz2Gy4(int i10) {
        return this.f16563q0.mo411toSpkPz2Gy4(i10);
    }
}
