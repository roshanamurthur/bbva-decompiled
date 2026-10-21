package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "isIdentity-58bKbWc", "([F)Z", "isIdentity", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#2:441\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:441\n424#1:442\n425#1:443\n426#1:444\n434#1:445\n*E\n"})
public final class MatrixKt {
    /* JADX INFO: renamed from: access$dot-p89u6pk, reason: not valid java name */
    public static final float m2722access$dotp89u6pk(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m2723isIdentity58bKbWc(@NotNull float[] isIdentity) {
        Intrinsics.checkNotNullParameter(isIdentity, "$this$isIdentity");
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                if (isIdentity[(i10 * 4) + i11] != (i10 == i11 ? 1.0f : 0.0f)) {
                    return false;
                }
                i11++;
            }
            i10++;
        }
        return true;
    }
}
