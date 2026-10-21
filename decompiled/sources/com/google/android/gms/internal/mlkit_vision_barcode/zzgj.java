package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgj implements ObjectEncoder {
    static final zzgj zza = new zzgj();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzgj() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzjs zzjsVar = (zzjs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzjsVar.zzc());
        objectEncoderContext.add(zzc, zzjsVar.zze());
        objectEncoderContext.add(zzd, zzjsVar.zza());
        objectEncoderContext.add(zze, zzjsVar.zzb());
        objectEncoderContext.add(zzf, zzjsVar.zzd());
        objectEncoderContext.add(zzg, zzjsVar.zzf());
    }
}
