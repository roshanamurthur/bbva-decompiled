package com.bbva.bridge.extensions;

import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.data.CellsMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeLinkExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"setPopAndPushOperationWhenNativeLogin", "Lcom/bbva/cellscore/web/data/CellsMessage;", "cells-bridge_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeLinkExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeLinkExtensions.kt\ncom/bbva/bridge/extensions/NativeLinkExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class NativeLinkExtensionsKt {
    @NotNull
    public static final CellsMessage setPopAndPushOperationWhenNativeLogin(@NotNull CellsMessage cellsMessage) {
        Intrinsics.checkNotNullParameter(cellsMessage, "<this>");
        CellsMessage cellsMessage2 = Intrinsics.areEqual(cellsMessage.route(), "nativeLogin") ? cellsMessage : null;
        if (cellsMessage2 == null) {
            return cellsMessage;
        }
        CellsMessage cellsMessageCreate = CellsMessage.create(NavigationOperations.POP_AND_PUSH, cellsMessage2.route(), cellsMessage2.params());
        Intrinsics.checkNotNullExpressionValue(cellsMessageCreate, "create(...)");
        return cellsMessageCreate;
    }
}
