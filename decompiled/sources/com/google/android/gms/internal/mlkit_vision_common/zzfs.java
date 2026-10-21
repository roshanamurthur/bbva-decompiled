package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfs implements ObjectEncoder {
    static final zzfs zza = new zzfs();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("stages"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("runMiniBenchmark"));

    private zzfs() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
