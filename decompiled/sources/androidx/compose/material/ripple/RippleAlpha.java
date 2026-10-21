package androidx.compose.material.ripple;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "a", "F", "getDraggedAlpha", "()F", "draggedAlpha", "b", "getFocusedAlpha", "focusedAlpha", "c", "getHoveredAlpha", "hoveredAlpha", "d", "getPressedAlpha", "pressedAlpha", "<init>", "(FFFF)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
public final class RippleAlpha {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float draggedAlpha;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float focusedAlpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float hoveredAlpha;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float pressedAlpha;

    public RippleAlpha(float f6, float f10, float f11, float f12) {
        this.draggedAlpha = f6;
        this.focusedAlpha = f10;
        this.hoveredAlpha = f11;
        this.pressedAlpha = f12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) other;
        return this.draggedAlpha == rippleAlpha.draggedAlpha && this.focusedAlpha == rippleAlpha.focusedAlpha && this.hoveredAlpha == rippleAlpha.hoveredAlpha && this.pressedAlpha == rippleAlpha.pressedAlpha;
    }

    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.pressedAlpha) + z1.a(this.hoveredAlpha, z1.a(this.focusedAlpha, Float.floatToIntBits(this.draggedAlpha) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.draggedAlpha);
        sb2.append(", focusedAlpha=");
        sb2.append(this.focusedAlpha);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.hoveredAlpha);
        sb2.append(", pressedAlpha=");
        return u.i(sb2, this.pressedAlpha, RootService.CLOSE_BRACKET);
    }
}
