package com.bbva.cells.pluginkit.provider;

import com.bbva.cells.pluginkit.command.Command;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommandFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012$\u0010\t\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007j\u0006\u0012\u0002\b\u0003`\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/CommandFactory;", "", "", "key", "Lcom/bbva/cells/pluginkit/command/Command;", "get", "", "Lkotlin/Function0;", "Lcom/bbva/cells/pluginkit/provider/CommandProvider;", "commands", "<init>", "(Ljava/util/Map;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class CommandFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Function0<Command<?>>> f26850a;

    /* JADX WARN: Multi-variable type inference failed */
    public CommandFactory(@NotNull Map<String, ? extends Function0<? extends Command<?>>> commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.f26850a = commands;
    }

    @Nullable
    public final Command<?> get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String lowerCase = key.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        Function0<Command<?>> function0 = this.f26850a.get(lowerCase);
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }
}
