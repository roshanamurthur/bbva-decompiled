package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfa implements ObjectEncoder {
    static final zzfa zza = new zzfa();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("detectorMode"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("multipleObjectsEnabled"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("classificationEnabled"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("maxPerObjectLabelCount"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("classificationConfidenceThreshold"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("customLocalModelOptions"));

    private zzfa() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
