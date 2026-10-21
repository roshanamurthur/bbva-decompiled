package com.bbva.plugin.wearables.info.library.delegates;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Wearable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapabilitiesDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/delegates/CapabilitiesDelegate;", "Lcom/bbva/plugin/wearables/info/library/delegates/CapabilitiesInfo;", "", "id", "Lcom/google/android/gms/wearable/CapabilityInfo;", "getCapabilitiesBy", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class CapabilitiesDelegate implements CapabilitiesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36074a;

    public CapabilitiesDelegate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36074a = context;
    }

    @Override // com.bbva.plugin.wearables.info.library.delegates.CapabilitiesInfo
    @Nullable
    public CapabilityInfo getCapabilitiesBy(@NotNull String id) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((CapabilityInfo) Tasks.await(Wearable.getCapabilityClient(this.f36074a).getCapability(id, 1)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (CapabilityInfo) objM5535constructorimpl;
    }
}
