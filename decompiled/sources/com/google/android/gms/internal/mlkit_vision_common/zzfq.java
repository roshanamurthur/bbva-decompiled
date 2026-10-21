package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfq implements ObjectEncoder {
    static final zzfq zza = new zzfq();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzfq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
