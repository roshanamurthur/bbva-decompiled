package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "p0", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurable", "", "getParentData", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultIntrinsicMeasurable implements Measurable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntrinsicMeasurable measurable;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final IntrinsicMinMax f16540q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final IntrinsicWidthHeight f16541r0;

    public DefaultIntrinsicMeasurable(@NotNull IntrinsicMeasurable measurable, @NotNull IntrinsicMinMax minMax, @NotNull IntrinsicWidthHeight widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.measurable = measurable;
        this.f16540q0 = minMax;
        this.f16541r0 = widthHeight;
    }

    @NotNull
    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return this.measurable.maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return this.measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo3575measureBRTryo0(long constraints) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.f16541r0;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
        IntrinsicMinMax intrinsicMinMax = this.f16540q0;
        IntrinsicMeasurable intrinsicMeasurable = this.measurable;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            return new g1.a(intrinsicMinMax == IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m4356getMaxHeightimpl(constraints)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m4356getMaxHeightimpl(constraints)), Constraints.m4356getMaxHeightimpl(constraints));
        }
        return new g1.a(Constraints.m4357getMaxWidthimpl(constraints), intrinsicMinMax == IntrinsicMinMax.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m4357getMaxWidthimpl(constraints)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m4357getMaxWidthimpl(constraints)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return this.measurable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return this.measurable.minIntrinsicWidth(height);
    }
}
