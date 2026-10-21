package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.graphics.b;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = b.b(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = b.b(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = b.b(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = b.b(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = b.b(5, FieldDescriptor.builder(HashCommand.ID));
    private static final FieldDescriptor zzg = b.b(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = b.b(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = b.b(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = b.b(9, FieldDescriptor.builder("isManifestModel"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
