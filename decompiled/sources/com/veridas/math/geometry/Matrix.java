package com.veridas.math.geometry;

import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.b;
import androidx.camera.core.impl.v;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0000J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0011\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0086\u0002J\u0019\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0006\u0010\u0015\u001a\u00020\u0000J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0086\u0002J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\u0002J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0086\u0002J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0086\u0002J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\u0002J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0086\u0002J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\u0002J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000fH\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bH\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\tH\u0086\u0002J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001cH\u0086\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/veridas/math/geometry/Matrix;", "", "data", "", "([D)V", "adjugate", "assertLimits", "", FirebaseAnalytics.Param.INDEX, "", "row", "col", "cofactor", "copyOf", "determinant", "", "equals", "", "other", "get", GenerateActivationFormCommand.HASH_CODE, "inverse", "minus", "m", "plus", SetCommand.ID, "value", "", "", "times", "Lcom/veridas/math/geometry/Vector2;", SharedPrefsStorage.VERSION_KEY, "s", "toIndex", "toString", "", "transpose", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Matrix {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final double[] data;

    /* JADX INFO: compiled from: Matrix.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J\u001c\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\rH\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\rH\u0007J\u001c\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001c\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\rH\u0007¨\u0006\u0013"}, d2 = {"Lcom/veridas/math/geometry/Matrix$Companion;", "", "()V", "flip", "Lcom/veridas/math/geometry/Matrix;", "x", "", "y", "rotate", "angle", "Lcom/veridas/math/geometry/Angle;", ImageScaleTypeHandler.ID, "s", "", "shear", "squeeze", "translate", SharedPrefsStorage.VERSION_KEY, "Lcom/veridas/math/geometry/Vector2;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Matrix flip$default(Companion companion, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            return companion.flip(z10, z11);
        }

        public static /* synthetic */ Matrix scale$default(Companion companion, double d2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = 1.0d;
            }
            return companion.scale(d2);
        }

        public static /* synthetic */ Matrix shear$default(Companion companion, double d2, double d3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = 0.0d;
            }
            if ((i10 & 2) != 0) {
                d3 = 0.0d;
            }
            return companion.shear(d2, d3);
        }

        public static /* synthetic */ Matrix squeeze$default(Companion companion, double d2, double d3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = 1.0d;
            }
            if ((i10 & 2) != 0) {
                d3 = 1.0d;
            }
            return companion.squeeze(d2, d3);
        }

        public static /* synthetic */ Matrix translate$default(Companion companion, double d2, double d3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = 0.0d;
            }
            if ((i10 & 2) != 0) {
                d3 = 0.0d;
            }
            return companion.translate(d2, d3);
        }

        @JvmStatic
        @NotNull
        public final Matrix flip(boolean x4, boolean y7) {
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            if (x4) {
                matrixCopyOf.set(0, 0, -matrixCopyOf.get(0, 0));
            }
            if (y7) {
                matrixCopyOf.set(1, 1, -matrixCopyOf.get(1, 1));
            }
            return matrixCopyOf;
        }

        @JvmStatic
        @NotNull
        public final Matrix rotate(@NotNull Angle angle) {
            Intrinsics.checkNotNullParameter(angle, "angle");
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            double phi = angle.getPhi();
            matrixCopyOf.set(0, 0, Math.cos(phi));
            matrixCopyOf.set(0, 1, Math.sin(phi));
            matrixCopyOf.set(1, 0, -Math.sin(phi));
            matrixCopyOf.set(1, 1, Math.cos(phi));
            return matrixCopyOf;
        }

        @JvmStatic
        @NotNull
        public final Matrix scale(double s4) {
            return scale(s4, s4);
        }

        @JvmStatic
        @NotNull
        public final Matrix shear(double x4, double y7) {
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            if (x4 != 0.0d) {
                matrixCopyOf.set(0, 1, Math.tan(x4));
            }
            if (y7 != 0.0d) {
                matrixCopyOf.set(1, 0, Math.tan(y7));
            }
            return matrixCopyOf;
        }

        @JvmStatic
        @NotNull
        public final Matrix squeeze(double x4, double y7) {
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            matrixCopyOf.set(0, 0, 1.0d / x4);
            matrixCopyOf.set(1, 1, 1.0d / y7);
            return matrixCopyOf;
        }

        @JvmStatic
        @NotNull
        public final Matrix translate(@NotNull Vector2 v3) {
            Intrinsics.checkNotNullParameter(v3, "v");
            return translate(v3.getX(), v3.getY());
        }

        public static /* synthetic */ Matrix scale$default(Companion companion, double d2, double d3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = 1.0d;
            }
            if ((i10 & 2) != 0) {
                d3 = 1.0d;
            }
            return companion.scale(d2, d3);
        }

        @JvmStatic
        @NotNull
        public final Matrix scale(double x4, double y7) {
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            matrixCopyOf.set(0, 0, x4);
            matrixCopyOf.set(1, 1, y7);
            return matrixCopyOf;
        }

        @JvmStatic
        @NotNull
        public final Matrix translate(double x4, double y7) {
            Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
            matrixCopyOf.set(0, 2, x4);
            matrixCopyOf.set(1, 2, y7);
            return matrixCopyOf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Matrix() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void assertLimits(int index) {
        if (index < 0 || index >= this.data.length) {
            throw new IndexOutOfBoundsException(b.a("Index ", index, " is out of bounds."));
        }
    }

    @JvmStatic
    @NotNull
    public static final Matrix flip(boolean z10, boolean z11) {
        return INSTANCE.flip(z10, z11);
    }

    @JvmStatic
    @NotNull
    public static final Matrix rotate(@NotNull Angle angle) {
        return INSTANCE.rotate(angle);
    }

    @JvmStatic
    @NotNull
    public static final Matrix scale(double d2) {
        return INSTANCE.scale(d2);
    }

    @JvmStatic
    @NotNull
    public static final Matrix shear(double d2, double d3) {
        return INSTANCE.shear(d2, d3);
    }

    @JvmStatic
    @NotNull
    public static final Matrix squeeze(double d2, double d3) {
        return INSTANCE.squeeze(d2, d3);
    }

    private final int toIndex(int row, int col) {
        return (row * 3) + col;
    }

    @JvmStatic
    @NotNull
    public static final Matrix translate(double d2, double d3) {
        return INSTANCE.translate(d2, d3);
    }

    @NotNull
    public final Matrix adjugate() {
        return cofactor().transpose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix cofactor() {
        Matrix matrix = new Matrix(null, 1, 0 == true ? 1 : 0);
        matrix.set(0, 0, (get(2, 2) * get(1, 1)) - (get(2, 1) * get(1, 2)));
        matrix.set(0, 1, -((get(2, 2) * get(1, 0)) - (get(2, 0) * get(1, 2))));
        matrix.set(0, 2, (get(2, 1) * get(1, 0)) - (get(2, 0) * get(1, 1)));
        matrix.set(1, 0, -((get(2, 2) * get(0, 1)) - (get(2, 1) * get(0, 2))));
        matrix.set(1, 1, (get(2, 2) * get(0, 0)) - (get(2, 0) * get(0, 2)));
        matrix.set(1, 2, -((get(2, 1) * get(0, 0)) - (get(2, 0) * get(0, 1))));
        matrix.set(2, 0, (get(1, 2) * get(0, 1)) - (get(1, 1) * get(0, 2)));
        matrix.set(2, 1, -((get(1, 2) * get(0, 0)) - (get(1, 0) * get(0, 2))));
        matrix.set(2, 2, (get(1, 1) * get(0, 0)) - (get(1, 0) * get(0, 1)));
        return matrix;
    }

    @NotNull
    public final Matrix copyOf() {
        double[] dArr = this.data;
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return new Matrix(dArrCopyOf);
    }

    public final double determinant() {
        return (((get(2, 1) * get(1, 0)) - (get(2, 0) * get(1, 1))) * get(0, 2)) + ((((get(2, 2) * get(1, 1)) - (get(2, 1) * get(1, 2))) * get(0, 0)) - (((get(2, 2) * get(1, 0)) - (get(2, 0) * get(1, 2))) * get(0, 1)));
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Matrix)) {
            return false;
        }
        int length = this.data.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (get(i10) != ((Matrix) other).get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final double get(int index) {
        assertLimits(index);
        return this.data[index];
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix inverse() {
        if (determinant() != 0.0d) {
            return adjugate().times(1.0d / determinant());
        }
        return new Matrix(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix minus(@NotNull Matrix m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Matrix matrix = new Matrix(null, 1, 0 == true ? 1 : 0);
        int length = matrix.data.length;
        for (int i10 = 0; i10 < length; i10++) {
            matrix.set(i10, get(i10) - m.get(i10));
        }
        return matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix plus(@NotNull Matrix m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Matrix matrix = new Matrix(null, 1, 0 == true ? 1 : 0);
        int length = matrix.data.length;
        for (int i10 = 0; i10 < length; i10++) {
            matrix.set(i10, m.get(i10) + get(i10));
        }
        return matrix;
    }

    public final void set(int index, double value) {
        assertLimits(index);
        this.data[index] = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix times(@NotNull Matrix m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Matrix matrix = new Matrix(null, 1, 0 == true ? 1 : 0);
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                double d2 = 0.0d;
                for (int i12 = 0; i12 < 3; i12++) {
                    d2 += m.get(i12, i11) * get(i10, i12);
                }
                matrix.set(i10, i11, d2);
            }
        }
        return matrix;
    }

    @NotNull
    public String toString() {
        String qualifiedName = Reflection.getOrCreateKotlinClass(Matrix.class).getQualifiedName();
        double d2 = get(0);
        double d3 = get(1);
        double d7 = get(2);
        double d10 = get(3);
        double d11 = get(4);
        double d12 = get(5);
        double d13 = get(6);
        double d14 = get(7);
        double d15 = get(8);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qualifiedName);
        sb2.append("[\n\t");
        sb2.append(d2);
        sb2.append(", ");
        sb2.append(d3);
        v.f(sb2, ", ", d7, InstanceFactory.ERROR_SEPARATOR);
        sb2.append(d10);
        v.f(sb2, ", ", d11, ", ");
        sb2.append(d12);
        v.f(sb2, InstanceFactory.ERROR_SEPARATOR, d13, ", ");
        sb2.append(d14);
        sb2.append(", ");
        sb2.append(d15);
        sb2.append("\n]");
        return sb2.toString();
    }

    @NotNull
    public final Matrix transpose() {
        Matrix matrixCopyOf = MatrixKt.getIDENTITY().copyOf();
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                matrixCopyOf.set(i11, i10, get(i10, i11));
            }
        }
        return matrixCopyOf;
    }

    public Matrix(@NotNull double[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        if (data.length != 9) {
            throw new IllegalArgumentException("An affine transformation matrix requires three dimensions.".toString());
        }
    }

    @JvmStatic
    @NotNull
    public static final Matrix scale(double d2, double d3) {
        return INSTANCE.scale(d2, d3);
    }

    @JvmStatic
    @NotNull
    public static final Matrix translate(@NotNull Vector2 vector2) {
        return INSTANCE.translate(vector2);
    }

    public final double get(int row, int col) {
        assertLimits(row, col);
        return this.data[toIndex(row, col)];
    }

    public final void set(int index, float value) {
        set(index, value);
    }

    public final void set(int index, int value) {
        set(index, value);
    }

    public /* synthetic */ Matrix(double[] dArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new double[9] : dArr);
    }

    public final void set(int index, long value) {
        set(index, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Matrix times(double s4) {
        Matrix matrix = new Matrix(null, 1, 0 == true ? 1 : 0);
        int length = matrix.data.length;
        for (int i10 = 0; i10 < length; i10++) {
            matrix.set(i10, get(i10) * s4);
        }
        return matrix;
    }

    public final void set(int row, int col, double value) {
        assertLimits(row, col);
        this.data[toIndex(row, col)] = value;
    }

    public final void set(int row, int col, float value) {
        set(row, col, value);
    }

    @NotNull
    public final Matrix times(float s4) {
        return times(s4);
    }

    public final void set(int row, int col, int value) {
        set(row, col, value);
    }

    @NotNull
    public final Matrix times(int s4) {
        return times(s4);
    }

    public final void set(int row, int col, long value) {
        set(row, col, value);
    }

    @NotNull
    public final Matrix times(long s4) {
        return times(s4);
    }

    @NotNull
    public final Vector2 times(@NotNull Vector2 v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        double[] dArr = new double[3];
        dArr[0] = v3.getX();
        dArr[1] = v3.getY();
        dArr[2] = 1.0d;
        for (int i10 = 0; i10 < 3; i10++) {
            double d2 = 0.0d;
            for (int i11 = 0; i11 < 3; i11++) {
                d2 += get(i10, i11) * dArr[i11];
            }
            dArr[i10] = d2;
        }
        return new Vector2(dArr[0], dArr[1]);
    }

    private final void assertLimits(int row, int col) {
        if (row < 0 || row >= 3) {
            throw new IndexOutOfBoundsException(b.a("Row ", row, " is out of bounds."));
        }
        if (col < 0 || col >= 3) {
            throw new IndexOutOfBoundsException(b.a("Column ", col, " is out of bounds."));
        }
    }
}
