package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.SelectCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.SelectResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class Select {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f50861f = McmLiteUtils.byteArrayFromHexString("325041592E5359532E4444463031");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactlessPaymentData f50862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlternateContactlessPaymentData f50863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactlessContext f50864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f50866e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50867a;

        static {
            int[] iArr = new int[b.values().length];
            f50867a = iArr;
            try {
                iArr[b.PPSE_AID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50867a[b.PRIMARY_AID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50867a[b.ALTERNATE_AID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50867a[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALTERNATE_AID;
        public static final b PPSE_AID;
        public static final b PRIMARY_AID;
        public static final b UNKNOWN;

        static {
            b bVar = new b("PRIMARY_AID", 0);
            PRIMARY_AID = bVar;
            b bVar2 = new b("ALTERNATE_AID", 1);
            ALTERNATE_AID = bVar2;
            b bVar3 = new b("PPSE_AID", 2);
            PPSE_AID = bVar3;
            b bVar4 = new b("UNKNOWN", 3);
            UNKNOWN = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public Select(SelectCommandApdu selectCommandApdu, McmLiteProfile mcmLiteProfile, ContactlessContext contactlessContext) {
        b bVar;
        byte[] bArr;
        ContactlessPaymentData contactlessPaymentData = mcmLiteProfile.getContactlessPaymentData();
        this.f50862a = contactlessPaymentData;
        AlternateContactlessPaymentData alternateContactlessPaymentData = contactlessPaymentData.getAlternateContactlessPaymentData();
        this.f50863b = alternateContactlessPaymentData;
        this.f50864c = contactlessContext;
        byte[] aid = contactlessPaymentData.getAid();
        if (alternateContactlessPaymentData != null) {
            byte[] aid2 = alternateContactlessPaymentData.getAid();
            this.f50865d = aid2 != null ? aid2 : null;
        } else {
            this.f50865d = null;
        }
        byte[] fileName = selectCommandApdu.getFileName();
        if (fileName != null && (bArr = f50861f) != null && Arrays.equals(fileName, bArr)) {
            bVar = b.PPSE_AID;
        } else if (fileName == null || aid == null || !Arrays.equals(fileName, aid)) {
            byte[] bArr2 = this.f50865d;
            bVar = (fileName == null || bArr2 == null || !Arrays.equals(fileName, bArr2)) ? b.UNKNOWN : b.ALTERNATE_AID;
        } else {
            bVar = b.PRIMARY_AID;
        }
        this.f50866e = bVar;
    }

    public final byte[] a(byte[] bArr, List list) {
        SelectResponseApdu selectResponseApduOf = SelectResponseApdu.of(bArr, list);
        if (selectResponseApduOf == null || selectResponseApduOf.getPdolList() == null) {
            throw new ContactlessLogicException("Unable to build a valid SELECT R-APDU");
        }
        ContactlessContext contactlessContext = this.f50864c;
        contactlessContext.getTransactionContext().setPdolList(selectResponseApduOf.getPdolList());
        contactlessContext.setContactlessSelectedState();
        return selectResponseApduOf.getBytes();
    }

    public final byte[] response() {
        int i10 = a.f50867a[this.f50866e.ordinal()];
        ContactlessPaymentData contactlessPaymentData = this.f50862a;
        ContactlessContext contactlessContext = this.f50864c;
        if (i10 == 1) {
            contactlessContext.setContactlessNotSelectedState();
            try {
                return ResponseApduFactory.successfulProcessing(contactlessPaymentData.getPpseFci());
            } catch (McmLiteInvalidInput e5) {
                throw new ContactlessLogicException(e5.getMessage());
            }
        }
        if (i10 == 2) {
            List<DolRequestList.DolItem> additionalPdolList = contactlessContext.getAdditionalPdolList();
            contactlessContext.getTransactionContext().setAlternateAid(false);
            return a(contactlessPaymentData.getPaymentFci(), additionalPdolList);
        }
        if (i10 != 3) {
            contactlessContext.setContactlessNotSelectedState();
            return ResponseApduFactory.fileNotFound();
        }
        List<DolRequestList.DolItem> additionalPdolList2 = contactlessContext.getAdditionalPdolList();
        contactlessContext.getTransactionContext().setAlternateAid(true);
        return a(this.f50863b.getPaymentFci(), additionalPdolList2);
    }
}
