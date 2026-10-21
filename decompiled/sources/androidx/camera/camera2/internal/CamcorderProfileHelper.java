package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
interface CamcorderProfileHelper {
    CamcorderProfile get(int i10, int i11);

    boolean hasProfile(int i10, int i11);
}
