package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjo {
    private static final zzjo zzb = new zzjo(true);
    final zzlx zza = new zzlq(16);
    private boolean zzc;
    private boolean zzd;

    private zzjo() {
    }

    public static zzjo zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzd(zzjn zzjnVar, Object obj) {
        boolean z10;
        zzjnVar.zzb();
        zzkf.zze(obj);
        zzmr zzmrVar = zzmr.zza;
        zzms zzmsVar = zzms.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzix) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzjz)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzlc) || (obj instanceof zzkj)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjnVar.zza()), zzjnVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjo zzjoVar = new zzjo();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzjoVar.zzc((zzjn) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzjoVar.zzc((zzjn) entry.getKey(), entry.getValue());
        }
        zzjoVar.zzd = this.zzd;
        return zzjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjo) {
            return this.zza.equals(((zzjo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzjn zzjnVar, Object obj) {
        if (!zzjnVar.zzc()) {
            zzd(zzjnVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzjnVar, arrayList.get(i10));
            }
            obj = arrayList;
        }
        if (obj instanceof zzkj) {
            this.zzd = true;
        }
        this.zza.put(zzjnVar, obj);
    }

    private zzjo(boolean z10) {
        zzb();
        zzb();
    }
}
