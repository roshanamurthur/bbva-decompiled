package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AdditionalCheckTable {
    private static final /* synthetic */ AdditionalCheckTable[] $VALUES;
    public static final AdditionalCheckTable INSTANCE;
    static final byte PROCESS_CHECK_TABLE_MASK = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result MATCH_FOUND;
        public static final Result MATCH_NOT_FOUND;
        public static final Result NOT_PERFORMED;

        static {
            Result result = new Result("MATCH_FOUND", 0);
            MATCH_FOUND = result;
            Result result2 = new Result("MATCH_NOT_FOUND", 1);
            MATCH_NOT_FOUND = result2;
            Result result3 = new Result("NOT_PERFORMED", 2);
            NOT_PERFORMED = result3;
            $VALUES = new Result[]{result, result2, result3};
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    static {
        AdditionalCheckTable additionalCheckTable = new AdditionalCheckTable("INSTANCE", 0);
        INSTANCE = additionalCheckTable;
        $VALUES = new AdditionalCheckTable[]{additionalCheckTable};
    }

    public AdditionalCheckTable() {
        throw null;
    }

    public static Result process(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if ((bArr2[5] & 3) == 0 && (bArr3[2] & 3) == 0) {
            return Result.NOT_PERFORMED;
        }
        int i10 = bArr4[0];
        int i11 = bArr4[1];
        int i12 = bArr4[2];
        if (i10 == 0 || (i10 + i11) - 1 > bArr.length || i12 * i11 > 15 || i11 == 0 || i12 < 2) {
            return Result.NOT_PERFORMED;
        }
        byte[] bArr5 = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr5[i13] = (byte) (bArr4[i13 + 3] & bArr[(i10 + i13) - 1]);
        }
        for (int i14 = 1; i14 < i12; i14++) {
            byte[] bArr6 = new byte[i11];
            System.arraycopy(bArr4, (i14 * i11) + 3, bArr6, 0, i11);
            if (Arrays.equals(bArr5, bArr6)) {
                return Result.MATCH_FOUND;
            }
        }
        return Result.MATCH_NOT_FOUND;
    }

    public static AdditionalCheckTable valueOf(String str) {
        return (AdditionalCheckTable) Enum.valueOf(AdditionalCheckTable.class, str);
    }

    public static AdditionalCheckTable[] values() {
        return (AdditionalCheckTable[]) $VALUES.clone();
    }
}
