package mx.openpay.library.ui.modal.plans;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import mx.openpay.library.R;
import mx.openpay.library.databinding.FragmentPayWithPlansModalBinding;
import mx.openpay.library.ui.FullScreenDialogFragment;
import mx.openpay.library.ui.util.UIExtensionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.d;
import w8.a;
import w8.b;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/ui/modal/plans/PayWithPlansModal;", "Lmx/openpay/library/ui/FullScreenDialogFragment;", "Lmx/openpay/library/ui/modal/plans/OnPlanSelected;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onResume", "Lmx/openpay/library/ui/modal/plans/PlanModel;", "plan", "onPlanSelected", "onDestroyView", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPlans", "()I", "setPlans", "(I)V", "plans", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayWithPlansModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayWithPlansModal.kt\nmx/openpay/library/ui/modal/plans/PayWithPlansModal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1549#2:118\n1620#2,3:119\n*S KotlinDebug\n*F\n+ 1 PayWithPlansModal.kt\nmx/openpay/library/ui/modal/plans/PayWithPlansModal\n*L\n74#1:118\n74#1:119,3\n*E\n"})
public final class PayWithPlansModal extends FullScreenDialogFragment implements OnPlanSelected {

    @NotNull
    public static final String PAY_PLANS_MODAL_TAG = "PAY_PLANS_MODAL_TAG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f84342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentPayWithPlansModalBinding f84343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int plans;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f84345d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/ui/modal/plans/PayWithPlansModal$Companion;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectorOptions", "Lkotlin/Function1;", "", "selectorListener", "Landroidx/fragment/app/DialogFragment;", "newInstance", "", PayWithPlansModal.PAY_PLANS_MODAL_TAG, "Ljava/lang/String;", "PLAN_OPTIONS", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialogFragment newInstance(@NotNull ArrayList<Integer> selectorOptions, @NotNull Function1<? super Integer, Unit> selectorListener) {
            Intrinsics.checkNotNullParameter(selectorOptions, "selectorOptions");
            Intrinsics.checkNotNullParameter(selectorListener, "selectorListener");
            Bundle bundle = new Bundle();
            bundle.putSerializable("PLAN_OPTIONS", selectorOptions);
            PayWithPlansModal payWithPlansModal = new PayWithPlansModal(selectorListener);
            payWithPlansModal.setArguments(bundle);
            return payWithPlansModal;
        }
    }

    public PayWithPlansModal(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84342a = listener;
        this.f84345d = CollectionsKt__CollectionsKt.emptyList();
    }

    public static final void a(PayWithPlansModal this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84342a.invoke(Integer.valueOf(this$0.plans));
        this$0.dismiss();
    }

    public static final void b(PayWithPlansModal this$0, View view) {
        Window window;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        boolean zIsDarkMode = UIExtensionKt.isDarkMode(contextRequireContext);
        Dialog dialog = this$0.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            Context contextRequireContext2 = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
            UIExtensionKt.changeStatusBarColor(window, contextRequireContext2, R.color.background_screen);
            UIExtensionKt.setSystemBarAppearance(window, zIsDarkMode);
        }
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding = this$0.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding);
        fragmentPayWithPlansModalBinding.clContent.setVisibility(0);
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding2 = this$0.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding2);
        fragmentPayWithPlansModalBinding2.flContainerMessage.setVisibility(8);
        List list = this$0.f84345d;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PlanModel(((Number) it.next()).intValue(), c.random(new IntRange(10, 50), Random.INSTANCE)));
        }
        PayWithPlansAdapter payWithPlansAdapter = new PayWithPlansAdapter(arrayList, this$0);
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding3 = this$0.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding3);
        fragmentPayWithPlansModalBinding3.rvContentPlans.setAdapter(payWithPlansAdapter);
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding4 = this$0.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding4);
        fragmentPayWithPlansModalBinding4.rvContentPlans.setLayoutManager(new LinearLayoutManager(this$0.getContext(), 1, false));
    }

    public static final void c(PayWithPlansModal this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84342a.invoke(Integer.valueOf(this$0.plans));
        this$0.dismiss();
    }

    public static final void d(PayWithPlansModal this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84342a.invoke(Integer.valueOf(this$0.plans));
        this$0.dismiss();
    }

    public final int getPlans() {
        return this.plans;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f84343b = FragmentPayWithPlansModalBinding.inflate(getLayoutInflater());
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("PLAN_OPTIONS") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
        this.f84345d = (List) serializable;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            UIExtensionKt.changeStatusBarColor(window, contextRequireContext, R.color.background_screen_overlap);
        }
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding);
        fragmentPayWithPlansModalBinding.btnContinue.setOnClickListener(new d(this, 4));
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding2 = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding2);
        fragmentPayWithPlansModalBinding2.yesButton.setOnClickListener(new a(this, 4));
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding3 = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding3);
        fragmentPayWithPlansModalBinding3.noButton.setOnClickListener(new b(this, 3));
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding4 = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding4);
        fragmentPayWithPlansModalBinding4.closeButton.setOnClickListener(new s5.a(this, 5));
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding5 = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding5);
        ConstraintLayout root = fragmentPayWithPlansModalBinding5.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f84343b = null;
    }

    @Override // mx.openpay.library.ui.modal.plans.OnPlanSelected
    public void onPlanSelected(@NotNull PlanModel plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        FragmentPayWithPlansModalBinding fragmentPayWithPlansModalBinding = this.f84343b;
        Intrinsics.checkNotNull(fragmentPayWithPlansModalBinding);
        fragmentPayWithPlansModalBinding.btnContinue.setEnabled(true);
        this.plans = plan.getMonthlyFrequency();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        UIExtensionKt.hideNavigationBar(window);
    }

    public final void setPlans(int i10) {
        this.plans = i10;
    }
}
