package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.internal.zzcb;
import com.google.android.play.core.splitinstall.testing.zzaa;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzae implements zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcb f46355a;

    public zzae(zzcb zzcbVar) {
        this.f46355a = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f46355a.zza();
        if (file == null) {
            return null;
        }
        return zzaa.zza(file);
    }
}
