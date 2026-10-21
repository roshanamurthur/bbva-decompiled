package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfu implements ObjectEncoder {
    static final zzfu zza = new zzfu();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = a.b(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.b(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.b(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = a.b(12, FieldDescriptor.builder("elapsedUs"));

    private zzfu() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
