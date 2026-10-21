package com.bbva.ethermobilesdk.devicechecker.common.extension;

import android.os.Build;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"base64ToByteArray", "", "", "devicechecker-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    @NotNull
    public static final byte[] base64ToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "{\n        Base64.getDecoder().decode(this)\n    }");
            return bArrDecode;
        }
        byte[] bArrDecode2 = android.util.Base64.decode(str, 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "{\n        android.util.B…til.Base64.NO_WRAP)\n    }");
        return bArrDecode2;
    }
}
