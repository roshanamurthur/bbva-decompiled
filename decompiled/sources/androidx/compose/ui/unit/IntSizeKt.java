package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\"\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0006\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n48#2:112\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n32#1:112\n*E\n"})
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i10, int i11) {
        return IntSize.m4544constructorimpl((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m4555getCenterozmzZPI(long j10) {
        return IntOffsetKt.IntOffset(IntSize.m4549getWidthimpl(j10) / 2, IntSize.m4548getHeightimpl(j10) / 2);
    }

    @Stable
    /* JADX INFO: renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m4557timesO0kMr_c(int i10, long j10) {
        return IntSize.m4551timesYEO4UFw(j10, i10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m4558toIntRectozmzZPI(long j10) {
        return IntRectKt.m4539IntRectVbeCjmY(IntOffset.INSTANCE.m4517getZeronOccac(), j10);
    }

    @Stable
    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m4559toSizeozmzZPI(long j10) {
        return SizeKt.Size(IntSize.m4549getWidthimpl(j10), IntSize.m4548getHeightimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m4556getCenterozmzZPI$annotations(long j10) {
    }
}
