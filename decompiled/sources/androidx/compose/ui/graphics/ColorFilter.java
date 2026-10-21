package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\b\u0000\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\b\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "Landroid/graphics/ColorFilter;", "getNativeColorFilter$ui_graphics_release", "()Landroid/graphics/ColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class ColorFilter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.graphics.ColorFilter nativeColorFilter;

    /* JADX INFO: compiled from: ColorFilter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "()V", "colorMatrix", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "lighting", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m2549tintxETnrds$default(Companion companion, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = BlendMode.INSTANCE.m2457getSrcIn0nO6VwU();
            }
            return companion.m2552tintxETnrds(j10, i10);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m2550colorMatrixjHGOpc(@NotNull float[] colorMatrix) {
            Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
            return AndroidColorFilter_androidKt.m2381actualColorMatrixColorFilterjHGOpc(colorMatrix);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m2551lightingOWjLjI(long multiply, long add) {
            return AndroidColorFilter_androidKt.m2382actualLightingColorFilterOWjLjI(multiply, add);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m2552tintxETnrds(long color, int blendMode) {
            return AndroidColorFilter_androidKt.m2383actualTintColorFilterxETnrds(color, blendMode);
        }
    }

    public ColorFilter(@NotNull android.graphics.ColorFilter nativeColorFilter) {
        Intrinsics.checkNotNullParameter(nativeColorFilter, "nativeColorFilter");
        this.nativeColorFilter = nativeColorFilter;
    }

    @NotNull
    /* JADX INFO: renamed from: getNativeColorFilter$ui_graphics_release, reason: from getter */
    public final android.graphics.ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
