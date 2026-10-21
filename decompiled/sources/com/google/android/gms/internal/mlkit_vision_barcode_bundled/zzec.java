package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzdw<MessageType, BuilderType>> extends zzck<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzgq zzc = zzgq.zzc();
    protected int zzd = -1;

    public static zzea zzH(zzfl zzflVar, Object obj, zzfl zzflVar2, zzef zzefVar, int i10, zzhf zzhfVar, Class cls) {
        return new zzea(zzflVar, obj, zzflVar2, new zzdz(null, i10, zzhfVar, false, false), cls);
    }

    public static zzec zzI(Class cls) {
        Map map = zza;
        zzec zzecVar = (zzec) map.get(cls);
        if (zzecVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzecVar = (zzec) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (zzecVar == null) {
            zzecVar = (zzec) ((zzec) zzgz.zze(cls)).zzg(6, null, null);
            if (zzecVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzecVar);
        }
        return zzecVar;
    }

    public static zzec zzJ(zzec zzecVar, byte[] bArr, zzdn zzdnVar) throws zzen {
        zzec zzecVarZzK = zzK(zzecVar, bArr, 0, bArr.length, zzdnVar);
        if (zzecVarZzK == null || zzecVarZzK.zzY()) {
            return zzecVarZzK;
        }
        zzen zzenVar = new zzen(new zzgo(zzecVarZzK).getMessage());
        zzenVar.zzf(zzecVarZzK);
        throw zzenVar;
    }

    public static zzec zzK(zzec zzecVar, byte[] bArr, int i10, int i11, zzdn zzdnVar) throws zzen {
        zzec zzecVar2 = (zzec) zzecVar.zzg(4, null, null);
        try {
            zzgb zzgbVarZzb = zzfu.zza().zzb(zzecVar2.getClass());
            zzgbVarZzb.zzh(zzecVar2, bArr, 0, i11, new zzco(zzdnVar));
            zzgbVarZzb.zzf(zzecVar2);
            if (zzecVar2.zzb == 0) {
                return zzecVar2;
            }
            throw new RuntimeException();
        } catch (zzen e5) {
            e5.zzf(zzecVar2);
            throw e5;
        } catch (IOException e7) {
            if (e7.getCause() instanceof zzen) {
                throw ((zzen) e7.getCause());
            }
            zzen zzenVar = new zzen(e7);
            zzenVar.zzf(zzecVar2);
            throw zzenVar;
        } catch (IndexOutOfBoundsException unused) {
            zzen zzenVarZzg = zzen.zzg();
            zzenVarZzg.zzf(zzecVar2);
            throw zzenVarZzg;
        }
    }

    public static zzeh zzL() {
        return zzdu.zze();
    }

    public static zzeh zzM(zzeh zzehVar) {
        int size = zzehVar.size();
        return zzehVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzei zzN() {
        return zzed.zzf();
    }

    public static zzek zzO() {
        return zzfv.zze();
    }

    public static zzek zzP(zzek zzekVar) {
        int size = zzekVar.size();
        return zzekVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzR(zzfl zzflVar, String str, Object[] objArr) {
        return new zzfw(zzflVar, str, objArr);
    }

    public static void zzS(Class cls, zzec zzecVar) {
        zza.put(cls, zzecVar);
    }

    public static final boolean zzT(zzec zzecVar, boolean z10) {
        byte bByteValue = ((Byte) zzecVar.zzg(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzj = zzfu.zza().zzb(zzecVar.getClass()).zzj(zzecVar);
        if (z10) {
            zzecVar.zzg(2, true != zZzj ? null : zzecVar, null);
        }
        return zZzj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfu.zza().zzb(getClass()).zzi(this, (zzec) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int iZzb = zzfu.zza().zzb(getClass()).zzb(this);
        this.zzb = iZzb;
        return iZzb;
    }

    public final String toString() {
        return zzfn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    public final int zzB() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    public final void zzD(int i10) {
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final int zzE() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int iZza = zzfu.zza().zzb(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final zzdw zzF() {
        return (zzdw) zzg(5, null, null);
    }

    public final zzdw zzG() {
        zzdw zzdwVar = (zzdw) zzg(5, null, null);
        zzdwVar.zzi(this);
        return zzdwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final /* synthetic */ zzfk zzU() {
        return (zzdw) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final /* synthetic */ zzfk zzV() {
        zzdw zzdwVar = (zzdw) zzg(5, null, null);
        zzdwVar.zzi(this);
        return zzdwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final void zzW(zzdi zzdiVar) throws IOException {
        zzfu.zza().zzb(getClass()).zzm(this, zzdj.zza(zzdiVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzX() {
        return (zzec) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final boolean zzY() {
        return zzT(this, true);
    }

    public abstract Object zzg(int i10, Object obj, Object obj2);
}
