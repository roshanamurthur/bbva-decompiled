package com.bbva.ethermobilesdk.deviceinfo.data;

import androidx.annotation.Keep;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemProperties;", "", ContextualDataConstants.CD_OS_VERSION, "", "runtimeName", "runtimeVersion", "javaVmName", "javaVmVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJavaVmName", "()Ljava/lang/String;", "getJavaVmVersion", "getOsVersion", "getRuntimeName", "getRuntimeVersion", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SystemProperties {

    @Nullable
    private final String javaVmName;

    @Nullable
    private final String javaVmVersion;

    @Nullable
    private final String osVersion;

    @Nullable
    private final String runtimeName;

    @Nullable
    private final String runtimeVersion;

    public SystemProperties(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.osVersion = str;
        this.runtimeName = str2;
        this.runtimeVersion = str3;
        this.javaVmName = str4;
        this.javaVmVersion = str5;
    }

    @Nullable
    public final String getJavaVmName() {
        return this.javaVmName;
    }

    @Nullable
    public final String getJavaVmVersion() {
        return this.javaVmVersion;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    public final String getRuntimeName() {
        return this.runtimeName;
    }

    @Nullable
    public final String getRuntimeVersion() {
        return this.runtimeVersion;
    }
}
