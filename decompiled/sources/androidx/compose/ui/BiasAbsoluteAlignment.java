package androidx.compose.ui;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "", "horizontalBias", "verticalBias", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(FF)V", "Horizontal", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15396b;

    /* JADX INFO: compiled from: Alignment.kt */
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "", "bias", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15397a;

        public Horizontal(float f6) {
            this.f15397a = f6;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = horizontal.f15397a;
            }
            return horizontal.copy(f6);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int size, int space, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return c.roundToInt((1 + this.f15397a) * ((space - size) / 2.0f));
        }

        @NotNull
        public final Horizontal copy(float bias) {
            return new Horizontal(bias);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Horizontal) && Float.compare(this.f15397a, ((Horizontal) other).f15397a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f15397a);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("Horizontal(bias="), this.f15397a, RootService.CLOSE_BRACKET);
        }
    }

    public BiasAbsoluteAlignment(float f6, float f10) {
        this.f15395a = f6;
        this.f15396b = f10;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = biasAbsoluteAlignment.f15395a;
        }
        if ((i10 & 2) != 0) {
            f10 = biasAbsoluteAlignment.f15396b;
        }
        return biasAbsoluteAlignment.copy(f6, f10);
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo2184alignKFBX0sM(long size, long space, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long jIntSize = IntSizeKt.IntSize(IntSize.m4549getWidthimpl(space) - IntSize.m4549getWidthimpl(size), IntSize.m4548getHeightimpl(space) - IntSize.m4548getHeightimpl(size));
        float f6 = 1;
        return IntOffsetKt.IntOffset(c.roundToInt((this.f15395a + f6) * (IntSize.m4549getWidthimpl(jIntSize) / 2.0f)), c.roundToInt((f6 + this.f15396b) * (IntSize.m4548getHeightimpl(jIntSize) / 2.0f)));
    }

    @NotNull
    public final BiasAbsoluteAlignment copy(float horizontalBias, float verticalBias) {
        return new BiasAbsoluteAlignment(horizontalBias, verticalBias);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) other;
        return Float.compare(this.f15395a, biasAbsoluteAlignment.f15395a) == 0 && Float.compare(this.f15396b, biasAbsoluteAlignment.f15396b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f15396b) + (Float.floatToIntBits(this.f15395a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb2.append(this.f15395a);
        sb2.append(", verticalBias=");
        return u.i(sb2, this.f15396b, RootService.CLOSE_BRACKET);
    }
}
