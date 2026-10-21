package com.bbva.ethermobile.help.kit.internal;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SystemBuild.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobile/help/kit/internal/SystemBuild;", "", "", "getVersion$help_kit_release", "()I", "getVersion", "getVersionCodesAndroidP$help_kit_release", "getVersionCodesAndroidP", "", "a", "Z", "isGreaterThanP$help_kit_release", "()Z", "isGreaterThanP", "<init>", "()V", "help-kit_release"}, k = 1, mv = {1, 9, 0})
public final class SystemBuild {

    @NotNull
    public static final SystemBuild INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final boolean isGreaterThanP;

    static {
        SystemBuild systemBuild = new SystemBuild();
        INSTANCE = systemBuild;
        isGreaterThanP = systemBuild.getVersion$help_kit_release() >= systemBuild.getVersionCodesAndroidP$help_kit_release();
    }

    public final int getVersion$help_kit_release() {
        return Build.VERSION.SDK_INT;
    }

    public final int getVersionCodesAndroidP$help_kit_release() {
        return 28;
    }

    public final boolean isGreaterThanP$help_kit_release() {
        return isGreaterThanP;
    }
}
