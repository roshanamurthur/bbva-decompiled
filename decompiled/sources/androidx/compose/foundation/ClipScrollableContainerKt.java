package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ClipScrollableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u001d\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "clipScrollableContainer", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMaxSupportedElevation", "()F", "MaxSupportedElevation", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n154#2:98\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n61#1:98\n*E\n"})
public final class ClipScrollableContainerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3355a = Dp.m4389constructorimpl(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Modifier f3356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Modifier f3357c;

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        f3356b = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @NotNull
            /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
            public Outline mo157createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float fMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(0.0f, -fMo413roundToPx0680j_4, Size.m2344getWidthimpl(size), Size.m2341getHeightimpl(size) + fMo413roundToPx0680j_4));
            }
        });
        f3357c = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @NotNull
            /* JADX INFO: renamed from: createOutline-Pq9zytI */
            public Outline mo157createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                float fMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(-fMo413roundToPx0680j_4, 0.0f, Size.m2344getWidthimpl(size) + fMo413roundToPx0680j_4, Size.m2341getHeightimpl(size)));
            }
        });
    }

    @NotNull
    public static final Modifier clipScrollableContainer(@NotNull Modifier modifier, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return modifier.then(orientation == Orientation.Vertical ? f3357c : f3356b);
    }

    public static final float getMaxSupportedElevation() {
        return f3355a;
    }
}
