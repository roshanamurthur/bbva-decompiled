package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("callingSource"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("supportedFormats"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("errorCode"));

    private zzft() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
