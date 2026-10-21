package org.bouncycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.SecureRandom;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class DESExample {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PaddedBufferedBlockCipher f88665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferedInputStream f88666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedOutputStream f88667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88668e;

    public DESExample() {
        this.f88664a = true;
        this.f88665b = null;
        this.f88666c = null;
        this.f88667d = null;
        this.f88668e = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x00ef
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void main(java.lang.String[] r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.examples.DESExample.main(java.lang.String[]):void");
    }

    public DESExample(String str, String str2, String str3, boolean z10) {
        PrintStream printStream;
        StringBuilder sb2;
        SecureRandom secureRandom;
        SecureRandom secureRandom2 = null;
        this.f88665b = null;
        this.f88666c = null;
        this.f88667d = null;
        this.f88668e = null;
        this.f88664a = z10;
        try {
            this.f88666c = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println("Input file not found [" + str + Constant.BRACKET_CLOSE);
            System.exit(1);
        }
        try {
            this.f88667d = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println("Output file not created [" + str2 + Constant.BRACKET_CLOSE);
            System.exit(1);
        }
        if (z10) {
            try {
                secureRandom = new SecureRandom();
                try {
                    secureRandom.setSeed("www.bouncycastle.org".getBytes());
                } catch (Exception unused3) {
                    secureRandom2 = secureRandom;
                    try {
                        System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                        System.exit(1);
                        secureRandom = secureRandom2;
                    } catch (IOException unused4) {
                        printStream = System.err;
                        sb2 = new StringBuilder("Could not decryption create key file [");
                    }
                }
            } catch (Exception unused5) {
            }
            KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, 192);
            DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
            dESedeKeyGenerator.init(keyGenerationParameters);
            byte[] bArrGenerateKey = dESedeKeyGenerator.generateKey();
            this.f88668e = bArrGenerateKey;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
            byte[] bArrEncode = Hex.encode(bArrGenerateKey);
            bufferedOutputStream.write(bArrEncode, 0, bArrEncode.length);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
            int iAvailable = bufferedInputStream.available();
            byte[] bArr = new byte[iAvailable];
            bufferedInputStream.read(bArr, 0, iAvailable);
            this.f88668e = Hex.decode(bArr);
            return;
        } catch (IOException unused6) {
            printStream = System.err;
            sb2 = new StringBuilder("Decryption key file not found, or not valid [");
        }
        sb2.append(str3);
        sb2.append(Constant.BRACKET_CLOSE);
        printStream.println(sb2.toString());
        System.exit(1);
    }
}
