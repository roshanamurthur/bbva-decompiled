package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzaz extends zzau {
    final transient Object zza;

    public zzaz(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Constant.BRACKET_OPEN + this.zza.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, com.google.android.gms.internal.tapandpay.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzba iterator() {
        return new zzav(this.zza);
    }
}
