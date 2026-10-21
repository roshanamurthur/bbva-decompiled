package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzip implements ObjectEncoder {
    static final zzip zza = new zzip();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder(Properties.APP_VERSION));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = b.b(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = b.b(8, FieldDescriptor.builder(com.huawei.hms.feature.model.b.f50443n));
    private static final FieldDescriptor zzj = b.b(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = b.b(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = b.b(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = b.b(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = b.b(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = b.b(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzip() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmv zzmvVar = (zzmv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmvVar.zzg());
        objectEncoderContext.add(zzc, zzmvVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzmvVar.zzj());
        objectEncoderContext.add(zzf, zzmvVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzmvVar.zza());
        objectEncoderContext.add(zzj, zzmvVar.zzi());
        objectEncoderContext.add(zzk, zzmvVar.zzb());
        objectEncoderContext.add(zzl, zzmvVar.zzd());
        objectEncoderContext.add(zzm, zzmvVar.zzc());
        objectEncoderContext.add(zzn, zzmvVar.zze());
        objectEncoderContext.add(zzo, zzmvVar.zzf());
    }
}
