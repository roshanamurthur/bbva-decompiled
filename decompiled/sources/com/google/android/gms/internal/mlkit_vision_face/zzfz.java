package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfz implements ObjectEncoder {
    static final zzfz zza = new zzfz();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("remoteModelOptions"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("localModelOptions"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("errorCodes"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("modelInitializationMs"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("isNnApiEnabled"));

    private zzfz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
