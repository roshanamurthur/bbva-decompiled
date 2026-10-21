package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzik implements ObjectEncoder {
    static final zzik zza = new zzik();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = b.b(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = b.b(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = b.b(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = b.b(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = b.b(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = b.b(12, FieldDescriptor.builder("elapsedUs"));

    private zzik() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
