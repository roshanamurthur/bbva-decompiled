package com.noknok.android.uaf.asmcore;

import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AuthenticatorDatabase {
    protected static final String ASM_TOKEN = "ASMToken";
    protected static final String NNL_AK_CONFIG = "NNL_AK_CONFIG";

    public abstract void addKeyValue(String str, String str2);

    public abstract void addRegistration(RegistrationRecord registrationRecord);

    public abstract void eraseDatabase();

    public String getAKConfig() {
        return getValue(NNL_AK_CONFIG);
    }

    public String getASMToken() {
        return getValue(ASM_TOKEN);
    }

    public String getAntiHammeringFailedAttempts() {
        return getValue("anti_hammer");
    }

    public String getAntiHammeringFailedTime() {
        return getValue("anti_hammer_false_attempt_time");
    }

    public String getKeyId(String str, String str2, String str3) {
        List<RegistrationRecord> registrations = getRegistrations(str3, str2, null);
        if (registrations.isEmpty()) {
            return null;
        }
        for (RegistrationRecord registrationRecord : registrations) {
            if (registrationRecord.keyHandle.equals(str)) {
                return registrationRecord.keyID;
            }
        }
        return null;
    }

    public abstract List<RegistrationRecord> getRegistrations();

    public abstract List<RegistrationRecord> getRegistrations(String str);

    public List<RegistrationRecord> getRegistrations(String str, String str2, List<String> list) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("The callerID is invalid");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("The appID is invalid");
        }
        List<RegistrationRecord> registrations = getRegistrations(str);
        ArrayList arrayList = new ArrayList();
        for (RegistrationRecord registrationRecord : registrations) {
            if (str.equals(registrationRecord.callerID) && str2.equals(registrationRecord.appID)) {
                arrayList.add(new RegistrationRecord(registrationRecord));
            }
        }
        if (list != null && list.size() != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!list.contains(((RegistrationRecord) it.next()).keyID)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public abstract String getValue(String str);

    public abstract boolean hasRegistrations();

    public abstract void removeAllRegistrations();

    public abstract void removeRegistration(String str, String str2, String str3);

    public abstract void removeRegistrations(String str, String str2);

    public void storeAKConfig(String str) {
        addKeyValue(NNL_AK_CONFIG, str);
    }

    public void storeASMToken(String str) {
        addKeyValue(ASM_TOKEN, str);
    }

    public void storeAntiHammeringFailedAttempts(String str) {
        addKeyValue("anti_hammer", str);
    }

    public void storeAntiHammeringFailedTime(String str) {
        addKeyValue("anti_hammer_false_attempt_time", str);
    }

    public abstract void storeStashId(String str, Map<String, String> map);

    public abstract void transferStashedData(String str, RegistrationRecord registrationRecord);

    public abstract void updateRegistrationRecord(RegistrationRecord registrationRecord);

    public abstract void validateUserRegistrations(IMatcher iMatcher);

    public static class RegistrationRecord {
        public String appID;
        public String callerID;
        public String keyHandle;
        public String keyID;
        public Map<String, String> kvs;
        public long timeStamp;
        public String userID;

        public RegistrationRecord() {
            this.kvs = new HashMap();
        }

        public RegistrationRecord(RegistrationRecord registrationRecord) {
            this.kvs = new HashMap();
            this.callerID = registrationRecord.callerID;
            this.appID = registrationRecord.appID;
            this.keyID = registrationRecord.keyID;
            this.keyHandle = registrationRecord.keyHandle;
            this.userID = registrationRecord.userID;
            this.timeStamp = registrationRecord.timeStamp;
            this.kvs = registrationRecord.kvs;
        }
    }

    public void setAuthenticatorIndex(short s4) {
    }
}
