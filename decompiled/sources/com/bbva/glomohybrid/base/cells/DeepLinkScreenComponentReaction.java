package com.bbva.glomohybrid.base.cells;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkScreenComponentReaction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/DeepLinkScreenComponentReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "component", "", "addPageComponent", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public class DeepLinkScreenComponentReaction extends BaseReaction {
    public final void addPageComponent(@NotNull Object component) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(component, "component");
        Uri data = this.mActivity.getIntent().getData();
        if (data == null || (lastPathSegment = data.getLastPathSegment()) == null) {
            throw new Error("Make sure the activity your are launching has an intent filter with valid path");
        }
        addComponent(lastPathSegment, component);
    }
}
