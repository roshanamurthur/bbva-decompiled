package com.bbva.sdkcatalog.openpay.plugin;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuildHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/BuildHelper;", "", "<init>", "()V", "versionCode", "", "getVersionCode", "()I", "isTapOnPhoneEnabled", "", "()Z", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildHelper {

    @NotNull
    public static final BuildHelper INSTANCE = new BuildHelper();
    private static final int versionCode = Build.VERSION.SDK_INT;
    private static final boolean isTapOnPhoneEnabled = true;

    private BuildHelper() {
    }

    public final int getVersionCode() {
        return versionCode;
    }

    public final boolean isTapOnPhoneEnabled() {
        return isTapOnPhoneEnabled;
    }
}
