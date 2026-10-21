package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.bbva.semaas.model.Properties;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.huawei.hms.feature.model.b;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzim implements ObjectEncoder {
    static final zzim zza = new zzim();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("appId"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder(Properties.APP_VERSION));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = c.b(8, FieldDescriptor.builder(b.f50443n));
    private static final FieldDescriptor zzj = c.b(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = c.b(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = c.b(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = c.b(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = c.b(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = c.b(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzim() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzme zzmeVar = (zzme) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmeVar.zzg());
        objectEncoderContext.add(zzc, zzmeVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzmeVar.zzj());
        objectEncoderContext.add(zzf, zzmeVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzmeVar.zza());
        objectEncoderContext.add(zzj, zzmeVar.zzi());
        objectEncoderContext.add(zzk, zzmeVar.zzb());
        objectEncoderContext.add(zzl, zzmeVar.zzd());
        objectEncoderContext.add(zzm, zzmeVar.zzc());
        objectEncoderContext.add(zzn, zzmeVar.zze());
        objectEncoderContext.add(zzo, zzmeVar.zzf());
    }
}
