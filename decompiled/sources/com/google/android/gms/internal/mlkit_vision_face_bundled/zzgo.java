package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgo implements ObjectEncoder {
    static final zzgo zza = new zzgo();

    static {
        a.g(10, u.e(9, u.e(8, u.e(7, u.e(6, u.e(5, u.e(4, u.e(3, u.e(2, u.e(1, FieldDescriptor.builder("durationMs"), "errorCode"), "isColdCall"), "autoManageModelOnBackground"), "autoManageModelOnLowMemory"), "isNnApiEnabled"), "eventsCount"), "otherErrors"), "remoteConfigValueForAcceleration"), "isAccelerated"));
    }

    private zzgo() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
