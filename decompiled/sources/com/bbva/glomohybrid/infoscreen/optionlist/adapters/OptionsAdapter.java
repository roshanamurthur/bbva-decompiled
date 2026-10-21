package com.bbva.glomohybrid.infoscreen.optionlist.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.databinding.OptionListItemBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListContract;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.OptionsViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OptionsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/OptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "options", "update", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "s0", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<set-?>", "t0", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lkotlinx/coroutines/flow/Flow;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "intents", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class OptionsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Channel<OptionListContract.Intent> f32408r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final a f32409s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<OptionData> options;

    /* JADX INFO: compiled from: OptionsAdapter.kt */
    public static final class a extends Lambda implements Function1<OptionListContract.Intent, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OptionListContract.Intent intent) {
            OptionListContract.Intent it = intent;
            Intrinsics.checkNotNullParameter(it, "it");
            OptionsAdapter optionsAdapter = OptionsAdapter.this;
            BuildersKt__Builders_commonKt.launch$default(optionsAdapter, null, null, new com.bbva.glomohybrid.infoscreen.optionlist.adapters.a(optionsAdapter, it, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public final Flow<OptionListContract.Intent> getIntents() {
        return FlowKt.consumeAsFlow(this.f32408r0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.options.size();
    }

    @NotNull
    public final Function1<OptionListContract.Intent, Unit> getListener() {
        return this.f32409s0;
    }

    @NotNull
    public final List<OptionData> getOptions() {
        return this.options;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OptionsViewHolder optionsViewHolder = holder instanceof OptionsViewHolder ? (OptionsViewHolder) holder : null;
        if (optionsViewHolder != null) {
            optionsViewHolder.bind(this.options.get(position), this.f32409s0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OptionListItemBinding optionListItemBindingInflate = OptionListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(optionListItemBindingInflate, "inflate(...)");
        return new OptionsViewHolder(optionListItemBindingInflate);
    }

    public final void update(@NotNull List<OptionData> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        notifyDataSetChanged();
    }

    public /* synthetic */ OptionsAdapter(ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }

    public OptionsAdapter(@NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32406p0 = dispatchers;
        this.coroutineContext = JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(dispatchers.main());
        this.f32408r0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f32409s0 = new a();
        this.options = CollectionsKt__CollectionsKt.emptyList();
    }
}
