package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingTextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0012\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onActionItemClicked", "Landroid/view/Menu;", "menu", "onCreateActionMode", "onPrepareActionMode", "", "onDestroyActionMode", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "<init>", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextActionModeCallback f17377a;

    public FloatingTextActionModeCallback(@NotNull TextActionModeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f17377a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        return this.f17377a.onActionItemClicked(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        return this.f17377a.onCreateActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@Nullable ActionMode mode) {
        this.f17377a.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@Nullable ActionMode mode, @Nullable View view, @Nullable Rect outRect) {
        androidx.compose.ui.geometry.Rect rect = this.f17377a.getRect();
        if (outRect != null) {
            outRect.set((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        return this.f17377a.onPrepareActionMode(mode, menu);
    }
}
