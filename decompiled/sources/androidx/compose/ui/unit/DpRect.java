package androidx.compose.ui.unit;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B*\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b(\u0010)B\u001c\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,ø\u0001\u0002¢\u0006\u0004\b(\u0010.J\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0004J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0004R)\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u0004R)\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u0004R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u001e\u001a\u0004\b&\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getLeft-D9Ej5fM", "getLeft-D9Ej5fM$annotations", "()V", "b", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "c", "getRight-D9Ej5fM", "getRight-D9Ej5fM$annotations", "d", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/DpOffset;", "origin", "Landroidx/compose/ui/unit/DpSize;", "size", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
public final /* data */ class DpRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottom;

    public DpRect(float f6, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this.left = f6;
        this.top = f10;
        this.right = f11;
        this.bottom = f12;
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m4461copya9UjIt4$default(DpRect dpRect, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = dpRect.left;
        }
        if ((i10 & 2) != 0) {
            f10 = dpRect.top;
        }
        if ((i10 & 4) != 0) {
            f11 = dpRect.right;
        }
        if ((i10 & 8) != 0) {
            f12 = dpRect.bottom;
        }
        return dpRect.m4470copya9UjIt4(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m4470copya9UjIt4(float left, float top, float right, float bottom) {
        return new DpRect(left, top, right, bottom, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) other;
        return Dp.m4394equalsimpl0(this.left, dpRect.left) && Dp.m4394equalsimpl0(this.top, dpRect.top) && Dp.m4394equalsimpl0(this.right, dpRect.right) && Dp.m4394equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m4471getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m4472getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m4473getRightD9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m4474getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.bottom) + u.a(this.right, u.a(this.top, Dp.m4395hashCodeimpl(this.left) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m4400toStringimpl(this.left)) + ", top=" + ((Object) Dp.m4400toStringimpl(this.top)) + ", right=" + ((Object) Dp.m4400toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m4400toStringimpl(this.bottom)) + RootService.CLOSE_BRACKET;
    }

    public DpRect(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(DpOffset.m4450getXD9Ej5fM(j10), DpOffset.m4452getYD9Ej5fM(j10), Dp.m4389constructorimpl(DpSize.m4487getWidthD9Ej5fM(j11) + DpOffset.m4450getXD9Ej5fM(j10)), Dp.m4389constructorimpl(DpSize.m4485getHeightD9Ej5fM(j11) + DpOffset.m4452getYD9Ej5fM(j10)), null);
    }

    @Stable
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4462getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4463getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4464getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4465getTopD9Ej5fM$annotations() {
    }
}
