package com.bbva.cellscore.component;

import androidx.annotation.RestrictTo;
import com.bbva.cellscore.pubsub.PubSubMessage;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class EmptyMessage extends PubSubMessage<Void> {
    public EmptyMessage(String str) {
        super(str, null);
    }
}
