package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import ci.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001ABR\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u000fø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\nHÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u000fHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000fHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\u000fHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0019\u0010\u0018\u001a\u00020\u000fHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0011Jf\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000fHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R \u0010\u001d\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0011R \u0010\u001e\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0011R \u0010\u001f\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u0010\u0011R \u0010 \u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010\u0011R\u0011\u0010<\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010+R\u0011\u0010>\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u0010+\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "toString", "", "component1", "component2", "component3", "component4", "Landroidx/compose/ui/geometry/CornerRadius;", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "F", "getLeft", "()F", "b", "getTop", "c", "getRight", "d", "getBottom", "e", "J", "getTopLeftCornerRadius-kKHJgLs", "f", "getTopRightCornerRadius-kKHJgLs", "g", "getBottomRightCornerRadius-kKHJgLs", "h", "getBottomLeftCornerRadius-kKHJgLs", "getWidth", "width", "getHeight", "height", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final RoundRect f15539j = RoundRectKt.m2329RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m2260getZerokKHJgLs());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottom;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long topLeftCornerRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long topRightCornerRadius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long bottomRightCornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long bottomLeftCornerRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RoundRect f15548i;

    public RoundRect(float f6, float f10, float f11, float f12, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.left = f6;
        this.top = f10;
        this.right = f11;
        this.bottom = f12;
        this.topLeftCornerRadius = j10;
        this.topRightCornerRadius = j11;
        this.bottomRightCornerRadius = j12;
        this.bottomLeftCornerRadius = j13;
    }

    public static float a(float f6, float f10, float f11, float f12) {
        float f13 = f10 + f11;
        return (f13 <= f12 || f13 == 0.0f) ? f6 : Math.min(f6, f12 / f13);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
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

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2321containsk4lQ0M(long point) {
        float fM2275getXimpl;
        float fM2276getYimpl;
        float fM2250getXimpl;
        float fM2251getYimpl;
        float fM2275getXimpl2 = Offset.m2275getXimpl(point);
        float f6 = this.left;
        if (fM2275getXimpl2 < f6) {
            return false;
        }
        float fM2275getXimpl3 = Offset.m2275getXimpl(point);
        float f10 = this.right;
        if (fM2275getXimpl3 >= f10) {
            return false;
        }
        float fM2276getYimpl2 = Offset.m2276getYimpl(point);
        float f11 = this.top;
        if (fM2276getYimpl2 < f11) {
            return false;
        }
        float fM2276getYimpl3 = Offset.m2276getYimpl(point);
        float f12 = this.bottom;
        if (fM2276getYimpl3 >= f12) {
            return false;
        }
        RoundRect roundRect = this.f15548i;
        if (roundRect == null) {
            long j10 = this.bottomLeftCornerRadius;
            float fM2251getYimpl2 = CornerRadius.m2251getYimpl(j10);
            long j11 = this.topLeftCornerRadius;
            float fA = a(1.0f, fM2251getYimpl2, CornerRadius.m2251getYimpl(j11), getHeight());
            float fM2250getXimpl2 = CornerRadius.m2250getXimpl(j11);
            long j12 = this.topRightCornerRadius;
            float fA2 = a(fA, fM2250getXimpl2, CornerRadius.m2250getXimpl(j12), getWidth());
            float fM2251getYimpl3 = CornerRadius.m2251getYimpl(j12);
            long j13 = this.bottomRightCornerRadius;
            float fA3 = a(a(fA2, fM2251getYimpl3, CornerRadius.m2251getYimpl(j13), getHeight()), CornerRadius.m2250getXimpl(j13), CornerRadius.m2250getXimpl(j10), getWidth());
            RoundRect roundRect2 = new RoundRect(f6 * fA3, f11 * fA3, f10 * fA3, f12 * fA3, CornerRadiusKt.CornerRadius(CornerRadius.m2250getXimpl(j11) * fA3, CornerRadius.m2251getYimpl(j11) * fA3), CornerRadiusKt.CornerRadius(CornerRadius.m2250getXimpl(j12) * fA3, CornerRadius.m2251getYimpl(j12) * fA3), CornerRadiusKt.CornerRadius(CornerRadius.m2250getXimpl(j13) * fA3, CornerRadius.m2251getYimpl(j13) * fA3), CornerRadiusKt.CornerRadius(CornerRadius.m2250getXimpl(j10) * fA3, CornerRadius.m2251getYimpl(j10) * fA3), null);
            this.f15548i = roundRect2;
            roundRect = roundRect2;
        }
        float fM2275getXimpl4 = Offset.m2275getXimpl(point);
        long j14 = roundRect.topLeftCornerRadius;
        if (fM2275getXimpl4 >= CornerRadius.m2250getXimpl(j14) + f6 || Offset.m2276getYimpl(point) >= CornerRadius.m2251getYimpl(j14) + f11) {
            float fM2275getXimpl5 = Offset.m2275getXimpl(point);
            long j15 = roundRect.topRightCornerRadius;
            if (fM2275getXimpl5 <= f10 - CornerRadius.m2250getXimpl(j15) || Offset.m2276getYimpl(point) >= CornerRadius.m2251getYimpl(j15) + f11) {
                float fM2275getXimpl6 = Offset.m2275getXimpl(point);
                long j16 = roundRect.bottomRightCornerRadius;
                if (fM2275getXimpl6 <= f10 - CornerRadius.m2250getXimpl(j16) || Offset.m2276getYimpl(point) <= f12 - CornerRadius.m2251getYimpl(j16)) {
                    float fM2275getXimpl7 = Offset.m2275getXimpl(point);
                    long j17 = roundRect.bottomLeftCornerRadius;
                    if (fM2275getXimpl7 >= CornerRadius.m2250getXimpl(j17) + f6 || Offset.m2276getYimpl(point) <= f12 - CornerRadius.m2251getYimpl(j17)) {
                        return true;
                    }
                    fM2275getXimpl = (Offset.m2275getXimpl(point) - f6) - CornerRadius.m2250getXimpl(j17);
                    fM2276getYimpl = (Offset.m2276getYimpl(point) - f12) + CornerRadius.m2251getYimpl(j17);
                    fM2250getXimpl = CornerRadius.m2250getXimpl(j17);
                    fM2251getYimpl = CornerRadius.m2251getYimpl(j17);
                } else {
                    fM2275getXimpl = (Offset.m2275getXimpl(point) - f10) + CornerRadius.m2250getXimpl(j16);
                    fM2276getYimpl = (Offset.m2276getYimpl(point) - f12) + CornerRadius.m2251getYimpl(j16);
                    fM2250getXimpl = CornerRadius.m2250getXimpl(j16);
                    fM2251getYimpl = CornerRadius.m2251getYimpl(j16);
                }
            } else {
                fM2275getXimpl = (Offset.m2275getXimpl(point) - f10) + CornerRadius.m2250getXimpl(j15);
                fM2276getYimpl = (Offset.m2276getYimpl(point) - f11) - CornerRadius.m2251getYimpl(j15);
                fM2250getXimpl = CornerRadius.m2250getXimpl(j15);
                fM2251getYimpl = CornerRadius.m2251getYimpl(j15);
            }
        } else {
            fM2275getXimpl = (Offset.m2275getXimpl(point) - f6) - CornerRadius.m2250getXimpl(j14);
            fM2276getYimpl = (Offset.m2276getYimpl(point) - f11) - CornerRadius.m2251getYimpl(j14);
            fM2250getXimpl = CornerRadius.m2250getXimpl(j14);
            fM2251getYimpl = CornerRadius.m2251getYimpl(j14);
        }
        float f13 = fM2275getXimpl / fM2250getXimpl;
        float f14 = fM2276getYimpl / fM2251getYimpl;
        return (f14 * f14) + (f13 * f13) <= 1.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m2322copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m2249equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2249equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2249equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2249equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2323getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2324getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2325getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2326getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return CornerRadius.m2252hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m2252hashCodeimpl(this.bottomRightCornerRadius) + ((CornerRadius.m2252hashCodeimpl(this.topRightCornerRadius) + ((CornerRadius.m2252hashCodeimpl(this.topLeftCornerRadius) + z1.a(this.bottom, z1.a(this.right, z1.a(this.top, Float.floatToIntBits(this.left) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        long j10 = this.topLeftCornerRadius;
        long j11 = this.topRightCornerRadius;
        boolean zM2249equalsimpl0 = CornerRadius.m2249equalsimpl0(j10, j11);
        long j12 = this.bottomRightCornerRadius;
        long j13 = this.bottomLeftCornerRadius;
        if (!zM2249equalsimpl0 || !CornerRadius.m2249equalsimpl0(j11, j12) || !CornerRadius.m2249equalsimpl0(j12, j13)) {
            StringBuilder sbD = a.d("RoundRect(rect=", str, ", topLeft=");
            sbD.append((Object) CornerRadius.m2256toStringimpl(j10));
            sbD.append(", topRight=");
            sbD.append((Object) CornerRadius.m2256toStringimpl(j11));
            sbD.append(", bottomRight=");
            sbD.append((Object) CornerRadius.m2256toStringimpl(j12));
            sbD.append(", bottomLeft=");
            sbD.append((Object) CornerRadius.m2256toStringimpl(j13));
            sbD.append(RootService.CLOSE_BRACKET);
            return sbD.toString();
        }
        if (CornerRadius.m2250getXimpl(j10) == CornerRadius.m2251getYimpl(j10)) {
            StringBuilder sbD2 = a.d("RoundRect(rect=", str, ", radius=");
            sbD2.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m2250getXimpl(j10), 1));
            sbD2.append(RootService.CLOSE_BRACKET);
            return sbD2.toString();
        }
        StringBuilder sbD3 = a.d("RoundRect(rect=", str, ", x=");
        sbD3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m2250getXimpl(j10), 1));
        sbD3.append(", y=");
        sbD3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m2251getYimpl(j10), 1));
        sbD3.append(RootService.CLOSE_BRACKET);
        return sbD3.toString();
    }

    public /* synthetic */ RoundRect(float f6, float f10, float f11, float f12, long j10, long j11, long j12, long j13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, f10, f11, f12, (i10 & 16) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j10, (i10 & 32) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j11, (i10 & 64) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j12, (i10 & 128) != 0 ? CornerRadius.INSTANCE.m2260getZerokKHJgLs() : j13, null);
    }

    /* JADX INFO: compiled from: RoundRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.f15539j;
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
