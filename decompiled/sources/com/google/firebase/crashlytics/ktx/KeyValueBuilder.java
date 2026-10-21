package com.google.firebase.crashlytics.ktx;

import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyValueBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "", "key", "", "value", "", "", "", "", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", CrashlyticsHandler.ID, "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
public final class KeyValueBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FirebaseCrashlytics f48316a;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f48316a = crashlytics;
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48316a.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48316a.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48316a.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48316a.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48316a.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f48316a.setCustomKey(key, value);
    }
}
