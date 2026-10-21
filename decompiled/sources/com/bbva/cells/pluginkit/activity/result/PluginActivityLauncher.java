package com.bbva.cells.pluginkit.activity.result;

import android.app.Activity;
import android.content.Intent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.pluginkit.activity.result.ActivityResultRequest;
import com.bbva.pluginkit.activity.result.ResultHandlerActivity;
import ek.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ4\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/PluginActivityLauncher;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lkotlin/Function1;", "Lcom/bbva/pluginkit/activity/result/ActivityResultRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "request", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", "launch", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PluginActivityLauncher implements ActivityLauncher {
    @Override // com.bbva.cells.pluginkit.activity.result.ActivityLauncher
    @Nullable
    public Object launch(@NotNull Activity activity, @NotNull Function1<? super ActivityResultRequest.Builder, Unit> function1, @NotNull Continuation<? super ActivityResult> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        ActivityResultManager.INSTANCE.setListener(new Function1<ActivityResult, Unit>() { // from class: com.bbva.cells.pluginkit.activity.result.PluginActivityLauncher$launch$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
                invoke2(activityResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                safeContinuation.resumeWith(Result.m5535constructorimpl(result));
            }
        });
        ActivityResultRequest.Companion companion = ActivityResultRequest.INSTANCE;
        ActivityResultRequest.Builder builder = new ActivityResultRequest.Builder();
        function1.invoke(builder);
        ActivityResultRequest activityResultRequestBuild = builder.build();
        Intent intent = new Intent(activity, (Class<?>) ResultHandlerActivity.class);
        if (activityResultRequestBuild.getAction() != null) {
            intent.putExtra("action", activityResultRequestBuild.getAction());
            intent.putExtra("uri", activityResultRequestBuild.getUri());
        }
        intent.putExtra("type", activityResultRequestBuild.getType());
        intent.putExtra("extras", activityResultRequestBuild.getExtras());
        activity.startActivity(intent);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
