package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdv implements ObjectEncoder {
    static final zzdv zza = new zzdv();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("rotationDegrees"));

    private zzdv() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzhn zzhnVar = (zzhn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzhnVar.zzg());
        objectEncoderContext.add(zzc, zzhnVar.zzb());
        objectEncoderContext.add(zzd, zzhnVar.zza());
        objectEncoderContext.add(zze, zzhnVar.zzc());
        objectEncoderContext.add(zzf, zzhnVar.zze());
        objectEncoderContext.add(zzg, zzhnVar.zzd());
        objectEncoderContext.add(zzh, zzhnVar.zzf());
    }
}
