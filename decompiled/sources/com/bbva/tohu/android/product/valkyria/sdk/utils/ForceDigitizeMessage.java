package com.bbva.tohu.android.product.valkyria.sdk.utils;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ForceDigitizeMessage {
    private List<String> listCardUniqueReference;

    public List<String> getListCardUniqueReference() {
        return this.listCardUniqueReference;
    }

    public void setListCardUniqueReference(List<String> list) {
        this.listCardUniqueReference = list;
    }

    public String toString() {
        return a.c(new StringBuilder("ForceDigitizeMessage{listCardUniqueReference="), this.listCardUniqueReference, AbstractJsonLexerKt.END_OBJ);
    }
}
