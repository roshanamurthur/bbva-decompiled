package com.bbva.glomohybrid.login.presentation.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginRememberedUserReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/LoginRememberedUserReaction;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginRememberedUserReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRememberedUserReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginRememberedUserReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,37:1\n25#2,8:38\n25#2,8:46\n*S KotlinDebug\n*F\n+ 1 LoginRememberedUserReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginRememberedUserReaction\n*L\n28#1:38,8\n33#1:46,8\n*E\n"})
public final class LoginRememberedUserReaction implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33501p0;

    public LoginRememberedUserReaction(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f33501p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        Channel<Void> changeUserChannel = CellsChannels.INSTANCE.getChangeUserChannel();
        BaseReaction baseReaction = this.f33501p0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(changeUserChannel).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginRememberedUserReaction$deleteUser$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).deleteUserData();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.whenever(CustomerDataManager.ID).doAction(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginRememberedUserReaction$notifyRememberedUserIsSet$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Customer customer) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).saveUserDataAndNotifyRememberedUser(customer);
            }
        }), "doReaction(...)");
    }
}
