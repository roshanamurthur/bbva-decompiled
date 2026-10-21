package com.bbva.cells.pluginkit.permission;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import ek.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/PluginPermissionLauncher;", "Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;", "()V", "request", "Lcom/bbva/cells/pluginkit/permission/PermissionReport;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "permissions", "", "", "(Landroid/app/Activity;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PluginPermissionLauncher implements PermissionLauncher {
    @Override // com.bbva.cells.pluginkit.permission.PermissionLauncher
    @Nullable
    public Object request(@NotNull Activity activity, @NotNull String[] strArr, @NotNull Continuation<? super PermissionReport> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        PermissionManager.INSTANCE.request(activity, ArraysKt___ArraysKt.toList(strArr), new Function1<PermissionReport, Unit>() { // from class: com.bbva.cells.pluginkit.permission.PluginPermissionLauncher$request$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionReport permissionReport) {
                invoke2(permissionReport);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull PermissionReport report) {
                Intrinsics.checkNotNullParameter(report, "report");
                safeContinuation.resumeWith(Result.m5535constructorimpl(report));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
