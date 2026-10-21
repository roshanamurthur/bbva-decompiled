package com.noknok.android.client.asm.authenticator;

import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.asmcore.TLVCommandEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class UVTHelper {
    private static final short AFI_UVI_RAW_USER_VERIFICATION_INDEX = 259;
    private static final short AFI_UVS_RAW_USER_VERIFICATION_STATE = 261;
    private static final String TAG = "UVTHelper";
    private static final short TAG_UVT_AUTHNR_NAME = 25093;
    private static final short TAG_UVT_FINAL_CHALLENGE = 25098;
    private static final short TAG_UVT_MATCHER_VERSION = 25096;
    private static final short TAG_UVT_MATCHING_SCORE = 25100;
    private static final short TAG_UVT_RESULT = 25094;
    private static final short TAG_UVT_TIMESTAMP = 25099;
    private static final short TAG_UVT_USER_ID = 25095;
    private static final short TAG_UVT_USER_VERIFICATION_METHOD = 25097;
    private static final short USER_ID_LENGTH = 32;
    private static final int UVT_LIFETIME = 300;
    private String mAaid;
    private byte[] mFinalChallenge;
    private byte[] mUserID = null;
    private byte[] mRawUVI = null;
    private byte[] mRawUVS = null;
    private byte[] mResult = null;
    private byte[] mMatchingScore = null;
    private int mUserVerificationMethod = 0;
    private byte mMatcherVersion = 0;
    private int mTimestamp = 0;

    public UVTHelper(String str, byte[] bArr) {
        this.mAaid = str;
        this.mFinalChallenge = bArr;
    }

    public static UVTHelper decodeUvt(byte[] bArr) {
        UVTHelper uVTHelper = new UVTHelper(null, null);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferWrap.hasRemaining()) {
            TLVCommandEncoder.TagLength tagAndLength = TLVCommandEncoder.readTagAndLength(byteBufferWrap);
            int i10 = tagAndLength.length;
            if (i10 < 0) {
                throw new AsmException(Outcome.PROTOCOL_ERROR, "Invalid TLV structure in UVT");
            }
            short s4 = tagAndLength.tag;
            if (s4 == 259) {
                byte[] bArr2 = new byte[i10];
                uVTHelper.mRawUVI = bArr2;
                byteBufferWrap.get(bArr2);
            } else if (s4 != 261) {
                switch (s4) {
                    case 25093:
                        byte[] bArr3 = new byte[i10];
                        byteBufferWrap.get(bArr3);
                        uVTHelper.mAaid = new String(bArr3, Charsets.utf8Charset);
                        break;
                    case 25094:
                        byte[] bArr4 = new byte[i10];
                        uVTHelper.mResult = bArr4;
                        byteBufferWrap.get(bArr4);
                        break;
                    case 25095:
                        byte[] bArr5 = new byte[i10];
                        uVTHelper.mUserID = bArr5;
                        byteBufferWrap.get(bArr5);
                        break;
                    case 25096:
                        uVTHelper.mMatcherVersion = byteBufferWrap.get();
                        break;
                    case 25097:
                        uVTHelper.mUserVerificationMethod = byteBufferWrap.getInt();
                        break;
                    case 25098:
                        byte[] bArr6 = new byte[i10];
                        uVTHelper.mFinalChallenge = bArr6;
                        byteBufferWrap.get(bArr6);
                        break;
                    case 25099:
                        uVTHelper.mTimestamp = byteBufferWrap.getInt();
                        break;
                    case 25100:
                        byte[] bArr7 = new byte[i10];
                        uVTHelper.mMatchingScore = bArr7;
                        byteBufferWrap.get(bArr7);
                        break;
                    default:
                        throw new AsmException(Outcome.PROTOCOL_ERROR, "Unknown tag in UVT structure");
                }
            } else {
                byte[] bArr8 = new byte[i10];
                uVTHelper.mRawUVS = bArr8;
                byteBufferWrap.get(bArr8);
            }
        }
        return uVTHelper;
    }

    public static UVTHelper verifyUVT(byte[] bArr) {
        UVTHelper uVTHelperDecodeUvt = decodeUvt(bArr);
        if (uVTHelperDecodeUvt.mAaid == null) {
            throw new AsmException(Outcome.ACCESS_DENIED, "Missing AAID in UVT");
        }
        if (uVTHelperDecodeUvt.mFinalChallenge == null) {
            throw new AsmException(Outcome.ACCESS_DENIED, "Missing Final challange in UVT");
        }
        if (((int) (System.currentTimeMillis() / 1000)) - uVTHelperDecodeUvt.mTimestamp > 300) {
            throw new AsmException(Outcome.ACCESS_DENIED, "UVT Timestamp validation Failed");
        }
        byte[] bArr2 = uVTHelperDecodeUvt.mUserID;
        if (bArr2 == null || bArr2.length == 32) {
            return uVTHelperDecodeUvt;
        }
        throw new AsmException(Outcome.ACCESS_DENIED, "Invalid userID length");
    }

    public byte[] createUVT() {
        try {
            TLVCommandEncoder.TlvStream tlvStream = new TLVCommandEncoder.TlvStream(null);
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_AUTHNR_NAME)).writeTlvBytes(this.mAaid.getBytes(Charsets.utf8Charset)));
            if (this.mUserID != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_USER_ID)).writeTlvBytes(this.mUserID));
            }
            if (this.mFinalChallenge != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_FINAL_CHALLENGE)).writeTlvBytes(this.mFinalChallenge));
            }
            if (this.mRawUVI != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream((short) 259).writeTlvBytes(this.mRawUVI));
            }
            if (this.mRawUVS != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(AFI_UVS_RAW_USER_VERIFICATION_STATE)).writeTlvBytes(this.mRawUVS));
            }
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_TIMESTAMP)).writeInt((int) (Calendar.getInstance().getTimeInMillis() / 1000)));
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_USER_VERIFICATION_METHOD)).writeInt(this.mUserVerificationMethod));
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_UVT_MATCHER_VERSION)).writeByte(this.mMatcherVersion));
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e(TAG, "Failed to encode User Verification Token structure.", e5);
            return null;
        }
    }

    public byte[] getUserID() {
        return this.mUserID;
    }

    public UVTHelper setMatcherVersion(byte b10) {
        this.mMatcherVersion = b10;
        return this;
    }

    public UVTHelper setUVI(byte[] bArr) {
        this.mRawUVI = bArr;
        return this;
    }

    public UVTHelper setUVS(byte[] bArr) {
        this.mRawUVS = bArr;
        return this;
    }

    public UVTHelper setUserID(byte[] bArr) {
        this.mUserID = bArr;
        return this;
    }

    public UVTHelper setUserVerificationMethod(int i10) {
        this.mUserVerificationMethod = i10;
        return this;
    }
}
