package com.noknok.android.uaf.asmcore;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.DisplayPNGCharacteristicsDescriptor;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.asm.api.uaf.json.ProtocolTags;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.asm.authenticator.KsUafAuthenticatorKernel;
import com.noknok.android.client.asm.core.uaf.AuthenticatorCore;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.UShort;

/* JADX INFO: loaded from: classes11.dex */
public class TLVCommandEncoder {
    public static final int BASE64_ENCODING = 11;
    public static final short TAG_TC_TOKEN_CONTENT = 10486;
    public static final short TAG_TC_TOKEN_TYPE = 10485;

    public static class Commands {
        public static final short ADD_AUTHNR = 13320;
        public static final short DEREGISTER = 13316;
        public static final short GET_INFO = 13313;
        public static final short GET_REGISTRATIONS = 13321;
        public static final short REGISTER = 13314;
        public static final short SETTINGS = 13318;
        public static final short SIGN = 13315;
    }

    public static class TagLength {
        public final short length;
        public final short tag;

        public TagLength() {
            this.tag = (short) 0;
            this.length = (short) -1;
        }

        public short Length() {
            return this.length;
        }

        public short Tag() {
            return this.tag;
        }

        public TagLength(short s4, short s7) {
            this.tag = s4;
            this.length = s7;
        }
    }

    public static class TlvStream extends ByteArrayOutputStream {
        private final Short mType;

        public TlvStream(Short sh2) {
            this.mType = sh2;
        }

        @Override // java.io.ByteArrayOutputStream
        @NonNull
        public byte[] toByteArray() {
            if (this.mType == null) {
                return super.toByteArray();
            }
            short size = (short) (size() & 65535);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putShort(this.mType.shortValue());
            byteBufferAllocate.putShort(size);
            byteBufferAllocate.put(super.toByteArray());
            return byteBufferAllocate.array();
        }

        public TlvStream writeByte(byte b10) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
            byteBufferAllocate.put(b10);
            write(byteBufferAllocate.array());
            return this;
        }

