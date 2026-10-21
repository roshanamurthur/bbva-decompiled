package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgj implements ObjectEncoder {
    static final zzgj zza = new zzgj();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = b.b(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = b.b(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = b.b(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = b.b(10, FieldDescriptor.builder("isAccelerated"));

    private zzgj() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkl zzklVar = (zzkl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzklVar.zze());
        objectEncoderContext.add(zzc, zzklVar.zza());
        objectEncoderContext.add(zzd, zzklVar.zzd());
        objectEncoderContext.add(zze, zzklVar.zzb());
        objectEncoderContext.add(zzf, zzklVar.zzc());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
        objectEncoderContext.add(zzk, (Object) null);
    }
}
