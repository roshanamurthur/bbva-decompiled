package com.bbva.tohu.android.product.valkyria.sdk.payments;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;

/* JADX INFO: loaded from: classes6.dex */
public interface HceLogic {
    String getPanAsHex();

    void init(byte[] bArr, Token token, Bullet bullet, Context context) throws TohuSdkException;

    byte[] processApdu(byte[] bArr) throws TohuSdkException;

    byte[] responseApduOnDeactivate(int i10);
}
