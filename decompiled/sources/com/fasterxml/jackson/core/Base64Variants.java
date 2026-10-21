package com.fasterxml.jackson.core;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;

/* JADX INFO: loaded from: classes9.dex */
public final class Base64Variants {
    public static final Base64Variant MIME;
    public static final Base64Variant MIME_NO_LINEFEEDS;
    public static final Base64Variant MODIFIED_FOR_URL;
    public static final Base64Variant PEM;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        MIME = base64Variant;
        MIME_NO_LINEFEEDS = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        PEM = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }

    public static Base64Variant valueOf(String str) throws IllegalArgumentException {
        Base64Variant base64Variant = MIME;
        if (base64Variant.f43032s0.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = MIME_NO_LINEFEEDS;
        if (base64Variant2.f43032s0.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = PEM;
        if (base64Variant3.f43032s0.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = MODIFIED_FOR_URL;
        if (base64Variant4.f43032s0.equals(str)) {
            return base64Variant4;
        }
        throw new IllegalArgumentException(f.d("No Base64Variant with name ", str == null ? "<null>" : h0.b("'", str, "'")));
    }
}
