package com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.VeriShowView;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.channels.HearingDisabilitiesChannels;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HearingDisabilitiesReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/reactions/HearingDisabilitiesReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "baseReaction", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "configure", "", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHearingDisabilitiesReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HearingDisabilitiesReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/verishow/reactions/HearingDisabilitiesReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,46:1\n25#2,8:47\n25#2,8:55\n25#2,8:63\n25#2,8:71\n*S KotlinDebug\n*F\n+ 1 HearingDisabilitiesReactions.kt\ncom/bbva/glomohybrid/cellsweb/presentation/verishow/reactions/HearingDisabilitiesReactions\n*L\n15#1:47,8\n23#1:55,8\n31#1:63,8\n39#1:71,8\n*E\n"})
public final class HearingDisabilitiesReactions implements PageReactionDelegator {

    @NotNull
    private final BaseReaction baseReaction;

    public HearingDisabilitiesReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.baseReaction = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.baseReaction;
        HearingDisabilitiesChannels hearingDisabilitiesChannels = HearingDisabilitiesChannels.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(hearingDisabilitiesChannels.getGetNetworkStatusDisabilityVideocallChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(VeriShowView.ID, VeriShowView.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions.HearingDisabilitiesReactions$configure$lambda$4$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((VeriShowView) p4).getNetworkStatusDisabilityVideocallChannel();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd, hearingDisabilitiesChannels.getGetNetworkStatusDisabilityVideocallChannel());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.reactTo(hearingDisabilitiesChannels.getUserInfoDisabilityVideocall()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderThen2.inside(VeriShowView.ID, VeriShowView.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions.HearingDisabilitiesReactions$configure$lambda$4$$inlined$reactIn$default$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                ((VeriShowView) p4).configWebViewForVeriShow(str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd2 = andReactionBuilderDoReaction2.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd2, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd2, hearingDisabilitiesChannels.getUserInfoDisabilityVideocall());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.reactTo(hearingDisabilitiesChannels.getCloseScreenTimerDisabilityVideocall()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction3 = reactionBuilderThen3.inside(VeriShowView.ID, VeriShowView.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions.HearingDisabilitiesReactions$configure$lambda$4$$inlined$reactIn$default$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((VeriShowView) p4).closeScreenTimer();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction3, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd3 = andReactionBuilderDoReaction3.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd3, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd3, hearingDisabilitiesChannels.getCloseScreenTimerDisabilityVideocall());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = baseReaction.reactTo(hearingDisabilitiesChannels.getWaitingTimeEndedDisabilityVideocall()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction4 = reactionBuilderThen4.inside(VeriShowView.ID, VeriShowView.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions.HearingDisabilitiesReactions$configure$lambda$4$$inlined$reactIn$default$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((VeriShowView) p4).waitingTimeIsOver();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction4, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd4 = andReactionBuilderDoReaction4.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd4, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd4, hearingDisabilitiesChannels.getWaitingTimeEndedDisabilityVideocall());
    }
}
