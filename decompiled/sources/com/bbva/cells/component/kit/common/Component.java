package com.bbva.cells.component.kit.common;

import com.bbva.cells.component.kit.featureflag.FlagState;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface Component extends Disposable {
    void featureFlag(String str, Consumer<FlagState> consumer);

    String getId();

    void setFeatureFlag(String str, FlagState flagState);

    void setProperties(Map<String, Object> map);

    <T> void setProperty(String str, T t10);
}
