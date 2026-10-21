package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory;

/* JADX INFO: loaded from: classes13.dex */
public class QTESLAParameterSpec implements AlgorithmParameterSpec {
    public static final String PROVABLY_SECURE_I = QTESLASecurityCategory.getName(5);
    public static final String PROVABLY_SECURE_III = QTESLASecurityCategory.getName(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91556a;

    public QTESLAParameterSpec(String str) {
        this.f91556a = str;
    }

    public String getSecurityCategory() {
        return this.f91556a;
    }
}
