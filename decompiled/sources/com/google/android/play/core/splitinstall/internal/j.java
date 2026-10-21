package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements zzar, zzef {
    @Override // com.google.android.play.core.splitinstall.internal.zzar
    public boolean zza(Object obj, File file, File file2) {
        try {
            return !((Boolean) zzbk.zzf(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void a() {
    }
}