        public TlvStream writeInt(int i10) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(i10);
            write(byteBufferAllocate.array());
            return this;
        }

        public TlvStream writeShort(short s4) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putShort(s4);
            write(byteBufferAllocate.array());
            return this;
        }

        public TlvStream writeString(String str) throws IOException {
            write(str.getBytes(Charsets.utf8Charset));
            return this;
        }

        public TlvStream writeTlv(TlvStream tlvStream) throws IOException {
            write(tlvStream.toByteArray());
            return this;
        }

        public TlvStream writeTlvBytes(byte[] bArr) throws IOException {
            if (bArr != null && bArr.length != 0) {
                write(bArr);
            }
            return this;
        }
    }

    public static byte[] a(AKProcessor.AKRequestParams aKRequestParams) {
        try {
            short s4 = aKRequestParams.cmd;
            if (s4 == 13320) {
                return b(aKRequestParams);
            }
            if (s4 == 13321) {
                return new TlvStream(Short.valueOf(Commands.GET_REGISTRATIONS)).writeTlv(new TlvStream((short) 10253).writeByte(aKRequestParams.authenticatorIndex)).toByteArray();
            }
            switch (s4) {
                case 13313:
                    return new TlvStream(Short.valueOf(Commands.GET_INFO)).toByteArray();
                case 13314:
                case 13315:
                case 13316:
                    return a(s4, aKRequestParams);
                default:
                    throw new AsmException(Outcome.FAILURE, "Not supported AK command");
            }
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode AK request", e5);
            throw new AsmException(Outcome.FAILURE, "Failed to encode AK request");
        }
    }

    private static byte[] b(AKProcessor.AKRequestParams aKRequestParams) throws IOException {
        TlvStream tlvStream = new TlvStream(Short.valueOf(Commands.ADD_AUTHNR));
        tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AAID)).writeTlvBytes(aKRequestParams.aaid)).writeTlv(new TlvStream((short) 10745).writeByte(aKRequestParams.matcherVersion));
        Iterator<byte[]> it = aKRequestParams.attestationCerts.iterator();
        while (it.hasNext()) {
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_ATTESTATION_CERT)).writeTlvBytes(it.next()));
        }
        return tlvStream.toByteArray();
    }

    public static byte[] createAuthSignData(AKProcessor.AKRequestParams aKRequestParams, KsUafAuthenticatorKernel.AkUafInfo akUafInfo, AKProcessor.AkConfig akConfig, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            TlvStream tlvStream = new TlvStream(Short.valueOf(ProtocolTags.TAG_UAFV1_SIGNED_DATA));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AAID)).writeTlvBytes(akUafInfo.aaid.getBytes(StandardCharsets.UTF_8)));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AUTHENTICATOR_INFO)).writeShort((short) 256).writeByte(bArr3 == null ? (byte) 1 : (byte) 2).writeShort(akUafInfo.authenticationAlgorithm));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AUTHENTICATOR_NONCE)).writeTlvBytes(bArr2));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_FINAL_CHALLENGE)).writeTlvBytes(aKRequestParams.finalChallenge));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_TRANSACTION_CONTENT)).writeTlvBytes(bArr3));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_KEYID)).writeTlvBytes(bArr));
            tlvStream.writeTlvBytes(bArr4);
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_COUNTERS)).writeInt(akConfig.signCounter));
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode auth Signrd Data structure.", e5);
            return null;
        }
    }

    public static byte[] createKrd(AKProcessor.AKRequestParams aKRequestParams, KsUafAuthenticatorKernel.AkUafInfo akUafInfo, AKProcessor.AkConfig akConfig, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            TlvStream tlvStream = new TlvStream(Short.valueOf(ProtocolTags.TAG_UAFV1_KRD));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AAID)).writeTlvBytes(akUafInfo.aaid.getBytes(StandardCharsets.UTF_8)));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AUTHENTICATOR_INFO)).writeShort((short) 256).writeByte((byte) 1).writeShort(akUafInfo.authenticationAlgorithm).writeShort(akUafInfo.pubKeyAlgAndEncoding));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_FINAL_CHALLENGE)).writeTlvBytes(aKRequestParams.finalChallenge));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_KEYID)).writeTlvBytes(bArr));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_COUNTERS)).writeInt(akConfig.regCounter).writeInt(akConfig.signCounter));
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_PUB_KEY)).writeTlvBytes(bArr2));
            tlvStream.writeTlvBytes(bArr3);
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode KRD structure.", e5);
            return null;
        }
    }

    public static String createRegAssertion(byte[] bArr, byte[] bArr2) {
        try {
            TlvStream tlvStream = new TlvStream(Short.valueOf(ProtocolTags.TAG_UAFV1_REG_ASSERTION));
            tlvStream.writeTlvBytes(bArr);
            tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_ATTESTATION_BASIC_SURROGATE)).writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_SIGNATURE)).writeTlvBytes(bArr2)));
            return Base64.encodeToString(tlvStream.toByteArray(), 11);
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode reg assertion structure.", e5);
            return null;
        }
    }

    public static String createSignAsertion(byte[] bArr, byte[] bArr2) {
        try {
            TlvStream tlvStream = new TlvStream(Short.valueOf(ProtocolTags.TAG_UAFV1_AUTH_ASSERTION));
            tlvStream.writeTlvBytes(bArr);
            tlvStream.writeTlvBytes(new TlvStream(Short.valueOf(ProtocolTags.TAG_SIGNATURE)).writeTlvBytes(bArr2).toByteArray());
            tlvStream.toByteArray();
            return Base64.encodeToString(tlvStream.toByteArray(), 11);
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode auth assertion structure.", e5);
            return null;
        }
    }

    public static byte[] createUvmExtensionTlv(KsUafAuthenticatorKernel.AkUafInfo akUafInfo) {
        try {
            TlvStream tlvStream = new TlvStream((short) 15890);
            tlvStream.writeTlv(new TlvStream((short) 11795).writeTlvBytes("fido.uaf.uvm".getBytes(StandardCharsets.UTF_8)));
            tlvStream.writeTlv(new TlvStream((short) 11796).writeInt((int) akUafInfo.userVerification).writeShort(akUafInfo.keyProtection).writeShort(akUafInfo.matcherProtection));
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode UVM extension structure.", e5);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AKProcessor.AKResponseParams decode(short s4, byte[] bArr) {
        AKProcessor.AKResponseParams aKResponseParams = new AKProcessor.AKResponseParams();
        aKResponseParams.statusCode = Outcome.FAILURE.getUafCmdStatusCode();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        TagLength tagAndLength = readTagAndLength(byteBufferWrap);
        if (s4 + 512 != tagAndLength.Tag()) {
            Logger.e("TLVCommandEncoder", String.format("Response tag %04X does not match command tag.", Integer.valueOf(tagAndLength.Tag() & UShort.MAX_VALUE)));
            return aKResponseParams;
        }
        if (tagAndLength.Length() != byteBufferWrap.remaining()) {
            Logger.e("TLVCommandEncoder", String.format("Response size (%s) does not match tlv length (%s).", Integer.valueOf(byteBufferWrap.remaining()), Short.valueOf(tagAndLength.Length())));
            return aKResponseParams;
        }
        try {
            short sA = a(byteBufferWrap);
            if (sA != Outcome.SUCCESS.getUafCmdStatusCode()) {
                Logger.e("TLVCommandEncoder", String.format("Error: status code = %s", Short.valueOf(sA)));
                aKResponseParams.statusCode = sA;
                return aKResponseParams;
            }
            if (s4 != 13320) {
                if (s4 == 13321) {
                    Logger.i("TLVCommandEncoder", "parseGetRegistrations");
                    GetRegistrationsOut.AppRegistration appRegistration = null;
                    boolean z10 = false;
                    while (byteBufferWrap.hasRemaining()) {
                        TagLength tagAndLength2 = readTagAndLength(byteBufferWrap);
                        if (tagAndLength2.Length() < 0) {
                            Logger.e("TLVCommandEncoder", "Invalid GETREGISTRATIONS_CMD_RESPONSE.");
                        } else {
                            short sTag = tagAndLength2.Tag();
                            if (sTag == 10244) {
                                if (appRegistration != null) {
                                    aKResponseParams.appRegistrations.add(appRegistration);
                                }
                                appRegistration = new GetRegistrationsOut.AppRegistration();
                                byte[] bArr2 = new byte[tagAndLength2.Length()];
                                byteBufferWrap.get(bArr2);
                                Logger.d("TLVCommandEncoder", String.format("appID from GetRegistrations cmd: %s", TypeConverter.byteArrayToHexString(bArr2)));
                                String str = new String(bArr2, Charsets.utf8Charset);
                                appRegistration.appID = str;
                                Logger.d("TLVCommandEncoder", String.format("appID from GetRegistrations cmd with utf8Charset: %s", str));
                                z10 = true;
                            } else if (sTag != 11785) {
                                Logger.w("TLVCommandEncoder", String.format("Unknown tag: %s", Short.valueOf(tagAndLength2.Tag())));
                                byteBufferWrap.position(tagAndLength2.Length() + byteBufferWrap.position());
                            } else if (z10) {
                                byte[] bArr3 = new byte[tagAndLength2.Length()];
                                byteBufferWrap.get(bArr3);
                                appRegistration.keyIDs.add(Base64.encodeToString(bArr3, 11));
                            } else {
                                Logger.w("TLVCommandEncoder", String.format("Invalid format, No AppID found: %s", Short.valueOf(tagAndLength2.Tag())));
                                aKResponseParams.statusCode = Outcome.FAILURE.getUafCmdStatusCode();
                            }
                        }
                        return aKResponseParams;
                    }
                    if (appRegistration != null) {
                        aKResponseParams.appRegistrations.add(appRegistration);
                    }
                    aKResponseParams.statusCode = sA;
                    return aKResponseParams;
                }
                switch (s4) {
                    case 13313:
                        while (byteBufferWrap.hasRemaining()) {
                            TagLength tagAndLength3 = readTagAndLength(byteBufferWrap);
                            if (tagAndLength3.Length() < 0) {
                                Logger.e("TLVCommandEncoder", "Invalid GETINFO_CMD_RESPONSE.");
                            } else {
                                short sTag2 = tagAndLength3.Tag();
                                if (sTag2 != 10254) {
                                    if (sTag2 == 10481) {
                                        byteBufferWrap.position(tagAndLength3.Length() + byteBufferWrap.position());
                                    } else if (sTag2 != 14353) {
                                        Logger.e("TLVCommandEncoder", "Unknown tag.");
                                    } else {
                                        AKProcessor.AkAuthnrInfo akAuthnrInfo = new AKProcessor.AkAuthnrInfo();
                                        akAuthnrInfo.generalInfo.asmVersions.add(new Version((short) 1, (short) 0));
                                        akAuthnrInfo.generalInfo.asmVersions.add(new Version((short) 1, (short) 1));
                                        byte[] bArr4 = new byte[tagAndLength3.Length()];
                                        byteBufferWrap.get(bArr4);
                                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr4);
                                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                        while (byteBufferWrap2.hasRemaining()) {
                                            TagLength tagAndLength4 = readTagAndLength(byteBufferWrap2);
                                            if (tagAndLength4.Length() < 0) {
                                                Logger.e("TLVCommandEncoder", "Invalid TAG_AUTHENTICATOR_INFO.");
                                                break;
                                            } else {
                                                short sTag3 = tagAndLength4.Tag();
                                                if (sTag3 != 10247) {
                                                    if (sTag3 != 10258) {
                                                        if (sTag3 == 11787) {
                                                            byte[] bArr5 = new byte[tagAndLength4.Length()];
                                                            byteBufferWrap2.get(bArr5);
                                                            short s7 = tagAndLength4.length;
                                                            if (s7 != 9) {
                                                                Logger.e("TLVCommandEncoder", String.format("Invalid AAID length: %s", Short.valueOf(s7)));
                                                            } else {
                                                                akAuthnrInfo.generalInfo.aaid = new String(bArr5, Charsets.utf8Charset);
                                                            }
                                                            break;
                                                        } else {
                                                            switch (sTag3) {
                                                                case 10249:
                                                                    short s9 = byteBufferWrap2.getShort();
                                                                    if ((s9 & 1) != 0) {
                                                                        akAuthnrInfo.generalInfo.isSecondFactorOnly = true;
                                                                    }
                                                                    if ((s9 & 2) != 0) {
                                                                        akAuthnrInfo.generalInfo.isRoamingAuthenticator = true;
                                                                    }
                                                                    if ((s9 & 4) != 0) {
                                                                        akAuthnrInfo.additionalInfo.keyHandleStoredInside = true;
                                                                    }
                                                                    if ((s9 & 8) != 0) {
                                                                        akAuthnrInfo.additionalInfo.builtinEnrollUI = true;
                                                                    }
                                                                    if ((s9 & 16) != 0) {
                                                                        akAuthnrInfo.additionalInfo.builtinSettingUI = true;
                                                                    }
                                                                    if ((s9 & 32) != 0) {
                                                                        akAuthnrInfo.additionalInfo.expectAPPID = true;
                                                                    }
                                                                    if ((s9 & 64) != 0) {
                                                                        akAuthnrInfo.generalInfo.isUserEnrolled = true;
                                                                    }
                                                                    akAuthnrInfo.additionalInfo.maxKeyHandle = byteBufferWrap2.get();
                                                                    akAuthnrInfo.generalInfo.userVerification = byteBufferWrap2.getInt();
                                                                    akAuthnrInfo.generalInfo.keyProtection = byteBufferWrap2.getShort();
                                                                    akAuthnrInfo.generalInfo.matcherProtection = byteBufferWrap2.getShort();
                                                                    akAuthnrInfo.generalInfo.tcDisplay = byteBufferWrap2.getShort();
                                                                    akAuthnrInfo.generalInfo.authenticationAlgorithm = byteBufferWrap2.getShort();
                                                                    if (akAuthnrInfo.generalInfo.authenticationAlgorithm > 8) {
                                                                        Logger.e("TLVCommandEncoder", "Unsupported hash algorithm.");
                                                                    }
                                                                    break;
                                                                case 10250:
                                                                    byte[] bArr6 = new byte[tagAndLength4.Length()];
                                                                    byteBufferWrap2.get(bArr6);
                                                                    akAuthnrInfo.generalInfo.assertionScheme = new String(bArr6, Charsets.utf8Charset);
                                                                    break;
                                                                case 10251:
                                                                    short sLength = tagAndLength4.Length();
                                                                    if (sLength >= 13) {
                                                                        DisplayPNGCharacteristicsDescriptor displayPNGCharacteristicsDescriptor = new DisplayPNGCharacteristicsDescriptor(((long) byteBufferWrap2.getInt()) & 4294967295L, ((long) byteBufferWrap2.getInt()) & 4294967295L, byteBufferWrap2.get(), byteBufferWrap2.get(), byteBufferWrap2.get(), byteBufferWrap2.get(), byteBufferWrap2.get());
                                                                        short s10 = (short) (sLength - 13);
                                                                        if (s10 % 6 == 0) {
                                                                            while (s10 >= 6) {
                                                                                displayPNGCharacteristicsDescriptor.addRGBPalletteEntry(new DisplayPNGCharacteristicsDescriptor.rgbPalletteEntry(byteBufferWrap2.getShort(), byteBufferWrap2.getShort(), byteBufferWrap2.getShort()));
                                                                                s10 = (short) (s10 - 6);
                                                                            }
                                                                            AuthenticatorInfo authenticatorInfo = akAuthnrInfo.generalInfo;
                                                                            if (authenticatorInfo.tcDisplayPNGCharacteristics == null) {
                                                                                authenticatorInfo.tcDisplayPNGCharacteristics = new ArrayList();
                                                                            }
                                                                            akAuthnrInfo.generalInfo.tcDisplayPNGCharacteristics.add(displayPNGCharacteristicsDescriptor);
                                                                        } else {
                                                                            Logger.e("TLVCommandEncoder", "Invalid PNG PALLETE.");
                                                                        }
                                                                    } else {
                                                                        Logger.e("TLVCommandEncoder", "Invalid display characteristics.");
                                                                    }
                                                                    break;
                                                                case 10252:
                                                                    byte[] bArr7 = new byte[tagAndLength4.Length()];
                                                                    byteBufferWrap2.get(bArr7);
                                                                    akAuthnrInfo.generalInfo.tcDisplayContentType = new String(bArr7, Charsets.utf8Charset);
                                                                    break;
                                                                case 10253:
                                                                    if (tagAndLength4.Length() == 1) {
                                                                        akAuthnrInfo.generalInfo.authenticatorIndex = byteBufferWrap2.get();
                                                                    } else {
                                                                        Logger.e("TLVCommandEncoder", "TAG_AUTHENTICATOR_INDEX Length is not 1.");
                                                                    }
                                                                    break;
                                                                default:
                                                                    Logger.e("TLVCommandEncoder", "Unknown tag.");
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        byte[] bArr8 = new byte[tagAndLength4.Length()];
                                                        byteBufferWrap2.get(bArr8);
                                                        akAuthnrInfo.generalInfo.supportedExtensionIDs.add(new String(bArr8, Charsets.utf8Charset));
                                                    }
                                                } else {
                                                    if (tagAndLength4.Length() == 2) {
                                                        AuthenticatorInfo authenticatorInfo2 = akAuthnrInfo.generalInfo;
                                                        if (authenticatorInfo2.attestationTypes == null) {
                                                            authenticatorInfo2.attestationTypes = new ArrayList();
                                                        }
                                                        short s11 = byteBufferWrap2.getShort();
                                                        if (s11 == 15879 || s11 == 15880) {
                                                            akAuthnrInfo.generalInfo.attestationTypes.add(Short.valueOf(s11));
                                                        } else {
                                                            Logger.e("TLVCommandEncoder", String.format("Invalid Attestation Type: %s", Short.valueOf(s11)));
                                                        }
                                                    } else {
                                                        Logger.e("TLVCommandEncoder", String.format("TAG_ATTESTATION_TYPE length is %s, should be 2.", Short.valueOf(tagAndLength4.Length())));
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        aKResponseParams.info.authenticators.add(akAuthnrInfo);
                                    }
                                } else if (tagAndLength3.Length() != 1) {
                                    Logger.e("TLVCommandEncoder", "API Version Length is not 1.");
                                } else {
                                    aKResponseParams.info.apiVersion = byteBufferWrap.get();
                                }
                            }
                            break;
                        }
                        aKResponseParams.statusCode = Outcome.SUCCESS.getUafCmdStatusCode();
                        break;
                    case 13314:
                        while (byteBufferWrap.hasRemaining()) {
                            TagLength tagAndLength5 = readTagAndLength(byteBufferWrap);
                            if (tagAndLength5.Length() < 0) {
                                Logger.e("TLVCommandEncoder", "Invalid REGISTER_CMD_RESPONSE.");
                            } else {
                                short sTag4 = tagAndLength5.Tag();
                                if (sTag4 == 10241) {
                                    byte[] bArr9 = new byte[tagAndLength5.Length()];
                                    byteBufferWrap.get(bArr9);
                                    aKResponseParams.regToBeStored.keyHandle = Base64.encodeToString(bArr9, 11);
                                } else if (sTag4 == 10255) {
                                    byte[] bArr10 = new byte[tagAndLength5.Length()];
                                    byteBufferWrap.get(bArr10);
                                    Logger.d("TLVCommandEncoder", String.format("Assertion response from authenticator: %s", TypeConverter.byteArrayToHexString(bArr10)));
                                    String strEncodeToString = Base64.encodeToString(bArr10, 11);
                                    aKResponseParams.assertion = strEncodeToString;
                                    Logger.d("TLVCommandEncoder", String.format("Assertion response from authenticator in base64: %s", strEncodeToString));
                                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArr10);
                                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                                    TagLength tagAndLength6 = readTagAndLength(byteBufferWrap3);
                                    if (tagAndLength6.Tag() != 15873 || tagAndLength6.Length() < 0) {
                                        Logger.e("TLVCommandEncoder", "Invalid TAG_UAFV1_REG_ASSERTION.");
                                    } else {
                                        TagLength tagAndLength7 = readTagAndLength(byteBufferWrap3);
                                        if (tagAndLength7.Tag() != 15875 || tagAndLength7.Length() < 0) {
                                            Logger.e("TLVCommandEncoder", "Invalid TAG_UAFV1_KRD.");
                                        } else {
                                            while (byteBufferWrap3.hasRemaining()) {
                                                TagLength tagAndLength8 = readTagAndLength(byteBufferWrap3);
                                                if (tagAndLength8.Length() < 0) {
                                                    Logger.e("TLVCommandEncoder", "Invalid tlv in registration assertion.");
                                                } else {
                                                    if (tagAndLength8.Tag() == 11785) {
                                                        byte[] bArr11 = new byte[tagAndLength8.Length()];
                                                        byteBufferWrap3.get(bArr11);
                                                        aKResponseParams.regToBeStored.keyID = Base64.encodeToString(bArr11, 11);
                                                    }
                                                    byteBufferWrap3.position(tagAndLength8.Length() + byteBufferWrap3.position());
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } else if (sTag4 != 10482) {
                                    Logger.e("TLVCommandEncoder", "Unknown tag.");
                                } else {
                                    byte[] bArr12 = new byte[tagAndLength5.Length()];
                                    aKResponseParams.additionalAKInfoToBeStored = bArr12;
                                    byteBufferWrap.get(bArr12);
                                }
                            }
                            break;
                        }
                        aKResponseParams.statusCode = Outcome.SUCCESS.getUafCmdStatusCode();
                        break;
                    case 13315:
                        while (byteBufferWrap.hasRemaining()) {
                            TagLength tagAndLength9 = readTagAndLength(byteBufferWrap);
                            if (tagAndLength9.Length() < 0) {
                                Logger.e("TLVCommandEncoder", "Invalid SIGN_CMD_RESPONSE.");
                            } else {
                                short sTag5 = tagAndLength9.Tag();
                                if (sTag5 == 10255) {
                                    byte[] bArr13 = new byte[tagAndLength9.Length()];
                                    byteBufferWrap.get(bArr13);
                                    aKResponseParams.assertion = Base64.encodeToString(bArr13, 11);
                                } else if (sTag5 == 10482) {
                                    byte[] bArr14 = new byte[tagAndLength9.Length()];
                                    aKResponseParams.additionalAKInfoToBeStored = bArr14;
                                    byteBufferWrap.get(bArr14);
                                } else if (sTag5 != 14338) {
                                    Logger.e("TLVCommandEncoder", "Unknown tag.");
                                } else {
                                    byte[] bArr15 = new byte[tagAndLength9.Length()];
                                    byteBufferWrap.get(bArr15);
                                    ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArr15);
                                    byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                                    while (true) {
                                        String str2 = "";
                                        String strEncodeToString2 = str2;
                                        while (true) {
                                            if (!byteBufferWrap4.hasRemaining()) {
                                            }
                                            TagLength tagAndLength10 = readTagAndLength(byteBufferWrap4);
                                            if (tagAndLength10.Length() < 0) {
                                                Logger.e("TLVCommandEncoder", "Invalid TAG_USERNAME_AND_KEYHANDLE.");
                                            } else {
                                                if (10246 == tagAndLength10.Tag()) {
                                                    byte[] bArr16 = new byte[tagAndLength10.Length()];
                                                    byteBufferWrap4.get(bArr16);
                                                    str2 = new String(bArr16, Charsets.utf8Charset);
                                                } else if (10241 != tagAndLength10.Tag()) {
                                                    Logger.e("TLVCommandEncoder", "Unknown tag in TAG_USERNAME_AND_KEYHANDLE.");
                                                } else {
                                                    byte[] bArr17 = new byte[tagAndLength10.Length()];
                                                    byteBufferWrap4.get(bArr17);
                                                    strEncodeToString2 = Base64.encodeToString(bArr17, 11);
                                                }
                                                if (str2.equals("") || strEncodeToString2.equals("")) {
                                                }
                                            }
                                            break;
                                            break;
                                        }
                                        aKResponseParams.usernames.add(new AuthenticatorCore.Username(str2, strEncodeToString2, 0L));
                                    }
                                }
                            }
                            break;
                        }
                        aKResponseParams.statusCode = Outcome.SUCCESS.getUafCmdStatusCode();
                        break;
                }
                return aKResponseParams;
            }
            aKResponseParams.statusCode = sA;
            return aKResponseParams;
        } catch (AsmException e5) {
            Logger.e("TLVCommandEncoder", "Failed to parse StatusCode.", e5);
            return aKResponseParams;
        }
    }

    public static AKProcessor.AKRequestParams decodeRequest(byte[] bArr) {
        AKProcessor.AKRequestParams aKRequestParams = new AKProcessor.AKRequestParams();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        TagLength tagAndLength = readTagAndLength(byteBufferWrap);
        if (tagAndLength.Length() < 0 || tagAndLength.Length() != byteBufferWrap.remaining()) {
            throw new AsmException(Outcome.FAILURE, "Invalid TLV request");
        }
        aKRequestParams.cmd = tagAndLength.Tag();
        while (byteBufferWrap.hasRemaining()) {
            TagLength tagAndLength2 = readTagAndLength(byteBufferWrap);
            Logger.i("TLVCommandEncoder", String.format("Current TAG is : %04X", Integer.valueOf(tagAndLength2.Tag() & UShort.MAX_VALUE)));
            short sTag = tagAndLength2.Tag();
            if (sTag == 10241) {
                if (aKRequestParams.keyHandles == null) {
                    aKRequestParams.keyHandles = new ArrayList();
                }
                byte[] bArr2 = new byte[tagAndLength2.Length()];
                byteBufferWrap.get(bArr2);
                aKRequestParams.keyHandles.add(bArr2);
            } else if (sTag != 10253) {
                if (sTag == 10256) {
                    byte[] bArr3 = new byte[tagAndLength2.Length()];
                    aKRequestParams.transaction = bArr3;
                    byteBufferWrap.get(bArr3);
                } else if (sTag == 10482) {
                    byte[] bArr4 = new byte[tagAndLength2.Length()];
                    aKRequestParams.additionalAKArgument = bArr4;
                    byteBufferWrap.get(bArr4);
                } else if (sTag == 14580) {
                    byte[] bArr5 = new byte[tagAndLength2.Length()];
                    aKRequestParams.transactionConfirmationToken = bArr5;
                    byteBufferWrap.get(bArr5);
                } else if (sTag == 11785) {
                    byte[] bArr6 = new byte[tagAndLength2.Length()];
                    aKRequestParams.keyID = bArr6;
                    byteBufferWrap.get(bArr6);
                } else if (sTag == 11786) {
                    byte[] bArr7 = new byte[tagAndLength2.Length()];
                    aKRequestParams.finalChallenge = bArr7;
                    byteBufferWrap.get(bArr7);
                } else {
                    if (sTag == 15889) {
                        throw new AsmException(Outcome.FAILURE, "TLV decoding failed because of unsupported critical extension.");
                    }
                    if (sTag != 15890) {
                        switch (sTag) {
                            case 10243:
                                byte[] bArr8 = new byte[tagAndLength2.Length()];
                                aKRequestParams.userVerifyToken = bArr8;
                                byteBufferWrap.get(bArr8);
                                break;
                            case 10244:
                                byte[] bArr9 = new byte[tagAndLength2.Length()];
                                aKRequestParams.appID = bArr9;
                                byteBufferWrap.get(bArr9);
                                break;
                            case 10245:
                                byte[] bArr10 = new byte[tagAndLength2.Length()];
                                aKRequestParams.KHAccessToken = bArr10;
                                byteBufferWrap.get(bArr10);
                                break;
                            case 10246:
                                byte[] bArr11 = new byte[tagAndLength2.Length()];
                                aKRequestParams.userName = bArr11;
                                byteBufferWrap.get(bArr11);
                                break;
                            case 10247:
                                if (tagAndLength2.Length() != 2) {
                                    throw new AsmException(Outcome.FAILURE, "Invalid attestation type length");
                                }
                                short s4 = byteBufferWrap.getShort();
                                aKRequestParams.attestationType = s4;
                                if (s4 != 15880 && s4 != 15879) {
                                    throw new AsmException(Outcome.FAILURE);
                                }
                                break;
                                break;
                            default:
                                Logger.e("TLVCommandEncoder", String.format("Unknown TAG in request : %04X", Integer.valueOf(tagAndLength2.Tag() & UShort.MAX_VALUE)));
                                byteBufferWrap.position(tagAndLength2.Length() + byteBufferWrap.position());
                                break;
                        }
                    } else {
                        if (aKRequestParams.extensions == null) {
                            aKRequestParams.extensions = new ArrayList();
                        }
                        IMatcher.Extension extension = new IMatcher.Extension();
                        extension.fail_if_unknown = tagAndLength2.Tag() == 15889;
                        byte[] bArr12 = new byte[tagAndLength2.Length()];
                        byteBufferWrap.get(bArr12);
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr12);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        while (byteBufferWrap2.hasRemaining()) {
                            TagLength tagAndLength3 = readTagAndLength(byteBufferWrap2);
                            if (tagAndLength3.Tag() == 11795) {
                                byte[] bArr13 = new byte[tagAndLength3.Length()];
                                byteBufferWrap2.get(bArr13);
                                extension.id = new String(bArr13, Charsets.utf8Charset);
                            } else if (tagAndLength3.Tag() == 11796) {
                                byte[] bArr14 = new byte[tagAndLength3.Length()];
                                extension.data = bArr14;
                                byteBufferWrap2.get(bArr14);
                            } else {
                                Logger.e("TLVCommandEncoder", String.format("Unknown TAG in extension : %04X", Integer.valueOf(tagAndLength3.Tag() & UShort.MAX_VALUE)));
                                byteBufferWrap2.position(tagAndLength3.Length() + byteBufferWrap2.position());
                            }
                        }
                        aKRequestParams.extensions.add(extension);
                    }
                }
            } else {
                if (tagAndLength2.Length() != 1) {
                    throw new AsmException(Outcome.FAILURE, "Invalid authenticator index length");
                }
                aKRequestParams.authenticatorIndex = byteBufferWrap.get();
            }
        }
        return aKRequestParams;
    }

    public static byte[] encodeAkConfig(AKProcessor.AkConfig akConfig) {
        try {
            TlvStream tlvStream = new TlvStream(null);
            tlvStream.writeTlv(new TlvStream((short) 25120).writeInt(akConfig.version));
            tlvStream.writeTlv(new TlvStream((short) 25121).writeInt(akConfig.signCounter));
            tlvStream.writeTlv(new TlvStream((short) 25122).writeInt(akConfig.regCounter));
            tlvStream.writeTlv(new TlvStream((short) 25123).writeInt(akConfig.failCounter));
            if (akConfig.matcherData != null) {
                tlvStream.writeTlv(new TlvStream((short) 25124).writeTlvBytes(akConfig.matcherData));
            }
            if (akConfig.enrollId != null) {
                tlvStream.writeTlv(new TlvStream((short) 25125).writeTlvBytes(akConfig.enrollId));
            }
            tlvStream.toByteArray();
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode AK config structure.", e5);
            return null;
        }
    }

    public static byte[] encodeDeregResponse(AKProcessor.AKResponseParams aKResponseParams) {
        TlvStream tlvStream = new TlvStream((short) 13828);
        try {
            tlvStream.writeTlv(new TlvStream((short) 10248).writeShort(aKResponseParams.statusCode));
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode response params.", e5);
            return null;
        }
    }

    public static byte[] encodeRegResponse(AKProcessor.AKResponseParams aKResponseParams) {
        TlvStream tlvStream = new TlvStream((short) 13826);
        try {
            tlvStream.writeTlv(new TlvStream((short) 10248).writeShort(aKResponseParams.statusCode));
            String str = aKResponseParams.assertion;
            if (str != null) {
                tlvStream.writeTlv(new TlvStream((short) 10255).writeTlvBytes(Base64.decode(str, 11)));
            }
            AuthenticatorDatabase.RegistrationRecord registrationRecord = aKResponseParams.regToBeStored;
            if (registrationRecord != null && registrationRecord.keyHandle != null) {
                tlvStream.writeTlv(new TlvStream((short) 10241).writeTlvBytes(Base64.decode(aKResponseParams.regToBeStored.keyHandle, 11)));
            }
            if (aKResponseParams.additionalAKInfoToBeStored != null) {
                tlvStream.writeTlv(new TlvStream((short) 10482).writeTlvBytes(aKResponseParams.additionalAKInfoToBeStored));
            }
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode response params.", e5);
            return null;
        }
    }

    public static byte[] encodeResponse(AKProcessor.AKResponseParams aKResponseParams, short s4) {
        switch (s4) {
            case 13314:
                return encodeRegResponse(aKResponseParams);
            case 13315:
                return encodeSignResponse(aKResponseParams);
            case 13316:
                return encodeDeregResponse(aKResponseParams);
            default:
                throw new AsmException(Outcome.FAILURE, "Not supported AK command");
        }
    }

    public static byte[] encodeSignResponse(AKProcessor.AKResponseParams aKResponseParams) {
        TlvStream tlvStream = new TlvStream((short) 13827);
        try {
            tlvStream.writeTlv(new TlvStream((short) 10248).writeShort(aKResponseParams.statusCode));
            String str = aKResponseParams.assertion;
            if (str != null) {
                tlvStream.writeTlv(new TlvStream((short) 10255).writeTlvBytes(Base64.decode(str, 11)));
            }
            if (aKResponseParams.usernames.size() > 0) {
                for (AuthenticatorCore.Username username : aKResponseParams.usernames) {
                    TlvStream tlvStream2 = new TlvStream((short) 14338);
                    tlvStream2.writeTlv(new TlvStream((short) 10246).writeTlvBytes(username.username.getBytes(StandardCharsets.UTF_8)));
                    tlvStream2.writeTlv(new TlvStream((short) 10241).writeTlvBytes(Base64.decode(username.keyHandle, 11)));
                    tlvStream.writeTlv(tlvStream2);
                }
            }
            if (aKResponseParams.additionalAKInfoToBeStored != null) {
                tlvStream.writeTlv(new TlvStream((short) 10482).writeTlvBytes(aKResponseParams.additionalAKInfoToBeStored));
            }
            return tlvStream.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode response params.", e5);
            return null;
        }
    }

    public static boolean isGetInfo(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return readTagAndLength(byteBufferWrap).tag == 13313;
    }

    public static AKProcessor.AkConfig parseAkConfig(byte[] bArr) {
        AKProcessor.AkConfig akConfig = new AKProcessor.AkConfig();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferWrap.hasRemaining()) {
            TagLength tagAndLength = readTagAndLength(byteBufferWrap);
            switch (tagAndLength.tag) {
                case 25120:
                    akConfig.version = byteBufferWrap.getInt();
                    break;
                case 25121:
                    akConfig.signCounter = byteBufferWrap.getInt();
                    break;
                case 25122:
                    akConfig.regCounter = byteBufferWrap.getInt();
                    break;
                case 25123:
                    akConfig.failCounter = byteBufferWrap.getInt();
                    break;
                case 25124:
                    byte[] bArr2 = new byte[tagAndLength.length];
                    akConfig.matcherData = bArr2;
                    byteBufferWrap.get(bArr2);
                    break;
                case 25125:
                    byte[] bArr3 = new byte[tagAndLength.length];
                    akConfig.enrollId = bArr3;
                    byteBufferWrap.get(bArr3);
                    break;
                default:
                    throw new AsmException(Outcome.PROTOCOL_ERROR, "Unknown tag in AK config structure");
            }
        }
        return akConfig;
    }

    public static byte[] prepareErrorResponse(short s4, byte[] bArr) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new TlvStream(Short.valueOf((short) (readTagAndLength(byteBufferWrap).Tag() + 512))).writeTlv(new TlvStream((short) 10248).writeShort(s4)).toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode error response.", e5);
            return null;
        }
    }

    public static byte[] prepareGetInfoResponse(KsUafAuthenticatorKernel.AkUafInfo akUafInfo) {
        try {
            TlvStream tlvStreamWriteTlv = new TlvStream((short) 13825).writeTlv(new TlvStream((short) 10248).writeShort((short) 0)).writeTlv(new TlvStream((short) 10254).writeByte((byte) 1));
            TlvStream tlvStreamWriteTlv2 = new TlvStream((short) 14353).writeTlv(new TlvStream((short) 10253).writeByte((byte) 0)).writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_AAID)).writeString(akUafInfo.aaid)).writeTlv(new TlvStream((short) 10249).writeShort(akUafInfo.authenticatorType).writeByte((byte) 16).writeInt((int) akUafInfo.userVerification).writeShort(akUafInfo.keyProtection).writeShort(akUafInfo.matcherProtection).writeShort(akUafInfo.tcDisplay).writeShort(akUafInfo.authenticationAlgorithm)).writeTlv(new TlvStream((short) 10252).writeString(akUafInfo.tcDisplayContentType));
            List<DisplayPNGCharacteristicsDescriptor> list = akUafInfo.tcDisplayPNGCharacteristics;
            if (list != null) {
                for (DisplayPNGCharacteristicsDescriptor displayPNGCharacteristicsDescriptor : list) {
                    tlvStreamWriteTlv2.writeTlv(new TlvStream((short) 10251).writeInt((int) displayPNGCharacteristicsDescriptor.width).writeInt((int) displayPNGCharacteristicsDescriptor.height).writeByte(displayPNGCharacteristicsDescriptor.bitDepth).writeByte(displayPNGCharacteristicsDescriptor.colorType).writeByte(displayPNGCharacteristicsDescriptor.compression).writeByte(displayPNGCharacteristicsDescriptor.filter).writeByte(displayPNGCharacteristicsDescriptor.interlace));
                    List<DisplayPNGCharacteristicsDescriptor.rgbPalletteEntry> list2 = displayPNGCharacteristicsDescriptor.plte;
                    if (list2 != null) {
                        for (DisplayPNGCharacteristicsDescriptor.rgbPalletteEntry rgbpalletteentry : list2) {
                            tlvStreamWriteTlv2.writeShort(rgbpalletteentry.f63122r).writeShort(rgbpalletteentry.f63121g).writeShort(rgbpalletteentry.f63120b);
                        }
                    }
                }
            }
            tlvStreamWriteTlv2.writeTlv(new TlvStream((short) 10250).writeString("UAFV1TLV")).writeTlv(new TlvStream((short) 10247).writeShort(ProtocolTags.TAG_ATTESTATION_BASIC_SURROGATE));
            tlvStreamWriteTlv.writeTlv(tlvStreamWriteTlv2);
            return tlvStreamWriteTlv.toByteArray();
        } catch (IOException e5) {
            Logger.e("TLVCommandEncoder", "Failed to encode prepare getInfo response.", e5);
            return null;
        }
    }

    public static TagLength readTagAndLength(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            Logger.e("TLVCommandEncoder", String.format("Invalid TLV: size < %s", (short) 4));
            return new TagLength();
        }
        TagLength tagLength = new TagLength(byteBuffer.getShort(), byteBuffer.getShort());
        if (tagLength.Length() >= 0 && tagLength.Length() <= byteBuffer.remaining()) {
            return tagLength;
        }
        Logger.e("TLVCommandEncoder", "Invalid TLV: size too large.");
        return new TagLength();
    }

    public static String readTransactionFromRequst(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        if (readTagAndLength(byteBufferWrap).Tag() != 13315) {
            return null;
        }
        while (byteBufferWrap.hasRemaining()) {
            TagLength tagAndLength = readTagAndLength(byteBufferWrap);
            byte[] bArr2 = new byte[tagAndLength.Length()];
            byteBufferWrap.get(bArr2);
            if (tagAndLength.tag == 10256) {
                return Base64.encodeToString(bArr2, 11);
            }
        }
        return null;
    }

    private static byte[] a(short s4, AKProcessor.AKRequestParams aKRequestParams) throws IOException {
        TlvStream tlvStream = new TlvStream(Short.valueOf(s4));
        tlvStream.writeTlv(new TlvStream((short) 10253).writeByte(aKRequestParams.authenticatorIndex));
        if (!a(aKRequestParams.appID)) {
            tlvStream.writeTlv(new TlvStream((short) 10244).writeTlvBytes(aKRequestParams.appID));
        }
        if (s4 == 13314 || s4 == 13315) {
            if (!a(aKRequestParams.finalChallenge)) {
                tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_FINAL_CHALLENGE)).writeTlvBytes(aKRequestParams.finalChallenge));
            }
            if (s4 == 13314) {
                tlvStream.writeTlv(new TlvStream((short) 10246).writeTlvBytes(aKRequestParams.userName));
                tlvStream.writeTlv(new TlvStream((short) 10247).writeShort(aKRequestParams.attestationType));
            } else if (!a(aKRequestParams.transaction)) {
                tlvStream.writeTlv(new TlvStream((short) 10256).writeTlvBytes(aKRequestParams.transaction));
            }
        } else if (s4 == 13316) {
            if (!a(aKRequestParams.keyID)) {
                tlvStream.writeTlv(new TlvStream(Short.valueOf(ProtocolTags.TAG_KEYID)).writeTlvBytes(aKRequestParams.keyID));
            }
            List<byte[]> list = aKRequestParams.keyHandles;
            if (list != null) {
                Iterator<byte[]> it = list.iterator();
                while (it.hasNext()) {
                    tlvStream.writeTlv(new TlvStream((short) 10241).writeTlvBytes(it.next()));
                }
            }
        }
        tlvStream.writeTlv(new TlvStream((short) 10245).writeTlvBytes(aKRequestParams.KHAccessToken));
        if (s4 == 13314 || s4 == 13315) {
            if (!a(aKRequestParams.userVerifyToken)) {
                tlvStream.writeTlv(new TlvStream((short) 10243).writeTlvBytes(aKRequestParams.userVerifyToken));
            }
            if (s4 == 13315) {
                if (!a(aKRequestParams.transactionConfirmationToken)) {
                    tlvStream.writeTlv(new TlvStream((short) 14580).writeTlvBytes(aKRequestParams.transactionConfirmationToken));
                }
                List<byte[]> list2 = aKRequestParams.keyHandles;
                if (list2 != null) {
                    Iterator<byte[]> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        tlvStream.writeTlv(new TlvStream((short) 10241).writeTlvBytes(it2.next()));
                    }
                }
            }
        }
        if (!a(aKRequestParams.additionalAKArgument)) {
            tlvStream.writeTlv(new TlvStream((short) 10482).writeTlvBytes(aKRequestParams.additionalAKArgument));
        }
        List<IMatcher.Extension> list3 = aKRequestParams.extensions;
        if (list3 != null) {
            for (IMatcher.Extension extension : list3) {
                tlvStream.writeTlv(new TlvStream(Short.valueOf(extension.fail_if_unknown ? (short) 15889 : (short) 15890)).writeTlv(new TlvStream((short) 11795).writeString(extension.id)).writeTlv(new TlvStream((short) 11796).writeTlvBytes(extension.data)));
            }
        }
        return tlvStream.toByteArray();
    }

    private static short a(ByteBuffer byteBuffer) {
        TagLength tagAndLength = readTagAndLength(byteBuffer);
        if (tagAndLength.Length() >= 0) {
            if (tagAndLength.Tag() == 10248) {
                if (tagAndLength.Length() == 2) {
                    return byteBuffer.getShort();
                }
                throw new AsmException(Outcome.FAILURE, "Invalid status code size.");
            }
            throw new AsmException(Outcome.FAILURE, "TAG_STATUS_CODE is not found.");
        }
        throw new AsmException(Outcome.FAILURE, "Invalid TAG_STATUS_CODE.");
    }

    private static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
