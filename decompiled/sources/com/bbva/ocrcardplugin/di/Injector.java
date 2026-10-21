package com.bbva.ocrcardplugin.di;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/ocrcardplugin/di/Injector;", "", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "a", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "getActivityLauncher", "()Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "setActivityLauncher", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "activityLauncher", "<init>", "()V", "ocrcard-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static ActivityCreatorRequest activityLauncher = new ActivityLauncher();

    @NotNull
    public final ActivityCreatorRequest getActivityLauncher() {
        return activityLauncher;
    }

    public final void setActivityLauncher(@NotNull ActivityCreatorRequest activityCreatorRequest) {
        Intrinsics.checkNotNullParameter(activityCreatorRequest, "<set-?>");
        activityLauncher = activityCreatorRequest;
    }
}
