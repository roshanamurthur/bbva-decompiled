package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.appcompat.widget.c;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgz implements ObjectEncoder {
    static final zzgz zza = new zzgz();
    private static final FieldDescriptor zzb = c.b(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = c.b(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = c.b(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = c.b(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = c.b(5, FieldDescriptor.builder(HashCommand.ID));
    private static final FieldDescriptor zzg = c.b(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = c.b(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = c.b(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = c.b(9, FieldDescriptor.builder("isManifestModel"));

    private zzgz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
