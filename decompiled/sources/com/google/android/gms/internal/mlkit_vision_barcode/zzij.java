package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzij implements ObjectEncoder {
    static final zzij zza = new zzij();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = c.b(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = c.b(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = c.b(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = c.b(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = c.b(12, FieldDescriptor.builder("elapsedUs"));

    private zzij() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
