package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgc implements ObjectEncoder {
    static final zzgc zza = new zzgc();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzgc() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzjv zzjvVar = (zzjv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzjvVar.zzc());
        objectEncoderContext.add(zzc, zzjvVar.zze());
        objectEncoderContext.add(zzd, zzjvVar.zza());
        objectEncoderContext.add(zze, zzjvVar.zzb());
        objectEncoderContext.add(zzf, zzjvVar.zzd());
        objectEncoderContext.add(zzg, zzjvVar.zzf());
    }
}
