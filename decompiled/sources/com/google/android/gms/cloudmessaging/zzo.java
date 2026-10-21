package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import net.ipsoft.amelia.sdk.internal.c.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzo extends zzp<Void> {
    public zzo(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean(c.f84801f, false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final boolean zzb() {
        return true;
    }
}
