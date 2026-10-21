package androidx.compose.animation.core;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\nJ\t\u0010\u0007\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "", "other", "plus", "minus", "times", "unaryMinus", "div", "_real", "_imaginary", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "equals", "getReal", "()D", "real", "getImaginary", "imaginary", "<init>", "(DD)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n35#1,2:113\n66#1,3:115\n40#1,3:118\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:113,2\n50#1:115,3\n50#1:118,3\n*E\n"})
public final /* data */ class ComplexDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f2909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f2910b;

    public ComplexDouble(double d2, double d3) {
        this.f2909a = d2;
        this.f2910b = d3;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = complexDouble.f2909a;
        }
        if ((i10 & 2) != 0) {
            d3 = complexDouble.f2910b;
        }
        return complexDouble.copy(d2, d3);
    }

    @NotNull
    public final ComplexDouble copy(double _real, double _imaginary) {
        return new ComplexDouble(_real, _imaginary);
    }

    @NotNull
    public final ComplexDouble div(double other) {
        this.f2909a /= other;
        this.f2910b /= other;
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) other;
        return Double.compare(this.f2909a, complexDouble.f2909a) == 0 && Double.compare(this.f2910b, complexDouble.f2910b) == 0;
    }

    /* JADX INFO: renamed from: getImaginary, reason: from getter */
    public final double getF2910b() {
        return this.f2910b;
    }

    /* JADX INFO: renamed from: getReal, reason: from getter */
    public final double getF2909a() {
        return this.f2909a;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2909a);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f2910b);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public final ComplexDouble minus(double other) {
        this.f2909a += -other;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(double other) {
        this.f2909a += other;
        return this;
    }

    @NotNull
    public final ComplexDouble times(double other) {
        this.f2909a *= other;
        this.f2910b *= other;
        return this;
    }

    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this.f2909a + ", _imaginary=" + this.f2910b + RootService.CLOSE_BRACKET;
    }

    @NotNull
    public final ComplexDouble unaryMinus() {
        double d2 = -1;
        this.f2909a *= d2;
        this.f2910b *= d2;
        return this;
    }

    @NotNull
    public final ComplexDouble minus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d2 = -1;
        other.f2909a *= d2;
        other.f2910b *= d2;
        this.f2909a = other.getF2909a() + this.f2909a;
        this.f2910b = other.getF2910b() + this.f2910b;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f2909a = other.getF2909a() + this.f2909a;
        this.f2910b = other.getF2910b() + this.f2910b;
        return this;
    }

    @NotNull
    public final ComplexDouble times(@NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f2909a = (other.getF2909a() * getF2909a()) - (other.getF2910b() * getF2910b());
        this.f2910b = (getF2910b() * other.getF2909a()) + (other.getF2910b() * getF2909a());
        return this;
    }
}
