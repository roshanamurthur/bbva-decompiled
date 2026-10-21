package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.bbva.tohu.android.core.exceptions.DeviceSecurityDisabledException;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.auth.DeviceAuth;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationToken;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.ApplicationStatus;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.AidNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.DeviceLockedException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.UserNotAuthenticatedException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.DolRequestList;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.DolValues;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.QVSDCData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.QVSDCWithODA;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.TlvUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VCPCSProcess implements Constants {
    public static final String FORM_FACTOR_INDICATOR_DEFAULT_VALUE = "238C0000";
    static byte[] MSD_GPO_RESPONSE = null;
    public static final String TAG_AMOUNT_AUTHORIZED = "9F02";
    public static final String TAG_AMOUNT_OTHER = "9F03";
    public static final String TAG_TERMINAL_COUNTRY_CODE = "9F1A";
    public static final String TAG_TRANSACTION_CURRENCY_CODE = "5F2A";
    public static final String TAG_TRANSACTION_DATE = "9A";
    public static final String TAG_TRANSACTION_TYPE = "9C";
    public static final String TAG_TVR = "95";
    public static final String TAG_UNPREDICTABLE_NUMBER = "9F37";
    public static final byte[] TAG_APPLICATION_FILE_LOCATOR = {-108};
    public static final byte[] TAG_APPLICATION_INTERCHANGE_PROFILE = {-126};
    public static final byte[] TAG_TRACK_2_EQUIVALENT_DATA = {87};
    public static final byte[] TAG_PAN = {Constants.STATE_ERROR, 52};
    public static final byte[] TAG_ISSUER_APPLICATION_DATA = {-97, 16};
    public static final byte[] TAG_CRYPTOGRAM = {-97, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH};
    public static final byte[] TAG_CRYPTOGRAM_INFORMATION_DATA = {-97, 39};
    public static final byte[] TAG_ATC = {-97, 54};
    public static final byte[] TAG_CARD_TRANSACTIONS_QUALIFIERS = {-97, 108};
    public static final byte[] TAG_FORM_FACTOR_INDICATOR = {-97, 110};
    public static final byte[] TAG_CARDHOLDER_NAME = {Constants.STATE_ERROR, 32};
    public static final byte[] TAG_CUSTOMER_EXCLUSIVE_DATA = {-97, 124};
    private static final String TAG = "VCPCSProcess";
    public static SelectPpseProcess selectPpseProcess = new SelectPpseProcess();
    public static SelectAidProcess selectAidProcess = new SelectAidProcess();
    public static GetProcessingOptionsProcess gpoProcess = new GetProcessingOptionsProcess();
    public static CryptoKeyManager cryptoKeyManager = ManagerFactory.getCryptoKeyManager();
    static DeviceAuth deviceAuth = ManagerFactory.getDeviceAuth();

    @SuppressLint({"StaticFieldLeak"})
    static DeviceInfo deviceInfo = ServiceFactory.getDeviceInfo();
    static AuthenticationManager authenticationManager = ManagerFactory.getAuthenticationManager(MobilePayment.getInstance().getContext());
    static UserSharedPreferencesManager preferencesManager = ManagerFactory.getUserPreferencesManager(MobilePayment.getInstance().getContext());
    static boolean cdcvmSupported = ManagerFactory.getPropertiesManager(MobilePayment.getInstance().getContext()).cdcvmSupported().booleanValue();

    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cb  */
    public static byte CVMProcessing(TransactionContext transactionContext) throws DeviceLockedException, UserNotAuthenticatedException, DeviceSecurityDisabledException {
        byte[] valueByTag = transactionContext.getDolValues().getValueByTag("9F66");
        byte b10 = valueByTag[0];
        byte b11 = valueByTag[1];
        byte b12 = 2;
        byte b13 = valueByTag[2];
        byte[] bArr = transactionContext.ctq;
        if (bArr == null) {
            return (byte) 90;
        }
        bArr[0] = (byte) (bArr[0] & 63);
        bArr[1] = (byte) (bArr[1] & 127);
        if ((b11 & 64) == 0) {
            checkCdcvmForLvt(transactionContext, b13);
            transactionContext.ctq[1] = 0;
            transactionContext.cvr[0] = 0;
            transactionContext.setExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.NONE);
        } else if (transactionContext.getSelectedAidInfo().getCap() != null) {
            byte[] bArrByteArrayFromHexString = HexUtils.byteArrayFromHexString(transactionContext.getSelectedAidInfo().getCap());
            if ((b10 & 4) != 0) {
                byte b14 = bArrByteArrayFromHexString[2];
                if ((b14 & (-128)) != 0 || (b14 & 64) != 0) {
                    byte[] bArr2 = transactionContext.ctq;
                    bArr2[0] = (byte) (bArr2[0] | (-128));
                    byte[] bArr3 = transactionContext.cvr;
                    byte b15 = (byte) (bArr3[0] | Constants.CVR_B1b85_0110_TERMINAL);
                    bArr3[0] = b15;
                    bArr3[0] = (byte) (b15 | Constants.CVR_B1b41_1110_ONLINE_PIN);
                    transactionContext.setExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.ONLINE_PIN);
                } else if ((b13 & 64) == 0 && (bArrByteArrayFromHexString[2] & 8) != 0) {
                    checkDeviceIsSecure();
                    checkConsumerIsVerified();
                    byte[] bArr4 = transactionContext.ctq;
                    bArr4[1] = (byte) (bArr4[1] | (-128));
                    String consumerVerificationType = deviceAuth.getConsumerVerificationType();
                    consumerVerificationType.getClass();
                    switch (consumerVerificationType) {
                        case "CVM_VERIFIED_TYPE_PASSCODE":
                            byte[] bArr5 = transactionContext.cvr;
                            bArr5[0] = (byte) (bArr5[0] | 1);
                            break;
                        case "CVM_VERIFIED_TYPE_MOBILE_DEVICE_PATTERN":
                            byte[] bArr6 = transactionContext.cvr;
                            bArr6[0] = (byte) (bArr6[0] | 3);
                            break;
                        case "CVM_VERIFIED_TYPE_BIOMETRIC_FINGERPRINT":
                            byte[] bArr7 = transactionContext.cvr;
                            bArr7[0] = (byte) (bArr7[0] | 2);
                            break;
                        default:
                            byte[] bArr8 = transactionContext.cvr;
                            bArr8[0] = bArr8[0];
                            break;
                    }
                    String verifyingEntity = deviceAuth.getVerifyingEntity();
                    verifyingEntity.getClass();
                    switch (verifyingEntity.hashCode()) {
                        case -789519639:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_VMPA) ? (byte) -1 : (byte) 0;
                            break;
                        case -473679363:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_TERMINAL) ? (byte) -1 : (byte) 1;
                            break;
                        case -285052422:
                            if (!verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_CO_RESIDING_SE_APP)) {
                                b12 = -1;
                            }
                            break;
                        case -196588044:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_VERIFIED_IN_MOBILE_DEVICE_OS) ? (byte) -1 : (byte) 3;
                            break;
                        case 559189937:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_VERIFIED_IN_CLOUD) ? (byte) -1 : (byte) 4;
                            break;
                        case 697410388:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_MOBILE_APPLICATION) ? (byte) -1 : (byte) 5;
                            break;
                        case 943074197:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_TEE_APP) ? (byte) -1 : (byte) 6;
                            break;
                        case 1992472027:
                            b12 = !verifyingEntity.equals(DeviceAuth.CVM_VERIFYING_ENTITY_MG) ? (byte) -1 : (byte) 7;
                            break;
                        default:
                            b12 = -1;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            byte[] bArr9 = transactionContext.cvr;
                            bArr9[0] = (byte) (bArr9[0] | 16);
                            break;
                        case 1:
                            byte[] bArr10 = transactionContext.cvr;
                            bArr10[0] = (byte) (bArr10[0] | Constants.CVR_B1b85_0110_TERMINAL);
                            break;
                        case 2:
                            byte[] bArr11 = transactionContext.cvr;
                            bArr11[0] = (byte) (bArr11[0] | 48);
                            break;
                        case 3:
                            byte[] bArr12 = transactionContext.cvr;
                            bArr12[0] = (byte) (bArr12[0] | (-128));
                            break;
                        case 4:
                            byte[] bArr13 = transactionContext.cvr;
                            bArr13[0] = (byte) (bArr13[0] | Constants.CVR_B1b85_0111_VERIFIED_CLOUD);
                            break;
                        case 5:
                            byte[] bArr14 = transactionContext.cvr;
                            bArr14[0] = (byte) (bArr14[0] | Constants.CVR_B1b85_0101_MOBILE_APP);
                            break;
                        case 6:
                            byte[] bArr15 = transactionContext.cvr;
                            bArr15[0] = (byte) (bArr15[0] | 64);
                            break;
                        case 7:
                            byte[] bArr16 = transactionContext.cvr;
                            bArr16[0] = (byte) (bArr16[0] | 32);
                            break;
                        default:
                            byte[] bArr17 = transactionContext.cvr;
                            bArr17[0] = bArr17[0];
                            break;
                    }
                } else if ((b10 & 2) != 0 || (bArrByteArrayFromHexString[2] & 16) == 0) {
                    transactionContext.ctq[1] = 0;
                    transactionContext.cvr[0] = 0;
                    transactionContext.setExpectedUserActionOnPoi("UNKNOWN");
                } else {
                    byte[] bArr18 = transactionContext.ctq;
                    bArr18[0] = (byte) (bArr18[0] | 64);
                    byte[] bArr19 = transactionContext.cvr;
                    byte b16 = (byte) (bArr19[0] | Constants.CVR_B1b85_0110_TERMINAL);
                    bArr19[0] = b16;
                    bArr19[0] = (byte) (b16 | 13);
                    transactionContext.setExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.SIGNATURE);
                }
            } else if ((b13 & 64) == 0) {
                if ((b10 & 2) != 0) {
                    transactionContext.ctq[1] = 0;
                    transactionContext.cvr[0] = 0;
                    transactionContext.setExpectedUserActionOnPoi("UNKNOWN");
                } else {
                    transactionContext.ctq[1] = 0;
                    transactionContext.cvr[0] = 0;
                    transactionContext.setExpectedUserActionOnPoi("UNKNOWN");
                }
            } else if ((b10 & 2) != 0) {
                transactionContext.ctq[1] = 0;
                transactionContext.cvr[0] = 0;
                transactionContext.setExpectedUserActionOnPoi("UNKNOWN");
            } else {
                transactionContext.ctq[1] = 0;
                transactionContext.cvr[0] = 0;
                transactionContext.setExpectedUserActionOnPoi("UNKNOWN");
            }
        }
        byte[] bArr20 = transactionContext.cvr;
        bArr20[1] = (byte) (bArr20[1] | (-96));
        return (byte) 90;
    }

    private static void addPdolValue(DolValues dolValues, List<byte[]> list, String str) {
        byte[] valueByTag = dolValues.getValueByTag(str);
        LogTohu.d(TAG, "PDOL tag: %s, length: %d, value: %s", str, Integer.valueOf(valueByTag.length), HexUtils.byteArrayToHexString(valueByTag));
        list.add(valueByTag);
    }

    private static void checkCdcvmForLvt(TransactionContext transactionContext, byte b10) throws DeviceLockedException, UserNotAuthenticatedException, DeviceSecurityDisabledException {
        if (cdcvmSupported && preferencesManager.isCdcvmForLvt()) {
            byte[] bArrByteArrayFromHexString = HexUtils.byteArrayFromHexString(transactionContext.getSelectedAidInfo().getCap());
            if ((b10 & 64) == 0 || (bArrByteArrayFromHexString[2] & 8) == 0) {
                return;
            }
            checkDeviceIsSecure();
            checkConsumerIsVerified();
        }
    }

    private static void checkConsumerIsVerified() throws DeviceLockedException, UserNotAuthenticatedException {
        if (deviceInfo.isDeviceLocked()) {
            throw new DeviceLockedException();
        }
        if (!isUnlockAuthenticationAllowed() && !isUserAuthenticated()) {
            throw new UserNotAuthenticatedException();
        }
    }

    private static void checkDeviceIsSecure() throws DeviceSecurityDisabledException {
        if (!deviceInfo.isDeviceSecure()) {
            throw new DeviceSecurityDisabledException();
        }
    }

    private static byte checkTTQ(byte[] bArr, TransactionContext transactionContext) {
        if ((bArr[0] & 32) == 0) {
            return (byte) -91;
        }
        transactionContext.setTerminalProfile((byte) 1);
        return (byte) 90;
    }

    private static byte[] constructGPOResponse(TransactionContext transactionContext, short s4) throws DeviceLockedException, UserNotAuthenticatedException, TohuSdkException {
        if (s4 != 1) {
            return null;
        }
        transactionContext.setOda(((transactionContext.getDolValues().getValueByTag("9F66")[0] & 1) != 0) && ((HexUtils.byteArrayFromHexString(transactionContext.getSelectedAidInfo().getCap())[1] & 32) == 0));
        return createQvscdGpoResponse(transactionContext);
    }

    @NonNull
    private static List<byte[]> createIadDataList(TransactionContext transactionContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new byte[]{31});
        arrayList.add(new byte[]{67});
        arrayList.add(transactionContext.getDki());
        arrayList.add(transactionContext.getCvr());
        arrayList.add(HexUtils.byteArrayFromHexString(PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getqVSDCData().getDigitalWalletID()));
        arrayList.add(transactionContext.getApi());
        arrayList.add(new byte[]{0, 0});
        arrayList.add(HexUtils.byteArrayFromHexString("00000000000000000000000000"));
        return arrayList;
    }

    private static byte[] createQvscdGpoResponse(TransactionContext transactionContext) throws DeviceLockedException, UserNotAuthenticatedException, TohuSdkException {
        String aip;
        String afl;
        ArrayList arrayList = new ArrayList();
        QVSDCData qVSDCData = PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getqVSDCData();
        CVMProcessing(transactionContext);
        if (transactionContext.isOda()) {
            afl = getQvsdcForOda(transactionContext).getAfl();
            aip = getQvsdcForOda(transactionContext).getAip();
        } else {
            aip = qVSDCData.getqVSDCWithoutODA().getAip();
            afl = qVSDCData.getqVSDCWithoutODA().getAfl();
        }
        if (afl != null && !afl.isEmpty()) {
            transactionContext.setLastRecord(Util.getLastAflRecordId(HexUtils.byteArrayFromHexString(afl)));
        }
        arrayList.add(TlvUtils.createTlvFromHexString(TAG_APPLICATION_INTERCHANGE_PROFILE, aip));
        arrayList.add(TlvUtils.createTlvFromHexString(TAG_APPLICATION_FILE_LOCATOR, afl));
        if (transactionContext.isTerminalQvscdCompatible()) {
            arrayList.add(TlvUtils.createTlv(TAG_TRACK_2_EQUIVALENT_DATA, gpoProcess.generateTrack2EquivalentData()));
        }
        String psn = qVSDCData.getPsn();
        if (psn != null) {
            arrayList.add(TlvUtils.createTlvFromHexString(TAG_PAN, psn));
        }
        List<byte[]> listCreateIadDataList = createIadDataList(transactionContext);
        arrayList.add(TlvUtils.createTlv(TAG_ISSUER_APPLICATION_DATA, listCreateIadDataList));
        arrayList.add(TlvUtils.createTlv(TAG_CRYPTOGRAM, generateCryptogram(transactionContext, listCreateIadDataList)));
        String cid = qVSDCData.getCid();
        if (cid == null || cid.isEmpty()) {
            cid = "80";
        }
        arrayList.add(TlvUtils.createTlvFromHexString(TAG_CRYPTOGRAM_INFORMATION_DATA, cid));
        arrayList.add(TlvUtils.createTlv(TAG_ATC, transactionContext.getAtc()));
        if (transactionContext.getCtq() != null) {
            arrayList.add(TlvUtils.createTlv(TAG_CARD_TRANSACTIONS_QUALIFIERS, transactionContext.getCtq()));
        }
        String ffi = qVSDCData.getFfi();
        if (ffi == null || ffi.isEmpty()) {
            ffi = FORM_FACTOR_INDICATOR_DEFAULT_VALUE;
        }
        arrayList.add(TlvUtils.createTlvFromHexString(TAG_FORM_FACTOR_INDICATOR, ffi));
        if (transactionContext.isOda()) {
            String str = new String(HexUtils.byteArrayFromHexString(PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getCardHolderNameVCPCS()));
            if (!str.isEmpty()) {
                arrayList.add(TlvUtils.createTlv(TAG_CARDHOLDER_NAME, str.getBytes()));
            }
            String ced = qVSDCData.getCed();
            if (ced != null && !ced.isEmpty()) {
                arrayList.add(TlvUtils.createTlvFromHexString(TAG_CUSTOMER_EXCLUSIVE_DATA, ced));
            }
        }
        return HexUtils.concatenateArrays(arrayList);
    }

    private static short findRecord(byte b10, byte b11, TransactionContext transactionContext) {
        if (transactionContext.recordIndex == null) {
            return (short) -1;
        }
        short s4 = 0;
        while (true) {
            byte[][] bArr = transactionContext.recordIndex;
            if (s4 >= bArr.length) {
                return (short) -1;
            }
            byte[] bArr2 = bArr[s4];
            byte b12 = bArr2[0];
            byte b13 = bArr2[1];
            if (b12 == b10 && b13 == b11) {
                return s4;
            }
            s4 = (short) (s4 + 1);
        }
    }

    private static byte[] generateCryptogram(TransactionContext transactionContext, List<byte[]> list) throws TohuSdkException {
        ArrayList arrayList = new ArrayList();
        DolValues dolValues = transactionContext.getDolValues();
        addPdolValue(dolValues, arrayList, "9F02");
        addPdolValue(dolValues, arrayList, "9F03");
        addPdolValue(dolValues, arrayList, "9F1A");
        addPdolValue(dolValues, arrayList, "95");
        addPdolValue(dolValues, arrayList, "5F2A");
        addPdolValue(dolValues, arrayList, "9A");
        addPdolValue(dolValues, arrayList, "9C");
        addPdolValue(dolValues, arrayList, "9F37");
        byte[] bArrByteArrayFromHexString = HexUtils.byteArrayFromHexString(transactionContext.isOda() ? getQvsdcForOda(transactionContext).getAip() : PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getqVSDCData().getqVSDCWithoutODA().getAip());
        String str = TAG;
        LogTohu.d(str, "AIP length: %d, value: %s", Integer.valueOf(bArrByteArrayFromHexString.length), HexUtils.byteArrayToHexString(bArrByteArrayFromHexString));
        arrayList.add(bArrByteArrayFromHexString);
        byte[] atc = transactionContext.getAtc();
        LogTohu.d(str, "ATC length: %d, value: %s", Integer.valueOf(atc.length), HexUtils.byteArrayToHexString(atc));
        arrayList.add(atc);
        LogTohu.d(str, "IAD length: %d, value: %s", Integer.valueOf(HexUtils.concatenateArrays(list).length), HexUtils.concatenateArrays(list));
        arrayList.addAll(list);
        byte[] bArrConcatenateArrays = HexUtils.concatenateArrays(arrayList);
        LogTohu.d(str, "Entrada para criptograma: %s", HexUtils.byteArrayToHexString(bArrConcatenateArrays));
        byte[] bArrCreateVisaCryptogram = cryptoKeyManager.createVisaCryptogram(bArrConcatenateArrays, PaymentApplicationContext.getTransactionCredentialId());
        LogTohu.d(str, "Cryptograma resultado VISA: %s", HexUtils.byteArrayToHexString(bArrCreateVisaCryptogram));
        return bArrCreateVisaCryptogram;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getProcessingOptions(byte[] bArr, byte[] bArr2, TransactionContext transactionContext) throws DeviceLockedException, UserNotAuthenticatedException, TohuSdkException {
        if (bArr[2] != 0 || bArr[3] != 0) {
            return -7;
        }
        if (bArr[5] != -125) {
            return -3;
        }
        short s4 = (short) 1;
        int i10 = bArr[6];
        if (i10 == 0) {
            return -3;
        }
        if (i10 != ((short) ((bArr[4] & 255) - 2))) {
            return -7;
        }
        if (i10 != transactionContext.getDolRequestList().dolItemsLength) {
            return -3;
        }
        short s7 = (short) (s4 + 1);
        if (s7 == 2) {
            byte[] bArr3 = new byte[i10];
            Util.arrayCopy(bArr, (short) 7, bArr3, (short) 0, i10);
            DolRequestList dolRequestList = transactionContext.getDolRequestList();
            DolValues dolValues = transactionContext.getDolValues();
            dolValues.processTerminalDol(dolRequestList, bArr3);
            if (checkTTQ(dolValues.getValueByTag("9F66"), transactionContext) != 90) {
                return -3;
            }
            s7 = (short) (s7 + 1);
        }
        if (s7 == 3) {
            int i11 = HexUtils.readInt(transactionContext.getAtc(), 0);
            if (i11 >= 65535 || i11 <= 0) {
                PaymentApplicationContext.applicationStatus.setStatus(ApplicationStatus.STATUS_BLOCKED);
                return -3;
            }
            if (PaymentApplicationContext.getSc() >= 65535) {
                return -3;
            }
            s7 = (short) (s7 + 1);
        }
        if (s7 != 4) {
            return 0;
        }
        byte terminalProfile = transactionContext.getTerminalProfile();
        if (terminalProfile == 0) {
            byte[] bArrMsdProcessing = msdProcessing(transactionContext);
            Util.arrayCopy(bArrMsdProcessing, (short) 0, bArr2, (short) 0, (short) bArrMsdProcessing.length);
            return bArrMsdProcessing.length;
        }
        if (terminalProfile != 1) {
            return -6;
        }
        byte[] bArrQVSDCProcessing = qVSDCProcessing(transactionContext);
        Util.arrayCopy(bArrQVSDCProcessing, (short) 0, bArr2, (short) 0, (short) bArrQVSDCProcessing.length);
        return bArrQVSDCProcessing.length;
    }

    private static QVSDCWithODA getQvsdcForOda(TransactionContext transactionContext) {
        return transactionContext.getSelectedAidInfo().getqVSDCData().getqVSDCWithODA();
    }

    private static byte[] getRecord(byte b10, byte b11, TransactionContext transactionContext) {
        short sFindRecord = findRecord(b10, b11, transactionContext);
        if (sFindRecord != -1) {
            return (byte[]) transactionContext.recordValues[sFindRecord];
        }
        return null;
    }

    private static boolean isUnlockAuthenticationAllowed() {
        AuthenticationToken authenticationTokenRetrieveDeviceAuthentication = authenticationManager.retrieveDeviceAuthentication();
        return authenticationTokenRetrieveDeviceAuthentication != null && authenticationTokenRetrieveDeviceAuthentication.isValid();
    }

    private static boolean isUserAuthenticated() {
        AuthenticationToken authenticationTokenRetrieveUserAuthentication = authenticationManager.retrieveUserAuthentication();
        return authenticationTokenRetrieveUserAuthentication != null && authenticationTokenRetrieveUserAuthentication.isValid();
    }

    public static byte[] msdProcessing(TransactionContext transactionContext) throws DeviceLockedException, UserNotAuthenticatedException, TohuSdkException {
        byte[] bArrConstructGPOResponse = constructGPOResponse(transactionContext, (short) 0);
        byte[] bArr = new byte[(short) (bArrConstructGPOResponse.length + 4)];
        MSD_GPO_RESPONSE = bArr;
        short s4 = (short) 1;
        bArr[0] = -128;
        short s7 = (short) (s4 + 1);
        bArr[s4] = (byte) bArrConstructGPOResponse.length;
        Util.arrayCopy(bArrConstructGPOResponse, (short) 0, bArr, s7, (short) bArrConstructGPOResponse.length);
        Util.setShort(MSD_GPO_RESPONSE, (short) (s7 + ((short) bArrConstructGPOResponse.length)), (short) -28672);
        return MSD_GPO_RESPONSE;
    }

    public static byte[] qVSDCProcessing(TransactionContext transactionContext) throws DeviceLockedException, UserNotAuthenticatedException, TohuSdkException {
        return TlvUtils.createSucessfulResponseApdu(TlvUtils.createTlv(new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2}, constructGPOResponse(transactionContext, (short) 1)));
    }

    public static int readRecord(byte[] bArr, byte[] bArr2, TransactionContext transactionContext) {
        byte b10 = bArr[2];
        byte b11 = bArr[3];
        byte b12 = (byte) ((b11 >> 3) & 31);
        transactionContext.setLastRecordReaded(HexUtils.byteArrayToHexString(new byte[]{b12, b10}));
        if ((b11 & 7) != 4) {
            return -7;
        }
        byte[] record = getRecord(b12, b10, transactionContext);
        if (record == null) {
            return -8;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(record);
        arrayList.add(new byte[]{-112, 0});
        byte[] bArrConcatenateArrays = HexUtils.concatenateArrays(arrayList);
        Util.arrayCopy(bArrConcatenateArrays, (short) 0, bArr2, (short) 0, (short) bArrConcatenateArrays.length);
        return bArrConcatenateArrays.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int selectAid(byte[] bArr, byte[] bArr2, TransactionContext transactionContext) {
        if (bArr[2] != 4) {
            return -15;
        }
        byte b10 = bArr[3];
        if (b10 != 0 && b10 != 2) {
            return -15;
        }
        boolean z10 = b10 == 2;
        if (!z10) {
            PaymentApplicationContext.returnedPartialAids = new ArrayList();
        }
        int i10 = bArr[4];
        if (i10 < 6 || i10 > 10) {
            return -15;
        }
        if (PaymentApplicationContext.applicationStatus.isBlocked()) {
            return -14;
        }
        byte[] bArr3 = new byte[i10];
        Util.arrayCopy(bArr, (short) 5, bArr3, (short) 0, i10);
        transactionContext.setSelectedAid(HexUtils.byteArrayToHexString(bArr3));
        try {
            byte[] bArrCreateSucessfulResponseApdu = TlvUtils.createSucessfulResponseApdu(selectAidProcess.generateFciTemplate(transactionContext, PaymentApplicationContext.cardProfile, z10));
            Util.arrayCopy(bArrCreateSucessfulResponseApdu, (short) 0, bArr2, (short) 0, (short) bArrCreateSucessfulResponseApdu.length);
            return bArrCreateSucessfulResponseApdu.length;
        } catch (AidNotFoundException unused) {
            return -16;
        }
    }

    public static int selectPPSE(byte[] bArr, byte[] bArr2) {
        if (bArr[2] != 4) {
            return -15;
        }
        byte b10 = bArr[3];
        if (b10 != 0 && b10 != 2) {
            return -15;
        }
        if (PaymentApplicationContext.applicationStatus.isBlocked()) {
            return -14;
        }
        byte[] bArrCreateSucessfulResponseApdu = TlvUtils.createSucessfulResponseApdu(selectPpseProcess.generatePpseFci(PaymentApplicationContext.cardProfile));
        Util.arrayCopy(bArrCreateSucessfulResponseApdu, (short) 0, bArr2, (short) 0, (short) bArrCreateSucessfulResponseApdu.length);
        return bArrCreateSucessfulResponseApdu.length;
    }
}
