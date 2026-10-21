package com.google.crypto.tink;

import androidx.camera.core.processing.f;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class KeyTemplates {
    public static KeyTemplate get(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        Logger logger = Registry.f46453a;
        synchronized (Registry.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(Registry.f46458f);
        }
        KeyTemplate keyTemplate = (KeyTemplate) mapUnmodifiableMap.get(str);
        if (keyTemplate != null) {
            return keyTemplate;
        }
        throw new GeneralSecurityException(f.d("cannot find key template: ", str));
    }
}
