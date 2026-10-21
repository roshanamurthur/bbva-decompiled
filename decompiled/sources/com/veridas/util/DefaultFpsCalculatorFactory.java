package com.veridas.util;

import android.os.SystemClock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultFpsCalculatorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/veridas/util/DefaultFpsCalculatorFactory;", "Lcom/veridas/util/FpsCalculatorFactory;", "()V", "create", "Lcom/veridas/util/FpsCalculator;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFpsCalculatorFactory implements FpsCalculatorFactory {
    @Override // com.veridas.util.FpsCalculatorFactory
    @NotNull
    public FpsCalculator create() {
        return new TemporalFpsCalculator(5, 2000L, new TimeProvider() { // from class: com.veridas.util.DefaultFpsCalculatorFactory.create.1
            @Override // com.veridas.util.TimeProvider
            public long getTimeInMillis() {
                return SystemClock.elapsedRealtime();
            }
        });
    }
}
