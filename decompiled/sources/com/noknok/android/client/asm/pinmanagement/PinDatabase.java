package com.noknok.android.client.asm.pinmanagement;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.fido.android.framework.tm.core.prov.CryptoModule;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.authenticator.KsUafCryptoLayer;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabase;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabaseFactory;
import com.noknok.android.uaf.asmcore.BoundAuthenticatorDatabase;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PinDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BoundAuthenticatorDatabase f63280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63281b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63282c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63283d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63284e = null;

    public static class AKConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f63285a;

        private AKConfig() {
            this.f63285a = null;
        }

        public final void a(String str) {
            byte[] bArrUnwrapObjectStatic = KsUafCryptoLayer.unwrapObjectStatic(Base64.decode(str, 11));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrUnwrapObjectStatic);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
            if (ByteBuffer.wrap(bArrUnwrapObjectStatic, 0, 4).order(byteOrder).getInt() != 1) {
                while (byteBufferOrder.hasRemaining()) {
                    try {
                        short s4 = byteBufferOrder.getShort();
                        int i10 = byteBufferOrder.getShort();
                        if (s4 != 25124) {
                            byteBufferOrder.get(new byte[i10]);
                        } else {
                            if (i10 != 48) {
                                throw new InvalidParameterException("Invalid matcherData length");
                            }
                            byte[] bArr = new byte[i10];
                            this.f63285a = bArr;
                            byteBufferOrder.get(bArr);
                        }
                    } catch (InvalidParameterException unused) {
                        Logger.e("PinDatabase", "Failed to parse TLV AK configuration");
                        return;
                    }
                }
                return;
            }
            try {
                byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                short s7 = byteBufferOrder.getShort();
                if (s7 > 5) {
                    throw new InvalidParameterException("Invalid AKConfig old format: pins count");
                }
                for (int i11 = 0; i11 < s7; i11++) {
                    short s9 = byteBufferOrder.getShort();
                    byte[] bArr2 = new byte[byteBufferOrder.getShort()];
                    this.f63285a = bArr2;
                    byteBufferOrder.get(bArr2);
                    byteBufferOrder.get(new byte[32]);
                    byteBufferOrder.getShort();
                    if (s9 < 5) {
                        return;
                    }
                }
            } catch (BufferUnderflowException unused2) {
                throw new InvalidParameterException("failed to parse old format AK configuration");
            }
        }
    }

    public static class PinConfig {

        @Expose
        public boolean confirmationButton;

        @Expose
        public long lockoutPeriod;

        @Expose
        public int maxFalseAttempts;

        @Expose
        public int maxLength;

        @Expose
        public int maxRepeatDigits;

        @Expose
        public int maxSequentialDigits;

        @Expose
        public int minLength;

        @Expose
        public long nonReusableOldPINs;

        @Expose
        public long probationPeriod;
    }

    public static class PinData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Expose
        private Integer f63286a;

        @Expose
        public PinManager.Algorithm algorithm;

        @Expose
        public String data;

        @Expose
        public Integer pinLength;

        public PinManager.Algorithm getAlgorithm() {
            PinManager.Algorithm algorithm = this.algorithm;
            return algorithm == null ? PinManager.Algorithm.SHA256 : algorithm;
        }

        public byte[] getData() {
            String str = this.data;
            if (str != null) {
                return Base64.decode(str, 11);
            }
            return null;
        }

        public int getIterationCount() {
            Integer num = this.f63286a;
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        public int getPinLength() {
            Integer num = this.pinLength;
            if (num == null) {
                return 4;
            }
            return num.intValue();
        }

        public PinData setAlgorithm(PinManager.Algorithm algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public PinData setData(byte[] bArr) {
            if (bArr != null) {
                this.data = Base64.encodeToString(bArr, 11);
            } else {
                this.data = null;
            }
            return this;
        }

        public void setIterationCount(int i10) {
            this.f63286a = Integer.valueOf(i10);
        }

        public PinData setPinLength(int i10) {
            this.pinLength = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public String toString() {
            return "{length:" + this.pinLength + ", algorithm:" + this.algorithm + ", iteration count:" + this.f63286a + "}";
        }
    }

    public PinDatabase(Context context, String str) {
        this.f63280a = (BoundAuthenticatorDatabase) AuthenticatorDatabaseFactory.createAuthenticatorStore(false, str, new CryptoModule(str, context), context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.noknok.android.client.asm.pinmanagement.PinDatabase$1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private void a() {
        if (this.f63280a.getValue("PIN_ENROLLMENT") != null) {
            return;
        }
        byte[] bArrCopyOf = 0;
        bArrCopyOf = 0;
        if (this.f63280a.hasRegistrations()) {
            try {
                AKConfig aKConfig = new AKConfig();
                aKConfig.a(this.f63280a.getAKConfig());
                byte[] bArr = aKConfig.f63285a;
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } catch (AsmException | InvalidParameterException e5) {
                Logger.e("PinDatabase", "PIN DB converter failed to decode AK config ", e5);
                this.f63280a.eraseDatabase();
            }
        }
        if (bArrCopyOf != 0) {
            PinData pinData = new PinData();
            pinData.setData(bArrCopyOf).setPinLength(4);
            this.f63280a.addKeyValue("PIN_ENROLLMENT", new Gson().toJson(pinData));
        }
    }

    public void eraseDatabase() {
        this.f63280a.eraseDatabase();
    }

    public boolean hasRegistrations() {
        return this.f63280a.hasRegistrations();
    }

    public PinData read() {
        String value;
        if (this.f63281b) {
            a();
            value = this.f63280a.getValue("PIN_ENROLLMENT");
        } else {
            if (this.f63284e == null) {
                throw new AsmException(Outcome.FAILURE, "Key ID not specified for per registration enrollment");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f63284e);
            List<AuthenticatorDatabase.RegistrationRecord> registrations = this.f63280a.getRegistrations(this.f63282c, this.f63283d, arrayList);
            if (registrations.size() != 1) {
                return null;
            }
            value = registrations.get(0).kvs.get("PIN_ENROLLMENT");
        }
        if (value != null) {
            return (PinData) new Gson().fromJson(value, PinData.class);
        }
        return null;
    }

    public List<PinData> readUsedPinsList() {
        ArrayList arrayList = (ArrayList) new Gson().fromJson(this.f63280a.getValue("USED_PINS"), new TypeToken<ArrayList<PinData>>() { // from class: com.noknok.android.client.asm.pinmanagement.PinDatabase.1
        }.getType());
        return arrayList != null ? arrayList : new ArrayList();
    }

    public void setAppId(String str) {
        this.f63283d = str;
    }

    public void setCallerId(String str) {
        this.f63282c = str;
    }

    public void setGlobalEnrollment(boolean z10) {
        this.f63281b = z10;
    }

    public void setKeyId(String str) {
        this.f63284e = str;
    }

    public void write(PinData pinData) {
        Logger.d("PinDatabase", "set PIN data: " + pinData);
        if (this.f63281b) {
            a();
            this.f63280a.addKeyValue("PIN_ENROLLMENT", new Gson().toJson(pinData));
            return;
        }
        if (this.f63284e == null) {
            throw new AsmException(Outcome.FAILURE, "Key ID not specified for per registration enrollment");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f63284e);
        List<AuthenticatorDatabase.RegistrationRecord> registrations = this.f63280a.getRegistrations(this.f63282c, this.f63283d, arrayList);
        if (registrations.size() == 1) {
            Logger.d("PinDatabase", "write RegistrationRecord");
            AuthenticatorDatabase.RegistrationRecord registrationRecord = registrations.get(0);
            registrationRecord.kvs.put("PIN_ENROLLMENT", new Gson().toJson(pinData));
            this.f63280a.updateRegistrationRecord(registrationRecord);
            return;
        }
        Logger.d("PinDatabase", "write stashData");
        HashMap map = new HashMap();
        map.put("PIN_ENROLLMENT", new Gson().toJson(pinData));
        this.f63280a.storeStashId(this.f63284e, map);
    }

    public void writeUsedPinsList(List<PinData> list) {
        this.f63280a.addKeyValue("USED_PINS", new Gson().toJson(list));
    }
}
