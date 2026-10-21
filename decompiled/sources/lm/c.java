package lm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f83225a = new ByteArrayOutputStream();

    public final void a(int i10) {
        ByteArrayOutputStream byteArrayOutputStream = this.f83225a;
        byteArrayOutputStream.write((i10 >>> 24) & 255);
        byteArrayOutputStream.write((i10 >>> 16) & 255);
        byteArrayOutputStream.write((i10 >>> 8) & 255);
        byteArrayOutputStream.write(i10 & 255);
    }

    public final void b(BigInteger bigInteger) {
        c(bigInteger.toByteArray());
    }

    public final void c(byte[] bArr) {
        a(bArr.length);
        try {
            this.f83225a.write(bArr);
        } catch (IOException e5) {
            throw new IllegalStateException(e5.getMessage(), e5);
        }
    }

    public final void d(String str) {
        c(Strings.toByteArray(str));
    }
}
