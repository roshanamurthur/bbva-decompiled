package com.bbva.ethermobilesdk.passchecker.util;

import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Zxcvbn.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"zxcvbnMeasure", "Lcom/nulabinc/zxcvbn/Strength;", "kotlin.jvm.PlatformType", "password", "", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ZxcvbnKt {
    public static final Strength zxcvbnMeasure(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        return new Zxcvbn().measure(password);
    }
}
