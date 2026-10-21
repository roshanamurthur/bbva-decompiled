package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbd extends zzaw {
    final transient Object[] zza;

    private zzbd(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.zza = objArr;
    }

    public static zzbd zzg(int i10, Object[] objArr, zzav zzavVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzan.zza(obj, obj2);
        return new zzbd(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaw, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.zza;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaw
    public final zzaq zza() {
        return new zzbc(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaw
    public final zzax zzd() {
        return new zzba(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaw
    public final zzax zze() {
        return new zzbb(this, new zzbc(this.zza, 0, 1));
    }
}
