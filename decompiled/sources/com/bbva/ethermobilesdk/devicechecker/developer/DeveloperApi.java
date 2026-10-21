package com.bbva.ethermobilesdk.devicechecker.developer;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeveloperApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/developer/DeveloperApi;", "", "", "isDeveloperModeEnabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class DeveloperApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29403a;

    public DeveloperApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29403a = context;
    }

    public final boolean isDeveloperModeEnabled() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z10 = true;
            if (Settings.Secure.getInt(this.f29403a.getContentResolver(), "development_settings_enabled") != 1) {
                z10 = false;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }
}
