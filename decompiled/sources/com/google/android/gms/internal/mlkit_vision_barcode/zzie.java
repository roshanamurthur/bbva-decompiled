package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzie implements ObjectEncoder {
    static final zzie zza = new zzie();
    private static final FieldDescriptor zzb = c.b(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = c.b(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = c.b(5, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));

    private zzie() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
