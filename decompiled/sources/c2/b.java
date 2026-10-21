package c2;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.android.gms.internal.measurement.zzje;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static int a(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) / i13;
    }

    public static PathBuilder b(float f6, float f10, float f11, float f12) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f6, f10);
        pathBuilder.lineTo(f11, f12);
        return pathBuilder;
    }

    public static p c(String str) {
        return new p(str).i();
    }

    public static String d(String str, Exception exc) {
        return str + exc;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) - i12) * i13;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return zzje.zzA(i10) + i11 + i12 + i13;
    }
}
