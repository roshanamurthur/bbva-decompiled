package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgr implements ObjectEncoder {
    static final zzgr zza = new zzgr();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = b.a(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = b.a(5, FieldDescriptor.builder(HashCommand.ID));
    private static final FieldDescriptor zzg = b.a(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = b.a(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = b.a(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = b.a(9, FieldDescriptor.builder("isManifestModel"));

    private zzgr() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zznhVar.zzd());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zznhVar.zzb());
        objectEncoderContext.add(zze, (Object) null);
        objectEncoderContext.add(zzf, zznhVar.zzc());
        objectEncoderContext.add(zzg, zznhVar.zza());
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
    }
}
