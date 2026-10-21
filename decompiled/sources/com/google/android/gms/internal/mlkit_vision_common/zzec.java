package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.a;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = a.b(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = a.b(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = a.b(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = a.b(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = a.b(5, FieldDescriptor.builder(HashCommand.ID));
    private static final FieldDescriptor zzg = a.b(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = a.b(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = a.b(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.b(9, FieldDescriptor.builder("isManifestModel"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
