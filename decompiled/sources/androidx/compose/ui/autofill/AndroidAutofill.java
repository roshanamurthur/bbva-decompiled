package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.core.util.d;
import androidx.core.view.accessibility.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "requestAutofillForNode", "cancelAutofillForNode", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Landroidx/compose/ui/autofill/AutofillTree;", "b", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidAutofill implements Autofill {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutofillTree autofillTree;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutofillManager autofillManager;

    public AndroidAutofill(@NotNull View view, @NotNull AutofillTree autofillTree) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autofillTree, "autofillTree");
        this.view = view;
        this.autofillTree = autofillTree;
        AutofillManager autofillManagerA = e.a(view.getContext().getSystemService(d.d()));
        if (autofillManagerA == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.autofillManager = autofillManagerA;
        view.setImportantForAutofill(1);
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @NotNull
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @NotNull
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(c.roundToInt(boundingBox.getLeft()), c.roundToInt(boundingBox.getTop()), c.roundToInt(boundingBox.getRight()), c.roundToInt(boundingBox.getBottom())));
    }
}
