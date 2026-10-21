package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkh implements ObjectEncoder {
    static final zzkh zza = new zzkh();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder(Properties.APP_VERSION));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = b.a(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = b.a(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = b.a(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = b.a(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = b.a(8, FieldDescriptor.builder(com.huawei.hms.feature.model.b.f50443n));
    private static final FieldDescriptor zzj = b.a(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = b.a(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = b.a(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = b.a(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = b.a(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = b.a(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzkh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqvVar.zzg());
        objectEncoderContext.add(zzc, zzqvVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzqvVar.zzj());
        objectEncoderContext.add(zzf, zzqvVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzqvVar.zza());
        objectEncoderContext.add(zzj, zzqvVar.zzi());
        objectEncoderContext.add(zzk, zzqvVar.zzb());
        objectEncoderContext.add(zzl, zzqvVar.zzd());
        objectEncoderContext.add(zzm, zzqvVar.zzc());
        objectEncoderContext.add(zzn, zzqvVar.zze());
        objectEncoderContext.add(zzo, zzqvVar.zzf());
    }
}
