package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.huawei.hms.feature.model.b;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfz implements ObjectEncoder {
    static final zzfz zza = new zzfz();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder(Properties.APP_VERSION));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder(b.f50443n));
    private static final FieldDescriptor zzj = a.b(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.b(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.b(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.b(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.b(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = a.b(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzfz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzjq zzjqVar = (zzjq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzjqVar.zzg());
        objectEncoderContext.add(zzc, zzjqVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzjqVar.zzj());
        objectEncoderContext.add(zzf, zzjqVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzjqVar.zza());
        objectEncoderContext.add(zzj, zzjqVar.zzi());
        objectEncoderContext.add(zzk, zzjqVar.zzb());
        objectEncoderContext.add(zzl, zzjqVar.zzd());
        objectEncoderContext.add(zzm, zzjqVar.zzc());
        objectEncoderContext.add(zzn, zzjqVar.zze());
        objectEncoderContext.add(zzo, zzjqVar.zzf());
    }
}
