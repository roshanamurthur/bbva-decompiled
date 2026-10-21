package com.bbva.glomohybrid.base.file.channels;

import bk.p;
import bk.q;
import com.bbva.glomoutils.Either;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;

/* JADX INFO: compiled from: FileInteractionChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Base_release"}, k = 2, mv = {1, 9, 0})
public final class FileInteractionChannelsKt {
    public static final Map access$toWebObject(Either either) {
        if (either instanceof Either.Right) {
            return p.mapOf(TuplesKt.to("success", Boolean.TRUE));
        }
        if (either instanceof Either.Left) {
            return q.mapOf(TuplesKt.to("success", Boolean.FALSE), TuplesKt.to("error", ((Either.Left) either).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
