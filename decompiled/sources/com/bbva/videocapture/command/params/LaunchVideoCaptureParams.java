package com.bbva.videocapture.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchVideoCaptureParams.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/bbva/videocapture/command/params/LaunchVideoCaptureParams;", "", "configuration", "", "", "documentType", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getConfiguration", "()Ljava/util/Map;", "setConfiguration", "(Ljava/util/Map;)V", "getDocumentType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LaunchVideoCaptureParams {

    @Nullable
    private Map<String, String> configuration;

    @Nullable
    private final String documentType;

    public LaunchVideoCaptureParams(@Nullable Map<String, String> map, @Nullable String str) {
        this.configuration = map;
        this.documentType = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LaunchVideoCaptureParams copy$default(LaunchVideoCaptureParams launchVideoCaptureParams, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = launchVideoCaptureParams.configuration;
        }
        if ((i10 & 2) != 0) {
            str = launchVideoCaptureParams.documentType;
        }
        return launchVideoCaptureParams.copy(map, str);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.configuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    @NotNull
    public final LaunchVideoCaptureParams copy(@Nullable Map<String, String> configuration, @Nullable String documentType) {
        return new LaunchVideoCaptureParams(configuration, documentType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchVideoCaptureParams)) {
            return false;
        }
        LaunchVideoCaptureParams launchVideoCaptureParams = (LaunchVideoCaptureParams) other;
        return Intrinsics.areEqual(this.configuration, launchVideoCaptureParams.configuration) && Intrinsics.areEqual(this.documentType, launchVideoCaptureParams.documentType);
    }

    @Nullable
    public final Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final String getDocumentType() {
        return this.documentType;
    }

    public int hashCode() {
        Map<String, String> map = this.configuration;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.documentType;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setConfiguration(@Nullable Map<String, String> map) {
        this.configuration = map;
    }

    @NotNull
    public String toString() {
        return "LaunchVideoCaptureParams(configuration=" + this.configuration + ", documentType=" + this.documentType + ")";
    }
}
