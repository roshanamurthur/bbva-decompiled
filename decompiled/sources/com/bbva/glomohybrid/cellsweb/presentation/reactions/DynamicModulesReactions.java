package com.bbva.glomohybrid.cellsweb.presentation.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DynamicModulesReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/reactions/DynamicModulesReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDynamicModulesReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicModulesReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/DynamicModulesReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,35:1\n25#2,8:36\n25#2,8:44\n*S KotlinDebug\n*F\n+ 1 DynamicModulesReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/DynamicModulesReactions\n*L\n26#1:36,8\n31#1:44,8\n*E\n"})
public final class DynamicModulesReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31684p0;

    public DynamicModulesReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f31684p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        CellsChannels cellsChannels = CellsChannels.INSTANCE;
        Channel<String> downloadDynamicModuleChannel = cellsChannels.getDownloadDynamicModuleChannel();
        BaseReaction baseReaction = this.f31684p0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(downloadDynamicModuleChannel).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.DynamicModulesReactions$downloadDynamicModule$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                String str2 = str;
                DynamicModulesDelegate dynamicModulesDelegate = ((CellsWebViewModel) p4).getDynamicModulesDelegate();
                if (dynamicModulesDelegate != null) {
                    dynamicModulesDelegate.installDynamicModule(str2);
                }
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.reactTo(cellsChannels.isDynamicModuleInstalledChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.DynamicModulesReactions$isDynamicModuleInstalled$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                String str2 = str;
                DynamicModulesDelegate dynamicModulesDelegate = ((CellsWebViewModel) p4).getDynamicModulesDelegate();
                if (dynamicModulesDelegate != null) {
                    dynamicModulesDelegate.notifyIsDynamicModuleInstalled(str2);
                }
            }
        }), "doReaction(...)");
    }
}
