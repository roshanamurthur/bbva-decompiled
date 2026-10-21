package com.bbva.glomohybrid.landing.presentation.adapter.holders;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.component.ui.message.card.MessageCardView;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.glomohybrid.landing.databinding.ViewHolderSectionMessageBinding;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingMessageCardModelExtensionsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import l9.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingMessageCardViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingMessageCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "data", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/landing/databinding/ViewHolderSectionMessageBinding;", "binding", "<init>", "(Lcom/bbva/glomohybrid/landing/databinding/ViewHolderSectionMessageBinding;Lkotlin/coroutines/CoroutineContext;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingMessageCardViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingMessageCardViewHolder.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingMessageCardViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class LandingMessageCardViewHolder extends RecyclerView.ViewHolder implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewHolderSectionMessageBinding f33038p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Job f33040r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingMessageCardViewHolder(@NotNull ViewHolderSectionMessageBinding binding, @NotNull CoroutineContext coroutineContext) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f33038p0 = binding;
        this.coroutineContext = coroutineContext;
    }

    public final void bind(@NotNull LandingMessageCardModel data, @NotNull Function1<? super LandingContract.Intent, Unit> listener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewHolderSectionMessageBinding viewHolderSectionMessageBinding = this.f33038p0;
        viewHolderSectionMessageBinding.container.removeAllViews();
        Context context = viewHolderSectionMessageBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MessageCardState messageCardState = LandingMessageCardModelExtensionsKt.toMessageCardState(data, context);
        Context context2 = viewHolderSectionMessageBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MessageCardView messageCardView = new MessageCardView(context2, null, true, false, false, 18, null);
        messageCardView.getViewModel().updateModel(messageCardState);
        viewHolderSectionMessageBinding.container.addView(messageCardView);
        FrameLayout root = viewHolderSectionMessageBinding.getRoot();
        String primaryText = messageCardState.getPrimaryText();
        if (primaryText == null) {
            primaryText = "";
        }
        root.setContentDescription(primaryText);
        viewHolderSectionMessageBinding.getRoot().setImportantForAccessibility(2);
        Job job = this.f33040r0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f33040r0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(messageCardView, listener, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
