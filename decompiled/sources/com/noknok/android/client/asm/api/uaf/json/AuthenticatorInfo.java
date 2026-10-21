package com.noknok.android.client.asm.api.uaf.json;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorInfo implements Cloneable {

    @Expose
    public static final short AAID_VALID_LENGTH = 9;

    @Expose
    public String aaid;

    @Expose
    public String assertionScheme;

    @Expose
    public long attachmentHint;

    @Expose
    public List<Short> attestationTypes;

    @Expose
    public short authenticationAlgorithm;

    @Expose
    public short authenticatorIndex;

    @Expose
    public String description;

    @Expose
    public boolean hasSettings;

    @Expose
    public String icon;

    @Expose
    public boolean isRoamingAuthenticator;

    @Expose
    public boolean isSecondFactorOnly;

    @Expose
    public boolean isUserEnrolled;

    @Expose
    public short keyProtection;

    @Expose
    public short matcherProtection;

    @Expose
    public short tcDisplay;

    @Expose
    public String tcDisplayContentType;

    @Expose
    public List<DisplayPNGCharacteristicsDescriptor> tcDisplayPNGCharacteristics;

    @Expose
    public String title;

    @Expose
    public long userVerification;

    @Expose
    public List<Version> asmVersions = new ArrayList();

    @Expose
    public List<String> supportedExtensionIDs = new ArrayList();

    public AuthenticatorInfo shallowCopy() {
        try {
            return (AuthenticatorInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException("AuthenticatorInfo class does not implements Cloneable interface");
        }
    }

    @NonNull
    public String toString() {
        return "authenticatorIndex: " + ((int) this.authenticatorIndex) + "\n aiVersion: " + this.asmVersions + "\n aaid: " + this.aaid + "\n userVerification: " + this.userVerification + "\n keyProtection: " + ((int) this.keyProtection) + "\n matcherProtection: " + ((int) this.matcherProtection) + "\n attachmentHint: " + this.attachmentHint + "\n tcDisplay: " + ((int) this.tcDisplay) + "\n tcDisplayContentType: " + this.tcDisplayContentType + "\n tcDisplayPNGCharacteristics: " + this.tcDisplayPNGCharacteristics + "\n authenticationAlgorithm: " + ((int) this.authenticationAlgorithm) + "\n attestationTypes: " + this.attestationTypes + "\n scheme: " + this.assertionScheme + "\n isSecondFactorOnly: " + this.isSecondFactorOnly + "\n isRoamingAuthenticator: " + this.isRoamingAuthenticator + "\n isUserEnrolled: " + this.isUserEnrolled + "\n supportedExtensionIDs: " + this.supportedExtensionIDs + "\n title: " + this.title + "\n description: " + this.description + "\n hasSettings: " + this.hasSettings;
    }
}
