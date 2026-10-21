package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzud implements zzxi {
    private final zzuc zza;

    private zzud(zzuc zzucVar) {
        byte[] bArr = zzvc.zzb;
        this.zza = zzucVar;
        zzucVar.zza = this;
    }

    public static zzud zza(zzuc zzucVar) {
        zzud zzudVar = zzucVar.zza;
        return zzudVar != null ? zzudVar : new zzud(zzucVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z10) {
            while (i11 < zzvlVar.size()) {
                this.zza.zzh(i10, zzvlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzvlVar.size(); i15++) {
            zzvlVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzvlVar.size()) {
            this.zza.zzi(zzvlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzs(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzuc zzucVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzucVar.zzs(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzz += zzuc.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                zzuc zzucVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzucVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                zzuc zzucVar3 = this.zza;
                int iZze = zzuxVar.zze(i11);
                zzucVar3.zzs(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzuxVar.size(); i13++) {
            int iZze2 = zzuxVar.zze(i13);
            iZzz2 += zzuc.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzuxVar.size()) {
            zzuc zzucVar4 = this.zza;
            int iZze3 = zzuxVar.zze(i11);
            zzucVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzu(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzuc zzucVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzucVar.zzu(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzA += zzuc.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                zzuc zzucVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzucVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z10) {
            while (i11 < zzvlVar.size()) {
                zzuc zzucVar3 = this.zza;
                long jZze = zzvlVar.zze(i11);
                zzucVar3.zzu(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzvlVar.size(); i13++) {
            long jZze2 = zzvlVar.zze(i13);
            iZzA2 += zzuc.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzvlVar.size()) {
            zzuc zzucVar4 = this.zza;
            long jZze3 = zzvlVar.zze(i11);
            zzucVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzr(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzp(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvi)) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzvi zzviVar = (zzvi) list;
        while (i11 < list.size()) {
            Object objZza = zzviVar.zza();
            if (objZza instanceof String) {
                this.zza.zzp(i10, (String) objZza);
            } else {
                this.zza.zze(i10, (zztu) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzs(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzs(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzuc.zzz(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                this.zza.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                this.zza.zzs(i10, zzuxVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzuxVar.size(); i13++) {
            iZzz2 += zzuc.zzz(zzuxVar.zze(i13));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzuxVar.size()) {
            this.zza.zzt(zzuxVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzuc.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z10) {
            while (i11 < zzvlVar.size()) {
                this.zza.zzu(i10, zzvlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzvlVar.size(); i13++) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzvlVar.size()) {
            this.zza.zzv(zzvlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zztl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zztl zztlVar = (zztl) list;
        if (!z10) {
            while (i11 < zztlVar.size()) {
                this.zza.zzd(i10, zztlVar.zzf(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zztlVar.size(); i15++) {
            zztlVar.zzf(i15);
            i14++;
        }
        this.zza.zzt(i14);
        while (i11 < zztlVar.size()) {
            this.zza.zzb(zztlVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzd(int i10, zztu zztuVar) throws IOException {
        this.zza.zze(i10, zztuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zztu) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzf(int i10, double d2) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzue)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzue zzueVar = (zzue) list;
        if (!z10) {
            while (i11 < zzueVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzueVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzueVar.size(); i15++) {
            zzueVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzueVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzueVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzr(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzuc.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                this.zza.zzj(i10, zzuxVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzuxVar.size(); i13++) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzuxVar.size()) {
            this.zza.zzk(zzuxVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                this.zza.zzf(i10, zzuxVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzuxVar.size(); i15++) {
            zzuxVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzuxVar.size()) {
            this.zza.zzg(zzuxVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z10) {
            while (i11 < zzvlVar.size()) {
                this.zza.zzh(i10, zzvlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzvlVar.size(); i15++) {
            zzvlVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzvlVar.size()) {
            this.zza.zzi(zzvlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzo(int i10, float f6) throws IOException {
        this.zza.zzf(i10, Float.floatToRawIntBits(f6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzuo)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzuo zzuoVar = (zzuo) list;
        if (!z10) {
            while (i11 < zzuoVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzuoVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzuoVar.size(); i15++) {
            zzuoVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzuoVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzuoVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzq(int i10, Object obj, zzwh zzwhVar) throws IOException {
        zzuc zzucVar = this.zza;
        zzucVar.zzr(i10, 3);
        zzwhVar.zzi((zzvw) obj, zzucVar.zza);
        zzucVar.zzr(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzuc.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                this.zza.zzj(i10, zzuxVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzuxVar.size(); i13++) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzuxVar.size()) {
            this.zza.zzk(zzuxVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzvl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzuc.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzvl zzvlVar = (zzvl) list;
        if (!z10) {
            while (i11 < zzvlVar.size()) {
                this.zza.zzu(i10, zzvlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzvlVar.size(); i13++) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzvlVar.size()) {
            this.zza.zzv(zzvlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzv(int i10, Object obj, zzwh zzwhVar) throws IOException {
        this.zza.zzm(i10, (zzvw) obj, zzwhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zztu) {
            this.zza.zzo(i10, (zztu) obj);
        } else {
            this.zza.zzn(i10, (zzvw) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzux)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzux zzuxVar = (zzux) list;
        if (!z10) {
            while (i11 < zzuxVar.size()) {
                this.zza.zzf(i10, zzuxVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzuxVar.size(); i15++) {
            zzuxVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzuxVar.size()) {
            this.zza.zzg(zzuxVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }
}
