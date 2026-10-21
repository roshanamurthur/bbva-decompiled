package com.bbva.cellswidgets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsVisibility.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"toAndroidVisibility", "", "Lcom/bbva/cellswidgets/CellsVisibility;", "toCellsVisibility", "", "cells-widgets_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CellsVisibilityKt {

    /* JADX INFO: compiled from: CellsVisibility.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellsVisibility.values().length];
            try {
                iArr[CellsVisibility.INVISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellsVisibility.GONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toAndroidVisibility(@Nullable CellsVisibility cellsVisibility) {
        int i10 = cellsVisibility == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cellsVisibility.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 0 : 8;
        }
        return 4;
    }

    @NotNull
    public static final CellsVisibility toCellsVisibility(@Nullable String str) {
        if (Intrinsics.areEqual(str, "invisible")) {
            return CellsVisibility.INVISIBLE;
        }
        return Intrinsics.areEqual(str, "gone") ? CellsVisibility.GONE : CellsVisibility.VISIBLE;
    }
}
