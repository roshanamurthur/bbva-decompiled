package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgi implements ObjectEncoder {
    static final zzgi zza = new zzgi();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder(ContextualDataConstants.CD_SDK_VERSION));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder(Constants.device));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder(Constants.manufacturer));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = c.b(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = c.b(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = c.b(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzgi() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
