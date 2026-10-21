package com.veridas.math.geometry;

import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Vector2.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0000J\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u001b\u001a\u00020\u0000J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006H\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\nH\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\bH\u0086\u0002J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nJ\b\u0010 \u001a\u00020\nH\u0002J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010#\u001a\u00020\u0000J\u0011\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0006H\u0086\u0002J\b\u0010&\u001a\u00020\u0006H\u0016J\u0006\u0010'\u001a\u00020\nJ\u0011\u0010(\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nH\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\nH\u0086\u0002J\u0011\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\u0000J\u0011\u0010-\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010-\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nH\u0086\u0002J\u0011\u0010-\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010.\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010.\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\nH\u0086\u0002J\u0011\u0010.\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u00100\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u00101\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000J\u0011\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u000205H\u0086\u0002J\u0011\u00103\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002J\u0011\u00103\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0086\u0002J\u0011\u00103\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\u0002J\u0011\u00103\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006H\u0086\u0002J\u0011\u00103\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\nH\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0086\u0002J\u0011\u00106\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\bH\u0086\u0002J\u0006\u00107\u001a\u000208J\b\u00109\u001a\u00020:H\u0016R\u001a\u0010\u0002\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006<"}, d2 = {"Lcom/veridas/math/geometry/Vector2;", "", "x", "", "y", "(FF)V", "", "(II)V", "", "(JJ)V", "", "(DD)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "absoluteAreaDelta", "other", "add", SharedPrefsStorage.VERSION_KEY, "angle", "area", "assign", "", "compareTo", "copy", "div", "lambda", "divAssign", "divide", "dot", "equals", "", "flipAxis", "get", FirebaseAnalytics.Param.INDEX, GenerateActivationFormCommand.HASH_CODE, "magnitude", "minus", "phi", "minusAssign", "multiply", "normalize", "plus", "plusAssign", "project", "relativeAreaDelta", "rotate", "subtract", "times", "matrix", "Lcom/veridas/math/geometry/Matrix;", "timesAssign", "toPoint", "Landroid/graphics/Point;", "toString", "", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Vector2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Vector2 ZERO = new Vector2(0, 0);
    private double x;
    private double y;

    /* JADX INFO: compiled from: Vector2.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/veridas/math/geometry/Vector2$Companion;", "", "()V", "ZERO", "Lcom/veridas/math/geometry/Vector2;", "getZERO$annotations", "getZERO", "()Lcom/veridas/math/geometry/Vector2;", "from", "point", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Vector2 from(@NotNull Point point) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new Vector2(point.x, point.y);
        }

        @NotNull
        public final Vector2 getZERO() {
            return Vector2.ZERO;
        }

        @JvmStatic
        @NotNull
        public final Vector2 from(@NotNull PointF point) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new Vector2(point.x, point.y);
        }

        @JvmStatic
        public static /* synthetic */ void getZERO$annotations() {
        }
    }

    public Vector2() {
        this(0.0d, 0.0d, 3, null);
    }

    private final double dot() {
        return dot(this);
    }

    @JvmStatic
    @NotNull
    public static final Vector2 from(@NotNull Point point) {
        return INSTANCE.from(point);
    }

    @NotNull
    public static final Vector2 getZERO() {
        return INSTANCE.getZERO();
    }

    public final double absoluteAreaDelta(@NotNull Vector2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Math.abs(area() - other.area());
    }

    @NotNull
    public final Vector2 add(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return new Vector2(this.x + v3.x, this.y + v3.y);
    }

    public final double angle() {
        return Math.atan2(this.x, this.y);
    }

    public final double area() {
        return this.x * this.y;
    }

    public final void assign(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        this.x = v3.x;
        this.y = v3.y;
    }

    public final int compareTo(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        double dDot = dot(v3.project(this).minus(this));
        if (dDot > 0.0d) {
            return -1;
        }
        return dDot < 0.0d ? 1 : 0;
    }

    @NotNull
    public final Vector2 copy() {
        return new Vector2(this.x, this.y);
    }

    @NotNull
    public final Vector2 div(double lambda) {
        return divide(lambda);
    }

    public final void divAssign(double lambda) {
        assign(div(lambda));
    }

    @NotNull
    public final Vector2 divide(double lambda) {
        return lambda == 0.0d ? ZERO : new Vector2(this.x / lambda, this.y / lambda);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Vector2)) {
            return false;
        }
        Vector2 vector2 = (Vector2) other;
        return this.x == vector2.x && this.y == vector2.y;
    }

    @NotNull
    public final Vector2 flipAxis() {
        return new Vector2(this.y, this.x);
    }

    public final double get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IndexOutOfBoundsException(b.a("Index ", index, " is out of bounds."));
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.x);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.y);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final double magnitude() {
        return Math.sqrt(dot());
    }

    @NotNull
    public final Vector2 minus(double phi) {
        return rotate(-phi);
    }

    public final void minusAssign(double phi) {
        assign(rotate(-phi));
    }

    @NotNull
    public final Vector2 multiply(double lambda) {
        return new Vector2(this.x * lambda, this.y * lambda);
    }

    @NotNull
    public final Vector2 normalize() {
        double dMagnitude = magnitude();
        return dMagnitude == 0.0d ? ZERO : div(dMagnitude);
    }

    @NotNull
    public final Vector2 plus(double phi) {
        return rotate(phi);
    }

    public final void plusAssign(double phi) {
        assign(rotate(phi));
    }

    @NotNull
    public final Vector2 project(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Vector2 vector2Normalize = v3.normalize();
        double dMagnitude = vector2Normalize.magnitude();
        return dMagnitude == 0.0d ? ZERO : vector2Normalize.times(dot(vector2Normalize) / dMagnitude);
    }

    public final double relativeAreaDelta(@NotNull Vector2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double dArea = other.area();
        if (dArea == 0.0d) {
            return 0.0d;
        }
        return area() / dArea;
    }

    @NotNull
    public final Vector2 rotate(double phi) {
        double dAngle = angle() + phi;
        double dMagnitude = magnitude();
        return new Vector2(Math.cos(dAngle) * dMagnitude, Math.sin(dAngle) * dMagnitude);
    }

    public final void setX(double d2) {
        this.x = d2;
    }

    public final void setY(double d2) {
        this.y = d2;
    }

    @NotNull
    public final Vector2 subtract(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return new Vector2(this.x - v3.x, this.y - v3.y);
    }

    @NotNull
    public final Vector2 times(double lambda) {
        return multiply(lambda);
    }

    public final void timesAssign(double lambda) {
        assign(times(lambda));
    }

    @NotNull
    public final Point toPoint() {
        return new Point((int) this.x, (int) this.y);
    }

    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName() + "[x=" + this.x + ", y=" + this.y + Constant.BRACKET_CLOSE;
    }

    public Vector2(double d2, double d3) {
        this.x = d2;
        this.y = d3;
    }

    @JvmStatic
    @NotNull
    public static final Vector2 from(@NotNull PointF pointF) {
        return INSTANCE.from(pointF);
    }

    @NotNull
    public final Vector2 div(float lambda) {
        return div(lambda);
    }

    public final void divAssign(float lambda) {
        divAssign(lambda);
    }

    public final double dot(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return (this.y * v3.y) + (this.x * v3.x);
    }

    @NotNull
    public final Vector2 minus(float phi) {
        return rotate(phi);
    }

    public final void minusAssign(float phi) {
        minusAssign(phi);
    }

    @NotNull
    public final Vector2 plus(float phi) {
        return rotate(phi);
    }

    public final void plusAssign(float phi) {
        plusAssign(phi);
    }

    @NotNull
    public final Vector2 times(float lambda) {
        return times(lambda);
    }

    public final void timesAssign(float lambda) {
        timesAssign(lambda);
    }

    @NotNull
    public final Vector2 div(int lambda) {
        return div(lambda);
    }

    public final void divAssign(int lambda) {
        divAssign(lambda);
    }

    @NotNull
    public final Vector2 minus(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return subtract(v3);
    }

    public final void minusAssign(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        assign(minus(v3));
    }

    @NotNull
    public final Vector2 plus(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return add(v3);
    }

    public final void plusAssign(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        assign(plus(v3));
    }

    @NotNull
    public final Vector2 times(int lambda) {
        return times(lambda);
    }

    public final void timesAssign(int lambda) {
        timesAssign(lambda);
    }

    @NotNull
    public final Vector2 div(long lambda) {
        return div(lambda);
    }

    public final void divAssign(long lambda) {
        divAssign(lambda);
    }

    @NotNull
    public final Vector2 times(long lambda) {
        return times(lambda);
    }

    public final void timesAssign(long lambda) {
        timesAssign(lambda);
    }

    public /* synthetic */ Vector2(double d2, double d3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d2, (i10 & 2) != 0 ? 0.0d : d3);
    }

    @NotNull
    public final Vector2 div(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return new Vector2(this.x / v3.x, this.y / v3.y);
    }

    public final void divAssign(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        assign(div(v3));
    }

    @NotNull
    public final Vector2 times(@NotNull Vector2 lambda) {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        return new Vector2(this.x * lambda.x, this.y * lambda.y);
    }

    public final void timesAssign(@NotNull Vector2 lambda) {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        assign(new Vector2(this.x * lambda.x, this.y * lambda.y));
    }

    public Vector2(float f6, float f10) {
        this(f6, f10);
    }

    @NotNull
    public final Vector2 times(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return matrix.times(this);
    }

    public final void timesAssign(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Vector2 vector2Times = matrix.times(this);
        this.x = vector2Times.x;
        this.y = vector2Times.y;
    }

    public Vector2(int i10, int i11) {
        this(i10, i11);
    }

    @NotNull
    public final Vector2 rotate(float phi) {
        return rotate(phi);
    }

    public Vector2(long j10, long j11) {
        this(j10, j11);
    }
}
