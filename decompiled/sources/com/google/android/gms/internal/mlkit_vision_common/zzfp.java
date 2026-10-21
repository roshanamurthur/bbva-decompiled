package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfp implements ObjectEncoder {
    static final zzfp zza = new zzfp();
    private static final FieldDescriptor zzb = a.b(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = a.b(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = a.b(5, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));

    private zzfp() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
