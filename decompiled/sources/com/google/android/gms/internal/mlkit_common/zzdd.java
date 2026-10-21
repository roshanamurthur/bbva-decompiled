package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdd implements ObjectEncoder {
    static final zzdd zza = new zzdd();

    static {
        a.d(5, androidx.appcompat.widget.a.b(4, androidx.appcompat.widget.a.b(3, androidx.appcompat.widget.a.b(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("errorCode"), "isColdCall"), "inputsFormats"), "outputFormats"), "options"));
    }

    private zzdd() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
