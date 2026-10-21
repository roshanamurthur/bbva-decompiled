package com.bbva.glomohybrid.base.extensions;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ChannelsExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a2\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\u0012\u0012\u0004\u0012\u0002H\u00050\u0006j\b\u0012\u0004\u0012\u0002H\u0005`\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t¨\u0006\n"}, d2 = {"autoClean", "Lcom/bbva/cellscore/channel/model/Channel;", ExifInterface.GPS_DIRECTION_TRUE, "onActionPerformed", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", "Any", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;", "Lcom/bbva/glomohybrid/base/cells/Reaction;", "actionSpec", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChannelsExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelsExtensions.kt\ncom/bbva/glomohybrid/base/extensions/ChannelsExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,15:1\n1#2:16\n25#3,8:17\n*S KotlinDebug\n*F\n+ 1 ChannelsExtensions.kt\ncom/bbva/glomohybrid/base/extensions/ChannelsExtensionsKt\n*L\n12#1:17,8\n*E\n"})
public final class ChannelsExtensionsKt {
    @NotNull
    public static final <T> Channel<T> autoClean(@NotNull Channel<T> channel) {
        Intrinsics.checkNotNullParameter(channel, "<this>");
        channel.setAutoClean(true);
        return channel;
    }

    @NotNull
    public static final <Any> ReactorCoreBuilder.AndReactionBuilder<Any> onActionPerformed(@NotNull ReactorCoreBuilder.ReactionBuilder<Any> reactionBuilder, @NotNull final ActionSpec<?> actionSpec) {
        Intrinsics.checkNotNullParameter(reactionBuilder, "<this>");
        Intrinsics.checkNotNullParameter(actionSpec, "actionSpec");
        ReactorCoreBuilder.AndReactionBuilder<Any> andReactionBuilderDoReaction = reactionBuilder.inside(ZipActionsComponent.ID, ZipActionsComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt$onActionPerformed$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Any any) {
                Intrinsics.checkNotNull(p4);
                ((ZipActionsComponent) p4).onActionPerformed(actionSpec, any);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        return andReactionBuilderDoReaction;
    }
}
