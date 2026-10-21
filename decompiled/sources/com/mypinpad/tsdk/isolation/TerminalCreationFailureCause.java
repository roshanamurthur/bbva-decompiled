package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalCreationFailureCause;", "Lcom/mypinpad/tsdk/i/setIndeterminateDrawable;"}, k = 1, mv = {1, 5, 1})
public final class TerminalCreationFailureCause extends setIndeterminateDrawable {
    public TerminalCreationFailureCause(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(5, (i10 & 1) != 0 ? null : str, null, 4, null);
    }

    public TerminalCreationFailureCause() {
        this(null, 1, null);
    }
}
