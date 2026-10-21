package com.bbva.slidemenuview.cells.reactions;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.bbva.ui.component.menu.model.MenuItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuReactions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/slidemenuview/cells/reactions/MenuReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "", "menuViewModelId", "", "menuDelegateId", "", "fromWeb", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;ILjava/lang/String;Z)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuReactions.kt\ncom/bbva/slidemenuview/cells/reactions/MenuReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,72:1\n25#2,8:73\n25#2,8:81\n25#2,8:89\n50#2,8:97\n*S KotlinDebug\n*F\n+ 1 MenuReactions.kt\ncom/bbva/slidemenuview/cells/reactions/MenuReactions\n*L\n47#1:73,8\n58#1:81,8\n63#1:89,8\n68#1:97,8\n*E\n"})
public class MenuReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f36668p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f36669q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f36670r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f36671s0;

    public MenuReactions(@NotNull BaseReaction baseReaction, int i10, @NotNull String menuDelegateId, boolean z10) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(menuDelegateId, "menuDelegateId");
        this.f36668p0 = baseReaction;
        this.f36669q0 = i10;
        this.f36670r0 = menuDelegateId;
        this.f36671s0 = z10;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.f36668p0;
        int i10 = this.f36669q0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.whenever(i10).doAction(SlideMenuViewModel.ACTION_ITEM_CLICK).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(i10, SlideMenuViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.slidemenuview.cells.reactions.MenuReactions$closeMenu$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                SlideMenuViewModel.toggle$default((SlideMenuViewModel) p4, false, false, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        String str = this.f36670r0;
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd.inside(str, MenuDelegate.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.slidemenuview.cells.reactions.MenuReactions$onStoreItemClicked$$inlined$reactIn$default$1
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, MenuItem menuItem) {
                Intrinsics.checkNotNull(p4);
                MenuItem menuItem2 = menuItem;
                ((MenuDelegate) p4).onStoreItemClicked(new MenuClickAction(menuItem2.getId(), menuItem2.getRoute(), MenuItemAction.INSTANCE.from(menuItem2.getClickAction()), this.f36672p0.f36671s0));
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.whenever(i10).doAction(SlideMenuViewModel.ACTION_CLOSED_MENU).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside(str, MenuDelegate.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.slidemenuview.cells.reactions.MenuReactions$onMenuItemClicked$$inlined$reactIn$default$1
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((MenuDelegate) p4).onItemClicked();
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.whenever(i10).doAction(SlideMenuViewModel.ACTION_HEADER_CLICK).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3.inside(i10, SlideMenuViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.slidemenuview.cells.reactions.MenuReactions$closeMenu$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                SlideMenuViewModel.toggle$default((SlideMenuViewModel) p4, false, false, 2, null);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = baseReaction.whenever(MenuDataManager.ID).doAction(MenuDataManager.INSTANCE.getACTION_REFRESH_ITEM()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4.inside(str, MenuDelegate.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.slidemenuview.cells.reactions.MenuReactions$updateMenuItem$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Pair<? extends Integer, ? extends Boolean> pair) {
                Intrinsics.checkNotNull(p4);
                ((MenuDelegate) p4).updateFeaturedItem(pair);
            }
        }), "doReaction(...)");
    }
}
