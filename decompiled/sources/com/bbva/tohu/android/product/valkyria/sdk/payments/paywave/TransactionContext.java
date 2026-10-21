package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave;

import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.ReadRecordProcess;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.AidInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.DolRequestList;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.DolValues;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.Util;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionContext {
    public static final String TAG = "TransactionContext";
    private byte[] api;
    private byte[] atc;
    private byte[] cardUnpredictableNumber;
    public byte[] ctq;
    public byte[] cvr;
    private byte[] dki;
    private String expectedUserActionOnPoi;
    private byte[] iccDynamicData;
    private boolean isOda;
    private String lastRecord;
    private String lastRecordReaded;
    private byte[] luk;
    public byte[][] recordIndex;
    public Object[] recordValues;
    public List returnedPartialAids;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private int f36930sc;
    private String selectedAid;
    private AidInfo selectedAidInfo;
    private byte terminalProfile;
    private DolRequestList dolRequestList = new DolRequestList();
    private DolValues dolValues = new DolValues();
    private ReadRecordProcess readRecordProcess = new ReadRecordProcess();

    public TransactionContext(int i10) {
        reset(i10);
    }

    private void initializeRecordIndex() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 2);
        this.recordIndex = bArr;
        byte[] bArr2 = bArr[0];
        bArr2[0] = 1;
        bArr2[1] = 3;
        byte[] bArr3 = bArr[1];
        bArr3[0] = 2;
        bArr3[1] = 2;
        byte[] bArr4 = bArr[2];
        bArr4[0] = 2;
        bArr4[1] = 3;
        byte[] bArr5 = bArr[3];
        bArr5[0] = 2;
        bArr5[1] = 4;
    }

    public byte[] getAmount() {
        return this.dolValues.getValueByTag("9F02");
    }

    public byte[] getApi() {
        return this.api;
    }

    public byte[] getAtc() {
        return this.atc;
    }

    public byte[] getCardUnpredictableNumber() {
        return this.cardUnpredictableNumber;
    }

    public byte[] getCtq() {
        return this.ctq;
    }

    public byte[] getCurrency() {
        return this.dolValues.getValueByTag("5F2A");
    }

    public byte[] getCvr() {
        return this.cvr;
    }

    public byte[] getDki() {
        return this.dki;
    }

    public DolRequestList getDolRequestList() {
        return this.dolRequestList;
    }

    public DolValues getDolValues() {
        return this.dolValues;
    }

    public String getExpectedUserActionOnPoi() {
        return this.expectedUserActionOnPoi;
    }

    public byte[] getIccDynamicData() {
        return this.iccDynamicData;
    }

    public String getLastRecord() {
        return this.lastRecord;
    }

    public String getLastRecordReaded() {
        return this.lastRecordReaded;
    }

    public byte[] getLuk() {
        return this.luk;
    }

    public int getSc() {
        return this.f36930sc;
    }

    public String getSelectedAID() {
        return this.selectedAid;
    }

    public AidInfo getSelectedAidInfo() {
        return this.selectedAidInfo;
    }

    public byte getTerminalProfile() {
        return this.terminalProfile;
    }

    public void initializeRecords() {
        Object[] objArr = new Object[4];
        this.recordValues = objArr;
        if (this.isOda) {
            objArr[0] = null;
            objArr[1] = this.readRecordProcess.readRecord202(this.selectedAidInfo);
            this.recordValues[2] = this.readRecordProcess.readRecord203(this.selectedAidInfo);
            this.recordValues[3] = this.readRecordProcess.readRecord0204(this);
            return;
        }
        objArr[0] = this.readRecordProcess.readRecord103();
        Object[] objArr2 = this.recordValues;
        objArr2[1] = null;
        objArr2[2] = null;
        objArr2[3] = null;
    }

    public boolean isOda() {
        return this.isOda;
    }

    public boolean isTerminalQvscdCompatible() {
        return this.terminalProfile == 1;
    }

    public void reset(int i10) {
        this.lastRecord = null;
        this.returnedPartialAids = new ArrayList();
        this.dolRequestList = new DolRequestList();
        this.dolValues = new DolValues();
        this.cvr = new byte[]{0, 0, 0, 0, 0, 0};
        this.cardUnpredictableNumber = Util.getRandomBytes(4);
        this.ctq = null;
        String ctq = PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getStaticParams().getqVSDCData().getCtq();
        if (ctq != null && !ctq.isEmpty()) {
            this.ctq = HexUtils.byteArrayFromHexString(ctq);
        }
        byte[] bArrArray = ByteBuffer.allocate(2).putShort((short) i10).array();
        this.atc = bArrArray;
        this.iccDynamicData = bArrArray;
        String str = TAG;
        LogTohu.d(str, "cardProfile API: %s", PaymentApplicationContext.cardProfile.getTokenInfo().getHceData().getDynParams().getApi());
        LogTohu.d(str, "Token (en PaymentApplicationContent) API: %s", PaymentApplicationContext.getApi());
        this.api = HexUtils.byteArrayFromHexString(PaymentApplicationContext.getApi());
        this.f36930sc = PaymentApplicationContext.getSc();
        this.dki = HexUtils.byteArrayFromHexString(PaymentApplicationContext.getDki());
        initializeRecordIndex();
        initializeRecords();
    }

    public void setApi(byte[] bArr) {
        this.api = bArr;
    }

    public void setAtc(byte[] bArr) {
        this.atc = bArr;
    }

    public void setCtq(byte[] bArr) {
        this.ctq = bArr;
    }

    public void setCvr(byte[] bArr) {
        this.cvr = bArr;
    }

    public void setExpectedUserActionOnPoi(String str) {
        this.expectedUserActionOnPoi = str;
    }

    public void setLastRecord(String str) {
        this.lastRecord = str;
    }

    public void setLastRecordReaded(String str) {
        this.lastRecordReaded = str;
    }

    public void setLuk(byte[] bArr) {
        this.luk = bArr;
    }

    public void setOda(boolean z10) {
        this.isOda = z10;
    }

    public void setSelectedAid(String str) {
        this.selectedAid = str;
    }

    public void setSelectedAidInfo(AidInfo aidInfo) {
        this.selectedAidInfo = aidInfo;
    }

    public void setTerminalProfile(byte b10) {
        this.terminalProfile = b10;
    }

    public String toString() {
        return "TransactionContext{selectedAid='" + this.selectedAid + "', dolRequestList=" + this.dolRequestList + ", dolValues=" + this.dolValues + ", ctq=" + Arrays.toString(this.ctq) + ", cvr=" + Arrays.toString(this.cvr) + ", selectedAidInfo=" + this.selectedAidInfo + ", atc=" + Arrays.toString(this.atc) + ", luk=" + Arrays.toString(this.luk) + ", cardUnpredictableNumber=" + Arrays.toString(this.cardUnpredictableNumber) + ", recordIndex=" + Arrays.toString(this.recordIndex) + ", recordValues=" + Arrays.toString(this.recordValues) + ", isOda=" + this.isOda + ", readRecordProcess=" + this.readRecordProcess + ", terminalProfile=" + ((int) this.terminalProfile) + ", api=" + Arrays.toString(this.api) + AbstractJsonLexerKt.END_OBJ;
    }
}
