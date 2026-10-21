package com.nimbusds.jose.jwk;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public enum KeyOperation {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");

    private final String identifier;

    KeyOperation(String str) {
        this.identifier = str;
    }

    public static Set<KeyOperation> parse(List<String> list) throws ParseException {
        KeyOperation keyOperation;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                KeyOperation[] keyOperationArrValues = values();
                int length = keyOperationArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        keyOperation = null;
                        break;
                    }
                    keyOperation = keyOperationArrValues[i10];
                    if (str.equals(keyOperation.identifier())) {
                        break;
                    }
                    i10++;
                }
                if (keyOperation == null) {
                    throw new ParseException("Invalid JWK operation: ".concat(str), 0);
                }
                linkedHashSet.add(keyOperation);
            }
        }
        return linkedHashSet;
    }

    public String identifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return identifier();
    }
}
