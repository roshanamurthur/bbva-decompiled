package org.bouncycastle.pqc.crypto.qtesla;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class QTESLAKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91205c;

    public QTESLAKeyGenerationParameters(int i10, SecureRandom secureRandom) {
        super(secureRandom, -1);
        QTESLASecurityCategory.a(i10);
        this.f91205c = i10;
    }

    public int getSecurityCategory() {
        return this.f91205c;
    }
}
