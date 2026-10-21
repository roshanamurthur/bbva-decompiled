package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzew implements ObjectEncoder {
    static final zzew zza = new zzew();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("hasResult"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("detectedBarcodeValueTypes"));

    private zzew() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzdy zzdyVar = (zzdy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzdyVar.zzc());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zzdyVar.zze());
        objectEncoderContext.add(zze, (Object) null);
        objectEncoderContext.add(zzf, zzdyVar.zzd());
        objectEncoderContext.add(zzg, zzdyVar.zza());
        objectEncoderContext.add(zzh, zzdyVar.zzb());
    }
}
