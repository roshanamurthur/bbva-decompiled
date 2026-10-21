package com.bbva.plugin.localstorage.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.params.ClearParam;
import com.bbva.plugin.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.util.FunctionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClearCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/localstorage/command/ClearCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/localstorage/params/ClearParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClearCommand extends AbstractCommand<ClearParam> {

    @NotNull
    public static final String ID = "clear";

    /* JADX INFO: compiled from: ClearCommand.kt */
    public static final class a extends Lambda implements Function1<Storage, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClearParam f35768p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35769q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClearParam clearParam, CommandCallback commandCallback) {
            super(1);
            this.f35768p0 = clearParam;
            this.f35769q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Storage storage) {
            Boolean sync;
            Storage it = storage;
            Intrinsics.checkNotNullParameter(it, "it");
            ClearParam clearParam = this.f35768p0;
            it.clear((clearParam == null || (sync = clearParam.getSync()) == null) ? false : sync.booleanValue());
            this.f35769q0.sendEvent();
            return Unit.INSTANCE;
        }
    }

    public ClearCommand() {
        super(ClearParam.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable ClearParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FunctionKt.runClient(params != null ? params.getVolatile() : null, callback, new a(params, callback));
    }
}
