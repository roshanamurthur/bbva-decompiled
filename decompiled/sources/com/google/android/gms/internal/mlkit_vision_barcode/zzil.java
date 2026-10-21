package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzil implements ObjectEncoder {
    static final zzil zza = new zzil();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("httpResponseCode"));

    private zzil() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
