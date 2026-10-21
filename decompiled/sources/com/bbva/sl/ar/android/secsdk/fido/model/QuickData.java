package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QuickData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/model/QuickData;", "", "aaid", "", "appId", "keyId", IAppSDKPlus.EXTRA_KEY_QUICK_DATA, "Lcom/bbva/sl/ar/android/secsdk/fido/model/QuickAuthData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/QuickAuthData;)V", "getAaid", "()Ljava/lang/String;", "getAppId", "getKeyId", "getQuickAuthData", "()Lcom/bbva/sl/ar/android/secsdk/fido/model/QuickAuthData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickData {

    @NotNull
    private final String aaid;

    @SerializedName("appID")
    @NotNull
    private final String appId;

    @SerializedName("keyID")
    @NotNull
    private final String keyId;

    @NotNull
    private final QuickAuthData quickAuthData;

    public QuickData(@NotNull String aaid, @NotNull String appId, @NotNull String keyId, @NotNull QuickAuthData quickAuthData) {
        Intrinsics.checkNotNullParameter(aaid, "aaid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(quickAuthData, "quickAuthData");
        this.aaid = aaid;
        this.appId = appId;
        this.keyId = keyId;
        this.quickAuthData = quickAuthData;
    }

    public static /* synthetic */ QuickData copy$default(QuickData quickData, String str, String str2, String str3, QuickAuthData quickAuthData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = quickData.aaid;
        }
        if ((i10 & 2) != 0) {
            str2 = quickData.appId;
        }
        if ((i10 & 4) != 0) {
            str3 = quickData.keyId;
        }
        if ((i10 & 8) != 0) {
            quickAuthData = quickData.quickAuthData;
        }
        return quickData.copy(str, str2, str3, quickAuthData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAaid() {
        return this.aaid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeyId() {
        return this.keyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final QuickAuthData getQuickAuthData() {
        return this.quickAuthData;
    }

    @NotNull
    public final QuickData copy(@NotNull String aaid, @NotNull String appId, @NotNull String keyId, @NotNull QuickAuthData quickAuthData) {
        Intrinsics.checkNotNullParameter(aaid, "aaid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(quickAuthData, "quickAuthData");
        return new QuickData(aaid, appId, keyId, quickAuthData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickData)) {
            return false;
        }
        QuickData quickData = (QuickData) other;
        return Intrinsics.areEqual(this.aaid, quickData.aaid) && Intrinsics.areEqual(this.appId, quickData.appId) && Intrinsics.areEqual(this.keyId, quickData.keyId) && Intrinsics.areEqual(this.quickAuthData, quickData.quickAuthData);
    }

    @NotNull
    public final String getAaid() {
        return this.aaid;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getKeyId() {
        return this.keyId;
    }

    @NotNull
    public final QuickAuthData getQuickAuthData() {
        return this.quickAuthData;
    }

    public int hashCode() {
        return this.quickAuthData.hashCode() + n1.c(this.keyId, n1.c(this.appId, this.aaid.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.aaid;
        String str2 = this.appId;
        String str3 = this.keyId;
        QuickAuthData quickAuthData = this.quickAuthData;
        StringBuilder sbC = a.c("QuickData(aaid=", str, ", appId=", str2, ", keyId=");
        sbC.append(str3);
        sbC.append(", quickAuthData=");
        sbC.append(quickAuthData);
        sbC.append(")");
        return sbC.toString();
    }
}
