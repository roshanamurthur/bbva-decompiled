package com.bbva.ethermobile.help.kit.extension;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bbva.ethermobile.help.kit.internal.SystemBuild;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"isDebugEnable", "", "Landroid/content/Context;", "isIsolatedProcess", "help-kit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/ethermobile/help/kit/extension/ContextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class ContextKt {
    public static final boolean isDebugEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    @SuppressLint({"NewApi"})
    public static final boolean isIsolatedProcess(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (SystemBuild.INSTANCE.isGreaterThanP$help_kit_release()) {
            return Process.isIsolated();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService).getRunningAppProcesses();
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.FALSE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }
}
