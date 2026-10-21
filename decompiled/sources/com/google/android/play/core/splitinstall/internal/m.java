package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        af.d.b(classLoader, set, new i());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return f.a(classLoader, file, file2, z10, new af.b(), "path", new a4.c());
    }
}
