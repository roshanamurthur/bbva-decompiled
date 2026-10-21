package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfh implements ObjectEncoder {
    static final zzfh zza = new zzfh();

    static {
        a.d(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("type"), "dims"));
    }

    private zzfh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
