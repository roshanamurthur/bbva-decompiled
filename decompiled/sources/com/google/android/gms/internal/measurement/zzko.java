package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzko extends zzkq {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzko(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzml.zzf(obj, j10);
        if (list instanceof zzkm) {
            objUnmodifiableList = ((zzkm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlj) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzml.zzs(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) zzml.zzf(obj2, j10);
        int size = list3.size();
        List list4 = (List) zzml.zzf(obj, j10);
        if (list4.isEmpty()) {
            if (list4 instanceof zzkm) {
                listZzd = new zzkl(size);
            } else {
                listZzd = ((list4 instanceof zzlj) && (list4 instanceof zzke)) ? ((zzke) list4).zzd(size) : new ArrayList(size);
            }
            zzml.zzs(obj, j10, listZzd);
            list2 = listZzd;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzml.zzs(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzmg) {
                zzkl zzklVar = new zzkl(list4.size() + size);
                zzklVar.addAll(zzklVar.size(), (zzmg) list4);
                zzml.zzs(obj, j10, zzklVar);
                list = zzklVar;
            } else if ((list4 instanceof zzlj) && (list4 instanceof zzke)) {
                zzke zzkeVar = (zzke) list4;
                if (!zzkeVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzke zzkeVarZzd = zzkeVar.zzd(list4.size() + size);
                    zzml.zzs(obj, j10, zzkeVarZzd);
                    list2 = zzkeVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzml.zzs(obj, j10, list3);
    }

    private zzko() {
        super(null);
    }
}
