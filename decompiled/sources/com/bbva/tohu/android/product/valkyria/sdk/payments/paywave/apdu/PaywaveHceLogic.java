package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu;

import android.content.Context;
import com.bbva.tohu.android.core.exceptions.DeviceSecurityDisabledException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.PaymentResponse;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.BroadcastManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.payments.AmountInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.ContactlessTransactionResponseLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.ApplicationStatus;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.PaymentApplicationContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.TransactionContext;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.DeviceLockedException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.exceptions.UserNotAuthenticatedException;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.AidInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Iso4217CurrencyUtils;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class PaywaveHceLogic implements HceLogic {
    private static final String TAG = "PaywaveHceLogic";
    public static final String TRANSACTION_TYPE_CODE_PURCHASE = "00";
    public static final String TRANSACTION_TYPE_CODE_REFUND = "20";
    private static AuthenticationManager authenticationManager;
    private static BroadcastManager broadcastManager;
    private static byte lastCommandAPDU;
    private static ITestApduCommands testApduCommands;
    protected static TransactionContext transactionContext;
    private static ContactlessTransactionResponseLogic transactionResponseLogic;

    public PaywaveHceLogic(Context context) {
        testApduCommands = new TestApduCommands();
        BroadcastManager broadcastManagerCreate = BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_PAYMENT_ACTION);
        broadcastManager = broadcastManagerCreate;
        transactionResponseLogic = LogicFactory.getTransactionResponseLogic(broadcastManagerCreate, context);
        authenticationManager = ManagerFactory.getAuthenticationManager(context);
    }

    private byte[] buildApduR(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        Util.arrayCopy(bArr, (short) 0, bArr2, (short) 0, (short) bArr.length);
        return bArr2;
    }

    private AmountInfo getAmountInfo(TransactionContext transactionContext2) {
        byte[] amount = transactionContext2.getAmount();
        String strValueOf = amount != null ? String.valueOf(Double.parseDouble(HexUtils.byteArrayToHexString(amount)) / 100.0d) : null;
        byte[] currency = transactionContext2.getCurrency();
        return new AmountInfo(strValueOf, currency != null ? Iso4217CurrencyUtils.getCurrencyByCode(currency).getCurrencyCode() : null);
    }

    private void notifyTransaction(TransactionContext transactionContext2, boolean z10) {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setOperationDate(new Date());
        paymentResponse.setComplete(z10);
        paymentResponse.setAtc(transactionContext2.getAtc());
        paymentResponse.setCardUnpredicableNumber(transactionContext2.getCardUnpredictableNumber());
        paymentResponse.setOdaTransaction(transactionContext2.isOda() ? PaymentResponse.ODA_APPLIED : PaymentResponse.ODA_NOT_APPLIED);
        byte[] amount = transactionContext2.getAmount();
        if (amount != null) {
            paymentResponse.setAmount(Double.valueOf(Double.parseDouble(HexUtils.byteArrayToHexString(amount)) / 100.0d));
        }
        byte[] currency = transactionContext2.getCurrency();
        if (currency != null) {
            paymentResponse.setCurrency(Iso4217CurrencyUtils.getCurrencyByCode(currency));
        }
        paymentResponse.setExpectedUserActionOnPoi(transactionContext2.getExpectedUserActionOnPoi());
        paymentResponse.setTerminalType("UNKNOWN");
        String strByteArrayToHex = Util.byteArrayToHex(transactionContext2.getDolValues().getValueByTag("9C"));
        if (strByteArrayToHex.equals("00")) {
            paymentResponse.setOperationType("PURCHASE");
        } else if (strByteArrayToHex.equals(TRANSACTION_TYPE_CODE_REFUND)) {
            paymentResponse.setOperationType("REFUND");
        } else {
            paymentResponse.setOperationType("UNKNOWN");
        }
        transactionResponseLogic.processResponse(paymentResponse, z10 ? "OK" : "TOHU_PAYMENT_ABORT");
    }

    private void notifyTransactionAborted(TransactionContext transactionContext2) {
        LogTohu.d(TAG, "********+++++++... TRANSACTION ABORTED NOTIFICATION", new Object[0]);
        notifyTransaction(transactionContext2, false);
    }

    private void notifyTransactionCompleted(TransactionContext transactionContext2) {
        LogTohu.d(TAG, "********+++++++... TRANSACTION COMPLETED NOTIFICATION", new Object[0]);
        notifyTransaction(transactionContext2, true);
    }

    private void overwriteCdcvmWithOnlinePin() {
        for (AidInfo aidInfo : PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getAidInfo()) {
            byte[] bArrByteArrayFromHexString = HexUtils.byteArrayFromHexString(aidInfo.getCap());
            if ((bArrByteArrayFromHexString[2] & 8) != 0) {
                String str = TAG;
                LogTohu.d(str, "El CAP del AID %s  soporta CDCVM: %s", aidInfo.getAid(), aidInfo.getCap());
                byte b10 = (byte) (bArrByteArrayFromHexString[2] & (-9));
                bArrByteArrayFromHexString[2] = b10;
                bArrByteArrayFromHexString[2] = (byte) (b10 | Constants.CVR_B2b87_11_RFU);
                aidInfo.setCap(HexUtils.byteArrayToHexString(bArrByteArrayFromHexString));
                LogTohu.d(str, "Modificado CAP del AID %s para sustituir CDCVM por PIN ONLINE: %s", aidInfo.getAid(), aidInfo.getCap());
            } else {
                LogTohu.d(TAG, "El CAP del AID %s NO soporta CDCVM: %s", aidInfo.getAid(), aidInfo.getCap());
            }
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public String getPanAsHex() {
        return PaymentApplicationContext.getPan();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public void init(byte[] bArr, Token token, Bullet bullet, Context context) throws TohuSdkException {
        PaymentApplicationContext.setTransactionCredentialId(bullet.getKeyLocator().concat(ReplenishLogic.ID_SEPARATOR).concat(TransactionType.TRANSACTION_TYPE_CONTACTLESS));
        PaymentApplicationContext.cardProfile = VtsCardProfile.valueOf(new String(bArr));
        if (ManagerFactory.getPropertiesManager(context).overwriteCDCVMWithPinOnline().booleanValue()) {
            overwriteCdcvmWithOnlinePin();
        }
        PaymentApplicationContext.setAtc(bullet.getAtc().shortValue());
        PaymentApplicationContext.setSc(token.getSc().intValue());
        PaymentApplicationContext.setApi(token.getApi());
        PaymentApplicationContext.setDki(token.getDki());
        PaymentApplicationContext.applicationStatus = new ApplicationStatus();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public byte[] processApdu(byte[] bArr) throws TohuSdkException {
        String str = TAG;
        LogTohu.d(str, "Entering processCommandApdu", new Object[0]);
        byte[] bArrBuildApduR = new byte[2];
        byte[] bArr2 = new byte[256];
        short s4 = Util.getShort(bArr, (short) 0);
        String str2 = null;
        if (s4 == -32600) {
            LogTohu.d(str, "%s, transactionContext: %s", null, transactionContext);
            str2 = "GPO Command ";
            if (!PaymentApplicationContext.applicationStatus.isReadyToPay()) {
                bArrBuildApduR = buildApduR(Constants.ISO7816_SW_COMMAND_NOT_ALLOWED);
                notifyTransactionAborted(transactionContext);
            } else if (PaymentApplicationContext.applicationStatus.isBlocked()) {
                bArrBuildApduR = buildApduR(Constants.ISO7816_SECURITY_STATUS_NOT_SATISFIED);
                notifyTransactionAborted(transactionContext);
            } else if (lastCommandAPDU == 2) {
                str2 = "GPO: ";
                LogTohu.d(str, "****************************************\nReceived GPO: %s", Util.byteArrayToHex(bArr));
                try {
                    int processingOptions = VCPCSProcess.getProcessingOptions(bArr, bArr2, transactionContext);
                    if (processingOptions < 0) {
                        bArrBuildApduR = new byte[2];
                        if (processingOptions == -3) {
                            byte[] bArr3 = Constants.ISO7816_SW_CONDITIONS_NOT_SATISFIED;
                            Util.arrayCopy(bArr3, (short) 0, bArrBuildApduR, (short) 0, (short) bArr3.length);
                        } else if (processingOptions == -17) {
                            byte[] bArr4 = Constants.ISO7816_SW_COMMAND_NOT_ALLOWED;
                            Util.arrayCopy(bArr4, (short) 0, bArrBuildApduR, (short) 0, (short) bArr4.length);
                        } else {
                            byte[] bArr5 = Constants.ISO7816_SW_FUNC_NOT_SUPPORTED;
                            Util.arrayCopy(bArr5, (short) 0, bArrBuildApduR, (short) 0, (short) bArr5.length);
                        }
                        notifyTransactionAborted(transactionContext);
                    } else {
                        bArrBuildApduR = new byte[processingOptions];
                        Util.arrayCopy(bArr2, (short) 0, bArrBuildApduR, (short) 0, (short) processingOptions);
                        lastCommandAPDU = (byte) 3;
                        if (transactionContext.getLastRecord() == null) {
                            notifyTransactionCompleted(transactionContext);
                        } else {
                            transactionContext.initializeRecords();
                        }
                    }
                    PaymentApplicationContext.incAtc();
                } catch (DeviceSecurityDisabledException unused) {
                    byte[] bArrBuildApduR2 = buildApduR(Constants.ISO7816_SW_COMMAND_NOT_ALLOWED);
                    LogTohu.d(TAG, "%s , Response: %s", "GPO: ", Util.byteArrayToHex(bArrBuildApduR2));
                    transactionResponseLogic.notifyCdcvmDeviceSecurityDisabled(getAmountInfo(transactionContext));
                    return bArrBuildApduR2;
                } catch (DeviceLockedException unused2) {
                    String str3 = TAG;
                    LogTohu.d(str3, "Device unlocked required for payment", new Object[0]);
                    byte[] bArrBuildApduR3 = buildApduR(Constants.ISO7816_SW_COMMAND_NOT_ALLOWED);
                    LogTohu.d(str3, "%s , Response: %s", "GPO: ", Util.byteArrayToHex(bArrBuildApduR3));
                    transactionResponseLogic.notifyCdcvmDeviceUnlockRequired(getAmountInfo(transactionContext));
                    authenticationManager.authenticateWithDeviceUnlocking();
                    return bArrBuildApduR3;
                } catch (UserNotAuthenticatedException unused3) {
                    String str4 = TAG;
                    LogTohu.d(str4, "User authentication required for payment", new Object[0]);
                    byte[] bArrBuildApduR4 = buildApduR(Constants.ISO7816_SW_COMMAND_NOT_ALLOWED);
                    LogTohu.d(str4, "%s , Response: %s", "GPO: ", Util.byteArrayToHex(bArrBuildApduR4));
                    transactionResponseLogic.notifyCdcvmUserAuthenticationRequired(getAmountInfo(transactionContext));
                    return bArrBuildApduR4;
                }
            } else {
                bArrBuildApduR = buildApduR(Constants.ISO7816_SW_CONDITIONS_NOT_SATISFIED);
                notifyTransactionAborted(transactionContext);
            }
        } else if (s4 == -32529) {
            LogTohu.d(str, "****************************************\nReceived UPDATE TEST PARAMETERS: %s", Util.byteArrayToHex(bArr));
            bArrBuildApduR = testApduCommands.processUpdateTestParameters(bArr);
        } else if (s4 == -32513) {
            LogTohu.d(str, "****************************************\nReceived CLEAR DATA: %s", Util.byteArrayToHex(bArr));
            bArrBuildApduR = testApduCommands.clearTestData(transactionContext);
        } else if (s4 != 164) {
            if (s4 != 178) {
                str2 = "Received Unhandled APDU: " + HexUtils.byteArrayToHexString(bArr);
                bArrBuildApduR = buildApduR(Constants.ISO7816_SW_INS_NOT_SUPPORTED);
                notifyTransactionAborted(transactionContext);
            } else {
                byte b10 = lastCommandAPDU;
                if (b10 == 3 || b10 == 4) {
                    LogTohu.d(str, "****************************************\nReceived Read Record: %s", Util.byteArrayToHex(bArr));
                    int record = VCPCSProcess.readRecord(bArr, bArr2, transactionContext);
                    str2 = "Read Record: ";
                    if (record < 0) {
                        bArrBuildApduR = new byte[2];
                        if (record == -7) {
                            byte[] bArr6 = Constants.ISO7816_SW_FUNC_NOT_SUPPORTED;
                            Util.arrayCopy(bArr6, (short) 0, bArrBuildApduR, (short) 0, (short) bArr6.length);
                        } else {
                            byte[] bArr7 = Constants.ISO7816_SW_FILE_NOT_FOUND;
                            Util.arrayCopy(bArr7, (short) 0, bArrBuildApduR, (short) 0, (short) bArr7.length);
                        }
                    } else {
                        bArrBuildApduR = new byte[record];
                        Util.arrayCopy(bArr2, (short) 0, bArrBuildApduR, (short) 0, (short) record);
                        lastCommandAPDU = (byte) 4;
                        if (transactionContext.getLastRecord().equals(transactionContext.getLastRecordReaded())) {
                            notifyTransactionCompleted(transactionContext);
                        }
                    }
                } else {
                    bArrBuildApduR = buildApduR(Constants.ISO7816_SW_CONDITIONS_NOT_SATISFIED);
                    notifyTransactionAborted(transactionContext);
                    str2 = "READ RECORD Command ";
                }
            }
        } else if (Arrays.equals(Constants.SELECT_PPSE_APDU, bArr)) {
            int iSelectPPSE = VCPCSProcess.selectPPSE(bArr, bArr2);
            LogTohu.d(str, "****************************************\nReceived Select PPSE: %s", Util.byteArrayToHex(bArr));
            str2 = "Select PPSE: ";
            if (iSelectPPSE >= 0) {
                bArrBuildApduR = new byte[iSelectPPSE];
                Util.arrayCopy(bArr2, (short) 0, bArrBuildApduR, (short) 0, (short) iSelectPPSE);
                lastCommandAPDU = (byte) 1;
            } else if (iSelectPPSE == -14) {
                byte[] bArr8 = Constants.SW_VIS_SELECTED_FILE_INVALIDATED;
                Util.arrayCopy(bArr8, (short) 0, bArrBuildApduR, (short) 0, (short) bArr8.length);
            } else {
                bArrBuildApduR = buildApduR(Constants.ISO7816_SW_CONDITIONS_NOT_SATISFIED);
            }
        } else {
            LogTohu.d(str, "****************************************\nReceived Select AID: %s", Util.byteArrayToHex(bArr));
            TransactionContext transactionContext2 = new TransactionContext(PaymentApplicationContext.getAtc());
            transactionContext = transactionContext2;
            int iSelectAid = VCPCSProcess.selectAid(bArr, bArr2, transactionContext2);
            str2 = "Select AID ";
            if (iSelectAid < 0) {
                bArrBuildApduR = new byte[2];
                if (iSelectAid == -16) {
                    byte[] bArr9 = Constants.ISO7816_SW_FILE_NOT_FOUND;
                    Util.arrayCopy(bArr9, (short) 0, bArrBuildApduR, (short) 0, (short) bArr9.length);
                } else {
                    byte[] bArr10 = Constants.ISO7816_SW_FUNC_NOT_SUPPORTED;
                    Util.arrayCopy(bArr10, (short) 0, bArrBuildApduR, (short) 0, (short) bArr10.length);
                }
            } else {
                bArrBuildApduR = new byte[iSelectAid];
                Util.arrayCopy(bArr2, (short) 0, bArrBuildApduR, (short) 0, (short) iSelectAid);
                lastCommandAPDU = (byte) 2;
            }
        }
        if (bArrBuildApduR != null) {
            LogTohu.d(str, "%s , Response: %s", str2, Util.byteArrayToHex(bArrBuildApduR));
        }
        return bArrBuildApduR;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public byte[] responseApduOnDeactivate(int i10) {
        return Constants.ISO7816_SW_CONDITIONS_NOT_SATISFIED;
    }
}
