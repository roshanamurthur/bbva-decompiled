package com.bbva.ocrcard.command.params;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"generateScanParams", "Lcom/bbva/ocrcard/command/params/ScanParams;", "block", "Lkotlin/Function1;", "Lcom/bbva/ocrcard/command/params/ScanParamsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "ocrcard_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ScanParamsKt {
    @NotNull
    public static final ScanParams generateScanParams(@NotNull Function1<? super ScanParamsBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ScanParamsBuilder scanParamsBuilder = new ScanParamsBuilder();
        block.invoke(scanParamsBuilder);
        return scanParamsBuilder.build();
    }
}
