package com.nimbusds.jose;

import androidx.datastore.preferences.protobuf.q;
import java.security.Key;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class KeyTypeException extends KeyException {
    public KeyTypeException(Class<? extends Key> cls) {
        super(q.c("Invalid key: Must be an instance of ", cls));
    }

    public KeyTypeException(Class<? extends Key> cls, Class<?>... clsArr) {
        super("Invalid key: Must be an instance of " + cls + " and implement all of the following interfaces " + Arrays.toString(clsArr));
    }
}
