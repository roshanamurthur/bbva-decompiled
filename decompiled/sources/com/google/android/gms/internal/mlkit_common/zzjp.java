package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjp implements ObjectEncoder {
    static final zzjp zza = new zzjp();

    static {
        a.d(5, androidx.appcompat.widget.a.b(4, androidx.appcompat.widget.a.b(3, FieldDescriptor.builder("languageOption"), "isUsingLegacyApi"), ContextualDataConstants.CD_SDK_VERSION));
    }

    private zzjp() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
