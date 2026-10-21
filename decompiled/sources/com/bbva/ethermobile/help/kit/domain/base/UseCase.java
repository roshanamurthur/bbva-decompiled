package com.bbva.ethermobile.help.kit.domain.base;

import kotlin.Metadata;

/* JADX INFO: compiled from: UseCase.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobile/help/kit/domain/base/UseCase;", "P", "R", "", "()V", "execute", "parameters", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "help-kit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class UseCase<P, R> {
    public abstract R execute(P parameters);

    public final R invoke(P parameters) {
        return execute(parameters);
    }
}
