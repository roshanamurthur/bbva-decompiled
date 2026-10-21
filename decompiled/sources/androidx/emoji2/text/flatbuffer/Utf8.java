package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Utf8 f21389a;

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws IllegalArgumentException {
            if (!d(b11)) {
                if ((((b11 + com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants.CVR_B1b85_0111_VERIFIED_CLOUD) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void b(byte b10, byte b11, byte b12, char[] cArr, int i10) throws IllegalArgumentException {
            if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static void c(byte b10, byte b11, char[] cArr, int i10) throws IllegalArgumentException {
            if (b10 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (d(b11)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }

        public static boolean e(byte b10) {
            return b10 >= 0;
        }
    }

    public static Utf8 getDefault() {
        if (f21389a == null) {
            f21389a = new Utf8Safe();
        }
        return f21389a;
    }

    public static void setDefault(Utf8 utf8) {
        f21389a = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
