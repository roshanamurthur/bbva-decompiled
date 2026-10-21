package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfb implements ObjectEncoder {
    static final zzfb zza = new zzfb();

    static {
        a.g(6, u.e(5, u.e(4, u.e(3, u.e(2, u.e(1, FieldDescriptor.builder("cameraSource"), "eventType"), "requestedPreviewHeight"), "requestedPreviewWidth"), "actualPreviewHeight"), "actualPreviewWidth"));
    }

    private zzfb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
