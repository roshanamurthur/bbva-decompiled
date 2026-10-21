package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;

/* JADX INFO: loaded from: classes9.dex */
final class zzv implements CapabilityApi.CapabilityListener {
    private final String zzbc;
    private final CapabilityApi.CapabilityListener zzbs;

    public zzv(CapabilityApi.CapabilityListener capabilityListener, String str) {
        this.zzbs = capabilityListener;
        this.zzbc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzv.class != obj.getClass()) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        if (this.zzbs.equals(zzvVar.zzbs)) {
            return this.zzbc.equals(zzvVar.zzbc);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbc.hashCode() + (this.zzbs.hashCode() * 31);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        this.zzbs.onCapabilityChanged(capabilityInfo);
    }
}
