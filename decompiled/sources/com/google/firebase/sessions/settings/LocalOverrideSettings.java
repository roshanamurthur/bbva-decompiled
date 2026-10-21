package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalOverrideSettings.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001f\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class LocalOverrideSettings implements SettingsProvider {

    @Deprecated
    @NotNull
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";

    @Deprecated
    @NotNull
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";

    @Deprecated
    @NotNull
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f48915a;

    public LocalOverrideSettings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f48915a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        Bundle bundle = this.f48915a;
        if (bundle.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(bundle.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        Bundle bundle = this.f48915a;
        if (bundle.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(bundle.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public Duration mo5293getSessionRestartTimeoutFghU774() {
        Bundle bundle = this.f48915a;
        if (bundle.containsKey(SESSION_RESTART_TIMEOUT)) {
            return Duration.m5809boximpl(DurationKt.toDuration(bundle.getInt(SESSION_RESTART_TIMEOUT), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) {
        return SettingsProvider.DefaultImpls.updateSettings(this, continuation);
    }
}
