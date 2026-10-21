package com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Tlv;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PosCardholderInteractionInformation {
    public static final int POSCII_LENGTH = 3;
    public static final byte[] POSCII_TAG = {-33, 75};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50812a = new byte[3];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50813a;

        static {
            int[] iArr = new int[Reason.values().length];
            f50813a = iArr;
            try {
                iArr[Reason.CONTEXT_NOT_MATCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50813a[Reason.MISSING_CD_CVM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50813a[Reason.INSUFFICIENT_CD_CVM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50813a[Reason.CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50813a[Reason.MISSING_CONSENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static PosCardholderInteractionInformation a(List list, boolean z10) {
        PosCardholderInteractionInformation posCardholderInteractionInformation = new PosCardholderInteractionInformation();
        byte[] bArr = posCardholderInteractionInformation.f50812a;
        if (z10 && !McmLiteUtils.isLackOfCdCvmIndicatedIn(list)) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (list.contains(Reason.CONTEXT_NOT_MATCHING)) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (list.contains(Reason.MISSING_CONSENT)) {
            bArr[1] = (byte) (bArr[1] | 2);
        }
        return posCardholderInteractionInformation;
    }

    public static PosCardholderInteractionInformation b(List<Reason> list) {
        PosCardholderInteractionInformation posCardholderInteractionInformation = new PosCardholderInteractionInformation();
        Iterator<Reason> it = list.iterator();
        while (it.hasNext()) {
            int i10 = a.f50813a[it.next().ordinal()];
            byte[] bArr = posCardholderInteractionInformation.f50812a;
            if (i10 == 1) {
                bArr[1] = (byte) (bArr[1] | 8);
            } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                bArr[1] = (byte) (bArr[1] | 1);
            } else if (i10 == 5) {
                bArr[1] = (byte) (bArr[1] | 2);
            }
        }
        return posCardholderInteractionInformation;
    }

    public static PosCardholderInteractionInformation forAbortMagstripe(boolean z10, List<Reason> list) {
        PosCardholderInteractionInformation posCardholderInteractionInformationB = b(list);
        if (z10 && !McmLiteUtils.isLackOfCdCvmIndicatedIn(list)) {
            byte[] bArr = posCardholderInteractionInformationB.f50812a;
            bArr[1] = (byte) (bArr[1] | 16);
        }
        return posCardholderInteractionInformationB;
    }

    public static PosCardholderInteractionInformation forAbortMchip(List<Reason> list) {
        return b(list);
    }

    public static PosCardholderInteractionInformation forApproveMagstripe(boolean z10, List<Reason> list) {
        PosCardholderInteractionInformation posCardholderInteractionInformationB = b(list);
        if (z10 && !McmLiteUtils.isLackOfCdCvmIndicatedIn(list)) {
            byte[] bArr = posCardholderInteractionInformationB.f50812a;
            bArr[1] = (byte) (bArr[1] | 16);
        }
        return posCardholderInteractionInformationB;
    }

    public static PosCardholderInteractionInformation forApproveMchip() {
        return null;
    }

    public static PosCardholderInteractionInformation forAuthenticateMchip() {
        return new PosCardholderInteractionInformation();
    }

    public static PosCardholderInteractionInformation forDeclineMagstripe(boolean z10, List<Reason> list) {
        return a(list, z10);
    }

    public static PosCardholderInteractionInformation forDeclineMchip() {
        return new PosCardholderInteractionInformation();
    }

    public static PosCardholderInteractionInformation forErrorMagstripe(boolean z10, List<Reason> list) {
        return a(list, z10);
    }

    public static PosCardholderInteractionInformation forErrorMchip(List<Reason> list) {
        return b(list);
    }

    public final byte[] getTlv() {
        return Tlv.create(POSCII_TAG, this.f50812a);
    }
}
