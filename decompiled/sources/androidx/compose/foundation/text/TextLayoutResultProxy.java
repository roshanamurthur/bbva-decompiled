package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0004J\u001b\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "Landroidx/compose/ui/geometry/Offset;", "position", "", "coerceInVisibleBounds", "", "getOffsetForPosition-3MmeM6k", "(JZ)I", "getOffsetForPosition", "", "vertical", "getLineForVerticalPosition", "lineIndex", "visibleEnd", "getLineEnd", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionOnText-k-4lQ0M", "(J)Z", "isPositionOnText", "Landroidx/compose/ui/text/TextLayoutResult;", "a", "Landroidx/compose/ui/text/TextLayoutResult;", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "b", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getInnerTextFieldCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setInnerTextFieldCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "innerTextFieldCoordinates", "c", "getDecorationBoxCoordinates", "setDecorationBoxCoordinates", "decorationBoxCoordinates", "<init>", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
public final class TextLayoutResultProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextLayoutResult value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutCoordinates innerTextFieldCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutCoordinates decorationBoxCoordinates;

    public TextLayoutResultProxy(@NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResultProxy.getLineEnd(i10, z10);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m559getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return textLayoutResultProxy.m560getOffsetForPosition3MmeM6k(j10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public final long a(long j10) {
        Rect zero;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates == null) {
            zero = Rect.INSTANCE.getZero();
        } else {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
                zero = null;
                if (layoutCoordinates2 != null) {
                    zero = g1.d.c(layoutCoordinates2, layoutCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.INSTANCE.getZero();
            }
            if (zero == null) {
                zero = Rect.INSTANCE.getZero();
            }
        }
        return TextLayoutResultProxyKt.m562access$coerceIn3MmeM6k(j10, zero);
    }

    public final long b(long j10) {
        Offset offsetM2264boximpl;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates == null) {
            return j10;
        }
        LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
        if (layoutCoordinates2 != null) {
            offsetM2264boximpl = Offset.m2264boximpl((layoutCoordinates.isAttached() && layoutCoordinates2.isAttached()) ? layoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates2, j10) : j10);
        } else {
            offsetM2264boximpl = null;
        }
        return offsetM2264boximpl != null ? offsetM2264boximpl.getF15533a() : j10;
    }

    @Nullable
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @Nullable
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.value.getLineEnd(lineIndex, visibleEnd);
    }

    public final int getLineForVerticalPosition(float vertical) {
        return this.value.getLineForVerticalPosition(Offset.m2276getYimpl(b(a(OffsetKt.Offset(0.0f, vertical)))));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m560getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.m3940getOffsetForPositionk4lQ0M(b(position));
    }

    @NotNull
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m561isPositionOnTextk4lQ0M(long offset) {
        long jB = b(a(offset));
        float fM2276getYimpl = Offset.m2276getYimpl(jB);
        TextLayoutResult textLayoutResult = this.value;
        int lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(fM2276getYimpl);
        return Offset.m2275getXimpl(jB) >= textLayoutResult.getLineLeft(lineForVerticalPosition) && Offset.m2275getXimpl(jB) <= textLayoutResult.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}
