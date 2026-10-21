package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhk implements zzkv {
    final /* synthetic */ zzhw zza;

    public zzhk(zzhw zzhwVar) {
        this.zza = zzhwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            this.zza.zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
        }
    }
}
