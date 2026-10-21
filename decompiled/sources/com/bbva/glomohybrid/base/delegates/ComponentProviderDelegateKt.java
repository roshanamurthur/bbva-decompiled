package com.bbva.glomohybrid.base.delegates;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComponentProviderDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"components", "Lcom/bbva/glomohybrid/base/delegates/ComponentProviderDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "componentId", "", "pageId", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComponentProviderDelegateKt {
    @NotNull
    public static final <T> ComponentProviderDelegate<T> components(@NotNull Activity activity, @NotNull String componentId, int i10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        return new ComponentProviderDelegate<>(componentId, i10);
    }

    public static /* synthetic */ ComponentProviderDelegate components$default(Activity activity, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        return components(activity, str, i10);
    }
}
