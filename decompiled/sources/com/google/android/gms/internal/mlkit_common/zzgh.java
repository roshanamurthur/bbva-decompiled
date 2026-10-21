package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgh implements ObjectEncoder {
    static final zzgh zza = new zzgh();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder("isDownloaded"));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("modelName"));

    private zzgh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmjVar.zza());
        objectEncoderContext.add(zzc, zzmjVar.zzb());
        objectEncoderContext.add(zzd, (Object) null);
    }
}
