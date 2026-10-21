package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgm implements ObjectEncoder {
    static final zzgm zza = new zzgm();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("mode"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("landmark"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder(VDDocumentConfiguration.CLASSIFICATION));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("prominentFaceOnly"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("tracking"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("minFaceSize"));

    private zzgm() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
