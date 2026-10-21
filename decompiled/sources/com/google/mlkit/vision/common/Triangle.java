package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class Triangle<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzp f49581a;

    @KeepForSdk
    public Triangle(@NonNull T t10, @NonNull T t11, @NonNull T t12) {
        this.f49581a = zzp.zzj(t10, t11, t12);
    }

    @NonNull
    @KeepForSdk
    public List<T> getAllPoints() {
        return this.f49581a;
    }
}
