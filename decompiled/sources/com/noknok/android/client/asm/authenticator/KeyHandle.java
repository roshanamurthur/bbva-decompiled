package com.noknok.android.client.asm.authenticator;

import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.asmcore.TLVCommandEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class KeyHandle {
    private static final int KEY_CONTAINER_VERSION = 1;
    private static final short MAX_ENROLLID_LENGTH = 32;
    private static final String TAG = "KeyHandle";
    private static final short TAG_KEYHANDLE_ACCESS_TOKEN = 25153;
    private static final short TAG_KEYHANDLE_ENROLL_ID = 25155;
    private static final short TAG_KEYHANDLE_UAUTH = 25154;
    private static final short TAG_KEYHANDLE_USERNAME = 25156;
    private static final short TAG_KEYHANDLE_VERSION = 25152;
    public byte[] mAuthenticatorInput;
    public final boolean mIsSecondFactor;
    public byte[] mKhAccessToken;
    public byte[] mUAuthPriv;
    public byte[] mUsername;
    public Integer mVersionOfKeyContainer;

    public KeyHandle(byte[] bArr, byte[] bArr2, boolean z10, byte[] bArr3, byte[] bArr4, Integer num) {
        this.mVersionOfKeyContainer = 1;
        this.mKhAccessToken = bArr;
        this.mUAuthPriv = bArr2;
        this.mIsSecondFactor = z10;
        this.mUsername = bArr3;
        this.mAuthenticatorInput = bArr4;
        if (num != null) {
            this.mVersionOfKeyContainer = num;
        }
    }

    public static KeyHandle decodeKeyHandle(byte[] bArr) {
        KeyHandle keyHandle = new KeyHandle(null, null, false, null, null, 1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferWrap.hasRemaining()) {
            TLVCommandEncoder.TagLength tagAndLength = TLVCommandEncoder.readTagAndLength(byteBufferWrap);
            int i10 = tagAndLength.length;
            if (i10 < 0) {
                throw new AsmException(Outcome.PROTOCOL_ERROR, "Invalid TLV structure in KeyHandle");
            }
            switch (tagAndLength.tag) {
                case 25152:
                    keyHandle.mVersionOfKeyContainer = Integer.valueOf(byteBufferWrap.getInt());
                    break;
                case 25153:
                    byte[] bArr2 = new byte[i10];
                    keyHandle.mKhAccessToken = bArr2;
                    byteBufferWrap.get(bArr2);
                    break;
                case 25154:
                    byte[] bArr3 = new byte[i10 - 1];
                    keyHandle.mUAuthPriv = bArr3;
                    byteBufferWrap.get(bArr3);
                    byteBufferWrap.get();
                    break;
                case 25155:
                    byte[] bArr4 = new byte[i10];
                    keyHandle.mAuthenticatorInput = bArr4;
                    byteBufferWrap.get(bArr4);
                    break;
                case 25156:
                    byte[] bArr5 = new byte[i10];
                    keyHandle.mUsername = bArr5;
                    byteBufferWrap.get(bArr5);
                    break;
                default:
                    throw new AsmException(Outcome.PROTOCOL_ERROR, "Unknown tag in KeyHandle");
            }
        }
        return keyHandle;
    }

    public byte[] encodeKeyHandle() {
        try {
            TLVCommandEncoder.TlvStream tlvStream = new TLVCommandEncoder.TlvStream(null);
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_KEYHANDLE_VERSION)).writeInt(this.mVersionOfKeyContainer.intValue()));
            if (this.mKhAccessToken != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_KEYHANDLE_ACCESS_TOKEN)).writeTlvBytes(this.mKhAccessToken));
            }
            if (this.mUAuthPriv != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_KEYHANDLE_UAUTH)).writeTlvBytes(this.mUAuthPriv));
            }
            if (this.mAuthenticatorInput == null) {
                this.mAuthenticatorInput = new byte[32];
            }
            tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_KEYHANDLE_ENROLL_ID)).writeTlvBytes(this.mAuthenticatorInput));
            if (this.mUsername != null) {
                tlvStream.writeTlv(new TLVCommandEncoder.TlvStream(Short.valueOf(TAG_KEYHANDLE_USERNAME)).writeTlvBytes(this.mUsername));
            }
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e(TAG, "Failed to encode KeyHandle structure.", e5);
            return null;
        }
    }
}
