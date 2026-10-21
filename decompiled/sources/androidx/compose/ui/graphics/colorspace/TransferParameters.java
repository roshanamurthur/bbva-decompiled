package androidx.compose.ui.graphics.colorspace;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JO\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "gamma", "a", "b", "c", "d", "e", "f", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "D", "getGamma", "()D", "getA", "getB", "getC", "getD", "getE", "g", "getF", "<init>", "(DDDDDDD)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransferParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double gamma;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double b;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final double d;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final double e;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final double f;

    public TransferParameters(double d2, double d3, double d7, double d10, double d11, double d12, double d13) {
        this.gamma = d2;
        this.a = d3;
        this.b = d7;
        this.c = d10;
        this.d = d11;
        this.e = d12;
        this.f = d13;
        if (Double.isNaN(d3) || Double.isNaN(d7) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d11 < 0.0d || d11 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d11);
        }
        if (d11 == 0.0d && (d3 == 0.0d || d2 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d11 >= 1.0d && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d3 == 0.0d || d2 == 0.0d) && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d3 < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getGamma() {
        return this.gamma;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getF() {
        return this.f;
    }

    @NotNull
    public final TransferParameters copy(double gamma, double a10, double b10, double c10, double d2, double e5, double f6) {
        return new TransferParameters(gamma, a10, b10, c10, d2, e5, f6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) other;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.a, transferParameters.a) == 0 && Double.compare(this.b, transferParameters.b) == 0 && Double.compare(this.c, transferParameters.c) == 0 && Double.compare(this.d, transferParameters.d) == 0 && Double.compare(this.e, transferParameters.e) == 0 && Double.compare(this.f, transferParameters.f) == 0;
    }

    public final double getA() {
        return this.a;
    }

    public final double getB() {
        return this.b;
    }

    public final double getC() {
        return this.c;
    }

    public final double getD() {
        return this.d;
    }

    public final double getE() {
        return this.e;
    }

    public final double getF() {
        return this.f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.gamma);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.a);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.b);
        int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.c);
        int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.d);
        int i13 = (i12 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.e);
        int i14 = (i13 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f);
        return i14 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ TransferParameters(double d2, double d3, double d7, double d10, double d11, double d12, double d13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, d7, d10, d11, (i10 & 32) != 0 ? 0.0d : d12, (i10 & 64) != 0 ? 0.0d : d13);
    }
}
