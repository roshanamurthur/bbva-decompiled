package com.bbva.glomoutils.mobileservices.craslytics;

import android.content.Context;
import android.os.Bundle;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.usecase.CrashlyticsExtensionsKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CrashReporter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/glomoutils/mobileservices/craslytics/CrashReporter;", "", "Landroid/os/Bundle;", "bundle", "", "reportIfPendingCrashIsAvailable", "Landroid/content/Context;", "context", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "<init>", "(Landroid/content/Context;Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;)V", "Companion", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
public final class CrashReporter {

    @NotNull
    public static final String PENDING_CRASH = "pending_crash_to_be_send";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f34861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Crashlytics f34862b;

    public CrashReporter(@NotNull Context context, @NotNull Crashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f34861a = context;
        this.f34862b = crashlytics;
    }

    public final void reportIfPendingCrashIsAvailable(@Nullable Bundle bundle) {
        Serializable serializable = bundle != null ? bundle.getSerializable(PENDING_CRASH) : null;
        Throwable th2 = serializable instanceof Throwable ? (Throwable) serializable : null;
        if (th2 == null) {
            return;
        }
        Context context = this.f34861a;
        Crashlytics crashlytics = this.f34862b;
        CrashlyticsExtensionsKt.setUncaughtCrashCustomKeys(crashlytics, context);
        crashlytics.recordException(th2);
    }
}
