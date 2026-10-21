package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zzbe extends zzbg implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzbe(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.zza = map;
    }

    public static /* synthetic */ int zzd(zzbe zzbeVar) {
        int i10 = zzbeVar.zzb;
        zzbeVar.zzb = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int zze(zzbe zzbeVar) {
        int i10 = zzbeVar.zzb;
        zzbeVar.zzb = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int zzf(zzbe zzbeVar, int i10) {
        int i11 = zzbeVar.zzb + i10;
        zzbeVar.zzb = i11;
        return i11;
    }

    public static /* synthetic */ int zzg(zzbe zzbeVar, int i10) {
        int i11 = zzbeVar.zzb - i10;
        zzbeVar.zzb = i11;
        return i11;
    }

    public static /* synthetic */ void zzm(zzbe zzbeVar, Object obj) {
        Object objRemove;
        Map map = zzbeVar.zza;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbeVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collectionZza = (Collection) this.zza.get(obj);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj, collectionZza);
    }

    public final List zzi(Object obj, List list, @CheckForNull zzbb zzbbVar) {
        return list instanceof RandomAccess ? new zzaz(this, obj, list, zzbbVar) : new zzbd(this, obj, list, zzbbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    public final Map zzk() {
        return new zzaw(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg
    public final Set zzl() {
        return new zzay(this, this.zza);
    }

    public final void zzn() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbg, com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public final boolean zzo(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
