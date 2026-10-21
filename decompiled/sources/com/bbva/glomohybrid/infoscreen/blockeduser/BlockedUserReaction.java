package com.bbva.glomohybrid.infoscreen.blockeduser;

import android.app.Activity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.component.ui.toolbar.ToolbarViewModel;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import com.bbva.glomohybrid.infoscreen.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BlockedUserReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/blockeduser/BlockedUserReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBlockedUserReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockedUserReaction.kt\ncom/bbva/glomohybrid/infoscreen/blockeduser/BlockedUserReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,67:1\n25#2,8:68\n*S KotlinDebug\n*F\n+ 1 BlockedUserReaction.kt\ncom/bbva/glomohybrid/infoscreen/blockeduser/BlockedUserReaction\n*L\n63#1:68,8\n*E\n"})
public final class BlockedUserReaction extends BaseReaction {

    @NotNull
    public final Lazy H0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: compiled from: BlockedUserReaction.kt */
    public static final class a extends Lambda implements Function0<BlockedUserCountryReaction> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BlockedUserCountryReaction invoke() {
            BlockedUserReaction blockedUserReaction = BlockedUserReaction.this;
            Activity activity = ((GlobalReaction) blockedUserReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s-1489130752(...)");
            return new BlockedUserCountryReaction(blockedUserReaction, activity);
        }
    }

    public static void e(ReactorCoreBuilder.ReactionBuilder reactionBuilder) {
        Intrinsics.checkNotNullExpressionValue(reactionBuilder.inside("blocked-user", Activity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.infoscreen.blockeduser.BlockedUserReaction$finish$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((Activity) p4).finish();
            }
        }), "doReaction(...)");
    }

    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addComponent(new InfoScreenComponent(null, 1, null));
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = writeOn(CellsChannels.INSTANCE.getChangeUserChannel()).when("blocked-user");
        InfoScreenActivity.Companion companion = InfoScreenActivity.INSTANCE;
        writableActionBuilderWhen.doAction(companion.getACTION_NEGATIVE_BUTTON());
        ((PageReactionDelegator) this.H0.getValue()).configure();
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = whenever("blocked-user").doAction(companion.getACTION_NEGATIVE_BUTTON()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        e(reactionBuilderThen);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = whenever("blocked-user").doAction(companion.getACTION_BACK_BUTTON()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        e(reactionBuilderThen2);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = whenever(R.id.errorScreenToolbar).doAction(ToolbarViewModel.INSTANCE.getACTION_MENU_BUTTON_CLICK()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        e(reactionBuilderThen3);
    }
}
