package androidx.camera.camera2.internal.compat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi;
import com.google.firebase.encoders.FieldDescriptor;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.digests.MD5Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u {
    public static int a(float f6, int i10, int i11) {
        return (Dp.m4395hashCodeimpl(f6) + i10) * i11;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return (i10 * i11) + i12 + i13;
    }

    public static int c(int i10, int i11, int i12, int i13, int i14) {
        return MD5Digest.d(i10 + i11 + i12, i13) + i14;
    }

    public static CompositionScopedCoroutineScopeCanceller d(CoroutineScope coroutineScope, Composer composer) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
        return compositionScopedCoroutineScopeCanceller;
    }

    public static FieldDescriptor.Builder e(int i10, FieldDescriptor.Builder builder, String str) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i10);
        builder.withProperty(zzbiVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String h(String str, Object[] objArr, StringBuilder sb2) {
        sb2.append(String.format(str, objArr));
        return sb2.toString();
    }

    public static String i(StringBuilder sb2, float f6, char c10) {
        sb2.append(f6);
        sb2.append(c10);
        return sb2.toString();
    }
}
