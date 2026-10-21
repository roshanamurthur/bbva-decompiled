package com.bbva.cells.component.kit.properties;

import com.bbva.cells.component.kit.featureflag.FlagState;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface RxDynamicPropertyObserver {
    void featureFlag(String str, Consumer<FlagState> consumer);

    <T> void newProperty(String str, Consumer<T> consumer);
}
