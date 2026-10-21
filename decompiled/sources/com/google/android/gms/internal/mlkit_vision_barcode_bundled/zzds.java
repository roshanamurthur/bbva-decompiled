package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.widget.o1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzds {
    private static final zzds zzb = new zzds(true);
    final zzgl zza = new zzge(16);
    private boolean zzc;
    private boolean zzd;

    private zzds() {
    }

    public static int zza(zzdr zzdrVar, Object obj) {
        zzhf zzhfVarZzd = zzdrVar.zzd();
        int iZza = zzdrVar.zza();
        zzdrVar.zzg();
        int iZzC = zzdi.zzC(iZza);
        if (zzhfVarZzd == zzhf.zzj) {
            zzel.zzi((zzfl) obj);
            iZzC += iZzC;
        }
        zzhg zzhgVar = zzhg.INT;
        int iZzE = 4;
        switch (zzhfVarZzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                iZzE = 8;
                return iZzC + iZzE;
            case 1:
                ((Float) obj).floatValue();
                return iZzC + iZzE;
            case 2:
                iZzE = zzdi.zzE(((Long) obj).longValue());
                return iZzC + iZzE;
            case 3:
                iZzE = zzdi.zzE(((Long) obj).longValue());
                return iZzC + iZzE;
            case 4:
                iZzE = zzdi.zzx(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 5:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzC + iZzE;
            case 6:
                ((Integer) obj).intValue();
                return iZzC + iZzE;
            case 7:
                ((Boolean) obj).booleanValue();
                iZzE = 1;
                return iZzC + iZzE;
            case 8:
                iZzE = obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzB((String) obj);
                return iZzC + iZzE;
            case 9:
                iZzE = zzdi.zzw((zzfl) obj);
                return iZzC + iZzE;
            case 10:
                iZzE = obj instanceof zzes ? zzdi.zzy((zzes) obj) : zzdi.zzz((zzfl) obj);
                return iZzC + iZzE;
            case 11:
                iZzE = obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzt((byte[]) obj);
                return iZzC + iZzE;
            case 12:
                iZzE = zzdi.zzD(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 13:
                iZzE = obj instanceof zzee ? zzdi.zzx(((zzee) obj).zza()) : zzdi.zzx(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 14:
                ((Integer) obj).intValue();
                return iZzC + iZzE;
            case 15:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzC + iZzE;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzE = zzdi.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzC + iZzE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzE = zzdi.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzC + iZzE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzds zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzfq) {
            return ((zzfq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzfl zzflVarZzl;
        zzdr zzdrVar = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzes) {
            throw null;
        }
        zzdrVar.zzg();
        if (zzdrVar.zze() != zzhg.MESSAGE) {
            this.zza.put(zzdrVar, zzl(value));
            return;
        }
        Object objZze = zze(zzdrVar);
        if (objZze == null) {
            this.zza.put(zzdrVar, zzl(value));
            return;
        }
        if (objZze instanceof zzfq) {
            zzflVarZzl = zzdrVar.zzc((zzfq) objZze, (zzfq) value);
        } else {
            zzfk zzfkVarZzV = ((zzfl) objZze).zzV();
            zzdrVar.zzb(zzfkVarZzV, (zzfl) value);
            zzflVarZzl = zzfkVarZzV.zzl();
        }
        this.zza.put(zzdrVar, zzflVarZzl);
    }

    private static boolean zzn(Map.Entry entry) {
        zzdr zzdrVar = (zzdr) entry.getKey();
        if (zzdrVar.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdrVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfm) {
            return ((zzfm) value).zzY();
        }
        if (value instanceof zzes) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzdr zzdrVar = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (zzdrVar.zze() != zzhg.MESSAGE) {
            return zza(zzdrVar, value);
        }
        zzdrVar.zzg();
        zzdrVar.zzf();
        if (value instanceof zzes) {
            int iZza = ((zzdr) entry.getKey()).zza();
            int iZzD = zzdi.zzD(8);
            int iZza2 = ((zzes) value).zza();
            return a.a(iZza2, iZza2, zzdi.zzD(24), o1.a(iZza, zzdi.zzD(16), iZzD + iZzD));
        }
        int iZza3 = ((zzdr) entry.getKey()).zza();
        int iZzD2 = zzdi.zzD(8);
        return zzdi.zzz((zzfl) value) + zzdi.zzD(24) + o1.a(iZza3, zzdi.zzD(16), iZzD2 + iZzD2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzds) {
            return this.zza.equals(((zzds) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            iZzo += zzo(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzds clone() {
        zzds zzdsVar = new zzds();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzdsVar.zzi((zzdr) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzdsVar.zzi((zzdr) entry.getKey(), entry.getValue());
        }
        zzdsVar.zzd = this.zzd;
        return zzdsVar;
    }

    public final Object zze(zzdr zzdrVar) {
        Object obj = this.zza.get(zzdrVar);
        if (!(obj instanceof zzes)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzer(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzds zzdsVar) {
        for (int i10 = 0; i10 < zzdsVar.zza.zzb(); i10++) {
            zzm(zzdsVar.zza.zzg(i10));
        }
        Iterator it = zzdsVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zze(r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L45;
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L55
        L1b:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
            if (r0 != 0) goto L49
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L55
            goto L49
        L24:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L49
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee
            if (r0 == 0) goto L55
            goto L49
        L2d:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r0 != 0) goto L49
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L55
            goto L49
        L36:
            boolean r0 = r7 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r7 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r7 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r7 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r7 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L55
        L49:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L4f
            r5.zzd = r1
        L4f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r0 = r5.zza
            r0.put(r6, r7)
            return
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r6 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r6 = r6.zza()
            r2[r1] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r2[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds.zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzds(boolean z10) {
        zzg();
        zzg();
    }
}
