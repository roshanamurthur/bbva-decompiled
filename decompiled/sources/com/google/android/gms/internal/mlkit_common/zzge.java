package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzge implements ObjectEncoder {
    static final zzge zza = new zzge();

    static {
        a.d(10, androidx.appcompat.widget.a.b(9, androidx.appcompat.widget.a.b(8, androidx.appcompat.widget.a.b(7, androidx.appcompat.widget.a.b(6, androidx.appcompat.widget.a.b(5, androidx.appcompat.widget.a.b(4, androidx.appcompat.widget.a.b(3, androidx.appcompat.widget.a.b(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder("durationMs"), "errorCode"), "isColdCall"), "autoManageModelOnBackground"), "autoManageModelOnLowMemory"), "isNnApiEnabled"), "eventsCount"), "otherErrors"), "remoteConfigValueForAcceleration"), "isAccelerated"));
    }

    private zzge() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
