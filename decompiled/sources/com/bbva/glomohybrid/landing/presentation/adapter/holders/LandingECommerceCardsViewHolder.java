package com.bbva.glomohybrid.landing.presentation.adapter.holders;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.landing.databinding.ViewHolderSectionEcommerceCardsBinding;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingECommerceCardsModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import l9.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceCardsViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingECommerceCardsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "data", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/landing/databinding/ViewHolderSectionEcommerceCardsBinding;", "binding", "<init>", "(Lcom/bbva/glomohybrid/landing/databinding/ViewHolderSectionEcommerceCardsBinding;Lkotlin/coroutines/CoroutineContext;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingECommerceCardsViewHolder extends RecyclerView.ViewHolder implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewHolderSectionEcommerceCardsBinding f33025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Job f33027r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingECommerceCardsViewHolder(@NotNull ViewHolderSectionEcommerceCardsBinding binding, @NotNull CoroutineContext coroutineContext) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f33025p0 = binding;
        this.coroutineContext = coroutineContext;
    }

    public static final void access$handleECommerceEvent(LandingECommerceCardsViewHolder landingECommerceCardsViewHolder, CarouselCardsContract.Event event, Function1 function1) {
        landingECommerceCardsViewHolder.getClass();
        if (Intrinsics.areEqual(event, CarouselCardsContract.Event.HeaderLinkClicked.INSTANCE)) {
            function1.invoke(new LandingContract.Intent.OpenLink(new LandingLink(RouteConstants.LANDING_SETTINGS, false, true, 2, null), AnalyticsConstants.LANDING_ECOMMERCE_SETTINGS));
        } else if (event instanceof CarouselCardsContract.Event.CardSelected) {
            function1.invoke(new LandingContract.Intent.SectionItemTap(LandingECommerceCardsModel.ID, ((CarouselCardsContract.Event.CardSelected) event).getId()));
        }
    }

    public final void bind(@NotNull LandingECommerceCardsModel data, @NotNull Function1<? super LandingContract.Intent, Unit> listener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewHolderSectionEcommerceCardsBinding viewHolderSectionEcommerceCardsBinding = this.f33025p0;
        Context context = viewHolderSectionEcommerceCardsBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewHolderSectionEcommerceCardsBinding.ecommerceCards.getViewModel().updateModel(LandingECommerceCardsModelExtensionsKt.toCarouselState(data, context));
        Job job = this.f33027r0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f33027r0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, listener, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
