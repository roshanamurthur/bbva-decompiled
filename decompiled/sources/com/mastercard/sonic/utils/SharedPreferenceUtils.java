package com.mastercard.sonic.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.notifications.constants.PushConstants;
import com.mastercard.sonic.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferenceUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0004¨\u0006\u001d"}, d2 = {"Lcom/mastercard/sonic/utils/SharedPreferenceUtils;", "", "", "setVersionCheckDate", "", "updatedAnimationVersion", "cue", "setLocalAnimationVersion", "", "getPreviousVersionCheckDate", "getExistingAnimationVersion", "", "getRemoteUpgradeFound", "getAssetDownloadCompleted", "isAnalyticsEnabled", "value", "setIsAnalyticsEnabled", "", "setAnalyticsFrequency", "setAnalyticsUrl", "getAnalyticsFrequency", "getAnalyticsUrl", "setDistinctId", "getDistinctId", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SharedPreferenceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f51574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f51576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f51577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f51578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f51579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f51580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SharedPreferences f51581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SharedPreferences.Editor f51582i;

    public SharedPreferenceUtils(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R.string.animation_version);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.animation_version)");
        this.f51574a = string;
        this.f51575b = "didRemoteUpgradeFound";
        this.f51576c = "didAssetDownloadCompleted";
        this.f51577d = "isAnalyticsEnabled";
        this.f51578e = "frequency";
        this.f51579f = "analyticsUrl";
        this.f51580g = "distinctId";
        SharedPreferences sharedPreferences = context.getSharedPreferences("SonicSharedPreferences", 0);
        this.f51581h = sharedPreferences;
        this.f51582i = sharedPreferences.edit();
    }

    public final char getAnalyticsFrequency() {
        String string = this.f51581h.getString(this.f51578e, "M");
        Intrinsics.checkNotNull(string);
        return string.charAt(0);
    }

    @NotNull
    public final String getAnalyticsUrl() {
        String string = this.f51581h.getString(this.f51579f, "");
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final boolean getAssetDownloadCompleted() {
        return this.f51581h.getBoolean(this.f51576c, false);
    }

    @NotNull
    public final String getDistinctId() {
        String string = this.f51581h.getString(this.f51580g, "");
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    public final String getExistingAnimationVersion(@NotNull String cue) {
        Intrinsics.checkNotNullParameter(cue, "cue");
        String string = this.f51581h.getString(this.f51574a + PushConstants.GE_PARAMS_SEPARATOR + cue, "");
        return (string == null || l.isBlank(string)) ? "0" : string;
    }

    public final long getPreviousVersionCheckDate() {
        return this.f51581h.getLong("previousVersionCheckDate", 0L);
    }

    public final boolean getRemoteUpgradeFound() {
        return this.f51581h.getBoolean(this.f51575b, false);
    }

    public final boolean isAnalyticsEnabled() {
        return this.f51581h.getBoolean(this.f51577d, true);
    }

    public final void setAnalyticsFrequency(char value) {
        String str = this.f51578e;
        String strValueOf = String.valueOf(value);
        SharedPreferences.Editor editor = this.f51582i;
        editor.putString(str, strValueOf);
        editor.apply();
    }

    public final void setAnalyticsUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.f51579f;
        SharedPreferences.Editor editor = this.f51582i;
        editor.putString(str, value);
        editor.apply();
    }

    public final void setDistinctId() {
        String string = UUID.randomUUID().toString();
        SharedPreferences.Editor editor = this.f51582i;
        editor.putString(this.f51580g, string);
        editor.apply();
    }

    public final void setIsAnalyticsEnabled(boolean value) {
        String str = this.f51577d;
        SharedPreferences.Editor editor = this.f51582i;
        editor.putBoolean(str, value);
        editor.apply();
    }

    public final void setLocalAnimationVersion(@NotNull String updatedAnimationVersion, @Nullable String cue) {
        Intrinsics.checkNotNullParameter(updatedAnimationVersion, "updatedAnimationVersion");
        String str = this.f51574a + PushConstants.GE_PARAMS_SEPARATOR + cue;
        SharedPreferences.Editor editor = this.f51582i;
        editor.putString(str, updatedAnimationVersion);
        editor.apply();
    }

    public final void setVersionCheckDate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f51582i;
        editor.putLong("previousVersionCheckDate", jCurrentTimeMillis);
        editor.apply();
    }
}
