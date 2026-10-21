package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSParameterSpec implements AlgorithmParameterSpec {
    public static final String SHA256 = "SHA256";
    public static final String SHA512 = "SHA512";
    public static final String SHAKE128 = "SHAKE128";
    public static final String SHAKE256 = "SHAKE256";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91574b;
    public static final XMSSParameterSpec SHA2_10_256 = new XMSSParameterSpec(10, "SHA256");
    public static final XMSSParameterSpec SHA2_16_256 = new XMSSParameterSpec(16, "SHA256");
    public static final XMSSParameterSpec SHA2_20_256 = new XMSSParameterSpec(20, "SHA256");
    public static final XMSSParameterSpec SHAKE_10_256 = new XMSSParameterSpec(10, "SHAKE128");
    public static final XMSSParameterSpec SHAKE_16_256 = new XMSSParameterSpec(16, "SHAKE128");
    public static final XMSSParameterSpec SHAKE_20_256 = new XMSSParameterSpec(20, "SHAKE128");
    public static final XMSSParameterSpec SHA2_10_512 = new XMSSParameterSpec(10, "SHA512");
    public static final XMSSParameterSpec SHA2_16_512 = new XMSSParameterSpec(16, "SHA512");
    public static final XMSSParameterSpec SHA2_20_512 = new XMSSParameterSpec(20, "SHA512");
    public static final XMSSParameterSpec SHAKE_10_512 = new XMSSParameterSpec(10, "SHAKE256");
    public static final XMSSParameterSpec SHAKE_16_512 = new XMSSParameterSpec(16, "SHAKE256");
    public static final XMSSParameterSpec SHAKE_20_512 = new XMSSParameterSpec(20, "SHAKE256");

    public XMSSParameterSpec(int i10, String str) {
        this.f91573a = i10;
        this.f91574b = str;
    }

    public int getHeight() {
        return this.f91573a;
    }

    public String getTreeDigest() {
        return this.f91574b;
    }
}
