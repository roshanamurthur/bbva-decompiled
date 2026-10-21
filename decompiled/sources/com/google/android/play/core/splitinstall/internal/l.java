package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import java.io.File;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements zzan, zzef {
    public static ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public void zza(ClassLoader classLoader, Set set) {
        af.d.b(classLoader, set, new i());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return k.e(classLoader, file, file2, z10);
    }
}
