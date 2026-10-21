package com.bbva.component.ui.toolbar;

import android.view.MenuItem;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ToolbarExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"hasActionLayout", "", "Landroid/view/MenuItem;", "cmp-ui-toolbar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ToolbarExtensionsKt {
    public static final boolean hasActionLayout(@Nullable MenuItem menuItem) {
        return (menuItem != null ? menuItem.getActionView() : null) != null;
    }
}
