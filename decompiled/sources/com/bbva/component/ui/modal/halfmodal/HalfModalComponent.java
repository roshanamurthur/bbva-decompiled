package com.bbva.component.ui.modal.halfmodal;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalType;
import com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
import com.bbva.component.ui.modal.halfmodal.views.HalfModalView;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HalfModalComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "state", "configure", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/component/ui/modal/halfmodal/views/HalfModalView;", "show", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class HalfModalComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BottomSheetDialogFragment f28689a;

    /* JADX INFO: compiled from: HalfModalComponent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent$Companion;", "", "()V", "getInstance", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HalfModalComponent getInstance() {
            return new HalfModalComponent();
        }
    }

    /* JADX INFO: compiled from: HalfModalComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HalfModalType.values().length];
            try {
                iArr[HalfModalType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HalfModalType.GENDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bbva.component.ui.modal.halfmodal.views.HalfModalView, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @NotNull
    public final HalfModalComponent configure(@NotNull HalfModalState state) {
        ?? defaultHalfModalView;
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()];
        if (i10 == 1) {
            defaultHalfModalView = new DefaultHalfModalView();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultHalfModalView = new GenderHalfModalView();
        }
        this.f28689a = defaultHalfModalView;
        HalfModalViewModel viewModel = defaultHalfModalView.getViewModel();
        if (viewModel != null) {
            viewModel.updateModel(state);
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bbva.component.ui.modal.halfmodal.views.HalfModalView, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.bbva.component.ui.modal.halfmodal.views.HalfModalView, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
    @Nullable
    public final HalfModalView show(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ?? r1 = this.f28689a;
        if (r1 != 0) {
            r1.show(activity);
        }
        return this.f28689a;
    }
}
