package com.bbva.glomo.semaas.span;

import com.bbva.qrcreatorplugin.command.GenerateCommand;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UUIDGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomo/semaas/span/DefaultUUIDGenerator;", "Lcom/bbva/glomo/semaas/span/UUIDGenerator;", "()V", GenerateCommand.ID, "", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultUUIDGenerator implements UUIDGenerator {
    @Override // com.bbva.glomo.semaas.span.UUIDGenerator
    @NotNull
    public String generate() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
