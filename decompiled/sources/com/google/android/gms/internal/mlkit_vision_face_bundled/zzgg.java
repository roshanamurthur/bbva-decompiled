package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgg implements ObjectEncoder {
    static final zzgg zza = new zzgg();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("landmarkMode"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("classificationMode"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("performanceMode"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("contourMode"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("isTrackingEnabled"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("minFaceSize"));

    private zzgg() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmp zzmpVar = (zzmp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmpVar.zzc());
        objectEncoderContext.add(zzc, zzmpVar.zza());
        objectEncoderContext.add(zzd, zzmpVar.zzd());
        objectEncoderContext.add(zze, zzmpVar.zzb());
        objectEncoderContext.add(zzf, zzmpVar.zze());
        objectEncoderContext.add(zzg, zzmpVar.zzf());
    }
}
