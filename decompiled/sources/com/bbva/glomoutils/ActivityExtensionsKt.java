package com.bbva.glomoutils;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"stringFromExtrasBy", "", "Landroid/app/Activity;", "key", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActivityExtensionsKt {
    @Nullable
    public static final String stringFromExtrasBy(@NotNull Activity activity, @NotNull String key) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            return extras.getString(key);
        }
        return null;
    }
}
