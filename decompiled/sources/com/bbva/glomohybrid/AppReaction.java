package com.bbva.glomohybrid;

import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.WebAwareComponentKt;
import com.bbva.bridge.navigate.WebNavigateDispatcher;
import com.bbva.bridge.webcontroller.WebControllerExtensionsKt;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.c;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.glomo.semaas.usecase.RefreshSemaasParams;
import com.bbva.glomo.semaas.usecase.RefreshSemaasTokenUseCase;
import com.bbva.glomohybrid.AppReaction;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.session.AuthTokenDispatcher;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w4.h;

/* JADX INFO: compiled from: AppReaction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/AppReaction;", "Lcom/bbva/cellscore/reactor/GlobalReaction;", "", "configure", "", "Lcom/bbva/bridge/WebAwareComponent;", "webReadyAwareComponents", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "Lcom/bbva/glomo/semaas/usecase/RefreshSemaasTokenUseCase;", "refreshSemaasTokenUseCase", "Lcom/bbva/glomohybrid/base/session/Session;", "session", "<init>", "(Ljava/util/List;Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;Lcom/bbva/glomo/semaas/usecase/RefreshSemaasTokenUseCase;Lcom/bbva/glomohybrid/base/session/Session;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAppReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppReaction.kt\ncom/bbva/glomohybrid/AppReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,98:1\n59#2,7:99\n*S KotlinDebug\n*F\n+ 1 AppReaction.kt\ncom/bbva/glomohybrid/AppReaction\n*L\n76#1:99,7\n*E\n"})
public final class AppReaction extends GlobalReaction {

    @NotNull
    public final List<WebAwareComponent> G0;

    @NotNull
    public final Crashlytics H0;

    @Nullable
    public final RefreshSemaasTokenUseCase I0;

    @NotNull
    public final Session J0;

    @NotNull
    public final ArrayList K0;

    public /* synthetic */ AppReaction(List list, Crashlytics crashlytics, RefreshSemaasTokenUseCase refreshSemaasTokenUseCase, Session session, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, crashlytics, refreshSemaasTokenUseCase, session);
    }

    @Override // com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        reactTo(WebController.ON_WEB_READY_CHANNEL).then().inside(WebActions.ID, WebController.class).doReaction(new Reaction.ReactionExecution() { // from class: t7.d
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                AppReaction this$0 = this.f93472p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WebAwareComponentKt.propagateWebReady(this$0.G0, WebState.READY);
            }
        });
        whenever(WebActions.ID).doAction(WebControllerExtensionsKt.getACTION_SWITCH_WEB()).then().inside(WebActions.ID, WebController.class).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: t7.e
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                AppReaction this$0 = this.f93473p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WebAwareComponentKt.propagateWebReady(this$0.G0, WebState.IDLE);
            }
        });
        reactTo(WebController.ON_PAGE_LOADED_CHANNEL).then().inside(WebActions.ID, WebController.class).doReaction(new h(this, 1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = whenever(HeadersInterceptorDataManager.ID).doAction(HeadersInterceptorDataManager.ACCESS_TOKEN_CHANGE).then().inside(AuthTokenDispatcher.ID, AuthTokenDispatcher.class).doReaction(new c(this, 1)).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd.inside(Router.ID, Router.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.AppReaction$configureReactions$$inlined$react$default$1
            public final void execute(Router router, AccessToken accessToken) {
                RefreshSemaasTokenUseCase refreshSemaasTokenUseCase;
                AccessToken accessToken2 = accessToken;
                if (!Intrinsics.areEqual(accessToken2.getId(), AuthTokenInterceptorsIds.GLOMO.name()) || (refreshSemaasTokenUseCase = this.f30995p0.I0) == null) {
                    return;
                }
                String token = accessToken2.getToken();
                if (token == null) {
                    token = "";
                }
                refreshSemaasTokenUseCase.execute2(new RefreshSemaasParams(token));
            }

            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public /* bridge */ /* synthetic */ void execute(Object obj, Object obj2) {
                execute((Router) obj, (AccessToken) obj2);
            }
        }), "doReaction(...)");
        whenever(WebActions.ID).doAction(WebController.ON_WEB_MESSAGE).then().inside("web-navigate-dispatcher", WebNavigateDispatcher.class).doReactionAndCleanChannel(new u4.c(1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppReaction(@NotNull List<? extends WebAwareComponent> webReadyAwareComponents, @NotNull Crashlytics crashlytics, @Nullable RefreshSemaasTokenUseCase refreshSemaasTokenUseCase, @NotNull Session session) {
        Intrinsics.checkNotNullParameter(webReadyAwareComponents, "webReadyAwareComponents");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter(session, "session");
        this.G0 = webReadyAwareComponents;
        this.H0 = crashlytics;
        this.I0 = refreshSemaasTokenUseCase;
        this.J0 = session;
        this.K0 = new ArrayList();
    }
}
