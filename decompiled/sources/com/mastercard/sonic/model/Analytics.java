package com.mastercard.sonic.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Analytics.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/mastercard/sonic/model/Analytics;", "", "", "component1", "", "component2", "component3", EnableHandler.ID, "frequency", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getEnable", "()Z", "b", "Ljava/lang/String;", "getFrequency", "()Ljava/lang/String;", "c", "getUrl", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Analytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(EnableHandler.ID)
    private final boolean enable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("frequency")
    @NotNull
    private final String frequency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    @NotNull
    private final String url;

    public Analytics(boolean z10, @NotNull String frequency, @NotNull String url) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(url, "url");
        this.enable = z10;
        this.frequency = frequency;
        this.url = url;
    }

    public static /* synthetic */ Analytics copy$default(Analytics analytics, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = analytics.enable;
        }
        if ((i10 & 2) != 0) {
            str = analytics.frequency;
        }
        if ((i10 & 4) != 0) {
            str2 = analytics.url;
        }
        return analytics.copy(z10, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Analytics copy(boolean enable, @NotNull String frequency, @NotNull String url) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Analytics(enable, frequency, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Analytics)) {
            return false;
        }
        Analytics analytics = (Analytics) other;
        return this.enable == analytics.enable && Intrinsics.areEqual(this.frequency, analytics.frequency) && Intrinsics.areEqual(this.url, analytics.url);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.enable;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.url.hashCode() + n1.c(this.frequency, r1 * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.enable;
        String str = this.frequency;
        String str2 = this.url;
        StringBuilder sb2 = new StringBuilder("Analytics(enable=");
        sb2.append(z10);
        sb2.append(", frequency=");
        sb2.append(str);
        sb2.append(", url=");
        return d.f(sb2, str2, ")");
    }
}
