package com.google.android.gms.internal.mlkit_common;

import com.bbva.semaas.model.Properties;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjy implements ObjectEncoder {
    static final zzjy zza = new zzjy();

    static {
        a.d(6, androidx.appcompat.widget.a.b(5, androidx.appcompat.widget.a.b(4, androidx.appcompat.widget.a.b(3, androidx.appcompat.widget.a.b(2, androidx.appcompat.widget.a.b(1, FieldDescriptor.builder(Properties.APP_NAME), AuthConstants.SESSION_ID), "startZoomLevel"), "endZoomLevel"), "durationMs"), "predictedArea"));
    }

    private zzjy() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
