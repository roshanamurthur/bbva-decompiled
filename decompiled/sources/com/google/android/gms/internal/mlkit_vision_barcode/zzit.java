package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzit implements ObjectEncoder {
    static final zzit zza = new zzit();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("numSamples"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("metricResults"));

    private zzit() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
