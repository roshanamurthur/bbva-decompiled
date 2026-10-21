package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzax extends zzaq implements Set {

    @CheckForNull
    private transient zzau zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbe.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbf iterator();

    public final zzau zzf() {
        zzau zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarZzg = zzg();
        this.zza = zzauVarZzg;
        return zzauVarZzg;
    }

    public zzau zzg() {
        Object[] array = toArray();
        int i10 = zzau.zzd;
        return zzau.zzg(array, array.length);
    }
}
