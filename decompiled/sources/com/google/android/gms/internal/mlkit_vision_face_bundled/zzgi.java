package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgi implements ObjectEncoder {
    static final zzgi zza = new zzgi();

    static {
        a.g(7, u.e(6, u.e(5, u.e(4, u.e(3, u.e(2, u.e(1, FieldDescriptor.builder("renderer"), IMAPStore.ID_VENDOR), "version"), "maxImages"), "maxSsbo"), "workGroupSizes"), "errorCode"));
    }

    private zzgi() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
