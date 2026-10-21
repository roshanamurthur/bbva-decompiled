package com.bbva.glomohybrid.base;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppBuildConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/AppBuildConfig;", "", "", "getFLAG_SECURE", "()Z", "FLAG_SECURE", "getCHECK_ROOT", "CHECK_ROOT", "", "getVERSION_CODE", "()I", "VERSION_CODE", "", "getVERSION_NAME", "()Ljava/lang/String;", "VERSION_NAME", "getFLAVOR_environment", "FLAVOR_environment", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class AppBuildConfig {

    @NotNull
    public static final AppBuildConfig INSTANCE = new AppBuildConfig();

    public final boolean getCHECK_ROOT() {
        return ((Boolean) com.bbva.glomohybrid.BuildConfig.class.getDeclaredField("CHECK_ROOT").get(null)).booleanValue();
    }

    public final boolean getFLAG_SECURE() {
        return ((Boolean) com.bbva.glomohybrid.BuildConfig.class.getDeclaredField("FLAG_SECURE").get(null)).booleanValue();
    }

    @NotNull
    public final String getFLAVOR_environment() {
        return (String) com.bbva.glomohybrid.BuildConfig.class.getDeclaredField("FLAVOR_environment").get(null);
    }

    public final int getVERSION_CODE() {
        return ((Number) com.bbva.glomohybrid.BuildConfig.class.getDeclaredField("VERSION_CODE").get(null)).intValue();
    }

    @NotNull
    public final String getVERSION_NAME() {
        return (String) com.bbva.glomohybrid.BuildConfig.class.getDeclaredField("VERSION_NAME").get(null);
    }
}
