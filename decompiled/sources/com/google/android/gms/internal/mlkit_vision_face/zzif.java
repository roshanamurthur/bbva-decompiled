package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzif implements ObjectEncoder {
    static final zzif zza = new zzif();
    private static final FieldDescriptor zzb = b.b(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = b.b(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = b.b(5, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));

    private zzif() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
