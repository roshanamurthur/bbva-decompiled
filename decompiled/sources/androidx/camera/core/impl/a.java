package androidx.camera.core.impl;

import com.bbva.ethermobile.help.kit.result.Result;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi;
import com.google.firebase.encoders.FieldDescriptor;
import java.io.IOException;
import org.bouncycastle.crypto.digests.MD4Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(int i10, int i11, int i12, int i13) {
        return MD4Digest.d(i10 + i11 + i12, i13);
    }

    public static int b(Result result, int i10, int i11) {
        return (result.hashCode() + i10) * i11;
    }

    public static FieldDescriptor c(int i10, FieldDescriptor.Builder builder) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i10);
        return builder.withProperty(zzbiVar.zzb()).build();
    }

    public static String d(IOException iOException, StringBuilder sb2) {
        sb2.append(iOException.getMessage());
        return sb2.toString();
    }

    public static String e(StringBuilder sb2, Object obj, String str) {
        sb2.append(obj);
        sb2.append(str);
        return sb2.toString();
    }
}
