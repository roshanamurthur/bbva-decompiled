package com.bbva.cells.pluginkit.activity;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityWeakReference.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/ActivityWeakReference;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "update", ClearCommand.ID, "get", "<init>", "(Landroid/app/Activity;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityWeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f26804a;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityWeakReference() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void clear() {
        this.f26804a.clear();
    }

    @Nullable
    public final Activity get() {
        return this.f26804a.get();
    }

    public final void update(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26804a.clear();
        this.f26804a = new WeakReference<>(activity);
    }

    public ActivityWeakReference(@Nullable Activity activity) {
        this.f26804a = new WeakReference<>(activity);
    }

    public /* synthetic */ ActivityWeakReference(Activity activity, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : activity);
    }
}
