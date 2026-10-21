package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgq implements ObjectEncoder {
    static final zzgq zza = new zzgq();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = b.a(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = b.a(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = b.a(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = b.a(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzgq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzncVar.zzc());
        objectEncoderContext.add(zzc, zzncVar.zzf());
        objectEncoderContext.add(zzd, zzncVar.zza());
        objectEncoderContext.add(zze, zzncVar.zze());
        objectEncoderContext.add(zzf, zzncVar.zzb());
        objectEncoderContext.add(zzg, zzncVar.zzd());
        objectEncoderContext.add(zzh, (Object) null);
    }
}
