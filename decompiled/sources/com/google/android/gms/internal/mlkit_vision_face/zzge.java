package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzge implements ObjectEncoder {
    static final zzge zza = new zzge();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("landmarkMode"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("classificationMode"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("performanceMode"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("contourMode"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("isTrackingEnabled"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("minFaceSize"));

    private zzge() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkd zzkdVar = (zzkd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzkdVar.zzc());
        objectEncoderContext.add(zzc, zzkdVar.zza());
        objectEncoderContext.add(zzd, zzkdVar.zzd());
        objectEncoderContext.add(zze, zzkdVar.zzb());
        objectEncoderContext.add(zzf, zzkdVar.zze());
        objectEncoderContext.add(zzg, zzkdVar.zzf());
    }
}
