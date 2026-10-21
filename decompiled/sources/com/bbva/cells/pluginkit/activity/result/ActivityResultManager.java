package com.bbva.cells.pluginkit.activity.result;

import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R6\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\u0004\u0018\u0001`\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/ActivityResultManager;", "", "Landroid/content/Intent;", "data", "", "onActivityResultSuccess", "onActivityResultCancelled", "Lkotlin/Function1;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResultCallback;", "a", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityResultManager {

    @NotNull
    public static final ActivityResultManager INSTANCE = new ActivityResultManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Function1<? super ActivityResult, Unit> listener;

    @Nullable
    public final Function1<ActivityResult, Unit> getListener() {
        return listener;
    }

    public final void onActivityResultCancelled() {
        Function1<? super ActivityResult, Unit> function1 = listener;
        if (function1 != null) {
            listener = null;
            if (function1 != null) {
                function1.invoke(new ActivityResult.Cancel());
            }
        }
    }

    public final void onActivityResultSuccess(@NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Function1<? super ActivityResult, Unit> function1 = listener;
        if (function1 != null) {
            listener = null;
            if (function1 != null) {
                function1.invoke(new ActivityResult.Success(data));
            }
        }
    }

    public final void setListener(@Nullable Function1<? super ActivityResult, Unit> function1) {
        listener = function1;
    }
}
