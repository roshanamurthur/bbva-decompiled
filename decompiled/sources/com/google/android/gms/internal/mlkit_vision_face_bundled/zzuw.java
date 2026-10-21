package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.appcompat.widget.g0;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuq;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzuw<MessageType extends zzuw<MessageType, BuilderType>, BuilderType extends zzuq<MessageType, BuilderType>> extends zztf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzww zzc = zzww.zzc();

    public static zzvb zzA() {
        return zzwf.zze();
    }

    public static Object zzB(Method method, Object obj, Object... objArr) {
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

    public static Object zzC(zzvw zzvwVar, String str, Object[] objArr) {
        return new zzwg(zzvwVar, str, objArr);
    }

    public static void zzF(Class cls, zzuw zzuwVar) {
        zzuwVar.zzE();
        zzb.put(cls, zzuwVar);
    }

    public static final boolean zzH(zzuw zzuwVar, boolean z10) {
        byte bByteValue = ((Byte) zzuwVar.zzf(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzwe.zza().zzb(zzuwVar.getClass()).zzk(zzuwVar);
        if (z10) {
            zzuwVar.zzf(2, true != zZzk ? null : zzuwVar, null);
        }
        return zZzk;
    }

    private final int zzb(zzwh zzwhVar) {
        return zzwe.zza().zzb(getClass()).zza(this);
    }

    private static zzuw zzd(zzuw zzuwVar, byte[] bArr, int i10, int i11, zzuh zzuhVar) throws zzve {
        if (i11 == 0) {
            return zzuwVar;
        }
        zzuw zzuwVarZzy = zzuwVar.zzy();
        try {
            zzwh zzwhVarZzb = zzwe.zza().zzb(zzuwVarZzy.getClass());
            zzwhVarZzb.zzh(zzuwVarZzy, bArr, 0, i11, new zztj(zzuhVar));
            zzwhVarZzb.zzf(zzuwVarZzy);
            return zzuwVarZzy;
        } catch (zzve e5) {
            throw e5;
        } catch (zzwu e7) {
            throw e7.zza();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzve) {
                throw ((zzve) e10.getCause());
            }
            throw new zzve(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zzuu zzw(zzvw zzvwVar, zzvw zzvwVar2, zzuz zzuzVar, int i10, zzxg zzxgVar, boolean z10, Class cls) {
        return new zzuu(zzvwVar, Collections.emptyList(), zzvwVar2, new zzut(null, 202056002, zzxgVar, true, false), cls);
    }

    public static zzuw zzx(Class cls) {
        Map map = zzb;
        zzuw zzuwVar = (zzuw) map.get(cls);
        if (zzuwVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzuwVar = (zzuw) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (zzuwVar == null) {
            zzuwVar = (zzuw) ((zzuw) zzxc.zze(cls)).zzf(6, null, null);
            if (zzuwVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzuwVar);
        }
        return zzuwVar;
    }

    public static zzuw zzz(zzuw zzuwVar, byte[] bArr, zzuh zzuhVar) throws zzve {
        zzuw zzuwVarZzd = zzd(zzuwVar, bArr, 0, bArr.length, zzuhVar);
        if (zzuwVarZzd == null || zzH(zzuwVarZzd, true)) {
            return zzuwVarZzd;
        }
        throw new zzwu(zzuwVarZzd).zza();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzwe.zza().zzb(getClass()).zzj(this, (zzuw) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzs();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzs = zzs();
        this.zza = iZzs;
        return iZzs;
    }

    public final String toString() {
        return zzvy.zza(this, super.toString());
    }

    public final void zzD() {
        zzwe.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    public final void zzE() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzG(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final /* synthetic */ zzvv zzK() {
        return (zzuq) zzf(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final void zzL(zzuc zzucVar) throws IOException {
        zzwe.zza().zzb(getClass()).zzi(this, zzud.zza(zzucVar));
    }

    public abstract Object zzf(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztf
    public final int zzp(zzwh zzwhVar) {
        if (zzI()) {
            int iZza = zzwhVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(g0.c("serialized size must be non-negative, was ", iZza));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzwhVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(g0.c("serialized size must be non-negative, was ", iZza2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvx
    public final /* synthetic */ zzvw zzq() {
        return (zzuw) zzf(6, null, null);
    }

    public final int zzs() {
        return zzwe.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvx
    public final boolean zzt() {
        return zzH(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final int zzu() {
        int iZzb;
        if (zzI()) {
            iZzb = zzb(null);
            if (iZzb < 0) {
                throw new IllegalStateException(g0.c("serialized size must be non-negative, was ", iZzb));
            }
        } else {
            iZzb = this.zzd & Integer.MAX_VALUE;
            if (iZzb == Integer.MAX_VALUE) {
                iZzb = zzb(null);
                if (iZzb < 0) {
                    throw new IllegalStateException(g0.c("serialized size must be non-negative, was ", iZzb));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzb;
            }
        }
        return iZzb;
    }

    public final zzuq zzv() {
        return (zzuq) zzf(5, null, null);
    }

    public final zzuw zzy() {
        return (zzuw) zzf(4, null, null);
    }
}
