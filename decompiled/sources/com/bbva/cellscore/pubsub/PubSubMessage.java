package com.bbva.cellscore.pubsub;

import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class PubSubMessage<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f27027b;

    public PubSubMessage(String str, T t10) {
        this.f27026a = str;
        this.f27027b = t10;
    }

    public String getChannelName() {
        return this.f27026a;
    }

    public T getPayload() {
        return this.f27027b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Channel: [");
        sb2.append(this.f27026a);
        sb2.append("] Payload: [");
        T t10 = this.f27027b;
        sb2.append(t10 != null ? t10.getClass() : AbstractJsonLexerKt.NULL);
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }
}
