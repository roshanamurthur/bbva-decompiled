package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdt implements ObjectEncoder {
    static final zzdt zza = new zzdt();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = a.b(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.b(10, FieldDescriptor.builder("isAccelerated"));

    private zzdt() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
