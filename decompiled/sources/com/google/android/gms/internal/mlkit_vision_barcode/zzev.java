package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzev implements ObjectEncoder {
    static final zzev zza = new zzev();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("logEventKey"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("eventCount"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("inferenceDurationStats"));

    private zzev() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzea zzeaVar = (zzea) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzeaVar.zza());
        objectEncoderContext.add(zzc, zzeaVar.zzc());
        objectEncoderContext.add(zzd, zzeaVar.zzb());
    }
}
