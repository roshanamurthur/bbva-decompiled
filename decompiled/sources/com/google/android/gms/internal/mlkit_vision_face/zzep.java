package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzep implements ObjectEncoder {
    static final zzep zza = new zzep();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzep() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzdn zzdnVar = (zzdn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzdnVar.zzb());
        objectEncoderContext.add(zzc, zzdnVar.zzc());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzdnVar.zza());
        objectEncoderContext.add(zzf, zzdnVar.zzd());
        objectEncoderContext.add(zzg, zzdnVar.zze());
    }
}
