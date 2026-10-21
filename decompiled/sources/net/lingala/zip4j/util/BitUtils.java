package net.lingala.zip4j.util;

/* JADX INFO: loaded from: classes12.dex */
public class BitUtils {
    public static boolean isBitSet(byte b10, int i10) {
        return ((1 << i10) & ((long) b10)) != 0;
    }

    public static byte setBit(byte b10, int i10) {
        return (byte) (b10 | (1 << i10));
    }

    public static byte unsetBit(byte b10, int i10) {
        return (byte) (b10 & (~(1 << i10)));
    }
}
