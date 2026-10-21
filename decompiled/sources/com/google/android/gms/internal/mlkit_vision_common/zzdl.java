package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdl implements ObjectEncoder {
    static final zzdl zza = new zzdl();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder(Constants.device));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder(Constants.manufacturer));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = a.b(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = a.b(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzdl() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
