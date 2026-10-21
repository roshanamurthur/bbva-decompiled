package com.bbva.glomohybrid.login.presentation.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.cells.reactions.AnalyticsPageReactionDelegator;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsLoginReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/AnalyticsLoginReaction;", "Lcom/bbva/glomohybrid/base/cells/reactions/AnalyticsPageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "pageDelegatorList", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Ljava/util/List;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class AnalyticsLoginReaction extends AnalyticsPageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33481p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final List<PageReactionDelegator> f33482q0;

    public /* synthetic */ AnalyticsLoginReaction(BaseReaction baseReaction, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseReaction, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @Override // com.bbva.glomohybrid.base.cells.reactions.AnalyticsPageReactionDelegator, com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        super.configure();
        PageDelegatorExtensionsKt.configureAll(this.f33482q0);
        BaseReaction baseReaction = this.f33481p0;
        ReactorCoreBuilder.ReactionBuilder<AnalyticsEvent> reactionBuilderThen = baseReaction.whenever("login-view-model").doAction(LoginGlobalViewModel.INSTANCE.getACTION_TRACK_LOGIN_EVENT()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        trackEvent(reactionBuilderThen);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.whenever(CustomerDataManager.ID).doAction(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        trackEvent(reactionBuilderThen2, AnalyticsEvent.LOGIN_SUCCESS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsLoginReaction(@NotNull BaseReaction baseReaction, @NotNull List<? extends PageReactionDelegator> pageDelegatorList) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(pageDelegatorList, "pageDelegatorList");
        this.f33481p0 = baseReaction;
        this.f33482q0 = pageDelegatorList;
    }
}
