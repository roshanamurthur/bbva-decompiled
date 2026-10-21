package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdz implements ObjectEncoder {
    static final zzdz zza = new zzdz();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder(SqlContracts.TokenEntry.API));

    private zzdz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
