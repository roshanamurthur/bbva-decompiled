package com.bbva.glomohybrid.process;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProcessScreenTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/process/ProcessScreenTracker;", "Lcom/bbva/glomoutils/lifecycle/ActivityLifecycleCallbacksAdapter;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "Landroid/app/Application;", "app", "", "", ProcessScreenTracker.LAUNCHER_SCREEN_LIST, "<init>", "(Landroid/app/Application;Ljava/util/List;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProcessScreenTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessScreenTracker.kt\ncom/bbva/glomohybrid/process/ProcessScreenTracker\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,30:1\n33#2,3:31\n*S KotlinDebug\n*F\n+ 1 ProcessScreenTracker.kt\ncom/bbva/glomohybrid/process/ProcessScreenTracker\n*L\n15#1:31,3\n*E\n"})
public final class ProcessScreenTracker extends ActivityLifecycleCallbacksAdapter {

    @NotNull
    public static final String LAUNCHER_SCREEN_LIST = "launcherScreenList";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Application f33815p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final List<String> f33816q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ProcessScreenTracker$special$$inlined$observable$1 f33817r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f33814s0 = {c.e(ProcessScreenTracker.class, "currentScreen", "getCurrentScreen()Ljava/lang/String;", 0)};

    /* JADX WARN: Type inference failed for: r2v2, types: [com.bbva.glomohybrid.process.ProcessScreenTracker$special$$inlined$observable$1] */
    public ProcessScreenTracker(@NotNull Application app, @NotNull List<String> launcherScreenList) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(launcherScreenList, "launcherScreenList");
        this.f33815p0 = app;
        this.f33816q0 = launcherScreenList;
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.f33817r0 = new ObservableProperty<String>(obj) { // from class: com.bbva.glomohybrid.process.ProcessScreenTracker$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, String oldValue, String newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                String str = newValue;
                if (oldValue == null) {
                    ProcessScreenTracker processScreenTracker = this;
                    if (CollectionsKt___CollectionsKt.contains(processScreenTracker.f33816q0, str)) {
                        return;
                    }
                    ContextExtensionKt.restartApplication(processScreenTracker.f33815p0);
                }
            }
        };
    }

    @Override // com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityCreated(activity, savedInstanceState);
        String simpleName = activity.getClass().getSimpleName();
        setValue(this, f33814s0[0], simpleName);
    }
}
