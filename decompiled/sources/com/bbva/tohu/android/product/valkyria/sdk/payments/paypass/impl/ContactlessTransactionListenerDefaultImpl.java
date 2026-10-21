package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.PaymentResponse;
import com.bbva.tohu.android.product.valkyria.sdk.payments.AmountInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.ContactlessTransactionResponseLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ExpectedUserActionOnPoi;
import com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class ContactlessTransactionListenerDefaultImpl implements ContactlessTransactionListener {
    private static final String DATE_FORMAT = "ddMMyyyy";
    private static final String RESPONSE_ABORT = "ABORT";
    private static final String RESPONSE_COMPLETED = "COMPLETED";
    private static final String TAG = "ContactlessTransactionListenerDefaultImpl";
    private static final int YEAR_BASE = 2006;
    private AuthenticationManager authenticationManager;
    private DeviceInfo deviceInfo;
    private EncoderService encoderService;
    private ContactlessTransactionResponseLogic transactionResponseLogic;

    public ContactlessTransactionListenerDefaultImpl(ContactlessTransactionResponseLogic contactlessTransactionResponseLogic, EncoderService encoderService, DeviceInfo deviceInfo, AuthenticationManager authenticationManager) {
        this.encoderService = encoderService;
        this.transactionResponseLogic = contactlessTransactionResponseLogic;
        this.deviceInfo = deviceInfo;
        this.authenticationManager = authenticationManager;
    }

    private PaymentResponse convert(ContactlessLog contactlessLog, String str) {
        PaymentResponse paymentResponseConvertCompleted = str.equals(RESPONSE_COMPLETED) ? convertCompleted(contactlessLog) : convertAbort(contactlessLog);
        paymentResponseConvertCompleted.setAtc(contactlessLog.getAtc());
        paymentResponseConvertCompleted.setCardUnpredicableNumber(contactlessLog.getUnpredictableNumber());
        return paymentResponseConvertCompleted;
    }

    private PaymentResponse convertAbort(ContactlessLog contactlessLog) {
        PaymentResponse paymentResponseConvert = convert(contactlessLog);
        paymentResponseConvert.setAmount(getAmount(contactlessLog));
        paymentResponseConvert.setComplete(false);
        return paymentResponseConvert;
    }

    private PaymentResponse convertCompleted(ContactlessLog contactlessLog) {
        PaymentResponse paymentResponseConvert = convert(contactlessLog);
        paymentResponseConvert.setComplete(true);
        if (contactlessLog.getTransactionInformation() != null) {
            paymentResponseConvert.setAmount(Double.valueOf(contactlessLog.getTransactionInformation().getAuthorizedAmount()));
            paymentResponseConvert.setOperationType(contactlessLog.getTransactionInformation().getTransactionType().name());
        }
        if (contactlessLog.getTerminalInformation() != null) {
            paymentResponseConvert.setTerminalType(contactlessLog.getTerminalInformation().getTerminalType().name());
        }
        return paymentResponseConvert;
    }

    private Double getAmount(ContactlessLog contactlessLog) {
        if (contactlessLog.getAmount() == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(this.encoderService.hexStringFromBytes(contactlessLog.getAmount())) / 100.0d);
    }

    private AmountInfo getAmountInfo(ContactlessLog contactlessLog) {
        Double amount = getAmount(contactlessLog);
        String currencyCode = null;
        String strValueOf = amount != null ? String.valueOf(amount) : null;
        if (contactlessLog.getTransactionInformation() != null && contactlessLog.getTransactionInformation().getCurrency() != null) {
            currencyCode = contactlessLog.getTransactionInformation().getCurrency().getCurrencyCode();
        }
        return new AmountInfo(strValueOf, currencyCode);
    }

    private Date getDate(byte[] bArr) throws InternalErrorException {
        try {
            String strHexStringFromBytes = this.encoderService.hexStringFromBytes(bArr);
            String strSubstring = strHexStringFromBytes.substring(0, 4);
            int i10 = Integer.parseInt(strHexStringFromBytes.substring(4)) + YEAR_BASE;
            return new SimpleDateFormat(DATE_FORMAT).parse(strSubstring + i10);
        } catch (Exception e5) {
            throw new InternalErrorException(e5);
        }
    }

    private String getResultFromTypeResponse(String str) {
        return str.equals(RESPONSE_COMPLETED) ? "OK" : "TOHU_PAYMENT_ABORT";
    }

    private String parseExpectedUserActionOnPoi(ExpectedUserActionOnPoi expectedUserActionOnPoi) {
        if (expectedUserActionOnPoi == ExpectedUserActionOnPoi.ONLINE_PIN) {
            return ExpectedUserActionOnPoiTypes.ONLINE_PIN;
        }
        if (expectedUserActionOnPoi == ExpectedUserActionOnPoi.SIGNATURE) {
            return ExpectedUserActionOnPoiTypes.SIGNATURE;
        }
        return expectedUserActionOnPoi == ExpectedUserActionOnPoi.NONE ? ExpectedUserActionOnPoiTypes.NONE : "UNKNOWN";
    }

    private void responseLogic(ContactlessLog contactlessLog, String str) {
        this.transactionResponseLogic.processResponse(convert(contactlessLog, str), getResultFromTypeResponse(str));
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener
    public void onContactlessReady() {
        LogTohu.d(TAG, "onContactlessReady", new Object[0]);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener
    public void onContactlessTransactionAbort(ContactlessLog contactlessLog) {
        try {
            String str = TAG;
            LogTohu.d(str, "onContactlessTransactionAbort, result: " + contactlessLog.getResult(), new Object[0]);
            LogTohu.d(str, "onContactlessTransactionAbort, object: " + contactlessLog, new Object[0]);
            responseLogic(contactlessLog, RESPONSE_ABORT);
        } catch (Exception e5) {
            LogTohu.e(TAG, "onContactlessTransactionAbort Exception: ", e5);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener
    public void onContactlessTransactionCompleted(ContactlessLog contactlessLog) {
        try {
            String str = TAG;
            LogTohu.d(str, "contactlessLog, result: " + contactlessLog.getResult(), new Object[0]);
            LogTohu.d(str, "contactlessLog, object: " + contactlessLog, new Object[0]);
            if (contactlessLog.getResult() != TransactionSummary.ABORT_PERSISTENT_CONTEXT) {
                LogTohu.d(str, "onContactlessTransactionCompleted", new Object[0]);
                responseLogic(contactlessLog, RESPONSE_COMPLETED);
            } else if (!this.deviceInfo.isDeviceSecure()) {
                this.transactionResponseLogic.notifyCdcvmDeviceSecurityDisabled(getAmountInfo(contactlessLog));
            } else if (this.deviceInfo.isDeviceLocked()) {
                this.transactionResponseLogic.notifyCdcvmDeviceUnlockRequired(getAmountInfo(contactlessLog));
                this.authenticationManager.authenticateWithDeviceUnlocking();
            } else {
                this.transactionResponseLogic.notifyCdcvmUserAuthenticationRequired(getAmountInfo(contactlessLog));
            }
        } catch (Exception e5) {
            LogTohu.e(TAG, "onContactlessTransactionCompleted Exception: ", e5);
        }
    }

    private PaymentResponse convert(ContactlessLog contactlessLog) {
        PaymentResponse paymentResponse = new PaymentResponse();
        try {
            paymentResponse.setOperationDate(getDate(contactlessLog.getDate()));
        } catch (Exception e5) {
            LogTohu.e(TAG, "Parse exception: ", e5);
        }
        if (contactlessLog.getTransactionInformation() != null) {
            paymentResponse.setCurrency(contactlessLog.getTransactionInformation().getCurrency());
            paymentResponse.setExpectedUserActionOnPoi(parseExpectedUserActionOnPoi(contactlessLog.getTransactionInformation().getExpectedUserActionOnPoi()));
        }
        return paymentResponse;
    }
}
