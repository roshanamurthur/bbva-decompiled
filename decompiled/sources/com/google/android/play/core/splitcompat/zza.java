package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f46248a;

    public zza(zze zzeVar) {
        this.f46248a = zzeVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        return ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
    }

    public final synchronized void zza(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzc(assets, (File) it.next());
        }
    }
}
