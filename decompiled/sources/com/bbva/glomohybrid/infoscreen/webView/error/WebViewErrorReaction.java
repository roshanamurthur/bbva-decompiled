package com.bbva.glomohybrid.infoscreen.webView.error;

import android.app.Activity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import com.bbva.glomohybrid.infoscreen.webView.error.WebViewErrorReaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WebViewErrorReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/error/WebViewErrorReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebViewErrorReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewErrorReaction.kt\ncom/bbva/glomohybrid/infoscreen/webView/error/WebViewErrorReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,41:1\n25#2,8:42\n*S KotlinDebug\n*F\n+ 1 WebViewErrorReaction.kt\ncom/bbva/glomohybrid/infoscreen/webView/error/WebViewErrorReaction\n*L\n37#1:42,8\n*E\n"})
public final class WebViewErrorReaction extends BaseReaction {
    public static void e(WebViewErrorReaction this$0, Router router, Route route) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(router);
        Activity mActivity = this$0.mActivity;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Router.navigate$default(router, mActivity, route.getRoute(), route.getAnimation(), null, null, false, 56, null);
    }

    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addComponent(new InfoScreenComponent(null, 1, null));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = whenever("webview-error").doAction(InfoScreenActivity.INSTANCE.getACTION_POSITIVE_BUTTON()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside(ActionLauncherComponent.ID, ActionLauncherComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.infoscreen.webView.error.WebViewErrorReaction$showMarket$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                Activity activity = ((GlobalReaction) this.f32491p0).mActivity;
                Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s-228987688(...)");
                ((ActionLauncherComponent) p4).launch(activity, new Action.Market(WebViewErrorActivity.WEB_VIEW_PACKAGE_NAME, null, 2, null));
            }
        }), "doReaction(...)");
        whenever("webview-error").doAction(Router.INSTANCE.getACTION_NAVIGATE()).then().inside(Router.ID, Router.class).doReaction(new Reaction.ReactionExecution() { // from class: g9.a
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                WebViewErrorReaction.e(this.f68590p0, (Router) obj, (Route) obj2);
            }
        });
    }
}
