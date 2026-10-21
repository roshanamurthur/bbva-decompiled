package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzex extends zzez {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzex(zzew zzewVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzgz.zzf(obj, j10);
        if (list instanceof zzev) {
            objUnmodifiableList = ((zzev) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzft) && (list instanceof zzek)) {
                zzek zzekVar = (zzek) list;
                if (zzekVar.zzc()) {
                    zzekVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzgz.zzs(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) zzgz.zzf(obj2, j10);
        int size = list3.size();
        List list4 = (List) zzgz.zzf(obj, j10);
        if (list4.isEmpty()) {
            if (list4 instanceof zzev) {
                listZzd = new zzeu(size);
            } else {
                listZzd = ((list4 instanceof zzft) && (list4 instanceof zzek)) ? ((zzek) list4).zzd(size) : new ArrayList(size);
            }
            zzgz.zzs(obj, j10, listZzd);
            list2 = listZzd;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzgz.zzs(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzgu) {
                zzeu zzeuVar = new zzeu(list4.size() + size);
                zzeuVar.addAll(zzeuVar.size(), (zzgu) list4);
                zzgz.zzs(obj, j10, zzeuVar);
                list = zzeuVar;
            } else if ((list4 instanceof zzft) && (list4 instanceof zzek)) {
                zzek zzekVar = (zzek) list4;
                if (!zzekVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzek zzekVarZzd = zzekVar.zzd(list4.size() + size);
                    zzgz.zzs(obj, j10, zzekVarZzd);
                    list2 = zzekVarZzd;
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
        zzgz.zzs(obj, j10, list3);
    }

    private zzex() {
        super(null);
    }
}
