package com.bbva.glomohybrid.cellsweb.presentation.model;

import bk.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScreenState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toMap", "", "", "", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;", "CellsWeb_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScreenStateKt {
    @NotNull
    public static final Map<String, Boolean> toMap(@NotNull ScreenState screenState) {
        Intrinsics.checkNotNullParameter(screenState, "<this>");
        return p.mapOf(TuplesKt.to("isVisible", Boolean.valueOf(screenState.isVisible())));
    }
}
