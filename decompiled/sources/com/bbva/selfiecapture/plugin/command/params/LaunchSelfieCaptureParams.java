package com.bbva.selfiecapture.plugin.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchSelfieCaptureParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/LaunchSelfieCaptureParams;", "", "configuration", "", "", "<init>", "(Ljava/util/Map;)V", "getConfiguration", "()Ljava/util/Map;", "setConfiguration", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LaunchSelfieCaptureParams {

    @Nullable
    private Map<String, String> configuration;

    public LaunchSelfieCaptureParams(@Nullable Map<String, String> map) {
        this.configuration = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LaunchSelfieCaptureParams copy$default(LaunchSelfieCaptureParams launchSelfieCaptureParams, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = launchSelfieCaptureParams.configuration;
        }
        return launchSelfieCaptureParams.copy(map);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.configuration;
    }

    @NotNull
    public final LaunchSelfieCaptureParams copy(@Nullable Map<String, String> configuration) {
        return new LaunchSelfieCaptureParams(configuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LaunchSelfieCaptureParams) && Intrinsics.areEqual(this.configuration, ((LaunchSelfieCaptureParams) other).configuration);
    }

    @Nullable
    public final Map<String, String> getConfiguration() {
        return this.configuration;
    }

    public int hashCode() {
        Map<String, String> map = this.configuration;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setConfiguration(@Nullable Map<String, String> map) {
        this.configuration = map;
    }

    @NotNull
    public String toString() {
        return "LaunchSelfieCaptureParams(configuration=" + this.configuration + ")";
    }
}
