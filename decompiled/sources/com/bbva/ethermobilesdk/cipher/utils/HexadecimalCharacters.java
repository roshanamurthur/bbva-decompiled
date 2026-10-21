package com.bbva.ethermobilesdk.cipher.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncodingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/utils/HexadecimalCharacters;", "", "", "chars", "[C", "getChars", "()[C", "UPPERCASE", "LOWERCASE", "cipher_release"}, k = 1, mv = {1, 8, 0})
public enum HexadecimalCharacters {
    UPPERCASE(0),
    LOWERCASE(1);


    @NotNull
    private final char[] chars;

    HexadecimalCharacters(int i10) {
        this.chars = cArr;
    }

    @NotNull
    public final char[] getChars() {
        return this.chars;
    }
}
