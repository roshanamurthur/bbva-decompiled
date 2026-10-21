package androidx.compose.ui;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "", "component1", "component2", "horizontalBias", "verticalBias", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "F", "getHorizontalBias", "()F", "b", "getVerticalBias", "<init>", "(FF)V", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BiasAlignment implements Alignment {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float horizontalBias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float verticalBias;

    /* JADX INFO: compiled from: Alignment.kt */
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "", "bias", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15400a;

        public Horizontal(float f6) {
            this.f15400a = f6;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = horizontal.f15400a;
            }
            return horizontal.copy(f6);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int size, int space, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            float f6 = (space - size) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f10 = this.f15400a;
            if (layoutDirection != layoutDirection2) {
                f10 *= -1;
            }
            return c.roundToInt((1 + f10) * f6);
        }

        @NotNull
        public final Horizontal copy(float bias) {
            return new Horizontal(bias);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Horizontal) && Float.compare(this.f15400a, ((Horizontal) other).f15400a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f15400a);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("Horizontal(bias="), this.f15400a, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "", "size", "space", "align", "", "bias", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15401a;

        public Vertical(float f6) {
            this.f15401a = f6;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = vertical.f15401a;
            }
            return vertical.copy(f6);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int size, int space) {
            return c.roundToInt((1 + this.f15401a) * ((space - size) / 2.0f));
        }

        @NotNull
        public final Vertical copy(float bias) {
            return new Vertical(bias);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Vertical) && Float.compare(this.f15401a, ((Vertical) other).f15401a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f15401a);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("Vertical(bias="), this.f15401a, RootService.CLOSE_BRACKET);
        }
    }

    public BiasAlignment(float f6, float f10) {
        this.horizontalBias = f6;
        this.verticalBias = f10;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = biasAlignment.horizontalBias;
        }
        if ((i10 & 2) != 0) {
            f10 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f6, f10);
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo2184alignKFBX0sM(long size, long space, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float fM4549getWidthimpl = (IntSize.m4549getWidthimpl(space) - IntSize.m4549getWidthimpl(size)) / 2.0f;
        float fM4548getHeightimpl = (IntSize.m4548getHeightimpl(space) - IntSize.m4548getHeightimpl(size)) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f6 = this.horizontalBias;
        if (layoutDirection != layoutDirection2) {
            f6 *= -1;
        }
        float f10 = 1;
        return IntOffsetKt.IntOffset(c.roundToInt((f6 + f10) * fM4549getWidthimpl), c.roundToInt((f10 + this.verticalBias) * fM4548getHeightimpl));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @NotNull
    public final BiasAlignment copy(float horizontalBias, float verticalBias) {
        return new BiasAlignment(horizontalBias, verticalBias);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) other;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.verticalBias) + (Float.floatToIntBits(this.horizontalBias) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.horizontalBias);
        sb2.append(", verticalBias=");
        return u.i(sb2, this.verticalBias, RootService.CLOSE_BRACKET);
    }
}
