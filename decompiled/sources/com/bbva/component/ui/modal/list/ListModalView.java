package com.bbva.component.ui.modal.list;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.modal.R;
import com.bbva.component.ui.modal.databinding.ViewListModalContentBinding;
import com.bbva.component.ui.modal.list.adapter.ListModalAdapter;
import com.bbva.component.ui.modal.list.model.ListModalState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.a;
import x5.b;
import x5.c;

/* JADX INFO: compiled from: ListModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalView;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/bbva/component/ui/modal/list/ListModalViewModel;", "q0", "Lcom/bbva/component/ui/modal/list/ListModalViewModel;", "getViewModel", "()Lcom/bbva/component/ui/modal/list/ListModalViewModel;", "viewModel", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ListModalView extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ListModalView";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewListModalContentBinding f28714p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ListModalViewModel viewModel = new ListModalViewModel();

    /* JADX INFO: compiled from: ListModalView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalView$Companion;", "", "()V", "TAG", "", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void access$updateView(ListModalView listModalView, ListModalState listModalState) {
        ViewListModalContentBinding viewListModalContentBinding = listModalView.f28714p0;
        if (viewListModalContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewListModalContentBinding = null;
        }
        ListModalAdapter listModalAdapter = new ListModalAdapter();
        listModalAdapter.update(listModalState.getValues(), new c(listModalView));
        viewListModalContentBinding.recyclerList.setAdapter(listModalAdapter);
        viewListModalContentBinding.recyclerList.setItemAnimator(null);
    }

    @NotNull
    public final ListModalViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.ComponentListModal);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewListModalContentBinding viewListModalContentBindingInflate = ViewListModalContentBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewListModalContentBindingInflate, "inflate(...)");
        this.f28714p0 = viewListModalContentBindingInflate;
        if (viewListModalContentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewListModalContentBindingInflate = null;
        }
        FrameLayout root = viewListModalContentBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        ViewListModalContentBinding viewListModalContentBinding = this.f28714p0;
        if (viewListModalContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewListModalContentBinding = null;
        }
        viewListModalContentBinding.listDialogContainer.setOnClickListener(new a(this, 0));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(this, null), 3, null);
    }
}
