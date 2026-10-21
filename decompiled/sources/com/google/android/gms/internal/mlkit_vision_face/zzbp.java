package com.google.android.gms.internal.mlkit_vision_face;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzbp implements Map, Serializable {

    @CheckForNull
    private transient zzbq zza;

    @CheckForNull
    private transient zzbq zzb;

    @CheckForNull
    private transient zzbi zzc;

    public static zzbp zzc(Object obj, Object obj2) {
        zzau.zzb("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzch.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbq zzbqVar = this.zzb;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarZze = zze();
        this.zzb = zzbqVarZze;
        return zzbqVarZze;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzau.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, SvgConstantsKt.SPECIFIED_MASK));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public abstract zzbi zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbi values() {
        zzbi zzbiVar = this.zzc;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarZza = zza();
        this.zzc = zzbiVarZza;
        return zzbiVarZza;
    }

    public abstract zzbq zzd();

    public abstract zzbq zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbq entrySet() {
        zzbq zzbqVar = this.zza;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarZzd = zzd();
        this.zza = zzbqVarZzd;
        return zzbqVarZzd;
    }
}
