package com.bbva.glomohybrid.cellsweb.presentation.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkPageReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/reactions/DeepLinkPageReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeepLinkPageReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkPageReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/DeepLinkPageReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,26:1\n25#2,8:27\n*S KotlinDebug\n*F\n+ 1 DeepLinkPageReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/DeepLinkPageReactions\n*L\n22#1:27,8\n*E\n"})
public final class DeepLinkPageReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31683p0;

    public DeepLinkPageReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f31683p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = this.f31683p0.reactTo(WebController.ON_PAGE_LOADED_CHANNEL).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.DeepLinkPageReactions$sendNotificationToWeb$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).notifyDeeplinkAfterLoadedPage();
            }
        }), "doReaction(...)");
    }
}
