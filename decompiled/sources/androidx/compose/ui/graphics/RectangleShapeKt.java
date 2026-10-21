package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RectangleShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\" \u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shape;", "a", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class RectangleShapeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RectangleShapeKt$RectangleShape$1 f15707a = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @NotNull
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.ui.graphics.Shape
        @NotNull
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo157createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            return new Outline.Rectangle(SizeKt.m2365toRectuvyYCjk(size));
        }
    };

    @NotNull
    public static final Shape getRectangleShape() {
        return f15707a;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
