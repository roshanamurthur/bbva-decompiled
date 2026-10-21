package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgn implements ObjectEncoder {
    static final zzgn zza = new zzgn();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder(IMAPStore.ID_VENDOR));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("errorCode"));

    private zzgn() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
