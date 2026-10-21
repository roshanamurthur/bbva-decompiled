package com.bbva.cells.pluginkit.provider;

import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/Action;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "", FetchCommand.ID, "Lcom/bbva/cells/pluginkit/provider/ActionResult;", "provider", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "params", "(Lcom/bbva/cells/pluginkit/provider/PlatformProvider;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface Action<I, O> {
    @Nullable
    Object fetch(@NotNull PlatformProvider platformProvider, I i10, @NotNull Continuation<? super ActionResult<O>> continuation);
}
