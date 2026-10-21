package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgb implements ObjectEncoder {
    static final zzgb zza = new zzgb();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder(Constants.device));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder(Constants.manufacturer));
    private static final FieldDescriptor zzh = b.b(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = b.b(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = b.b(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = b.b(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzgb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
