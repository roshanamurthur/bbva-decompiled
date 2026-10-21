package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.view.menu.b;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgk implements ObjectEncoder {
    static final zzgk zza = new zzgk();
    private static final FieldDescriptor zzb = b.a(1, FieldDescriptor.builder(SqlContracts.TokenEntry.API));

    private zzgk() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((ObjectEncoderContext) obj2).add(zzb, ((zzmp) obj).zza());
    }
}
