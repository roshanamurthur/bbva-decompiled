package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzum {
    private static final zzum zzb = new zzum(true);
    final zzwr zza = new zzwk();
    private boolean zzc;

    private zzum() {
    }

    public static int zza(zzul zzulVar, Object obj) {
        int iZzd;
        int iZzz;
        zzxg zzxgVarZzb = zzulVar.zzb();
        zzulVar.zza();
        zzulVar.zze();
        List list = (List) obj;
        int size = list.size();
        zzulVar.zzd();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj2 = list.get(i11);
            int iZzz2 = zzuc.zzz(1616448016);
            if (zzxgVarZzb == zzxg.zzj) {
                zzvw zzvwVar = (zzvw) obj2;
                byte[] bArr = zzvc.zzb;
                if (zzvwVar instanceof zztg) {
                    throw null;
                }
                iZzz2 += iZzz2;
            }
            zzxh zzxhVar = zzxh.INT;
            int iZzA = 4;
            switch (zzxgVarZzb.ordinal()) {
                case 0:
                    ((Double) obj2).doubleValue();
                    iZzA = 8;
                    i10 += iZzz2 + iZzA;
                    break;
                case 1:
                    ((Float) obj2).floatValue();
                    i10 += iZzz2 + iZzA;
                    break;
                case 2:
                    iZzA = zzuc.zzA(((Long) obj2).longValue());
                    i10 += iZzz2 + iZzA;
                    break;
                case 3:
                    iZzA = zzuc.zzA(((Long) obj2).longValue());
                    i10 += iZzz2 + iZzA;
                    break;
                case 4:
                    iZzA = zzuc.zzA(((Integer) obj2).intValue());
                    i10 += iZzz2 + iZzA;
                    break;
                case 5:
                    ((Long) obj2).longValue();
                    iZzA = 8;
                    i10 += iZzz2 + iZzA;
                    break;
                case 6:
                    ((Integer) obj2).intValue();
                    i10 += iZzz2 + iZzA;
                    break;
                case 7:
                    ((Boolean) obj2).booleanValue();
                    iZzA = 1;
                    i10 += iZzz2 + iZzA;
                    break;
                case 8:
                    if (obj2 instanceof zztu) {
                        iZzd = ((zztu) obj2).zzd();
                        iZzz = zzuc.zzz(iZzd);
                        iZzA = iZzz + iZzd;
                    } else {
                        iZzA = zzuc.zzy((String) obj2);
                    }
                    i10 += iZzz2 + iZzA;
                    break;
                case 9:
                    iZzA = ((zzvw) obj2).zzu();
                    i10 += iZzz2 + iZzA;
                    break;
                case 10:
                    if (obj2 instanceof zzvg) {
                        iZzd = ((zzvg) obj2).zza();
                        iZzz = zzuc.zzz(iZzd);
                    } else {
                        iZzd = ((zzvw) obj2).zzu();
                        iZzz = zzuc.zzz(iZzd);
                    }
                    iZzA = iZzz + iZzd;
                    i10 += iZzz2 + iZzA;
                    break;
                case 11:
                    if (obj2 instanceof zztu) {
                        iZzd = ((zztu) obj2).zzd();
                        iZzz = zzuc.zzz(iZzd);
                    } else {
                        iZzd = ((byte[]) obj2).length;
                        iZzz = zzuc.zzz(iZzd);
                    }
                    iZzA = iZzz + iZzd;
                    i10 += iZzz2 + iZzA;
                    break;
                case 12:
                    iZzA = zzuc.zzz(((Integer) obj2).intValue());
                    i10 += iZzz2 + iZzA;
                    break;
                case 13:
                    iZzA = obj2 instanceof zzuy ? zzuc.zzA(((zzuy) obj2).zza()) : zzuc.zzA(((Integer) obj2).intValue());
                    i10 += iZzz2 + iZzA;
                    break;
                case 14:
                    ((Integer) obj2).intValue();
                    i10 += iZzz2 + iZzA;
                    break;
                case 15:
                    ((Long) obj2).longValue();
                    iZzA = 8;
                    i10 += iZzz2 + iZzA;
                    break;
                case 16:
                    int iIntValue = ((Integer) obj2).intValue();
                    iZzA = zzuc.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10 += iZzz2 + iZzA;
                    break;
                case 17:
                    long jLongValue = ((Long) obj2).longValue();
                    iZzA = zzuc.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10 += iZzz2 + iZzA;
                    break;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i10;
    }

    public static zzum zzd() {
        return zzb;
    }

    private final void zzm(Map.Entry entry) {
        zzul zzulVar = (zzul) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzvg;
        zzulVar.zze();
        if (z10) {
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        Object objZze = zze(zzulVar);
        List list = (List) value;
        int size = list.size();
        if (objZze == null) {
            objZze = new ArrayList(size);
        }
        List list2 = (List) objZze;
        for (int i10 = 0; i10 < size; i10++) {
            Object objZzb = list.get(i10);
            if (objZzb instanceof zzwb) {
                objZzb = ((zzwb) objZzb).zzb();
            } else if (objZzb instanceof byte[]) {
                byte[] bArr = (byte[]) objZzb;
                int length = bArr.length;
                Object obj = new byte[length];
                System.arraycopy(bArr, 0, obj, 0, length);
                objZzb = obj;
            }
            list2.add(objZzb);
        }
        this.zza.put(zzulVar, objZze);
    }

    private static boolean zzn(Map.Entry entry) {
        zzul zzulVar = (zzul) entry.getKey();
        if (zzulVar.zzc() != zzxh.MESSAGE) {
            return true;
        }
        zzulVar.zze();
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzvx) {
                if (!((zzvx) obj).zzt()) {
                    return false;
                }
            } else if (!(obj instanceof zzvg)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static final int zzo(Map.Entry entry) {
        zzul zzulVar = (zzul) entry.getKey();
        Object value = entry.getValue();
        if (zzulVar.zzc() == zzxh.MESSAGE) {
            zzulVar.zze();
        }
        return zza(zzulVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzp(zzul zzulVar, Object obj) {
        boolean z10;
        zzulVar.zzb();
        byte[] bArr = zzvc.zzb;
        obj.getClass();
        zzxg zzxgVar = zzxg.zza;
        zzxh zzxhVar = zzxh.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zztu) || (obj instanceof byte[])) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzuy)) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzvw) || (obj instanceof zzvg)) {
                    return;
                }
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
            default:
                zzulVar.zza();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, zzulVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzum) {
            return this.zza.equals(((zzum) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzo += zzo(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzum clone() {
        zzum zzumVar = new zzum();
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzumVar.zzj((zzul) ((zzwl) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzumVar.zzj((zzul) entry.getKey(), entry.getValue());
        }
        return zzumVar;
    }

    public final Object zze(zzul zzulVar) {
        Object obj = this.zza.get(zzulVar);
        if (!(obj instanceof zzvg)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zza.entrySet().iterator();
    }

    public final void zzg(zzul zzulVar, Object obj) {
        List arrayList;
        zzp(zzulVar, obj);
        Object objZze = zze(zzulVar);
        if (objZze == null) {
            arrayList = new ArrayList();
            this.zza.put(zzulVar, arrayList);
        } else {
            arrayList = (List) objZze;
        }
        arrayList.add(obj);
    }

    public final void zzh() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            if (entryZzg.getValue() instanceof zzuw) {
                ((zzuw) entryZzg.getValue()).zzD();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzi(zzum zzumVar) {
        int iZzc = zzumVar.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            zzm(zzumVar.zza.zzg(i10));
        }
        Iterator it = zzumVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    public final void zzj(zzul zzulVar, Object obj) {
        zzulVar.zze();
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        List list = (List) obj;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            zzp(zzulVar, obj2);
            arrayList.add(obj2);
        }
        this.zza.put(zzulVar, arrayList);
    }

    public final boolean zzk() {
        return this.zzc;
    }

    public final boolean zzl() {
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzum(boolean z10) {
        zzh();
        zzh();
    }
}
