package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zziq implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzix zzixVar = (zzix) obj;
        zzix zzixVar2 = (zzix) obj2;
        zzio zzioVar = new zzio(zzixVar);
        zzio zzioVar2 = new zzio(zzixVar2);
        while (zzioVar.hasNext() && zzioVar2.hasNext()) {
            int iZza = zzip.zza(zzioVar.zza() & 255, zzioVar2.zza() & 255);
            if (iZza != 0) {
                return iZza;
            }
        }
        return zzip.zza(zzixVar.zzd(), zzixVar2.zzd());
    }
}
