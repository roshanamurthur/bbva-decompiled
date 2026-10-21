package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("pipelineNamespace"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("clientLibraryName"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("clientLibraryVersion"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("minClientLibraryVersion"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("maxClientLibraryVersion"));

    private zzft() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
