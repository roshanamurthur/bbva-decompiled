package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfo implements ObjectEncoder {
    static final zzfo zza = new zzfo();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzfo() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
