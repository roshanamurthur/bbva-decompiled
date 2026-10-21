package com.bbva.cellscore.channel.container;

import com.bbva.cellscore.channel.model.Action;
import com.bbva.cellscore.channel.model.Reaction;

/* JADX INFO: loaded from: classes2.dex */
public interface ActionReactionContainer {
    void addAction(Action action);

    void addReaction(Reaction reaction);
}
