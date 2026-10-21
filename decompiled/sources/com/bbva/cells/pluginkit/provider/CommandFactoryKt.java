package com.bbva.cells.pluginkit.provider;

import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.cells.pluginkit.command.Command;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommandFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001a(\u0012$\b\u0001\u0012 \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\u0006\u0012\u0002\b\u0003`\b0\u00040\u0003\" \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\u0006\u0012\u0002\b\u0003`\b0\u0004¢\u0006\u0002\u0010\t*(\u0010\n\u001a\u0004\b\u0000\u0010\u000b\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00070\u00062\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00070\u0006¨\u0006\f"}, d2 = {"factoryOf", "Lcom/bbva/cells/pluginkit/provider/CommandFactory;", "commands", "", "Lkotlin/Pair;", "", "Lkotlin/Function0;", "Lcom/bbva/cells/pluginkit/command/Command;", "Lcom/bbva/cells/pluginkit/provider/CommandProvider;", "([Lkotlin/Pair;)Lcom/bbva/cells/pluginkit/provider/CommandFactory;", "CommandProvider", ExifInterface.GPS_DIRECTION_TRUE, "pluginkit_release"}, k = 2, mv = {1, 4, 1})
public final class CommandFactoryKt {
    @NotNull
    public static final CommandFactory factoryOf(@NotNull Pair<String, ? extends Function0<? extends Command<?>>>... commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        ArrayList arrayList = new ArrayList(commands.length);
        for (Pair<String, ? extends Function0<? extends Command<?>>> pair : commands) {
            String first = pair.getFirst();
            if (first == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = first.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            arrayList.add(TuplesKt.to(lowerCase, pair.getSecond()));
        }
        return new CommandFactory(q.toMap(arrayList));
    }
}
