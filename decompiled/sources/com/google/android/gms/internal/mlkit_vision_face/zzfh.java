package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfh implements ObjectEncoder {
    static final zzfh zza = new zzfh();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzfh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
