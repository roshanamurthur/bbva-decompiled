package com.mypinpad.android.hapticslibrary;

import android.content.res.TypedArray;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u0002H\u0001\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0001H\u0080\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"getEnum", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/content/res/TypedArray;", FirebaseAnalytics.Param.INDEX, "", "default", "(Landroid/content/res/TypedArray;ILjava/lang/Enum;)Ljava/lang/Enum;", "android-scheme-haptics-library.implementation"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UtilKt {
    public static final /* synthetic */ <T extends Enum<T>> T getEnum(TypedArray typedArray, int i10, T t10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(t10, "default");
        int i11 = typedArray.getInt(i10, -1);
        if (i11 < 0) {
            return t10;
        }
        Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) new Enum[0][i11];
    }
}
