package com.bbva.sl.ar.android.secsdk.fido.model;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class Policy {
    private List<List<Accepted>> accepted;

    public Policy(List<List<Accepted>> list) {
        this.accepted = list;
    }

    public List<List<Accepted>> getAccepted() {
        return this.accepted;
    }

    public void setAccepted(List<List<Accepted>> list) {
        this.accepted = list;
    }

    public String toString() {
        return a.c(new StringBuilder("Policy{accepted="), this.accepted, AbstractJsonLexerKt.END_OBJ);
    }
}
