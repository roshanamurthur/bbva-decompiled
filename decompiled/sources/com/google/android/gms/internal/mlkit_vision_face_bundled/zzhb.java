package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhb implements ObjectEncoder {
    static final zzhb zza = new zzhb();

    static {
        a.g(9, u.e(8, u.e(7, u.e(6, u.e(5, u.e(4, u.e(3, u.e(2, u.e(1, FieldDescriptor.builder("name"), "version"), "source"), "uri"), HashCommand.ID), "modelType"), "size"), "hasLabelMap"), "isManifestModel"));
    }

    private zzhb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
