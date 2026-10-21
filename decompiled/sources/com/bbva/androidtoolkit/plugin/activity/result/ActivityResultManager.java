package com.bbva.androidtoolkit.plugin.activity.result;

import android.content.Intent;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultManager;", "", "", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResultSuccess", "Lcom/bbva/androidtoolkit/plugin/response/Errors;", "error", "onActivityResultCancelled", "Lkotlin/Function1;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultCallback;", "a", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultManager.kt\ncom/bbva/androidtoolkit/plugin/activity/result/ActivityResultManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class ActivityResultManager {

    @NotNull
    public static final ActivityResultManager INSTANCE = new ActivityResultManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Function1<? super ActivityResult, Unit> listener;

    public static /* synthetic */ void onActivityResultCancelled$default(ActivityResultManager activityResultManager, Errors errors, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errors = Errors.ErrorCanceled;
        }
        activityResultManager.onActivityResultCancelled(errors);
    }

    @Nullable
    public final Function1<ActivityResult, Unit> getListener() {
        return listener;
    }

    public final void onActivityResultCancelled(@NotNull Errors error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<? super ActivityResult, Unit> function1 = listener;
        if (function1 != null) {
            listener = null;
            if (function1 != null) {
                function1.invoke(new ActivityResult.Cancel(error));
            }
        }
    }

    public final void onActivityResultSuccess(int resultCode, @NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Function1<? super ActivityResult, Unit> function1 = listener;
        if (function1 != null) {
            listener = null;
            if (function1 != null) {
                function1.invoke(new ActivityResult.Success(resultCode, data));
            }
        }
    }

    public final void setListener(@Nullable Function1<? super ActivityResult, Unit> function1) {
        listener = function1;
    }
}
