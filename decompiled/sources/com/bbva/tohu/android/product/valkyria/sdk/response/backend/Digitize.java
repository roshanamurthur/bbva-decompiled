package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class Digitize {
    private List<DigitizeCard> cards;

    public List<DigitizeCard> getCards() {
        return this.cards;
    }

    public void setCards(List<DigitizeCard> list) {
        this.cards = list;
    }

    public String toString() {
        return a.c(new StringBuilder("Digitize{cards="), this.cards, AbstractJsonLexerKt.END_OBJ);
    }
}
