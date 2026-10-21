package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzil implements ObjectEncoder {
    static final zzil zza = new zzil();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("stageId"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder(Constants.device));

    private zzil() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
