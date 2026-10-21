package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InvertMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,77:1\n39#2:78\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n42#2,2:94\n42#2,2:96\n42#2,2:98\n42#2,2:100\n42#2,2:102\n42#2,2:104\n42#2,2:106\n42#2,2:108\n42#2,2:110\n42#2,2:112\n42#2,2:114\n42#2,2:116\n42#2,2:118\n42#2,2:120\n42#2,2:122\n42#2,2:124\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:78\n27#1:79\n28#1:80\n29#1:81\n30#1:82\n31#1:83\n32#1:84\n33#1:85\n34#1:86\n35#1:87\n36#1:88\n37#1:89\n38#1:90\n39#1:91\n40#1:92\n41#1:93\n60#1:94,2\n61#1:96,2\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n*E\n"})
public final class InvertMatrixKt {
    /* JADX INFO: renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m3804invertToJiSxe2E(@NotNull float[] invertTo, @NotNull float[] other) {
        Intrinsics.checkNotNullParameter(invertTo, "$this$invertTo");
        Intrinsics.checkNotNullParameter(other, "other");
        float f6 = invertTo[0];
        float f10 = invertTo[1];
        float f11 = invertTo[2];
        float f12 = invertTo[3];
        float f13 = invertTo[4];
        float f14 = invertTo[5];
        float f15 = invertTo[6];
        float f16 = invertTo[7];
        float f17 = invertTo[8];
        float f18 = invertTo[9];
        float f19 = invertTo[10];
        float f20 = invertTo[11];
        float f21 = invertTo[12];
        float f22 = invertTo[13];
        float f23 = invertTo[14];
        float f24 = invertTo[15];
        float f25 = (f6 * f14) - (f10 * f13);
        float f26 = (f6 * f15) - (f11 * f13);
        float f27 = (f6 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 == 0.0f) {
            return false;
        }
        float f38 = 1.0f / f37;
        other[0] = androidx.datastore.preferences.protobuf.q.a(f16, f34, (f14 * f36) - (f15 * f35), f38);
        other[1] = androidx.core.graphics.b.a(f12, f34, (f11 * f35) + ((-f10) * f36), f38);
        other[2] = androidx.datastore.preferences.protobuf.q.a(f24, f28, (f22 * f30) - (f23 * f29), f38);
        other[3] = androidx.core.graphics.b.a(f20, f28, (f19 * f29) + ((-f18) * f30), f38);
        float f39 = -f13;
        other[4] = androidx.core.graphics.b.a(f16, f32, (f15 * f33) + (f39 * f36), f38);
        other[5] = androidx.datastore.preferences.protobuf.q.a(f12, f32, (f6 * f36) - (f11 * f33), f38);
        float f40 = -f21;
        other[6] = androidx.core.graphics.b.a(f24, f26, (f23 * f27) + (f40 * f30), f38);
        other[7] = androidx.datastore.preferences.protobuf.q.a(f20, f26, (f17 * f30) - (f19 * f27), f38);
        other[8] = androidx.datastore.preferences.protobuf.q.a(f16, f31, (f13 * f35) - (f14 * f33), f38);
        other[9] = androidx.core.graphics.b.a(f12, f31, (f10 * f33) + ((-f6) * f35), f38);
        other[10] = androidx.datastore.preferences.protobuf.q.a(f24, f25, (f21 * f29) - (f22 * f27), f38);
        other[11] = androidx.core.graphics.b.a(f20, f25, (f27 * f18) + ((-f17) * f29), f38);
        other[12] = androidx.core.graphics.b.a(f15, f31, (f14 * f32) + (f39 * f34), f38);
        other[13] = androidx.datastore.preferences.protobuf.q.a(f11, f31, (f6 * f34) - (f10 * f32), f38);
        other[14] = androidx.core.graphics.b.a(f23, f25, (f22 * f26) + (f40 * f28), f38);
        other[15] = androidx.datastore.preferences.protobuf.q.a(f19, f25, (f17 * f28) - (f18 * f26), f38);
        return true;
    }
}
