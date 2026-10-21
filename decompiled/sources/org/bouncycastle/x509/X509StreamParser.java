package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParser;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes13.dex */
public class X509StreamParser implements StreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider f91723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X509StreamParserSpi f91724b;

    public static X509StreamParser getInstance(String str) throws NoSuchParserException {
        try {
            e.a aVarF = e.f("X509StreamParser", str);
            X509StreamParserSpi x509StreamParserSpi = (X509StreamParserSpi) aVarF.f91749a;
            X509StreamParser x509StreamParser = new X509StreamParser();
            x509StreamParser.f91723a = aVarF.f91750b;
            x509StreamParser.f91724b = x509StreamParserSpi;
            return x509StreamParser;
        } catch (NoSuchAlgorithmException e5) {
            throw new NoSuchParserException(e5.getMessage());
        }
    }

    public Provider getProvider() {
        return this.f91723a;
    }

    public void init(InputStream inputStream) {
        this.f91724b.engineInit(inputStream);
    }

    @Override // org.bouncycastle.x509.util.StreamParser
    public Object read() throws StreamParsingException {
        return this.f91724b.engineRead();
    }

    @Override // org.bouncycastle.x509.util.StreamParser
    public Collection readAll() throws StreamParsingException {
        return this.f91724b.engineReadAll();
    }

    public void init(byte[] bArr) {
        this.f91724b.engineInit(new ByteArrayInputStream(bArr));
    }

    public static X509StreamParser getInstance(String str, String str2) throws NoSuchParserException, NoSuchProviderException {
        return getInstance(str, e.h(str2));
    }

    public static X509StreamParser getInstance(String str, Provider provider) throws NoSuchParserException {
        try {
            e.a aVarG = e.g("X509StreamParser", str, provider);
            X509StreamParserSpi x509StreamParserSpi = (X509StreamParserSpi) aVarG.f91749a;
            X509StreamParser x509StreamParser = new X509StreamParser();
            x509StreamParser.f91723a = aVarG.f91750b;
            x509StreamParser.f91724b = x509StreamParserSpi;
            return x509StreamParser;
        } catch (NoSuchAlgorithmException e5) {
            throw new NoSuchParserException(e5.getMessage());
        }
    }
}
