package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhf implements ObjectEncoder {
    static final zzhf zza = new zzhf();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzhf() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzll zzllVar = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzllVar.zzc());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zzllVar.zzb());
        objectEncoderContext.add(zze, zzllVar.zza());
        objectEncoderContext.add(zzf, zzllVar.zzd());
        objectEncoderContext.add(zzg, zzllVar.zze());
    }
}
