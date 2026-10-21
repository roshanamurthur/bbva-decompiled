package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import androidx.databinding.e;
import androidx.exifinterface.media.ExifInterface;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.Record;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.TlvEditor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicTrackData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50895c;
    public static final byte[] EXPECTED_TRACK1_CVC3_BITMAP = McmLiteUtils.byteArrayFromHexString("0000000000F0");
    public static final byte[] EXPECTED_TRACK1_UN_ATC_BITMAP = McmLiteUtils.byteArrayFromHexString("000000000F0E");
    public static final byte[] EXPECTED_TRACK1_NO_ATC_DIGITS = McmLiteUtils.byteArrayFromHexString("04");
    public static final byte[] EXPECTED_TRACK2_CVC3_BITMAP = McmLiteUtils.byteArrayFromHexString("00F0");
    public static final byte[] EXPECTED_TRACK2_UN_ATC_BITMAP = McmLiteUtils.byteArrayFromHexString("0F0E");
    public static final byte[] EXPECTED_TRACK2_NO_ATC_DIGITS = McmLiteUtils.byteArrayFromHexString("04");

    public DynamicTrackData(ContactlessPaymentData contactlessPaymentData, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z10) throws McmLiteInvalidInput {
        byte[] recordValue;
        byte[] bytes;
        byte[] bytes2;
        this.f50895c = z10;
        if (contactlessPaymentData == null || contactlessPaymentData.getRecords() == null) {
            throw new ContactlessLogicException("Invalid profile information");
        }
        for (Record record : contactlessPaymentData.getRecords()) {
            if (record.getRecordNumber() == 1 && record.getSfi() == 1 && (recordValue = record.getRecordValue()) != null) {
                TlvEditor tlvEditorOf = TlvEditor.of(recordValue);
                if (tlvEditorOf == null) {
                    throw new McmLiteInvalidInput("Invalid profile data");
                }
                TlvEditor tlvEditorOf2 = TlvEditor.of(tlvEditorOf.getValue("70"));
                if (tlvEditorOf2 != null) {
                    byte[] value = tlvEditorOf2.getValue("9F62");
                    byte[] value2 = tlvEditorOf2.getValue("9F63");
                    byte[] value3 = tlvEditorOf2.getValue("9F64");
                    byte[] value4 = tlvEditorOf2.getValue("9F65");
                    byte[] value5 = tlvEditorOf2.getValue("9F66");
                    byte[] value6 = tlvEditorOf2.getValue("9F67");
                    if (Arrays.equals(value, EXPECTED_TRACK1_CVC3_BITMAP) && Arrays.equals(value2, EXPECTED_TRACK1_UN_ATC_BITMAP) && Arrays.equals(value3, EXPECTED_TRACK1_NO_ATC_DIGITS) && Arrays.equals(value4, EXPECTED_TRACK2_CVC3_BITMAP) && Arrays.equals(value5, EXPECTED_TRACK2_UN_ATC_BITMAP) && Arrays.equals(value6, EXPECTED_TRACK2_NO_ATC_DIGITS)) {
                        String str = "0" + a(bArr) + a(bArr2) + McmLiteUtils.byteArrayToHexString(bArr3).substring(5, 8) + (this.f50895c ? "8" : ExifInterface.GPS_MEASUREMENT_3D) + "F";
                        byte[] value7 = tlvEditorOf2.getValue("56");
                        byte[] value8 = tlvEditorOf2.getValue("9F6B");
                        if (value7 == null) {
                            bytes = new byte[0];
                        } else {
                            String str2 = new String(value7);
                            bytes = (str2.substring(0, str2.lastIndexOf("^") + 9) + str.substring(1, 13)).getBytes();
                        }
                        this.f50893a = bytes;
                        if (value8 == null) {
                            bytes2 = new byte[0];
                        } else {
                            String str3 = McmLiteUtils.byteArrayToHexString(value8).substring(0, McmLiteUtils.byteArrayToHexString(value8).indexOf(68) + 8) + str;
                            bytes2 = (str3.length() % 2 != 0 ? e.c(str3, 1, 0) : str3).getBytes();
                        }
                        this.f50894b = bytes2;
                        return;
                    }
                }
                throw new McmLiteInvalidInput("Data in profile does not match standard MCBP 1.0 bitmaps");
            }
        }
        throw new McmLiteInvalidInput("Unable to retrieve Record 1 1 for transaction id");
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return "0000";
        }
        String str = "0000" + Long.valueOf(McmLiteUtils.byteArrayToHexString(bArr), 16).toString();
        return str.substring(str.length() - 4);
    }

    public byte[] getDynamicTrack1() {
        return this.f50893a;
    }

    public byte[] getDynamicTrack2() {
        return this.f50894b;
    }
}
