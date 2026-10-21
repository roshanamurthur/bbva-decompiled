package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjz implements ObjectEncoder {
    static final zzjz zza = new zzjz();

    static {
        a.g(5, u.e(4, u.e(3, FieldDescriptor.builder("languageOption"), "isUsingLegacyApi"), ContextualDataConstants.CD_SDK_VERSION));
    }

    private zzjz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
