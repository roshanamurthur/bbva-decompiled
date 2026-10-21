package androidx.compose.ui.graphics.painter;

import a1.b;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ColorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "f", "J", "getColor-0d7_KjU", "()J", "color", "Landroidx/compose/ui/geometry/Size;", "i", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class ColorPainter extends Painter {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long color;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ColorFilter f15883h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15882g = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long intrinsicSize = Size.INSTANCE.m2352getUnspecifiedNHjbRc();

    public ColorPainter(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this.color = j10;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.f15882g = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15883h = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ColorPainter) {
            return Color.m2509equalsimpl0(this.color, ((ColorPainter) other).color);
        }
        return false;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        b.K(drawScope, this.color, 0L, 0L, this.f15882g, null, this.f15883h, 0, 86, null);
    }

    @NotNull
    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m2516toStringimpl(this.color)) + RootService.CLOSE_BRACKET;
    }
}
