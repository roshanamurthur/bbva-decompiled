package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzei implements ObjectEncoder {
    static final zzei zza = new zzei();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("logEventKey"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("eventCount"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("inferenceDurationStats"));

    private zzei() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
