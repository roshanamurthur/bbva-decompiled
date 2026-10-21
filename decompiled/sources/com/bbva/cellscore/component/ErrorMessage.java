package com.bbva.cellscore.component;

import androidx.annotation.RestrictTo;
import com.bbva.cellscore.pubsub.PubSubMessage;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ErrorMessage extends PubSubMessage<Throwable> {
    public ErrorMessage(String str, Throwable th2) {
        super(str, th2);
    }
}
