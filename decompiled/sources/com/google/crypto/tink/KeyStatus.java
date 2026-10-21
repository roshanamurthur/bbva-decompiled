package com.google.crypto.tink;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class KeyStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46411a;
    public static final KeyStatus ENABLED = new KeyStatus(PaymentStatus.ENABLED);
    public static final KeyStatus DISABLED = new KeyStatus("DISABLED");
    public static final KeyStatus DESTROYED = new KeyStatus("DESTROYED");

    public KeyStatus(String str) {
        this.f46411a = str;
    }

    public String toString() {
        return this.f46411a;
    }
}
