package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgf implements ObjectEncoder {
    static final zzgf zza = new zzgf();
    private static final FieldDescriptor zzb = a.c(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.c(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = a.c(3, FieldDescriptor.builder("errorCode"));

    private zzgf() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmiVar.zza());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zzmiVar.zzb());
    }
}
