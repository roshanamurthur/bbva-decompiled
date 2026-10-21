package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzay extends zzau {
    static final zzay zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzay(objArr, 0, objArr, 0, 0);
    }

    public zzay(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZza = zzap.zza(obj.hashCode());
        while (true) {
            int i10 = iZza & this.zzf;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZza = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzba iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau
    public final zzat zzh() {
        return zzat.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau
    public final boolean zzj() {
        return true;
    }
}
