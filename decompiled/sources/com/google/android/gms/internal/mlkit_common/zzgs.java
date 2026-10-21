package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder("modelInfo"));
    private static final FieldDescriptor zzc = b.a(2, FieldDescriptor.builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = b.a(3, FieldDescriptor.builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = b.a(4, FieldDescriptor.builder("isModelUpdateEnabled"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, ((zznl) obj).zza());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
