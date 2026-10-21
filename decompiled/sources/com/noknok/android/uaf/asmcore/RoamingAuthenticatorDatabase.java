package com.noknok.android.uaf.asmcore;

import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.GetRegistrationsOut;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RoamingAuthenticatorDatabase extends AuthenticatorDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f63536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AKProcessor f63537b;

    public RoamingAuthenticatorDatabase(AKProcessor aKProcessor) {
        this.f63537b = aKProcessor;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void addKeyValue(String str, String str2) {
        throw new IllegalStateException("addKeyValue not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void addRegistration(AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        throw new IllegalStateException("addRegistration not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void eraseDatabase() {
        throw new IllegalStateException("eraseDatabase not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public List<AuthenticatorDatabase.RegistrationRecord> getRegistrations(String str) {
        return getRegistrations();
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public String getValue(String str) {
        return null;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public boolean hasRegistrations() {
        return false;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeAllRegistrations() {
        throw new IllegalStateException("removeAllRegistrations not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeRegistration(String str, String str2, String str3) {
        throw new IllegalStateException("removeRegistration not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeRegistrations(String str, String str2) {
        throw new IllegalStateException("removeRegistrations not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void setAuthenticatorIndex(short s4) {
        this.f63536a = s4;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void storeStashId(String str, Map<String, String> map) {
        throw new IllegalStateException("storeStashId not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void transferStashedData(String str, AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        throw new IllegalStateException("transferStashedData not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void updateRegistrationRecord(AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        throw new IllegalStateException("updateRegistrationRecord not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void validateUserRegistrations(IMatcher iMatcher) {
        throw new IllegalStateException("validateUserRegistrations not supported in roaming authenticator");
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public List<AuthenticatorDatabase.RegistrationRecord> getRegistrations() {
        AKProcessor.AKResponseParams aKResponseParamsProcessAK = this.f63537b.processAK(new AKProcessor.AKRequestParams().setCmd(TLVCommandEncoder.Commands.GET_REGISTRATIONS).setAuthenticatorIndex((byte) this.f63536a));
        if (aKResponseParamsProcessAK.statusCode != Outcome.SUCCESS.getUafCmdStatusCode()) {
            throw new AsmException(Outcome.fromUafCmdStatusCode(aKResponseParamsProcessAK.statusCode), "GetRegistrations call to AK failed.");
        }
        ArrayList arrayList = new ArrayList();
        for (GetRegistrationsOut.AppRegistration appRegistration : aKResponseParamsProcessAK.appRegistrations) {
            for (String str : appRegistration.keyIDs) {
                AuthenticatorDatabase.RegistrationRecord registrationRecord = new AuthenticatorDatabase.RegistrationRecord();
                registrationRecord.appID = appRegistration.appID;
                registrationRecord.keyID = str;
                arrayList.add(registrationRecord);
                Logger.d("RoamingAuthenticatorDatabase", String.format("Adding regRecord appID: %s keyID: %s", registrationRecord.appID, registrationRecord.keyID));
            }
        }
        Logger.d("RoamingAuthenticatorDatabase", String.format("number of registrations: %s", Integer.valueOf(arrayList.size())));
        return arrayList;
    }
}
