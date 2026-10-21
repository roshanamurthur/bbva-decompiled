package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;

/* JADX INFO: loaded from: classes9.dex */
final class zzae implements CapabilityClient.OnCapabilityChangedListener {
    private final String zzbc;
    private final CapabilityClient.OnCapabilityChangedListener zzby;

    public zzae(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        this.zzby = onCapabilityChangedListener;
        this.zzbc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzae.class != obj.getClass()) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (this.zzby.equals(zzaeVar.zzby)) {
            return this.zzbc.equals(zzaeVar.zzbc);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbc.hashCode() + (this.zzby.hashCode() * 31);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        this.zzby.onCapabilityChanged(capabilityInfo);
    }
}
