package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BorderStroke.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "copy", "a", "F", "getWidth-D9Ej5fM", "()F", "b", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class BorderStroke {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Brush brush;

    public BorderStroke(float f6, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.width = f6;
        this.brush = brush;
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m139copyD5KLDUw$default(BorderStroke borderStroke, float f6, Brush brush, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = borderStroke.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m140copyD5KLDUw(f6, brush);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m140copyD5KLDUw(float width, @NotNull Brush brush) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        return new BorderStroke(width, brush, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) other;
        return Dp.m4394equalsimpl0(this.width, borderStroke.width) && Intrinsics.areEqual(this.brush, borderStroke.brush);
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.brush.hashCode() + (Dp.m4395hashCodeimpl(this.width) * 31);
    }

    @NotNull
    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m4400toStringimpl(this.width)) + ", brush=" + this.brush + RootService.CLOSE_BRACKET;
    }
}
