package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgi implements ObjectEncoder {
    static final zzgi zza = new zzgi();

    static {
        a.d(3, androidx.appcompat.widget.a.b(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("options"), "eventType"), "errorCode"));
    }

    private zzgi() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
