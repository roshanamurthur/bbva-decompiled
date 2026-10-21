package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class BitmapInStreamingChecker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GmsLogger f49582c = new GmsLogger("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f49583a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49584b = -1;

    @KeepForSdk
    public void check(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f49583a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f49584b;
        if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f49584b = jElapsedRealtime;
            f49582c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
