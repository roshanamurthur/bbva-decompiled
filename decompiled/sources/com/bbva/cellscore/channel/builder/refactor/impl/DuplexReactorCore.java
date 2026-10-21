package com.bbva.cellscore.channel.builder.refactor.impl;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder;
import com.bbva.cellscore.channel.container.ActionReactionContainer;
import com.bbva.cellscore.channel.model.Action;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.glomohybrid.base.webview.WebActions;
import g4.a;
import z0.d;

/* JADX INFO: loaded from: classes2.dex */
public class DuplexReactorCore<T> implements DuplexReactorCoreBuilder.PlainDuplexChannelBuilder, DuplexReactorCoreBuilder.PlainDuplexActionBuilder, DuplexReactorCoreBuilder.PlainDuplexActionThenBuilder, DuplexReactorCoreBuilder.DuplexReactionBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Channel<T> f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Channel<T> f26930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionReactionContainer f26933e;

    public DuplexReactorCore(Channel<T> channel, Channel<T> channel2, ActionReactionContainer actionReactionContainer) {
        this.f26929a = channel;
        this.f26930b = channel2;
        this.f26933e = actionReactionContainer;
    }

    public final <C> void a(String str, Channel channel, boolean z10, boolean z11, Reaction.NavigationExecution<C, T> navigationExecution) {
        this.f26933e.addReaction(new Reaction.Builder().componentId(str).channel(channel).cleanChannel(z10).navigation(navigationExecution, z11).build());
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.PlainDuplexActionBuilder
    public <F, B> DuplexReactorCoreBuilder.PlainDuplexActionThenBuilder<F, B> doActions(ActionSpec<F> actionSpec, ActionSpec<B> actionSpec2) {
        Action action = new Action(this.f26931c, actionSpec, this.f26929a);
        ActionReactionContainer actionReactionContainer = this.f26933e;
        actionReactionContainer.addAction(action);
        actionReactionContainer.addAction(new Action(this.f26932d, actionSpec2, this.f26930b));
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doBackwardNavigation(Class cls, Reaction.NavigationExecution navigationExecution) {
        String str = this.f26931c;
        Channel<T> channel = this.f26930b;
        a(str, channel, channel.isAutoClean(), false, navigationExecution);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doBackwardReaction(Class cls, Reaction.ReactionExecution reactionExecution) {
        String str = this.f26931c;
        Channel<T> channel = this.f26930b;
        this.f26933e.addReaction(new Reaction.Builder().componentId(str).channel(channel).cleanChannel(channel.isAutoClean()).execution(reactionExecution).build());
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doBackwardWebNavigation(String str) {
        doBackwardWebNavigation(str, 0, 0);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doForwardReaction(Class cls, Reaction.ReactionExecution reactionExecution) {
        String str = this.f26932d;
        Channel<T> channel = this.f26929a;
        this.f26933e.addReaction(new Reaction.Builder().componentId(str).channel(channel).cleanChannel(channel.isAutoClean()).execution(reactionExecution).build());
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.PlainDuplexChannelBuilder
    public DuplexReactorCoreBuilder.PlainDuplexActionBuilder when(String str, String str2) {
        this.f26931c = str;
        this.f26932d = str2;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doBackwardWebNavigation(String str, int i10, int i11) {
        Channel<T> channel = this.f26930b;
        a(WebActions.ID, channel, channel.isAutoClean(), true, new d(new WebNavigation.Builder().route(str).nativeContainer(new Route.Builder().activity(WebViewActivity.class).animationIn(i10).animationOut(i11).build()).build()));
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.DuplexReactionBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder doBackwardWebNavigation(String str, Route route) {
        Channel<T> channel = this.f26930b;
        a(WebActions.ID, channel, channel.isAutoClean(), true, new a(str, route));
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.DuplexReactorCoreBuilder.PlainDuplexActionThenBuilder
    public DuplexReactorCoreBuilder.DuplexReactionBuilder then() {
        return this;
    }
}
