package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrimaryTextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/PrimaryTextActionModeCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onActionItemClicked", "Landroid/view/Menu;", "menu", "onCreateActionMode", "onPrepareActionMode", "", "onDestroyActionMode", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "<init>", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextActionModeCallback f17378a;

    public PrimaryTextActionModeCallback(@NotNull TextActionModeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f17378a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        return this.f17378a.onActionItemClicked(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        return this.f17378a.onCreateActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode mode) {
        this.f17378a.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        return this.f17378a.onPrepareActionMode(mode, menu);
    }
}
