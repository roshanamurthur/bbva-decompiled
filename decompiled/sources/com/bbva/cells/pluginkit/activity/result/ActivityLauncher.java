package com.bbva.cells.pluginkit.activity.result;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.pluginkit.activity.result.ActivityResultRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/ActivityLauncher;", "", "launch", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "request", "Lkotlin/Function1;", "Lcom/bbva/pluginkit/activity/result/ActivityResultRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface ActivityLauncher {
    @Nullable
    Object launch(@NotNull Activity activity, @NotNull Function1<? super ActivityResultRequest.Builder, Unit> function1, @NotNull Continuation<? super ActivityResult> continuation);
}
