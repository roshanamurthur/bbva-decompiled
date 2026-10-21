package com.bbva.sl.ar.android.secsdk.fido.model;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class Accepted {
    private List<String> aaid;

    public Accepted(List<String> list) {
        this.aaid = list;
    }

    public List<String> getAaid() {
        return this.aaid;
    }

    public void setAaid(List<String> list) {
        this.aaid = list;
    }

    public String toString() {
        return a.c(new StringBuilder("Accepted{aaid="), this.aaid, AbstractJsonLexerKt.END_OBJ);
    }
}
