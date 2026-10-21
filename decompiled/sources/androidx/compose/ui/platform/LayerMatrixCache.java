package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\u0011\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "invalidate", "target", "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LayerMatrixCache<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<T, Matrix, Unit> f17243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Matrix f17244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Matrix f17245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public float[] f17246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public float[] f17247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17250h;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(@NotNull Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.f17243a = getMatrix;
        this.f17248f = true;
        this.f17249g = true;
        this.f17250h = true;
    }

    @Nullable
    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m3806calculateInverseMatrixbWbORWo(T target) {
        float[] fArrM2700constructorimpl$default = this.f17247e;
        if (fArrM2700constructorimpl$default == null) {
            fArrM2700constructorimpl$default = androidx.compose.ui.graphics.Matrix.m2700constructorimpl$default(null, 1, null);
            this.f17247e = fArrM2700constructorimpl$default;
        }
        if (this.f17249g) {
            this.f17250h = InvertMatrixKt.m3804invertToJiSxe2E(m3807calculateMatrixGrdbGEg(target), fArrM2700constructorimpl$default);
            this.f17249g = false;
        }
        if (this.f17250h) {
            return fArrM2700constructorimpl$default;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m3807calculateMatrixGrdbGEg(T target) {
        float[] fArrM2700constructorimpl$default = this.f17246d;
        if (fArrM2700constructorimpl$default == null) {
            fArrM2700constructorimpl$default = androidx.compose.ui.graphics.Matrix.m2700constructorimpl$default(null, 1, null);
            this.f17246d = fArrM2700constructorimpl$default;
        }
        if (!this.f17248f) {
            return fArrM2700constructorimpl$default;
        }
        Matrix matrix = this.f17244b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f17244b = matrix;
        }
        this.f17243a.invoke(target, matrix);
        Matrix matrix2 = this.f17245c;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m2388setFromtUYjHk(fArrM2700constructorimpl$default, matrix);
            this.f17244b = matrix2;
            this.f17245c = matrix;
        }
        this.f17248f = false;
        return fArrM2700constructorimpl$default;
    }

    public final void invalidate() {
        this.f17248f = true;
        this.f17249g = true;
    }
}
