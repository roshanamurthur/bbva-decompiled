package com.google.android.play.core.splitinstall;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46360a;

    public zzbe(@NonNull Context context) {
        this.f46360a = context;
    }

    public final Set zza() {
        Set<String> hashSet;
        synchronized (zzbe.class) {
            try {
                hashSet = this.f46360a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void zzb() {
        synchronized (zzbe.class) {
            this.f46360a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }
}
