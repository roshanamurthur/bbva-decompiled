package com.bbva.slidemenuview.presentation.interceptor;

import com.bbva.slidemenuview.domain.model.MenuClickAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ClickInterceptor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/slidemenuview/presentation/interceptor/ClickInterceptor;", "", "interceptClick", "", "menuClickAction", "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ClickInterceptor {

    /* JADX INFO: compiled from: ClickInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void interceptClick(@NotNull ClickInterceptor clickInterceptor, @NotNull MenuClickAction menuClickAction) {
            Intrinsics.checkNotNullParameter(menuClickAction, "menuClickAction");
        }
    }

    void interceptClick(@NotNull MenuClickAction menuClickAction);
}
