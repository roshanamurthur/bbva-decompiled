package com.bbva.component.ui.modal.list;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.list.model.ListModalState;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListModalComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalComponent;", "", "Lcom/bbva/component/ui/modal/list/model/ListModalState;", "state", "configure", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/component/ui/modal/list/ListModalView;", "show", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ListModalComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f28711a = ListModalView.TAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ListModalView f28712b;

    /* JADX INFO: compiled from: ListModalComponent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalComponent$Companion;", "", "()V", "getInstance", "Lcom/bbva/component/ui/modal/list/ListModalComponent;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ListModalComponent getInstance() {
            return new ListModalComponent();
        }
    }

    @NotNull
    public final ListModalComponent configure(@NotNull ListModalState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ListModalView listModalView = new ListModalView();
        this.f28712b = listModalView;
        ListModalViewModel viewModel = listModalView.getViewModel();
        if (viewModel != null) {
            viewModel.updateModel(state);
        }
        return this;
    }

    @Nullable
    public final ListModalView show(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ListModalView listModalView = this.f28712b;
        if (listModalView != null) {
            listModalView.show(activity.getSupportFragmentManager(), this.f28711a);
        }
        return this.f28712b;
    }
}
