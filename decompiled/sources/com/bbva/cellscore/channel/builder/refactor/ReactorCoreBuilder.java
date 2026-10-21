package com.bbva.cellscore.channel.builder.refactor;

import androidx.annotation.AnimRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.cellscore.web.navigation.Route;

/* JADX INFO: loaded from: classes2.dex */
public interface ReactorCoreBuilder {

    public interface AndReactionBuilder<T> {
        ReactionBuilder<T> and();
    }

    public interface PlainActionBuilder {
        <T> PlainThenActionBuilder<T> doAction(ActionSpec<T> actionSpec);
    }

    public interface PlainSimplexChannelBuilder {
        PlainActionBuilder when(String str);
    }

    public interface PlainThenActionBuilder<T> {
        ReactionBuilder<T> then();
    }

    public interface ReactionBuilder<T> {
        ReactionBuilder<T> delayWebNavigation(long j10);

        void doWebNavigation(WebNavigationDecision<T> webNavigationDecision);

        void doWebNavigation(WebNavigation webNavigation);

        void doWebNavigation(String str);

        void doWebNavigation(String str, @AnimRes int i10, @AnimRes int i11, @LayoutRes int i12);

        void doWebNavigation(String str, Route route);

        void doWebNavigationWithoutParams(WebNavigationDecision<T> webNavigationDecision);

        void doWebNavigationWithoutParams(String str, Route route);

        <Component> ReactionExecutionBuilder<Component, T> in(@IdRes int i10, Class<Component> cls);

        <Component> ReactionExecutionBuilder<Component, T> in(String str, Class<Component> cls);

        <Component> ReactionExecutionBuilder<Component, T> inside(@IdRes int i10, Class<Component> cls);

        <Component> ReactionExecutionBuilder<Component, T> inside(String str, Class<Component> cls);

        ReactionBuilder<T> onlyIf(Predicate<T> predicate);

        ReactionBuilder<T> withFlagEnabled(String str);

        ReactionBuilder<T> withPermissions(String... strArr);
    }

    public interface ReactionExecutionBuilder<C, T> {
        ReactionExecutionBuilder<C, T> delay(long j10);

        void doNavigation(Reaction.NavigationExecution<C, T> navigationExecution);

        void doNavigationAndCleanChannel(Reaction.NavigationExecution<C, T> navigationExecution);

        AndReactionBuilder<T> doReaction(Reaction.ReactionExecution<C, T> reactionExecution);

        void doReactionAndCleanChannel(Reaction.ReactionExecution<C, T> reactionExecution);

        ReactionExecutionBuilder<C, T> trace();

        ReactionExecutionBuilder<C, T> trace(Reaction.TracerMessageMapper tracerMessageMapper);
    }
}
