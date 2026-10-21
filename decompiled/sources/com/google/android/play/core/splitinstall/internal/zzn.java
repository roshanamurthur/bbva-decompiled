package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46317a = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzp zzpVar : this.f46317a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", zzpVar.zza());
            bundle.putLong("event_timestamp", zzpVar.zzb());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void zzb(int i10) {
        this.f46317a.add(zzp.zzc(i10, System.currentTimeMillis()));
    }
}
