package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgf implements ObjectEncoder {
    static final zzgf zza = new zzgf();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("mode"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("landmark"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder(VDDocumentConfiguration.CLASSIFICATION));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("prominentFaceOnly"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("tracking"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("minFaceSize"));

    private zzgf() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
