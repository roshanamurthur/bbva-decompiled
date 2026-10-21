package mx.openpay.library.ui.modal.plans;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.R;
import mx.openpay.library.databinding.ItemPayWithPlansBinding;
import mx.openpay.library.ui.modal.plans.PayWithPlansAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"Lmx/openpay/library/ui/modal/plans/PayWithPlansAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmx/openpay/library/ui/modal/plans/PayWithPlansAdapter$PayWithPlansViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lmx/openpay/library/ui/modal/plans/PlanModel;", "planList", "Lmx/openpay/library/ui/modal/plans/OnPlanSelected;", "onPlanSelectedCallback", "<init>", "(Ljava/util/List;Lmx/openpay/library/ui/modal/plans/OnPlanSelected;)V", "PayWithPlansViewHolder", "library_release"}, k = 1, mv = {1, 8, 0})
public final class PayWithPlansAdapter extends RecyclerView.Adapter<PayWithPlansViewHolder> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f84337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnPlanSelected f84338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84339c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lmx/openpay/library/ui/modal/plans/PayWithPlansAdapter$PayWithPlansViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lmx/openpay/library/ui/modal/plans/PlanModel;", "plan", "", "bind", "Lmx/openpay/library/databinding/ItemPayWithPlansBinding;", "binding", "<init>", "(Lmx/openpay/library/ui/modal/plans/PayWithPlansAdapter;Lmx/openpay/library/databinding/ItemPayWithPlansBinding;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public final class PayWithPlansViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ItemPayWithPlansBinding f84340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PayWithPlansAdapter f84341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithPlansViewHolder(@NotNull PayWithPlansAdapter payWithPlansAdapter, ItemPayWithPlansBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f84341b = payWithPlansAdapter;
            this.f84340a = binding;
        }

        public static final void a(PayWithPlansAdapter this$0, PayWithPlansViewHolder this$1, PlanModel plan, CompoundButton compoundButton, boolean z10) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(plan, "$plan");
            if (z10) {
                int i10 = this$0.f84339c;
                this$0.f84339c = this$1.getAdapterPosition();
                this$0.f84338b.onPlanSelected(plan);
                this$0.notifyItemChanged(i10);
                this$0.notifyItemChanged(this$0.f84339c);
            }
        }

        public final void bind(@NotNull final PlanModel plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            ItemPayWithPlansBinding itemPayWithPlansBinding = this.f84340a;
            final PayWithPlansAdapter payWithPlansAdapter = this.f84341b;
            itemPayWithPlansBinding.radioButtonPlans.setText(this.itemView.getContext().getString(R.string.plans_pay_plans_modal, Integer.valueOf(plan.getMonthlyFrequency())));
            itemPayWithPlansBinding.radioButtonPlans.setChecked(getAdapterPosition() == payWithPlansAdapter.f84339c);
            itemPayWithPlansBinding.divider.setVisibility(getAdapterPosition() == payWithPlansAdapter.f84337a.size() - 1 ? 8 : 0);
            itemPayWithPlansBinding.radioButtonPlans.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ul.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    PayWithPlansAdapter.PayWithPlansViewHolder.a(payWithPlansAdapter, this, plan, compoundButton, z10);
                }
            });
        }
    }

    public PayWithPlansAdapter(@NotNull List<PlanModel> planList, @NotNull OnPlanSelected onPlanSelectedCallback) {
        Intrinsics.checkNotNullParameter(planList, "planList");
        Intrinsics.checkNotNullParameter(onPlanSelectedCallback, "onPlanSelectedCallback");
        this.f84337a = planList;
        this.f84338b = onPlanSelectedCallback;
        this.f84339c = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84337a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PayWithPlansViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((PlanModel) this.f84337a.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PayWithPlansViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemPayWithPlansBinding itemPayWithPlansBindingInflate = ItemPayWithPlansBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemPayWithPlansBindingInflate, "inflate(inflater, parent, false)");
        return new PayWithPlansViewHolder(this, itemPayWithPlansBindingInflate);
    }
}
