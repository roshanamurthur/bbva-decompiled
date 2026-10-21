package com.bbva.androidtoolkit.plugin.activity.result;

import android.app.Activity;
import android.content.Intent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\t\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016J \u0010\r\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityLauncher;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ComponentResultCallback;", "Lcom/bbva/androidtoolkit/plugin/activity/result/LaunchResultCallback;", "Lkotlin/Function1;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "request", "create", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "listen", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "launch", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest;", "a", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest;", "getRequest", "()Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest;", "setRequest", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest;)V", "b", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLauncher.kt\ncom/bbva/androidtoolkit/plugin/activity/result/ActivityLauncher\n+ 2 ActivityResultRequest.kt\ncom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n21#2:59\n1855#3,2:60\n*S KotlinDebug\n*F\n+ 1 ActivityLauncher.kt\ncom/bbva/androidtoolkit/plugin/activity/result/ActivityLauncher\n*L\n29#1:59\n51#1:60,2\n*E\n"})
public final class ActivityLauncher implements ActivityCreatorRequest, ComponentResultCallback, LaunchResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ActivityResultRequest request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super ActivityResult, Unit> listener;

    @Override // com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest
    @NotNull
    public ComponentResultCallback create(@NotNull Function1<? super ActivityResultRequest.Builder, Unit> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ActivityResultRequest.Companion companion = ActivityResultRequest.INSTANCE;
        ActivityResultRequest.Builder builder = new ActivityResultRequest.Builder();
        request.invoke(builder);
        this.request = builder.build();
        return this;
    }

    @Nullable
    public final Function1<ActivityResult, Unit> getListener() {
        return this.listener;
    }

    @Nullable
    public final ActivityResultRequest getRequest() {
        return this.request;
    }

    @Override // com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback
    public void launch(@NotNull Activity activity) {
        List<String> categories;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityResultManager.INSTANCE.setListener(this.listener);
        Intent intent = new Intent(activity, (Class<?>) ResultHandlerActivity.class);
        ActivityResultRequest activityResultRequest = this.request;
        if (activityResultRequest != null) {
            if ((activityResultRequest != null ? activityResultRequest.getAction() : null) != null) {
                ActivityResultRequest activityResultRequest2 = this.request;
                intent.putExtra("action", activityResultRequest2 != null ? activityResultRequest2.getAction() : null);
                ActivityResultRequest activityResultRequest3 = this.request;
                intent.putExtra("uri", activityResultRequest3 != null ? activityResultRequest3.getUri() : null);
                ActivityResultRequest activityResultRequest4 = this.request;
                intent.putExtra("type", activityResultRequest4 != null ? activityResultRequest4.getType() : null);
            } else {
                ActivityResultRequest activityResultRequest5 = this.request;
                intent.putExtra("target", activityResultRequest5 != null ? activityResultRequest5.getTarget() : null);
            }
            ActivityResultRequest activityResultRequest6 = this.request;
            intent.putExtra("extras", activityResultRequest6 != null ? activityResultRequest6.getExtras() : null);
            ActivityResultRequest activityResultRequest7 = this.request;
            if (activityResultRequest7 != null && (categories = activityResultRequest7.getCategories()) != null) {
                Iterator<T> it = categories.iterator();
                while (it.hasNext()) {
                    intent.addCategory((String) it.next());
                }
            }
        }
        activity.startActivity(intent);
    }

    @Override // com.bbva.androidtoolkit.plugin.activity.result.ComponentResultCallback
    @NotNull
    public LaunchResultCallback listen(@NotNull Function1<? super ActivityResult, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    public final void setListener(@Nullable Function1<? super ActivityResult, Unit> function1) {
        this.listener = function1;
    }

    public final void setRequest(@Nullable ActivityResultRequest activityResultRequest) {
        this.request = activityResultRequest;
    }
}
