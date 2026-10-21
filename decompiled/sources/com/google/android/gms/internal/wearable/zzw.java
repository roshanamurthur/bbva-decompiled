package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzw {
    private static final int zzhn = 11;
    private static final int zzho = 12;
    private static final int zzhp = 16;
    private static final int zzhq = 26;
    private static final int[] zzhr = new int[0];
    public static final long[] zzhs = new long[0];
    public static final float[] zzht = new float[0];
    private static final double[] zzhu = new double[0];
    private static final boolean[] zzhv = new boolean[0];
    public static final String[] zzhw = new String[0];
    private static final byte[][] zzhx = new byte[0][];
    public static final byte[] zzhy = new byte[0];

    public static final int zzb(zzk zzkVar, int i10) throws IOException {
        int position = zzkVar.getPosition();
        zzkVar.zzd(i10);
        int i11 = 1;
        while (zzkVar.zzj() == i10) {
            zzkVar.zzd(i10);
            i11++;
        }
        zzkVar.zzc(position, i10);
        return i11;
    }
}
