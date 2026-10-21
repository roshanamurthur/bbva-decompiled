package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgo implements ObjectEncoder {
    static final zzgo zza = new zzgo();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("originalImageSize"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("compressedImageSize"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("isOdmlImage"));

    private zzgo() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzjy zzjyVar = (zzjy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzjyVar.zza());
        objectEncoderContext.add(zzc, zzjyVar.zzb());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
