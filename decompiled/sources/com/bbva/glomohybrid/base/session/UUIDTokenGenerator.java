package com.bbva.glomohybrid.base.session;

import com.bbva.qrcreatorplugin.command.GenerateCommand;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TokenGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/session/UUIDTokenGenerator;", "Lcom/bbva/glomohybrid/base/session/TokenGenerator;", "()V", GenerateCommand.ID, "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UUIDTokenGenerator implements TokenGenerator {
    @Override // com.bbva.glomohybrid.base.session.TokenGenerator
    @NotNull
    public String generate() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
