package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081@\u0018\u00002\u00020\u0001B,\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000bø\u0001\u0002¢\u0006\u0004\b(\u0010)B\u001c\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b(\u0010\tJ\u0016\u0010\u0004\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0012\u0010\u0011\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0012\u0010\u0012\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0012\u0010\u0013\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0012\u0010\u0014\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u001d\u0088\u0001+\u0092\u0001\u00020\u0007ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "stretchCrossAxis-q4ezo7Y", "(J)J", "stretchCrossAxis", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Landroidx/compose/ui/unit/Constraints;", "toBoxConstraints-OenEA2s", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "toBoxConstraints", "", "maxWidth-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxHeight-impl", "maxHeight", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "copy-yUG9Ft0", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getMainAxisMin-impl", "getMainAxisMax-impl", "getCrossAxisMin-impl", "getCrossAxisMax-impl", "constructor-impl", "(IIII)J", "c", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,868:1\n320#1:869\n321#1:870\n323#1:871\n322#1:872\n323#1:873\n320#1,4:874\n322#1,2:878\n320#1,2:880\n321#1:882\n323#1:883\n323#1:884\n321#1:885\n320#1:886\n321#1:887\n322#1:888\n323#1:889\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n348#1:869\n349#1:870\n350#1:871\n350#1:872\n351#1:873\n357#1:874,4\n359#1:878,2\n359#1:880,2\n365#1:882\n367#1:883\n373#1:884\n375#1:885\n379#1:886\n380#1:887\n381#1:888\n382#1:889\n*E\n"})
public final class OrientationIndependentConstraints {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4301a;

    public /* synthetic */ OrientationIndependentConstraints(long j10) {
        this.f4301a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m271boximpl(long j10) {
        return new OrientationIndependentConstraints(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m272constructorimpl(int i10, int i11, int i12, int i13) {
        return ConstraintsKt.Constraints(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m274copyyUG9Ft0(long j10, int i10, int i11, int i12, int i13) {
        return m272constructorimpl(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m275copyyUG9Ft0$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = Constraints.m4359getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = Constraints.m4357getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = Constraints.m4358getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = Constraints.m4356getMaxHeightimpl(j10);
        }
        return m274copyyUG9Ft0(j10, i15, i16, i17, i13);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m276equalsimpl(long j10, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m4351equalsimpl0(j10, ((OrientationIndependentConstraints) obj).getF4301a());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m277equalsimpl0(long j10, long j11) {
        return Constraints.m4351equalsimpl0(j10, j11);
    }

    /* JADX INFO: renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m278getCrossAxisMaximpl(long j10) {
        return Constraints.m4356getMaxHeightimpl(j10);
    }

    /* JADX INFO: renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m279getCrossAxisMinimpl(long j10) {
        return Constraints.m4358getMinHeightimpl(j10);
    }

    /* JADX INFO: renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m280getMainAxisMaximpl(long j10) {
        return Constraints.m4357getMaxWidthimpl(j10);
    }

    /* JADX INFO: renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m281getMainAxisMinimpl(long j10) {
        return Constraints.m4359getMinWidthimpl(j10);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m282hashCodeimpl(long j10) {
        return Constraints.m4360hashCodeimpl(j10);
    }

    /* JADX INFO: renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m283maxHeightimpl(long j10, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? Constraints.m4356getMaxHeightimpl(j10) : Constraints.m4357getMaxWidthimpl(j10);
    }

    /* JADX INFO: renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m284maxWidthimpl(long j10, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? Constraints.m4357getMaxWidthimpl(j10) : Constraints.m4356getMaxHeightimpl(j10);
    }

    /* JADX INFO: renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m285stretchCrossAxisq4ezo7Y(long j10) {
        return m272constructorimpl(Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10) != Integer.MAX_VALUE ? Constraints.m4356getMaxHeightimpl(j10) : Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10));
    }

    /* JADX INFO: renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m286toBoxConstraintsOenEA2s(long j10, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10)) : ConstraintsKt.Constraints(Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m287toStringimpl(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m4362toStringimpl(j10)) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m276equalsimpl(this.f4301a, obj);
    }

    public int hashCode() {
        return m282hashCodeimpl(this.f4301a);
    }

    public String toString() {
        return m287toStringimpl(this.f4301a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF4301a() {
        return this.f4301a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m273constructorimpl(long j10, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return m272constructorimpl(orientation == layoutOrientation ? Constraints.m4359getMinWidthimpl(j10) : Constraints.m4358getMinHeightimpl(j10), orientation == layoutOrientation ? Constraints.m4357getMaxWidthimpl(j10) : Constraints.m4356getMaxHeightimpl(j10), orientation == layoutOrientation ? Constraints.m4358getMinHeightimpl(j10) : Constraints.m4359getMinWidthimpl(j10), orientation == layoutOrientation ? Constraints.m4356getMaxHeightimpl(j10) : Constraints.m4357getMaxWidthimpl(j10));
    }
}
