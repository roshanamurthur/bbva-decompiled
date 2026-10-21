package com.google.android.gms.internal.mlkit_common;

import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjv implements ObjectEncoder {
    static final zzjv zza = new zzjv();

    static {
        a.d(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("stageId"), Constants.device));
    }

    private zzjv() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
