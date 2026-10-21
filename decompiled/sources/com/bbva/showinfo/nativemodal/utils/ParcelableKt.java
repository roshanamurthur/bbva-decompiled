package com.bbva.showinfo.nativemodal.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Parcelable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"parcelable", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "showinfo_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ParcelableKt {
    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) intent.getParcelableExtra(key, Parcelable.class);
        }
        T t10 = (T) intent.getParcelableExtra(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }
}
