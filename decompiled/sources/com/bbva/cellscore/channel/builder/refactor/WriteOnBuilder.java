package com.bbva.cellscore.channel.builder.refactor;

import androidx.annotation.IdRes;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.model.Action;

/* JADX INFO: loaded from: classes2.dex */
public interface WriteOnBuilder<T> {

    public interface WritableActionBuilder<T> {
        Action<T> doAction(ActionSpec<T> actionSpec);
    }

    WritableActionBuilder<T> when(@IdRes int i10);

    WritableActionBuilder<T> when(String str);

    WritableActionBuilder<T> whenever(@IdRes int i10);

    WritableActionBuilder<T> whenever(String str);
}
