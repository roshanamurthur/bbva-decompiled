package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.huawei.hms.feature.model.b;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkr implements ObjectEncoder {
    static final zzkr zza = new zzkr();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder(Properties.APP_VERSION));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.c(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.c(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.c(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.c(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.c(8, FieldDescriptor.builder(b.f50443n));
    private static final FieldDescriptor zzj = a.c(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.c(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.c(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.c(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.c(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.c(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzkr() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqy zzqyVar = (zzqy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqyVar.zzg());
        objectEncoderContext.add(zzc, zzqyVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzqyVar.zzj());
        objectEncoderContext.add(zzf, zzqyVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzqyVar.zza());
        objectEncoderContext.add(zzj, zzqyVar.zzi());
        objectEncoderContext.add(zzk, zzqyVar.zzb());
        objectEncoderContext.add(zzl, zzqyVar.zzd());
        objectEncoderContext.add(zzm, zzqyVar.zzc());
        objectEncoderContext.add(zzn, zzqyVar.zze());
        objectEncoderContext.add(zzo, zzqyVar.zzf());
    }
}
