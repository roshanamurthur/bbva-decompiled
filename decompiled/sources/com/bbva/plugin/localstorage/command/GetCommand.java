package com.bbva.plugin.localstorage.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.error.StorageErrors;
import com.bbva.plugin.localstorage.extension.StringKt;
import com.bbva.plugin.localstorage.params.GetParam;
import com.bbva.plugin.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.util.FunctionKt;
import com.bbva.plugin.localstorage.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/localstorage/command/GetCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/localstorage/params/GetParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCommand extends AbstractCommand<GetParam> {

    @NotNull
    public static final String ID = "get";

    /* JADX INFO: compiled from: GetCommand.kt */
    public static final class a extends Lambda implements Function1<Storage, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GetParam f35770p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35771q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetParam getParam, CommandCallback commandCallback) {
            super(1);
            this.f35770p0 = getParam;
            this.f35771q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Storage storage) {
            Unit unit;
            Storage it = storage;
            Intrinsics.checkNotNullParameter(it, "it");
            GetParam getParam = this.f35770p0;
            String key = getParam.getKey();
            Intrinsics.checkNotNull(key);
            Boolean secure = getParam.getSecure();
            Intrinsics.checkNotNull(secure);
            String str = it.get(key, secure.booleanValue());
            CommandCallback commandCallback = this.f35771q0;
            if (str != null) {
                StringKt.serialize(str, commandCallback);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                commandCallback.sendError(StorageErrors.ErrorKeyNotFound);
            }
            return Unit.INSTANCE;
        }
    }

    public GetCommand() {
        super(GetParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GetParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FunctionKt.runClient(params.getVolatile(), callback, new a(params, callback));
    }
}
