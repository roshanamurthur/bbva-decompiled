package com.bbva.glomohybrid.login.extensions;

import android.os.Bundle;
import com.bbva.glomohybrid.login.data.model.MagicLogData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BundleExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/os/Bundle;", "Lcom/bbva/glomohybrid/login/data/model/MagicLogData;", "toMagicLogData", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class BundleExtensionKt {
    @NotNull
    public static final MagicLogData toMagicLogData(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString("contactNumber", "");
        String string2 = bundle.getString("password", "");
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        return new MagicLogData(string, string2);
    }
}
