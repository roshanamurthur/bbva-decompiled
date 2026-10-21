package androidx.compose.ui.unit;

import androidx.activity.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0001VB'\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\bT\u0010UJ\u001d\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0000J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010 \u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010$R \u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R \u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\"\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010$R\u001a\u00102\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010$R\u001a\u00105\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010$R#\u0010:\u001a\u0002068FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b9\u0010&\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010&\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b>\u0010$R\u0011\u0010A\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b@\u0010$R\u001a\u0010C\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u00108R\u001a\u0010E\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bD\u00108R\u001a\u0010G\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bF\u00108R\u001a\u0010I\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bH\u00108R\u001a\u0010K\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bJ\u00108R\u001a\u0010M\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u00108R\u001a\u0010O\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bN\u00108R\u001a\u0010Q\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u00108R\u001a\u0010S\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u00108\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translate", "", "translateX", "translateY", "delta", "inflate", "deflate", "other", "intersect", "", "overlaps", "contains--gyyYBs", "(J)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "toString", "component1", "component2", "component3", "component4", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "copy", GenerateActivationFormCommand.HASH_CODE, "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", "getLeft$annotations", "()V", "b", "getTop", "getTop$annotations", "c", "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getSize-YbymL2g$annotations", "size", "isEmpty", "()Z", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-nOcc-ac", "topLeft", "getTopCenter-nOcc-ac", "topCenter", "getTopRight-nOcc-ac", "topRight", "getCenterLeft-nOcc-ac", "centerLeft", "getCenter-nOcc-ac", "center", "getCenterRight-nOcc-ac", "centerRight", "getBottomLeft-nOcc-ac", "bottomLeft", "getBottomCenter-nOcc-ac", "bottomCenter", "getBottomRight-nOcc-ac", "bottomRight", "<init>", "(IIII)V", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class IntRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final IntRect f18313e = new IntRect(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int bottom;

    public IntRect(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = intRect.left;
        }
        if ((i14 & 2) != 0) {
            i11 = intRect.top;
        }
        if ((i14 & 4) != 0) {
            i12 = intRect.right;
        }
        if ((i14 & 8) != 0) {
            i13 = intRect.bottom;
        }
        return intRect.copy(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m4526containsgyyYBs(long offset) {
        return IntOffset.m4507getXimpl(offset) >= this.left && IntOffset.m4507getXimpl(offset) < this.right && IntOffset.m4508getYimpl(offset) >= this.top && IntOffset.m4508getYimpl(offset) < this.bottom;
    }

    @NotNull
    public final IntRect copy(int left, int top, int right, int bottom) {
        return new IntRect(left, top, right, bottom);
    }

    @Stable
    @NotNull
    public final IntRect deflate(int delta) {
        return inflate(-delta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) other;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m4527getBottomCenternOccac() {
        return IntOffsetKt.IntOffset((getWidth() / 2) + this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m4528getBottomLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m4529getBottomRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.bottom);
    }

    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m4530getCenternOccac() {
        return IntOffsetKt.IntOffset((getWidth() / 2) + this.left, (getHeight() / 2) + this.top);
    }

    /* JADX INFO: renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m4531getCenterLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, (getHeight() / 2) + this.top);
    }

    /* JADX INFO: renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m4532getCenterRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, (getHeight() / 2) + this.top);
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4533getSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m4534getTopCenternOccac() {
        return IntOffsetKt.IntOffset((getWidth() / 2) + this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m4535getTopLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m4536getTopRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @Stable
    @NotNull
    public final IntRect inflate(int delta) {
        return new IntRect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @Stable
    @NotNull
    public final IntRect intersect(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new IntRect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.left);
        sb2.append(", ");
        sb2.append(this.top);
        sb2.append(", ");
        sb2.append(this.right);
        sb2.append(", ");
        return a.d(sb2, this.bottom, RootService.CLOSE_BRACKET);
    }

    @Stable
    @NotNull
    public final IntRect translate(int translateX, int translateY) {
        return new IntRect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m4537translategyyYBs(long offset) {
        return new IntRect(IntOffset.m4507getXimpl(offset) + this.left, IntOffset.m4508getYimpl(offset) + this.top, IntOffset.m4507getXimpl(offset) + this.right, IntOffset.m4508getYimpl(offset) + this.bottom);
    }

    /* JADX INFO: compiled from: IntRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.f18313e;
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m4525getSizeYbymL2g$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }
}
