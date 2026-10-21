package ak;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: classes12.dex */
public class h extends g {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateLeft(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> (8 - i11)) | (b10 << i11));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateRight(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> i11) | (b10 << (8 - i11)));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateLeft(short s4, int i10) {
        int i11 = i10 & 15;
        return (short) (((s4 & 65535) >>> (16 - i11)) | (s4 << i11));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateRight(short s4, int i10) {
        int i11 = i10 & 15;
        return (short) (((s4 & 65535) >>> i11) | (s4 << (16 - i11)));
    }
}
