package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzn;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zzn<M extends zzn<M>> extends zzt {
    protected zzp zzhc;

    @Override // com.google.android.gms.internal.wearable.zzt
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzn zznVar = (zzn) super.clone();
        zzr.zza(this, zznVar);
        return zznVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public void zza(zzl zzlVar) throws IOException {
        if (this.zzhc == null) {
            return;
        }
        for (int i10 = 0; i10 < this.zzhc.size(); i10++) {
            this.zzhc.zzp(i10).zza(zzlVar);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public int zzg() {
        if (this.zzhc == null) {
            return 0;
        }
        int iZzg = 0;
        for (int i10 = 0; i10 < this.zzhc.size(); i10++) {
            iZzg += this.zzhc.zzp(i10).zzg();
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    /* JADX INFO: renamed from: zzs */
    public final /* synthetic */ zzt clone() throws CloneNotSupportedException {
        return (zzn) clone();
    }

    public final boolean zza(zzk zzkVar, int i10) throws IOException {
        zzq zzqVarZzo;
        int position = zzkVar.getPosition();
        if (!zzkVar.zzd(i10)) {
            return false;
        }
        int i11 = i10 >>> 3;
        zzv zzvVar = new zzv(i10, zzkVar.zzb(position, zzkVar.getPosition() - position));
        zzp zzpVar = this.zzhc;
        if (zzpVar == null) {
            this.zzhc = new zzp();
            zzqVarZzo = null;
        } else {
            zzqVarZzo = zzpVar.zzo(i11);
        }
        if (zzqVarZzo == null) {
            zzqVarZzo = new zzq();
            this.zzhc.zza(i11, zzqVarZzo);
        }
        zzqVarZzo.zza(zzvVar);
        return true;
    }
}
