package com.bbva.glomohybrid.cellsweb.presentation.reactions;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import bk.p;
import bk.q;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.model.to_web.NavigationOptions;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.filefetcher.datamanager.FileFetcherDataManager;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomoconfig.factory.DataManagerComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.ActivityConfiguratorChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.OpenExternalWebViewChannel;
import com.bbva.glomohybrid.base.cells.components.InactiveSessionComponent;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannels;
import com.bbva.glomohybrid.base.file.reactions.FileReactions;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import com.bbva.glomohybrid.base.router.IntentExtra;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.glomohybrid.cellsweb.channels.SettingsDialogChannel;
import com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModel;
import com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogComponent;
import com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogTypeKt;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.network.NetworkWorker;
import com.bbva.networkmonitor.component.NetworkMonitorDataManager;
import com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.slidemenuview.cells.channels.MenuWebChannels;
import com.bbva.slidemenuview.cells.reactions.MenuReactions;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.mypinpad.tsdk.isolation.z1;
import com.noknok.android.client.oobsdk.OobReceiver;
import i8.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w4.o;

/* JADX INFO: compiled from: CellsWebReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/reactions/CellsWebReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsWebReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebReaction.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/CellsWebReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n+ 3 BaseReaction.kt\ncom/bbva/glomohybrid/base/cells/BaseReaction\n*L\n1#1,374:1\n59#2,7:375\n25#2,8:382\n67#2,5:390\n25#2,8:395\n82#2:403\n25#2,8:404\n25#2,8:412\n25#2,8:420\n25#2,8:428\n25#2,8:436\n25#2,8:444\n34#2,7:452\n34#2,7:459\n25#2,8:466\n50#2,8:474\n25#2,8:487\n50#2,8:496\n25#2,8:504\n25#2,8:512\n34#2,7:520\n79#3,5:482\n86#3:495\n*S KotlinDebug\n*F\n+ 1 CellsWebReaction.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/CellsWebReaction\n*L\n114#1:375,7\n121#1:382,8\n203#1:390,5\n203#1:395,8\n203#1:403\n283#1:404,8\n288#1:412,8\n293#1:420,8\n298#1:428,8\n303#1:436,8\n308#1:444,8\n313#1:452,7\n318#1:459,7\n324#1:466,8\n334#1:474,8\n339#1:487,8\n342#1:496,8\n347#1:504,8\n350#1:512,8\n369#1:520,7\n339#1:482,5\n339#1:495\n*E\n"})
public final class CellsWebReaction extends BaseReaction {

    @NotNull
    public final Lazy H0 = LazyKt__LazyJVMKt.lazy(new b());

    @NotNull
    public final Lazy I0 = LazyKt__LazyJVMKt.lazy(new a());

    @NotNull
    public final Lazy J0 = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: compiled from: CellsWebReaction.kt */
    public static final class a extends Lambda implements Function0<AndroidActionLauncher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AndroidActionLauncher invoke() {
            Application application = ((GlobalReaction) CellsWebReaction.this).mActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new AndroidActionLauncher(application, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: CellsWebReaction.kt */
    public static final class b extends Lambda implements Function0<CountryPageReactionDelegate> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountryPageReactionDelegate invoke() {
            CellsWebReaction cellsWebReaction = CellsWebReaction.this;
            Activity activity = ((GlobalReaction) cellsWebReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1735209388(...)");
            return new CountryPageReactionDelegate(cellsWebReaction, activity);
        }
    }

    /* JADX INFO: compiled from: CellsWebReaction.kt */
    public static final class c extends Lambda implements Function0<List<? extends PageReactionDelegator>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends PageReactionDelegator> invoke() {
            CellsWebReaction cellsWebReaction = CellsWebReaction.this;
            Activity activity = ((GlobalReaction) cellsWebReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1735209388(...)");
            Activity activity2 = ((GlobalReaction) cellsWebReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity2, "access$getMActivity$p$s1735209388(...)");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new PageReactionDelegator[]{CellsWebReaction.access$getPageReactionDelegate(cellsWebReaction), new MenuReactions(cellsWebReaction, R.id.slideMenuViewDashboard, "cells-web-view-model", true), new FileReactions(cellsWebReaction, activity, "cells-web-view-model"), new ApplicationSettingsReactions(cellsWebReaction, activity2), new DeepLinkPageReactions(cellsWebReaction)});
        }
    }

    public static final ActionLauncher access$getActionLauncher(CellsWebReaction cellsWebReaction) {
        return (ActionLauncher) cellsWebReaction.I0.getValue();
    }

    public static final CountryPageReactionDelegate access$getPageReactionDelegate(CellsWebReaction cellsWebReaction) {
        return (CountryPageReactionDelegate) cellsWebReaction.H0.getValue();
    }

    public static void e(CellsWebReaction this$0, Router router, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IntentExtra.StringExtra stringExtra = new IntentExtra.StringExtra(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DETAIL, str);
        Intrinsics.checkNotNull(router);
        Activity mActivity = this$0.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Router.navigate$default(router, mActivity, NotificationNoCommercialActivity.ID, null, null, stringExtra, false, 44, null);
    }

    public static void f(CellsWebReaction this$0, Router router, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IntentExtra.StringExtra stringExtra = new IntentExtra.StringExtra(OobReceiver.NOTIFICATION_ID, str);
        Intrinsics.checkNotNull(router);
        Activity mActivity = this$0.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Router.navigate$default(router, mActivity, NotificationNoCommercialActivity.ID, null, null, stringExtra, false, 44, null);
    }

    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        PageDelegatorExtensionsKt.configureAll((List) this.J0.getValue());
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = whenever("cellsweb");
        ActionSpec<Void> actionSpec = WebViewActivity.ON_RESUME;
        plainActionBuilderWhenever.doAction(actionSpec).then().inside(WebActions.ID, WebController.class).doReactionAndCleanChannel(new c8.b(1));
        whenever("cellsweb").doAction(WebViewActivity.ON_BACK).then().inside(WebActions.ID, WebController.class).doReactionAndCleanChannel(new d(0));
        whenever(WebActions.ID).doAction(WebController.ON_WEB_MESSAGE).then().inside(Dispatcher.ID, Dispatcher.class).doNavigationAndCleanChannel(new b2.a(3));
        addComponent(new SettingsDialogComponent());
        addComponent(InactiveSessionComponent.ID, new InactiveSessionComponent());
        Activity mActivity = this.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        addComponent(new NetworkMonitorDataManager(new NetworkChangeProvider(mActivity)));
        NetworkWorker networkWorker = (NetworkWorker) ComponentManager.get(NetworkWorker.class.getName());
        Intrinsics.checkNotNull(networkWorker);
        Activity mActivity2 = this.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
        FileFetcherDataManager fileFetcherDataManager = new FileFetcherDataManager(networkWorker, mActivity2, null, 4, null);
        fileFetcherDataManager.setProperties(DataManagerComponentFactory.INSTANCE.fileFetcher());
        addComponent(fileFetcherDataManager);
        CellsChannels cellsChannels = CellsChannels.INSTANCE;
        writeOn(cellsChannels.getWebVisibleChannel()).when(this.mTag).doAction(actionSpec);
        writeOn(cellsChannels.getOnCloseSessionSuccess()).when("cells-web-view-model").doAction(FileManagerComponent.INSTANCE.getACTION_CLOSE_SESSION());
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = writeOn(cellsChannels.getSendNativeBackWebChannel()).when("cellsweb");
        ActionConstants actionConstants = ActionConstants.INSTANCE;
        writableActionBuilderWhen.doAction(actionConstants.getACTION_NATIVE_BACK());
        writeOn(cellsChannels.getInactiveChannel()).when(InactiveSessionComponent.ID).doAction(InactiveSessionComponent.ACTION_INACTIVE_SESSION);
        writeOn(cellsChannels.getNativeRateAppChannel()).when("cells-web-view-model").doAction(actionConstants.getACTION_RATE_APP());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = reactTo(SettingsDialogChannel.INSTANCE.getShowSettingsModalChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        reactionBuilderThen.inside(SettingsDialogComponent.ID, SettingsDialogComponent.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$showSettingsDialog$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                String str2 = str;
                Activity activity = ((GlobalReaction) this.f31678p0).mActivity;
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ((SettingsDialogComponent) p4).show((FragmentActivity) activity, SettingsDialogTypeKt.toSettingsDialogType(str2), str2);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = reactTo(cellsChannels.getLogoutSuccessChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen2.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$onCloseSession$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).onCloseSession();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        final LoggerLevel loggerLevel = LoggerLevel.VERBOSE;
        final Exception exc = null;
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderAnd.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$setupChannels$$inlined$log$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                int i10 = CellsWebReaction$setupChannels$$inlined$log$default$1$1$wm$CellsReactor$WhenMappings.$EnumSwitchMapping$0[loggerLevel.ordinal()];
                Exception exc2 = exc;
                switch (i10) {
                    case 1:
                        LoggerKt.logVerbose$default("[Logout] received from web", null, 2, null);
                        break;
                    case 2:
                        LoggerKt.logDebug$default("[Logout] received from web", null, 2, null);
                        break;
                    case 3:
                        LoggerKt.logWarning$default("[Logout] received from web", null, 2, null);
                        break;
                    case 4:
                        LoggerKt.logInfo$default("[Logout] received from web", null, 2, null);
                        break;
                    case 5:
                        LoggerKt.logCritical$default("[Logout] received from web", exc2, null, 4, null);
                        break;
                    case 6:
                        LoggerKt.logError$default("[Logout] received from web", exc2, null, 4, null);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd2 = andReactionBuilderDoReaction2.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd2, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction3 = reactionBuilderAnd2.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$setUserIsNotLogged$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).saveStoreKey(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction3, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd3 = andReactionBuilderDoReaction3.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd3, "and(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction4 = reactionBuilderAnd3.inside(HeadersInterceptorDataManager.ID, HeadersInterceptorDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$clearToken$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((HeadersInterceptorDataManager) p4).setToken("", AuthTokenInterceptorsIds.GLOMO.toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction4, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd4 = andReactionBuilderDoReaction4.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd4, "and(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd4.inside("cellsweb", CellsWebActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$closeWebView$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebActivity) p4).closeScreen();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = reactTo(cellsChannels.getOpenMenuChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        int i10 = R.id.slideMenuViewDashboard;
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3.inside(i10, SlideMenuViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$openMenu$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                SlideMenuViewModel.toggle$default((SlideMenuViewModel) p4, true, false, 2, null);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = reactTo(cellsChannels.getEnableMenuSwipeChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4.inside(i10, SlideMenuViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$setMenuEnabled$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Boolean bool) {
                Intrinsics.checkNotNull(p4);
                boolean zBooleanValue = bool.booleanValue();
                this.f31675p0.g((SlideMenuViewModel) p4, zBooleanValue);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = reactTo(cellsChannels.getExpiredSessionChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5.inside(InactiveSessionComponent.ID, InactiveSessionComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$setInactive$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((InactiveSessionComponent) p4).launch();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen6 = reactTo(cellsChannels.getSharingChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6.inside(ActionLauncherComponent.ID, ActionLauncherComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$showShareModal$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                Activity activity = ((GlobalReaction) this.f31679p0).mActivity;
                Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1735209388(...)");
                ((ActionLauncherComponent) p4).launch(activity, q.mapOf(TuplesKt.to("type", "share"), TuplesKt.to("value", p.mapOf(TuplesKt.to("text", str)))));
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen7 = reactTo(cellsChannels.getCellsModalOpenedWebChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7.inside("cellsweb", CellsWebActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$onCellsModalOpened$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebActivity) p4).setIsCellsModalShown(true);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen8 = reactTo(cellsChannels.getCellsModalClosedWebChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8.inside("cellsweb", CellsWebActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$onCellsModalClosed$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebActivity) p4).setIsCellsModalShown(false);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen9 = reactTo(OpenExternalWebViewChannel.INSTANCE.getInstance()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen9, "then(...)");
        reactionBuilderThen9.inside(Router.ID, Router.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$navigateToExternalWebView$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Bundle bundle) {
                Intrinsics.checkNotNull(p4);
                Activity activity = ((GlobalReaction) this.f31673p0).mActivity;
                Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1735209388(...)");
                Router.navigate$default((Router) p4, activity, "webview", Animation.SlideUp.INSTANCE, bundle, null, false, 48, null);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen10 = reactTo(cellsChannels.getNotifyDashboardLoadedChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen10, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen10.inside("cells-web-view-model", DeepLinkWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$handleShortcutDeeplink$$inlined$reactIn$default$1
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                DeepLinkWebViewModel deepLinkWebViewModel = (DeepLinkWebViewModel) p4;
                deepLinkWebViewModel.notifyShortcut();
                deepLinkWebViewModel.notifyDeepLink();
            }
        }), "doReaction(...)");
        reactTo(cellsChannels.getGlobalRateApp()).then().inside("cells-web-view-model", CellsWebGlobalViewModel.class).doReactionAndCleanChannel(new z1());
        reactTo(cellsChannels.getOpenNotificationDetail()).then().inside(Router.ID, Router.class).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: i8.c
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                CellsWebReaction.f(this.f69520p0, (Router) obj, (String) obj2);
            }
        });
        reactTo(cellsChannels.getOpenNotification()).then().inside(Router.ID, Router.class).doReactionAndCleanChannel(new o(this, 1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen11 = reactTo(ActivityConfiguratorChannels.INSTANCE.getScratchcardChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen11, "then(...)");
        reactionBuilderThen11.inside(Router.ID, Router.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$navigateToScratchcardActivity$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, ScratchcardConfiguration scratchcardConfiguration) {
                Intrinsics.checkNotNull(p4);
                Activity activity = ((GlobalReaction) this.f31674p0).mActivity;
                Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s1735209388(...)");
                Router.navigate$default((Router) p4, activity, "scratch-card", Animation.SlideUp.INSTANCE, null, new IntentExtra.Parcel(ScratchcardConfiguration.SCRATCHCARD_CONFIG_KEY, scratchcardConfiguration), false, 40, null);
            }
        });
        WebActions webActions = WebActions.INSTANCE;
        Activity mActivity3 = this.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity3, "mActivity");
        webActions.configureWebActions(this, mActivity3);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen12 = whenever("cellsweb").doAction(actionConstants.getACTION_FINISH()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen12, "then(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd5 = cleanChannels(reactionBuilderThen12, cellsChannels.getWebChannels()).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd5, "and(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd6 = cleanChannels(reactionBuilderAnd5, FileInteractionChannels.INSTANCE.getChannels()).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd6, "and(...)");
        cleanChannels(reactionBuilderAnd6, MenuWebChannels.INSTANCE.getWebChannels());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen13 = whenever(i10).doAction(SlideMenuViewModel.ACTION_HEADER_CLICK).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen13, "then(...)");
        final boolean z10 = false;
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen13.inside(WebActions.ID, WebController.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$manageHeaderMenuItem$$inlined$webRouter$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, HeaderMenuItem headerMenuItem) {
                Intrinsics.checkNotNull(p4);
                ((WebController) p4).navigateTo(headerMenuItem.getRoute(), null, NavigationOptions.skipHistory(z10));
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever2 = whenever(SettingsDialogComponent.ID);
        SettingsDialogComponent.Companion companion = SettingsDialogComponent.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen14 = plainActionBuilderWhenever2.doAction(companion.getACTION_OPEN_SETTINGS()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen14, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen14.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$configure$$inlined$react$default$1
            public final void execute(Router router, Void r3) {
                CellsWebReaction cellsWebReaction = this.f31671p0;
                ActionLauncher actionLauncherAccess$getActionLauncher = CellsWebReaction.access$getActionLauncher(cellsWebReaction);
                String packageName = ((GlobalReaction) cellsWebReaction).mActivity.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                actionLauncherAccess$getActionLauncher.launchSettings(packageName);
            }

            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public /* bridge */ /* synthetic */ void execute(Object obj, Object obj2) {
                execute((Router) obj, (Void) obj2);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen15 = whenever(SettingsDialogComponent.ID).doAction(companion.getACTION_OPEN_LOCATION_SYSTEM_SETTINGS()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen15, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen15.inside("cellsweb", CellsWebActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction$configure$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Void r3) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebActivity) p4).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }), "doReaction(...)");
        whenever(SettingsDialogComponent.ID).doAction(companion.getACTION_CANCEL_DIALOG()).then().inside("web-dispatcher", MessageDispatcher.class).doReactionAndCleanChannel(new i8.a(0));
    }

    public final void g(final SlideMenuViewModel slideMenuViewModel, final boolean z10) {
        Activity activity = this.mActivity;
        if ((activity != null ? activity.findViewById(R.id.srn_root_layout) : null) != null) {
            slideMenuViewModel.lock(!z10);
        } else {
            new Handler().post(new Runnable() { // from class: i8.b
                @Override // java.lang.Runnable
                public final void run() {
                    CellsWebReaction this$0 = this.f69517p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    SlideMenuViewModel this_tryToEnableMenu = slideMenuViewModel;
                    Intrinsics.checkNotNullParameter(this_tryToEnableMenu, "$this_tryToEnableMenu");
                    this$0.g(this_tryToEnableMenu, z10);
                }
            });
        }
    }
}
