package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdq implements ObjectEncoder {
    static final zzdq zza = new zzdq();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder(IMAPStore.ID_VENDOR));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("errorCode"));

    private zzdq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
