package com.bbva.cellscore.channel.builder.refactor.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.k;
import androidx.camera.core.m0;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WebNavigationDecision;
import com.bbva.cellscore.channel.container.ActionReactionContainer;
import com.bbva.cellscore.channel.model.Action;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.notifications.constants.PushConstants;
import g4.b;
import k.a;

/* JADX INFO: loaded from: classes2.dex */
public class ReactorCore<T> implements ReactorCoreBuilder.PlainSimplexChannelBuilder, ReactorCoreBuilder.PlainActionBuilder, ReactorCoreBuilder.PlainThenActionBuilder, ReactorCoreBuilder.ReactionBuilder, ReactorCoreBuilder.ReactionExecutionBuilder, ReactorCoreBuilder.AndReactionBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel<T> f26934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionReactionContainer f26935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f26938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Action<T> f26940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Reaction.TracerMessageMapper<T> f26941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Predicate<T> f26943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26944k;

    public ReactorCore(Channel<T> channel, ActionReactionContainer actionReactionContainer) {
        this.f26934a = channel;
        this.f26935b = actionReactionContainer;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [g4.b] */
    @NonNull
    public static b b(String str, Route route, final boolean z10) {
        final WebNavigation webNavigationBuild = new WebNavigation.Builder().route(str).nativeContainer(route).build();
        return new Reaction.NavigationExecution() { // from class: g4.b
            @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
            public final void execute(Activity activity, Object obj, Object obj2) {
                WebController webController = (WebController) obj;
                if (!z10) {
                    obj2 = null;
                }
                webController.openWeb(activity, webNavigationBuild, obj2);
            }
        };
    }

    public final <C> void a(String str, boolean z10, boolean z11, Reaction.ReactionExecution<C, T> reactionExecution, Reaction.NavigationExecution<C, T> navigationExecution) {
        this.f26935b.addReaction(new Reaction.Builder().componentId(str).channel(this.f26934a).delay(this.f26939f).permissionsNeeded(this.f26938e).cleanChannel(z10).action(this.f26940g).execution(reactionExecution).navigation(navigationExecution, z11).tracerMapper(this.f26941h).filter(this.f26943j).featureFlagFilter(this.f26944k).build());
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.AndReactionBuilder
    public ReactorCoreBuilder.ReactionBuilder and() {
        this.f26939f = 0L;
        this.f26938e = null;
        this.f26943j = null;
        this.f26942i++;
        if (this.f26940g != null) {
            Channel<T> channelCloneWithName = this.f26934a.cloneWithName(this.f26934a.getName() + PushConstants.GE_PARAMS_SEPARATOR + this.f26942i);
            this.f26934a = channelCloneWithName;
            Action<T> actionDuplicateWithChannel = this.f26940g.duplicateWithChannel(channelCloneWithName);
            this.f26940g = actionDuplicateWithChannel;
            this.f26935b.addAction(actionDuplicateWithChannel);
        }
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder delay(long j10) {
        this.f26939f = j10;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionBuilder delayWebNavigation(long j10) {
        this.f26939f = j10;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.PlainActionBuilder
    public ReactorCoreBuilder.PlainThenActionBuilder doAction(ActionSpec actionSpec) {
        Action<T> action = new Action<>(this.f26936c, actionSpec, this.f26934a);
        this.f26940g = action;
        this.f26935b.addAction(action);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public void doNavigation(Reaction.NavigationExecution navigationExecution) {
        a(this.f26937d, this.f26934a.isAutoClean(), false, null, navigationExecution);
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public void doNavigationAndCleanChannel(Reaction.NavigationExecution navigationExecution) {
        a(this.f26937d, true, false, null, navigationExecution);
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public ReactorCoreBuilder.AndReactionBuilder doReaction(Reaction.ReactionExecution reactionExecution) {
        a(this.f26937d, this.f26934a.isAutoClean(), false, reactionExecution, null);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public void doReactionAndCleanChannel(Reaction.ReactionExecution reactionExecution) {
        a(this.f26937d, true, false, reactionExecution, null);
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigation(String str) {
        a(WebActions.ID, true, true, null, b(str, null, true));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigationWithoutParams(String str, Route route) {
        a(WebActions.ID, true, true, null, b(str, route, false));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder in(String str, Class cls) {
        this.f26937d = str;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder inside(String str, Class cls) {
        return in(str, cls);
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionBuilder onlyIf(Predicate predicate) {
        this.f26943j = predicate;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder trace() {
        trace(new m0(2));
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.PlainSimplexChannelBuilder
    public ReactorCoreBuilder.PlainActionBuilder when(String str) {
        this.f26936c = str;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionBuilder withFlagEnabled(String str) {
        this.f26944k = str;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionBuilder withPermissions(String... strArr) {
        this.f26938e = strArr;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder in(int i10, Class cls) {
        this.f26937d = String.valueOf(i10);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder inside(int i10, Class cls) {
        return in(i10, cls);
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionExecutionBuilder
    public ReactorCoreBuilder.ReactionExecutionBuilder trace(Reaction.TracerMessageMapper tracerMessageMapper) {
        this.f26941h = tracerMessageMapper;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigation(WebNavigation webNavigation) {
        a(WebActions.ID, true, true, null, new k(webNavigation));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigationWithoutParams(WebNavigationDecision webNavigationDecision) {
        a(WebActions.ID, true, true, null, new a(webNavigationDecision));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigation(String str, Route route) {
        a(WebActions.ID, true, true, null, b(str, route, true));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigation(WebNavigationDecision webNavigationDecision) {
        a(WebActions.ID, true, true, null, new androidx.camera.core.impl.utils.futures.a(webNavigationDecision));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.ReactionBuilder
    public void doWebNavigation(String str, int i10, int i11, int i12) {
        a(WebActions.ID, true, true, null, b(str, new Route.Builder().activity(null).animationIn(i10).animationOut(i11).loadingLayout(i12).build(), true));
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder.PlainThenActionBuilder
    public ReactorCoreBuilder.ReactionBuilder then() {
        return this;
    }
}
