package androidx.camera.core.impl;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class DeviceProperties {
    @NonNull
    public static DeviceProperties create() {
        return create(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    @NonNull
    public abstract String manufacturer();

    @NonNull
    public abstract String model();

    public abstract int sdkVersion();

    @NonNull
    public static DeviceProperties create(@NonNull String str, @NonNull String str2, int i10) {
        return new AutoValue_DeviceProperties(str, str2, i10);
    }
}
