package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzjx<MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> extends zzih<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmc zzc = zzmc.zzc();
    protected int zzd = -1;

    public static Object zzbC(Method method, Object obj, Object... objArr) {
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

    public static Object zzbD(zzlc zzlcVar, String str, Object[] objArr) {
        return new zzlm(zzlcVar, str, objArr);
    }

    public static void zzbE(Class cls, zzjx zzjxVar) {
        zza.put(cls, zzjxVar);
    }

    public static zzjx zzbu(Class cls) {
        Map map = zza;
        zzjx zzjxVar = (zzjx) map.get(cls);
        if (zzjxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjxVar = (zzjx) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (zzjxVar == null) {
            zzjxVar = (zzjx) ((zzjx) zzml.zze(cls)).zzl(6, null, null);
            if (zzjxVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzjxVar);
        }
        return zzjxVar;
    }

    public static zzkc zzbv() {
        return zzjy.zzf();
    }

    public static zzkd zzbw() {
        return zzkr.zzf();
    }

    public static zzkd zzbx(zzkd zzkdVar) {
        int size = zzkdVar.size();
        return zzkdVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzke zzby() {
        return zzll.zze();
    }

    public static zzke zzbz(zzke zzkeVar) {
        int size = zzkeVar.size();
        return zzkeVar.zzd(size == 0 ? 10 : size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlk.zza().zzb(getClass()).zzi(this, (zzjx) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int iZzb = zzlk.zza().zzb(getClass()).zzb(this);
        this.zzb = iZzb;
        return iZzb;
    }

    public final String toString() {
        return zzle.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzbA() {
        return (zzjt) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzbB() {
        zzjt zzjtVar = (zzjt) zzl(5, null, null);
        zzjtVar.zzaw(this);
        return zzjtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void zzbF(zzje zzjeVar) throws IOException {
        zzlk.zza().zzb(getClass()).zzm(this, zzjf.zza(zzjeVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final /* synthetic */ zzlc zzbJ() {
        return (zzjx) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final int zzbm() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final void zzbp(int i10) {
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int zzbr() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int iZza = zzlk.zza().zzb(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final zzjt zzbs() {
        return (zzjt) zzl(5, null, null);
    }

    public final zzjt zzbt() {
        zzjt zzjtVar = (zzjt) zzl(5, null, null);
        zzjtVar.zzaw(this);
        return zzjtVar;
    }

    public abstract Object zzl(int i10, Object obj, Object obj2);
}
