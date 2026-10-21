package com.bbva.glomohybrid.landing.presentation.adapter.holders;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.t;
import com.bbva.component.ui.landing.access.model.LandingAccessState;
import com.bbva.component.ui.message.card.MessageCardView;
import com.bbva.component.ui.message.card.MessageCardViewModel;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.component.ui.message.link.MessageLinkView;
import com.bbva.component.ui.shortcuts.model.ShortcutsConfiguration;
import com.bbva.component.ui.shortcuts.model.ShortcutsState;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.databinding.ViewHolderLandingHeaderBinding;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingBackground;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderFeatureFlagsModel;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.adapter.LandingItemsAnimator;
import com.bbva.glomohybrid.landing.presentation.constants.LandingAccessViewConstants;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingHeaderStateExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingShortcutItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.MessageCardViewEventsExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderPreDrawInformation;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomohybrid.ui.view.OverlayImageView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.widgets.image.extensions.ImageViewExtensionsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import l9.b;
import l9.c;
import l9.d;
import l9.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u001c\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006."}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "data", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderPreDrawInformation;", "info", "Lkotlin/Function0;", "onEnd", "animate", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getViewMinHeight", "()I", "setViewMinHeight", "(I)V", "viewMinHeight", "s0", "getViewMaxHeight", "viewMaxHeight", "t0", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderPreDrawInformation;", "getANIMATION_EXPAND", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderPreDrawInformation;", "ANIMATION_EXPAND", "u0", "getANIMATION_COLLAPSE", "ANIMATION_COLLAPSE", "Lcom/bbva/glomohybrid/landing/databinding/ViewHolderLandingHeaderBinding;", "binding", "Landroid/view/ViewGroup;", "container", "<init>", "(Lcom/bbva/glomohybrid/landing/databinding/ViewHolderLandingHeaderBinding;Landroid/view/ViewGroup;Lkotlin/coroutines/CoroutineContext;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingHeaderViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingHeaderViewHolder.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingHeaderViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,249:1\n1#2:250\n32#3:251\n95#3,14:252\n*S KotlinDebug\n*F\n+ 1 LandingHeaderViewHolder.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/holders/LandingHeaderViewHolder\n*L\n244#1:251\n244#1:252,14\n*E\n"})
public final class LandingHeaderViewHolder extends RecyclerView.ViewHolder implements CoroutineScope {
    public static final /* synthetic */ int E0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewHolderLandingHeaderBinding f33028p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int viewMinHeight;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int viewMaxHeight;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingHeaderPreDrawInformation ANIMATION_EXPAND;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingHeaderPreDrawInformation ANIMATION_COLLAPSE;

    @Nullable
    public Job v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Job f33034w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Job f33035x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public Job f33036y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingHeaderViewHolder(@NotNull ViewHolderLandingHeaderBinding binding, @NotNull ViewGroup container, @NotNull CoroutineContext coroutineContext) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f33028p0 = binding;
        this.coroutineContext = coroutineContext;
        this.viewMinHeight = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.landing_header_min_height);
        int height = container.getHeight();
        this.viewMaxHeight = height;
        this.ANIMATION_EXPAND = new LandingHeaderPreDrawInformation(this.viewMinHeight, height);
        this.ANIMATION_COLLAPSE = new LandingHeaderPreDrawInformation(height, this.viewMinHeight);
    }

    public static final void access$handleAccessEvent(LandingHeaderViewHolder landingHeaderViewHolder, String str, Function1 function1) {
        landingHeaderViewHolder.getClass();
        if (Intrinsics.areEqual(str, LandingAccessViewConstants.ID_EVENT_CHANGE_USER)) {
            function1.invoke(LandingContract.Intent.ChangeUserTap.INSTANCE);
        } else if (Intrinsics.areEqual(str, LandingAccessViewConstants.ID_EVENT_LOGIN_NAVIGATION)) {
            function1.invoke(LandingContract.Intent.LoginButtonTap.INSTANCE);
        }
    }

    public static final void access$handleBlockerMessageEvents(LandingHeaderViewHolder landingHeaderViewHolder, MessageCardViewModel.Event event, Function1 function1) {
        landingHeaderViewHolder.getClass();
        if (MessageCardViewEventsExtensionsKt.isInteractionEvent(event) && Intrinsics.areEqual(event.getViewId(), LandingHeaderState.Type.BlockedForUpdate.INSTANCE.getID())) {
            function1.invoke(new LandingContract.Intent.UpdateApp(event.getButtonId()));
        }
    }

    public final void animate(@NotNull LandingHeaderPreDrawInformation info, @NotNull final Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(info.getStartAnimationY(), info.getEndAnimationY());
        valueAnimatorOfInt.setDuration(LandingItemsAnimator.INSTANCE.getANIMATION_DURATION());
        valueAnimatorOfInt.addUpdateListener(new t(this, 1));
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder$animate$lambda$9$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                onEnd.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        valueAnimatorOfInt.start();
    }

    public final void bind(@NotNull LandingHeaderState data, @NotNull Function1<? super LandingContract.Intent, Unit> listener) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewHolderLandingHeaderBinding viewHolderLandingHeaderBinding = this.f33028p0;
        OverlayImageView background = viewHolderLandingHeaderBinding.background;
        Intrinsics.checkNotNullExpressionValue(background, "background");
        LandingBackground background2 = data.getBackground();
        String url = background2 != null ? background2.getUrl() : null;
        LandingBackground background3 = data.getBackground();
        ImageViewExtensionsKt.load$default(background, url, background3 != null ? background3.getResource() : 0, null, 0, 12, null);
        if (data.getUser() != null) {
            Context context = viewHolderLandingHeaderBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            viewHolderLandingHeaderBinding.access.getViewModel().updateModel(new LandingAccessState.Ready(LandingHeaderStateExtensionsKt.mapToAccessViewState(data, context)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Context context2 = viewHolderLandingHeaderBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            viewHolderLandingHeaderBinding.access.getViewModel().updateModel(new LandingAccessState.Loading(LandingHeaderStateExtensionsKt.mapToAccessButton(data, context2)));
        }
        Job job = this.f33034w0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f33034w0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, listener, null), 3, null);
        List<LandingShortcutItemModel> shortcuts = data.getShortcuts();
        if (shortcuts != null) {
            viewHolderLandingHeaderBinding.shortcuts.getViewModel().updateModel(new ShortcutsState.Ready(new ShortcutsConfiguration(LandingShortcutItemModelExtensionsKt.toView(shortcuts))));
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            viewHolderLandingHeaderBinding.shortcuts.getViewModel().updateModel(ShortcutsState.Loading.INSTANCE);
        }
        Job job2 = this.v0;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.v0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(this, listener, null), 3, null);
        boolean z10 = data.getShortcuts() == null;
        UserProfileConfiguration user = data.getUser();
        boolean z11 = (user != null ? user.getRememberedUser() : null) != null;
        boolean zAreEqual = Intrinsics.areEqual(data.getType(), LandingHeaderState.Type.Enabled.INSTANCE);
        LandingHeaderFeatureFlagsModel features = data.getFeatures();
        boolean z12 = features != null && features.getDigitalActivation();
        MessageLinkView digitalActivation = viewHolderLandingHeaderBinding.digitalActivation;
        Intrinsics.checkNotNullExpressionValue(digitalActivation, "digitalActivation");
        ViewExtensionsKt.show(digitalActivation, z12 && !z10 && zAreEqual && !z11);
        Job job3 = this.f33035x0;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.f33035x0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this, listener, null), 3, null);
        boolean z13 = data.getShortcuts() == null;
        Context context3 = viewHolderLandingHeaderBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        MessageCardState messageCardStateMapToBlockerMessage = LandingHeaderStateExtensionsKt.mapToBlockerMessage(data, context3);
        if (!(!z13)) {
            messageCardStateMapToBlockerMessage = null;
        }
        if (messageCardStateMapToBlockerMessage != null) {
            viewHolderLandingHeaderBinding.blockerMessage.getViewModel().updateModel(messageCardStateMapToBlockerMessage);
            ViewCompat.setAccessibilityDelegate(viewHolderLandingHeaderBinding.getRoot(), new AccessibilityDelegateCompat() { // from class: com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder$configureBlockerMessageAccessibility$1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.setClickable(false);
                    info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    info.addAction(1);
                }
            });
            viewHolderLandingHeaderBinding.getRoot().setContentDescription(null);
            viewHolderLandingHeaderBinding.blockerMessage.setContentDescription(messageCardStateMapToBlockerMessage.getPrimaryText() + " " + messageCardStateMapToBlockerMessage.getSecondaryText());
            unit3 = Unit.INSTANCE;
        } else {
            unit3 = null;
        }
        MessageCardView blockerMessage = viewHolderLandingHeaderBinding.blockerMessage;
        Intrinsics.checkNotNullExpressionValue(blockerMessage, "blockerMessage");
        ViewExtensionsKt.show(blockerMessage, (z13 || unit3 == null) ? false : true);
        Job job4 = this.f33036y0;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.f33036y0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, listener, null), 3, null);
    }

    @NotNull
    public final LandingHeaderPreDrawInformation getANIMATION_COLLAPSE() {
        return this.ANIMATION_COLLAPSE;
    }

    @NotNull
    public final LandingHeaderPreDrawInformation getANIMATION_EXPAND() {
        return this.ANIMATION_EXPAND;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final int getViewMaxHeight() {
        return this.viewMaxHeight;
    }

    public final int getViewMinHeight() {
        return this.viewMinHeight;
    }

    public final void setViewMinHeight(int i10) {
        this.viewMinHeight = i10;
    }
}
