package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkj implements ObjectEncoder {
    static final zzkj zza = new zzkj();

    static {
        a.g(5, u.e(4, u.e(3, u.e(2, u.e(1, FieldDescriptor.builder("xMin"), "yMin"), "xMax"), "yMax"), "confidenceScore"));
    }

    private zzkj() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
