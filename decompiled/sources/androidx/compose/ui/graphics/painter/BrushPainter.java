package androidx.compose.ui.graphics.painter;

import a1.b;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BrushPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/painter/BrushPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/Brush;", "f", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/Brush;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class BrushPainter extends Painter {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Brush brush;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ColorFilter f15880h;

    public BrushPainter(@NotNull Brush brush) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.brush = brush;
        this.f15879g = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.f15879g = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15880h = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BrushPainter) {
            return Intrinsics.areEqual(this.brush, ((BrushPainter) other).brush);
        }
        return false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3001getIntrinsicSizeNHjbRc() {
        return this.brush.getIntrinsicSize();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        b.J(drawScope, this.brush, 0L, 0L, this.f15879g, null, this.f15880h, 0, 86, null);
    }

    @NotNull
    public String toString() {
        return "BrushPainter(brush=" + this.brush + RootService.CLOSE_BRACKET;
    }
}
