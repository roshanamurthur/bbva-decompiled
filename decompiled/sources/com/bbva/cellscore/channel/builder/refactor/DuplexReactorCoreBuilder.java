package com.bbva.cellscore.channel.builder.refactor;

import androidx.annotation.AnimRes;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.navigation.Route;

/* JADX INFO: loaded from: classes2.dex */
public interface DuplexReactorCoreBuilder {

    public interface DuplexReactionBuilder<F, B> {
        <Component> DuplexReactionBuilder<F, B> doBackwardNavigation(Class<Component> cls, Reaction.NavigationExecution<Component, B> navigationExecution);

        <Component> DuplexReactionBuilder<F, B> doBackwardReaction(Class<Component> cls, Reaction.ReactionExecution<Component, B> reactionExecution);

        DuplexReactionBuilder<F, B> doBackwardWebNavigation(String str);

        DuplexReactionBuilder<F, B> doBackwardWebNavigation(String str, @AnimRes int i10, @AnimRes int i11);

        DuplexReactionBuilder<F, B> doBackwardWebNavigation(String str, Route route);

        <Component> DuplexReactionBuilder<F, B> doForwardReaction(Class<Component> cls, Reaction.ReactionExecution<Component, F> reactionExecution);
    }

    public interface PlainDuplexActionBuilder {
        <F, B> PlainDuplexActionThenBuilder<F, B> doActions(ActionSpec<F> actionSpec, ActionSpec<B> actionSpec2);
    }

    public interface PlainDuplexActionThenBuilder<F, B> {
        DuplexReactionBuilder<F, B> then();
    }

    public interface PlainDuplexChannelBuilder {
        PlainDuplexActionBuilder when(String str, String str2);
    }
}
