package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhh implements ObjectEncoder {
    static final zzhh zza = new zzhh();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("detectedBarcodeValueTypes"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("imageInfo"));

    private zzhh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkz zzkzVar = (zzkz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzkzVar.zzd());
        objectEncoderContext.add(zzc, zzkzVar.zze());
        objectEncoderContext.add(zzd, zzkzVar.zza());
        objectEncoderContext.add(zze, zzkzVar.zzb());
        objectEncoderContext.add(zzf, zzkzVar.zzc());
    }
}
