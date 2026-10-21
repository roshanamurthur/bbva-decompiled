package com.veridas.detect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectConfigurationProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0002\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, d2 = {"Lcom/veridas/detect/ObjectConfigurationProvider;", "", "get", "Lcom/veridas/detect/DetectableObjectConfiguration;", "identifier", "", "Lcom/veridas/detect/ObjectConfigurationCollection;", "identifiers", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ObjectConfigurationProvider {
    @NotNull
    DetectableObjectConfiguration get();

    @NotNull
    DetectableObjectConfiguration get(@NotNull String identifier);

    @NotNull
    ObjectConfigurationCollection get(@NotNull List<String> identifiers);
}
