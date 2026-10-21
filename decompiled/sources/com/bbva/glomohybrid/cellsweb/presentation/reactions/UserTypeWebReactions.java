package com.bbva.glomohybrid.cellsweb.presentation.reactions;

import android.app.Activity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserTypeWebReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/reactions/UserTypeWebReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserTypeWebReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeWebReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/UserTypeWebReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,115:1\n25#2,8:116\n25#2,8:124\n25#2,8:132\n25#2,8:140\n25#2,8:148\n25#2,8:156\n25#2,8:164\n*S KotlinDebug\n*F\n+ 1 UserTypeWebReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/UserTypeWebReactions\n*L\n72#1:116,8\n77#1:124,8\n88#1:132,8\n93#1:140,8\n98#1:148,8\n106#1:156,8\n111#1:164,8\n*E\n"})
public final class UserTypeWebReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31685p0;

    /* JADX INFO: compiled from: UserTypeWebReactions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserTypeWebReactions(@NotNull BaseReaction baseReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31685p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        ZipActionsComponent zipActionsComponent = new ZipActionsComponent(null, 1, null);
        BaseReaction baseReaction = this.f31685p0;
        baseReaction.addComponent(ZipActionsComponent.ID, zipActionsComponent);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.whenever(R.id.slideMenuViewDashboard).doAction(SlideMenuViewModel.ACTION_THIRD_LINE_CLICK).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$showUserTypeModal$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                CellsWebViewModel cellsWebViewModel = (CellsWebViewModel) p4;
                if (obj instanceof String) {
                    cellsWebViewModel.getUserTypeViewModelDelegate().onShowUserTypeSelector((String) obj);
                } else if (obj instanceof HeaderSubItem) {
                    cellsWebViewModel.getUserTypeViewModelDelegate().onShowUserTypeSelector(((HeaderSubItem) obj).getText());
                }
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.reactTo(CellsChannels.INSTANCE.getChangeUserChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$storeSelectedType$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).getUserTypeViewModelDelegate().onStoreUserTypeInComponent();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.whenever("cells-web-view-model").doAction(CellsWebGlobalViewModel.INSTANCE.getCLEAN_WEB_READY_CHANNEL()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        Channel<String> ON_WEB_READY_CHANNEL = WebController.ON_WEB_READY_CHANNEL;
        Intrinsics.checkNotNullExpressionValue(ON_WEB_READY_CHANNEL, "ON_WEB_READY_CHANNEL");
        baseReaction.cleanChannel(reactionBuilderThen3, ON_WEB_READY_CHANNEL);
        UserTypeChannels userTypeChannels = UserTypeChannels.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = baseReaction.reactTo(userTypeChannels.getShowProfileChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen4.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$showRememberedModal$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).getUserTypeViewModelDelegate().openEnterpriseDialog();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd, userTypeChannels.getShowProfileChannel());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = baseReaction.reactTo(userTypeChannels.getSwitchProfileChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderThen5.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$switchProfile$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                CellsWebViewModel cellsWebViewModel = (CellsWebViewModel) p4;
                UserType userType = UserTypeKt.toUserType(str);
                if (userType != null && UserTypeWebReactions.WhenMappings.$EnumSwitchMapping$0[userType.ordinal()] == 1) {
                    cellsWebViewModel.getUserTypeViewModelDelegate().onSwitchToEnterprise();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd2 = andReactionBuilderDoReaction2.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd2, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd2, userTypeChannels.getSwitchProfileChannel());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen6 = baseReaction.reactTo(ON_WEB_READY_CHANNEL).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6, "then(...)");
        final String id = ActionConstants.INSTANCE.getACTION_WEB_READY().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$performZipAction$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).getUserTypeViewModelDelegate().getZipComponent().markAsPerformed(id, obj);
            }
        }), "doReaction(...)");
        AppStartReadyChannel appStartReadyChannel = AppStartReadyChannel.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen7 = baseReaction.reactTo(appStartReadyChannel.getInstance()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7, "then(...)");
        final String id2 = appStartReadyChannel.getACTION_APP_READY().getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$performZipAction$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).getUserTypeViewModelDelegate().getZipComponent().markAsPerformed(id2, obj);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen8 = baseReaction.reactTo(userTypeChannels.getSplashReadyReceived()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction3 = reactionBuilderThen8.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.UserTypeWebReactions$readyReceived$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).getUserTypeViewModelDelegate().sendWebReadyDataGema$CellsWeb_mexicoRelease();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction3, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd3 = andReactionBuilderDoReaction3.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd3, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd3, userTypeChannels.getSplashReadyReceived());
    }
}
