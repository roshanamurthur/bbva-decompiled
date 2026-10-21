package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfb extends zzjt implements zzld {
    private zzfb() {
        super(zzfc.zza);
    }

    public final int zza() {
        return ((zzfc) this.zza).zzb();
    }

    public final zzfa zzb(int i10) {
        return ((zzfc) this.zza).zzd(i10);
    }

    public final zzfb zzc() {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        ((zzfc) this.zza).zzk = zzjx.zzby();
        return this;
    }

    public final zzfb zzd(int i10, zzez zzezVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfc.zzm((zzfc) this.zza, i10, (zzfa) zzezVar.zzay());
        return this;
    }

    public final List zze() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzi());
    }

    public /* synthetic */ zzfb(zzey zzeyVar) {
        super(zzfc.zza);
    }
}
