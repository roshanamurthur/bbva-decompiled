package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", HideCommand.ID, "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "d", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidTextToolbar implements TextToolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f17115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ActionMode f17116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextActionModeCallback f17117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextToolbarStatus status;

    /* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidTextToolbar.this.f17116b = null;
            return Unit.INSTANCE;
        }
    }

    public AndroidTextToolbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17115a = view;
        this.f17117c = new TextActionModeCallback(new a(), null, null, null, null, null, 62, null);
        this.status = TextToolbarStatus.Hidden;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f17116b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f17116b = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        TextActionModeCallback textActionModeCallback = this.f17117c;
        textActionModeCallback.setRect(rect);
        textActionModeCallback.setOnCopyRequested(onCopyRequested);
        textActionModeCallback.setOnCutRequested(onCutRequested);
        textActionModeCallback.setOnPasteRequested(onPasteRequested);
        textActionModeCallback.setOnSelectAllRequested(onSelectAllRequested);
        ActionMode actionMode = this.f17116b;
        if (actionMode != null) {
            if (actionMode != null) {
                actionMode.invalidate();
            }
        } else {
            this.status = TextToolbarStatus.Shown;
            this.f17116b = TextToolbarHelperMethods.INSTANCE.startActionMode(this.f17115a, new FloatingTextActionModeCallback(textActionModeCallback), 1);
        }
    }
}
