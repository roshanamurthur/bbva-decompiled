package com.mastercard.sonic.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.mastercard.sonic.utils.FileDirUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CueConfig.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/model/CueConfig;", "", "Lorg/json/JSONObject;", "getJSONObject", "", "component1", "component2", "version", "filePath", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "b", "getFilePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CueConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FileDirUtils.SONIC_SDK_ASSETS_PATH)
    @NotNull
    private final String filePath;

    public CueConfig(@NotNull String version, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.version = version;
        this.filePath = filePath;
    }

    public static /* synthetic */ CueConfig copy$default(CueConfig cueConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cueConfig.version;
        }
        if ((i10 & 2) != 0) {
            str2 = cueConfig.filePath;
        }
        return cueConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final CueConfig copy(@NotNull String version, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new CueConfig(version, filePath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CueConfig)) {
            return false;
        }
        CueConfig cueConfig = (CueConfig) other;
        return Intrinsics.areEqual(this.version, cueConfig.version) && Intrinsics.areEqual(this.filePath, cueConfig.filePath);
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final JSONObject getJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.version);
        jSONObject.put(FileDirUtils.SONIC_SDK_ASSETS_PATH, this.filePath);
        return jSONObject;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.filePath.hashCode() + (this.version.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("CueConfig(version=", this.version, ", filePath=", this.filePath, ")");
    }
}
