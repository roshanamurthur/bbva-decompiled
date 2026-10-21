package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgu implements ObjectEncoder {
    static final zzgu zza = new zzgu();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("errorCode"));

    private zzgu() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
