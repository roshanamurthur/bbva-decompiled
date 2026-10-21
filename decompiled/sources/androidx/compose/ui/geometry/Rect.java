package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0001[B'\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\bY\u0010ZJ\u001d\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0000J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010!\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010%R \u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%R \u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010#\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010%R\u001a\u00103\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010%R\u001a\u00106\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010%R#\u0010;\u001a\u0002078FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b:\u0010'\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010'\u001a\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010'\u001a\u0004\b?\u0010=R\u001a\u0010A\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010'\u001a\u0004\bA\u0010=R\u0011\u0010D\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010F\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u001a\u0010H\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u00109R\u001a\u0010J\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bI\u00109R\u001a\u0010L\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u00109R\u001a\u0010N\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u00109R\u001a\u0010P\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u00109R\u001a\u0010R\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u00109R\u001a\u0010T\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u00109R\u001a\u0010V\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bU\u00109R\u001a\u0010X\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u00109\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "", "translateX", "translateY", "delta", "inflate", "deflate", "other", "intersect", "", "overlaps", "contains-k-4lQ0M", "(J)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "toString", "component1", "component2", "component3", "component4", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "copy", "", GenerateActivationFormCommand.HASH_CODE, "equals", "a", "F", "getLeft", "()F", "getLeft$annotations", "()V", "b", "getTop", "getTop$annotations", "c", "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", "size", "isInfinite", "()Z", "isInfinite$annotations", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", "center", "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight", "<init>", "(FFFF)V", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Rect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Rect f15534e = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottom;

    public Rect(float f6, float f10, float f11, float f12) {
        this.left = f6;
        this.top = f10;
        this.right = f11;
        this.bottom = f12;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = rect.left;
        }
        if ((i10 & 2) != 0) {
            f10 = rect.top;
        }
        if ((i10 & 4) != 0) {
            f11 = rect.right;
        }
        if ((i10 & 8) != 0) {
            f12 = rect.bottom;
        }
        return rect.copy(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2301containsk4lQ0M(long offset) {
        return Offset.m2275getXimpl(offset) >= this.left && Offset.m2275getXimpl(offset) < this.right && Offset.m2276getYimpl(offset) >= this.top && Offset.m2276getYimpl(offset) < this.bottom;
    }

    @NotNull
    public final Rect copy(float left, float top, float right, float bottom) {
        return new Rect(left, top, right, bottom);
    }

    @Stable
    @NotNull
    public final Rect deflate(float delta) {
        return inflate(-delta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) other;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m2302getBottomCenterF1C5BW0() {
        return OffsetKt.Offset((getWidth() / 2.0f) + this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m2303getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m2304getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m2305getCenterF1C5BW0() {
        return OffsetKt.Offset((getWidth() / 2.0f) + this.left, (getHeight() / 2.0f) + this.top);
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m2306getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, (getHeight() / 2.0f) + this.top);
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m2307getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, (getHeight() / 2.0f) + this.top);
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2308getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m2309getTopCenterF1C5BW0() {
        return OffsetKt.Offset((getWidth() / 2.0f) + this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m2310getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m2311getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottom) + z1.a(this.right, z1.a(this.top, Float.floatToIntBits(this.left) * 31, 31), 31);
    }

    @Stable
    @NotNull
    public final Rect inflate(float delta) {
        return new Rect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean isFinite() {
        float f6 = this.left;
        if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
            float f10 = this.top;
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                float f11 = this.right;
                if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                    float f12 = this.bottom;
                    if (!Float.isInfinite(f12) && !Float.isNaN(f12)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        return this.left >= Float.POSITIVE_INFINITY || this.top >= Float.POSITIVE_INFINITY || this.right >= Float.POSITIVE_INFINITY || this.bottom >= Float.POSITIVE_INFINITY;
    }

    public final boolean overlaps(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + RootService.CLOSE_BRACKET;
    }

    @Stable
    @NotNull
    public final Rect translate(float translateX, float translateY) {
        return new Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m2312translatek4lQ0M(long offset) {
        return new Rect(Offset.m2275getXimpl(offset) + this.left, Offset.m2276getYimpl(offset) + this.top, Offset.m2275getXimpl(offset) + this.right, Offset.m2276getYimpl(offset) + this.bottom);
    }

    /* JADX INFO: compiled from: Rect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Rect getZero() {
            return Rect.f15534e;
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
    /* JADX INFO: renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m2300getSizeNHjbRc$annotations() {
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

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }
}
