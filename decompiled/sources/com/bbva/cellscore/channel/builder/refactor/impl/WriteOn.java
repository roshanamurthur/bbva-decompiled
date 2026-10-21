package com.bbva.cellscore.channel.builder.refactor.impl;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.container.ActionReactionContainer;
import com.bbva.cellscore.channel.model.Action;
import com.bbva.cellscore.channel.model.Channel;

/* JADX INFO: loaded from: classes2.dex */
public class WriteOn<T> implements WriteOnBuilder<T>, WriteOnBuilder.WritableActionBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Channel<T> f26945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionReactionContainer f26946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26947c;

    public WriteOn(Channel<T> channel, ActionReactionContainer actionReactionContainer) {
        this.f26945a = channel;
        this.f26946b = actionReactionContainer;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder.WritableActionBuilder
    public Action<T> doAction(ActionSpec<T> actionSpec) {
        Action<T> action = new Action<>(this.f26947c, actionSpec, this.f26945a);
        this.f26946b.addAction(action);
        return action;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder
    public WriteOnBuilder.WritableActionBuilder<T> when(String str) {
        this.f26947c = str;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder
    public WriteOnBuilder.WritableActionBuilder<T> whenever(String str) {
        this.f26947c = str;
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder
    public WriteOnBuilder.WritableActionBuilder<T> when(int i10) {
        this.f26947c = String.valueOf(i10);
        return this;
    }

    @Override // com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder
    public WriteOnBuilder.WritableActionBuilder<T> whenever(int i10) {
        this.f26947c = String.valueOf(i10);
        return this;
    }
}
