package com.bbva.glomohybrid.welcome.presentation.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.router.Router;
import ka.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelcomePagerReaction.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/reactions/WelcomePagerReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class WelcomePagerReaction extends BaseReaction {
    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = whenever("welcome-view-model");
        Router router = Router.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = plainActionBuilderWhenever.doAction(router.getACTION_NAVIGATE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        openScreen(reactionBuilderThen, (Animation) Animation.Fade.INSTANCE, true, (Function2) a.f79275p0);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = whenever("welcome-view-model").doAction(router.getACTION_CLOSE_SCREEN()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        closeScreen(reactionBuilderThen2);
    }
}
