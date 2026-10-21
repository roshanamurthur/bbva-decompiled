package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzmm;
import com.google.android.gms.internal.mlkit_common.zzmn;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class CloseGuard implements Closeable {

    @KeepForSdk
    public static final int API_TRANSLATE = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f49404p0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f49405q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Cleaner.Cleanable f49406r0;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cleaner f49407a;

        public Factory(@NonNull Cleaner cleaner) {
            this.f49407a = cleaner;
        }

        @NonNull
        @KeepForSdk
        public CloseGuard create(@NonNull Object obj, int i10, @NonNull Runnable runnable) {
            return new CloseGuard(obj, i10, this.f49407a, runnable, zzss.zzb("common"));
        }
    }

    public CloseGuard(Object obj, final int i10, Cleaner cleaner, final Runnable runnable, final zzsh zzshVar) {
        this.f49405q0 = obj.toString();
        this.f49406r0 = cleaner.register(obj, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                CloseGuard closeGuard = this.zza;
                int i11 = i10;
                zzsh zzshVar2 = zzshVar;
                Runnable runnable2 = runnable;
                if (!closeGuard.f49404p0.get()) {
                    String.format(Locale.ENGLISH, "%s has not been closed", closeGuard.f49405q0);
                    zzmw zzmwVar = new zzmw();
                    zzmn zzmnVar = new zzmn();
                    zzmnVar.zzb(zzmm.zzb(i11));
                    zzmwVar.zzh(zzmnVar.zzc());
                    zzshVar2.zzd(zzsk.zzf(zzmwVar), zzmv.HANDLE_LEAKED);
                }
                runnable2.run();
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f49404p0.set(true);
        this.f49406r0.clean();
    }
}
