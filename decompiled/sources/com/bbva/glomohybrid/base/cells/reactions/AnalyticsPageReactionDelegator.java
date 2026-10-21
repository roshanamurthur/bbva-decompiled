package com.bbva.glomohybrid.base.cells.reactions;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsPageReactionDelegator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\u0012\u0012\u0004\u0012\u0002H\u00070\bj\b\u0012\u0004\u0012\u0002H\u0007`\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006*\u0012\u0012\u0004\u0012\u00020\u000b0\bj\b\u0012\u0004\u0012\u00020\u000b`\t¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/reactions/AnalyticsPageReactionDelegator;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "()V", "configure", "", "trackEvent", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;", "Lcom/bbva/glomohybrid/base/cells/Reaction;", "analyticsEvent", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsPageReactionDelegator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsPageReactionDelegator.kt\ncom/bbva/glomohybrid/base/cells/reactions/AnalyticsPageReactionDelegator\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,23:1\n25#2,8:24\n25#2,8:32\n*S KotlinDebug\n*F\n+ 1 AnalyticsPageReactionDelegator.kt\ncom/bbva/glomohybrid/base/cells/reactions/AnalyticsPageReactionDelegator\n*L\n14#1:24,8\n19#1:32,8\n*E\n"})
public class AnalyticsPageReactionDelegator implements PageReactionDelegator {
    @NotNull
    public final <T> ReactorCoreBuilder.AndReactionBuilder<T> trackEvent(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder, @NotNull final AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        ReactorCoreBuilder.AndReactionBuilder<T> andReactionBuilderDoReaction = reactionBuilder.inside(AnalyticsManager.ID, AnalyticsManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.reactions.AnalyticsPageReactionDelegator$trackEvent$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, T t10) {
                Intrinsics.checkNotNull(p4);
                ((AnalyticsManager) p4).trackEvent(analyticsEvent);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @NotNull
    public final ReactorCoreBuilder.AndReactionBuilder<AnalyticsEvent> trackEvent(@NotNull ReactorCoreBuilder.ReactionBuilder<AnalyticsEvent> reactionBuilder) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        ReactorCoreBuilder.AndReactionBuilder<AnalyticsEvent> andReactionBuilderDoReaction = reactionBuilder.inside(AnalyticsManager.ID, AnalyticsManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.cells.reactions.AnalyticsPageReactionDelegator$trackEvent$$inlined$reactIn$default$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, AnalyticsEvent analyticsEvent) {
                Intrinsics.checkNotNull(p4);
                ((AnalyticsManager) p4).trackEvent(analyticsEvent);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
    }
}
