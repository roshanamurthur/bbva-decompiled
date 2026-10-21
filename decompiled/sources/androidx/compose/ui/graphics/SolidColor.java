package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0014ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R \u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "b", "J", "getValue-0d7_KjU", "()J", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class SolidColor extends Brush {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long value;

    public SolidColor(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.value = j10;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo2461applyToPq9zytI(long size, @NotNull Paint p4, float alpha) {
        long jM2507copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(p4, "p");
        p4.setAlpha(1.0f);
        if (alpha == 1.0f) {
            jM2507copywmQWz5c$default = this.value;
        } else {
            long j10 = this.value;
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(j10, Color.m2510getAlphaimpl(j10) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p4.mo2396setColor8_81llA(jM2507copywmQWz5c$default);
        if (p4.getShader() != null) {
            p4.setShader(null);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SolidColor) {
            return Color.m2509equalsimpl0(this.value, ((SolidColor) other).value);
        }
        return false;
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m2516toStringimpl(this.value)) + RootService.CLOSE_BRACKET;
    }
}
