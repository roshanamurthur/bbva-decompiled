package com.bbva.cells.pluginkit.command;

import com.bbva.cells.pluginkit.command.model.CommandResult;
import com.bbva.cells.pluginkit.command.model.Void;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Command.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/bbva/cells/pluginkit/command/VoidCommand;", "Lcom/bbva/cells/pluginkit/command/Command;", "Lcom/bbva/cells/pluginkit/command/model/Void;", "()V", "execute", "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "(Lcom/bbva/cells/pluginkit/command/model/Void;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class VoidCommand extends Command<Void> {
    public VoidCommand() {
        super(Void.INSTANCE, null, 2, null);
    }

    @Override // com.bbva.cells.pluginkit.command.Command
    public /* bridge */ /* synthetic */ Object execute(Void r1, Continuation continuation) {
        return execute2(r1, (Continuation<? super CommandResult>) continuation);
    }

    @Nullable
    public abstract Object execute(@NotNull Continuation<? super CommandResult> continuation);

    @Nullable
    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public Object execute2(@NotNull Void r1, @NotNull Continuation<? super CommandResult> continuation) {
        return execute(continuation);
    }
}
