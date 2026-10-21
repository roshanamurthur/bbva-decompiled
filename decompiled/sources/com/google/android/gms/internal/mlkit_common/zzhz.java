package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhz implements ObjectEncoder {
    static final zzhz zza = new zzhz();

    static {
        a.d(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "imageInfo"));
    }

    private zzhz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
