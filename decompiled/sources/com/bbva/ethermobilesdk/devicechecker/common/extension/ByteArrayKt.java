package com.bbva.ethermobilesdk.devicechecker.common.extension;

import android.os.Build;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBase64", "", "", "devicechecker-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ByteArrayKt {
    @NotNull
    public static final String toBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "{\n        Base64.getEnco…ncodeToString(this)\n    }");
            return strEncodeToString;
        }
        String strEncodeToString2 = android.util.Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "{\n        android.util.B…til.Base64.NO_WRAP)\n    }");
        return strEncodeToString2;
    }
}
