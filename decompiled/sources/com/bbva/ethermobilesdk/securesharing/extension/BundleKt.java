package com.bbva.ethermobilesdk.securesharing.extension;

import android.os.Bundle;
import com.bbva.ethermobilesdk.securesharing.config.SecurityLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"CONFIG_FILENAME", "", "SECURITY_LEVEL", "configurationFilename", "Landroid/os/Bundle;", "readSecurityLevel", "Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "securesharing_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BundleKt {

    @NotNull
    public static final String CONFIG_FILENAME = "com.bbva.sl.ar.android.storage.pss.provider.config.filename";

    @NotNull
    public static final String SECURITY_LEVEL = "com.bbva.sl.ar.android.storage.pss.provider.security";

    @NotNull
    public static final String configurationFilename(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString(CONFIG_FILENAME, "pss.json");
        Intrinsics.checkNotNullExpressionValue(string, "getString(CONFIG_FILENAME, \"pss.json\")");
        return string;
    }

    @NotNull
    public static final SecurityLevel readSecurityLevel(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString(SECURITY_LEVEL);
        if (string == null) {
            SecurityLevel securityLevel = SecurityLevel.Signature;
            LoggerKt.log(Intrinsics.stringPlus("No security level param found. Using default value: ", securityLevel));
            return securityLevel;
        }
        try {
            return SecurityLevel.INSTANCE.from(string);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("Invalid security level defined in manifest file [");
            sb2.append((Object) string);
            sb2.append("]. Using default value: ");
            SecurityLevel securityLevel2 = SecurityLevel.Signature;
            sb2.append(securityLevel2);
            LoggerKt.log(sb2.toString());
            return securityLevel2;
        }
    }
}
