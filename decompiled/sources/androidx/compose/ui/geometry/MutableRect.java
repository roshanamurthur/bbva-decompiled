package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u0012\u0010\"\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0012\u0010$\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u001a\u0010(\u001a\u00020%8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "", "intersect", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "", "contains-k-4lQ0M", "(J)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, SetCommand.ID, "", "toString", "a", "F", "getLeft", "()F", "setLeft", "(F)V", "b", "getTop", "setTop", "c", "getRight", "setRight", "d", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "isEmpty", "()Z", "<init>", "(FFFF)V", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,101:1\n40#1,5:102\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:102,5\n*E\n"})
public final class MutableRect {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float bottom;

    public MutableRect(float f6, float f10, float f11, float f12) {
        this.left = f6;
        this.top = f10;
        this.right = f11;
        this.bottom = f12;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2262containsk4lQ0M(long offset) {
        return Offset.m2275getXimpl(offset) >= this.left && Offset.m2275getXimpl(offset) < this.right && Offset.m2276getYimpl(offset) >= this.top && Offset.m2276getYimpl(offset) < this.bottom;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2263getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @Stable
    public final void intersect(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void set(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void setBottom(float f6) {
        this.bottom = f6;
    }

    public final void setLeft(float f6) {
        this.left = f6;
    }

    public final void setRight(float f6) {
        this.right = f6;
    }

    public final void setTop(float f6) {
        this.top = f6;
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + RootService.CLOSE_BRACKET;
    }
}
