package com.bbva.glomo.resource;

import android.content.Context;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/resource/ResourceProvider;", "", "", "resource", "", "getString", "value", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "gl-resource_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ResourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f30684a;

    public ResourceProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30684a = context;
    }

    @NotNull
    public final String getString(@StringRes int resource) {
        String string = this.f30684a.getString(resource);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final String getString(@StringRes int resource, @Nullable String value) {
        if (value == null) {
            return getString(resource);
        }
        String string = this.f30684a.getString(resource, value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
