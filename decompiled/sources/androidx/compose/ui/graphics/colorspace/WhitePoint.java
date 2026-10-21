package androidx.compose.ui.graphics.colorspace;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WhitePoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "", "toXyz$ui_graphics_release", "()[F", "toXyz", "", "component1", "component2", "x", "y", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getX", "()F", "b", "getY", "<init>", "(FF)V", "z", "(FFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WhitePoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float y;

    public WhitePoint(float f6, float f10) {
        this.x = f6;
        this.y = f10;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = whitePoint.x;
        }
        if ((i10 & 2) != 0) {
            f10 = whitePoint.y;
        }
        return whitePoint.copy(f6, f10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final WhitePoint copy(float x4, float y7) {
        return new WhitePoint(x4, y7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) other;
        return Float.compare(this.x, whitePoint.x) == 0 && Float.compare(this.y, whitePoint.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.x);
        sb2.append(", y=");
        return u.i(sb2, this.y, RootService.CLOSE_BRACKET);
    }

    @NotNull
    public final float[] toXyz$ui_graphics_release() {
        float f6 = this.x;
        float f10 = this.y;
        return new float[]{f6 / f10, 1.0f, ((1.0f - f6) - f10) / f10};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WhitePoint(float f6, float f10, float f11) {
        float f12 = f6 + f10 + f11;
        this(f6 / f12, f10 / f12);
    }
}
