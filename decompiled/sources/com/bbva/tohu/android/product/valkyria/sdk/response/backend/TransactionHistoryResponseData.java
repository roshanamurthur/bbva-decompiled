package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionHistoryResponseData {
    private List<TransactionDetails> transactionsDetails;

    public List<TransactionDetails> getTransactionsDetails() {
        return this.transactionsDetails;
    }

    public void setTransactionsDetails(List<TransactionDetails> list) {
        this.transactionsDetails = list;
    }

    public String toString() {
        return a.c(new StringBuilder("TransactionHistoryResponseData{transactionsDetails="), this.transactionsDetails, AbstractJsonLexerKt.END_OBJ);
    }
}
