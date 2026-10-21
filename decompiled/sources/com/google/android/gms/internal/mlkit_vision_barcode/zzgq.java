package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgq implements ObjectEncoder {
    static final zzgq zza = new zzgq();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = c.b(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = c.b(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = c.b(10, FieldDescriptor.builder("isAccelerated"));

    private zzgq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkc zzkcVar = (zzkc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzkcVar.zze());
        objectEncoderContext.add(zzc, zzkcVar.zza());
        objectEncoderContext.add(zzd, zzkcVar.zzd());
        objectEncoderContext.add(zze, zzkcVar.zzb());
        objectEncoderContext.add(zzf, zzkcVar.zzc());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
        objectEncoderContext.add(zzk, (Object) null);
    }
}
