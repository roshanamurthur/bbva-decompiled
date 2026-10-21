package com.bbva.glomohybrid.inappupdate.extensions;

import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdateInfoExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getValidData", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InAppUpdateInfoExtensionsKt {
    @Nullable
    public static final AppUpdateInfo getValidData(@NotNull InAppUpdateInfo inAppUpdateInfo) {
        Intrinsics.checkNotNullParameter(inAppUpdateInfo, "<this>");
        Object data = inAppUpdateInfo.getData();
        if (data instanceof AppUpdateInfo) {
            return (AppUpdateInfo) data;
        }
        return null;
    }
}
