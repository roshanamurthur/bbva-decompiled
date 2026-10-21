package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: CameraManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y {
    @NonNull
    public static CameraManagerCompat.CameraManagerCompatImpl a(@NonNull Context context, @NonNull Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new CameraManagerCompatApi29Impl(context);
        }
        return i10 >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
    }
}
