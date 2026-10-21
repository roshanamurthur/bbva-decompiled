package com.bbva.qr.view;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Configurable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/qr/view/Configurable;", "", "configureAttributes", "", "options", "", "", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Configurable {

    /* JADX INFO: compiled from: Configurable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void configureAttributes(@NotNull Configurable configurable, @NotNull Map<String, String> options) {
            Intrinsics.checkNotNullParameter(options, "options");
        }
    }

    void configureAttributes(@NotNull Map<String, String> options);
}
