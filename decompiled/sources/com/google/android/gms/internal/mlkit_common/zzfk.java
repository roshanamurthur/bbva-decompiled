package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("modelName"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzloVar.zza());
        objectEncoderContext.add(zzc, zzloVar.zzb());
        objectEncoderContext.add(zzd, (Object) null);
    }
}
