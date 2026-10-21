package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.Validator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MatchCriteria {

    @Expose
    public List<String> aaid;

    @Expose
    public List<String> assertionSchemes;

    @Expose
    public Long attachmentHint;

    @Expose
    public List<Short> attestationTypes;

    @Expose
    public List<Short> authenticationAlgorithms;

    @Expose
    public Short authenticatorVersion;
    public List<Extension> exts;

    @Expose
    public List<String> keyIDs;

    @Expose
    public Short keyProtection;

    @Expose
    public Short matcherProtection;

    @Expose
    public Short tcDisplay;

    @Expose
    public Long userVerification;

    @Expose
    public List<String> vendorID;

    public boolean isValid() {
        List<String> list = this.aaid;
        if (list != null && (this.vendorID != null || this.userVerification != null || this.keyProtection != null || this.matcherProtection != null || this.tcDisplay != null || this.authenticationAlgorithms != null || this.assertionSchemes != null || this.attestationTypes != null)) {
            return false;
        }
        if (list == null && (this.authenticationAlgorithms == null || this.assertionSchemes == null)) {
            return false;
        }
        List<Short> list2 = this.attestationTypes;
        if (list2 != null) {
            Iterator<Short> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return false;
                }
            }
        }
        List<Extension> list3 = this.exts;
        if (list3 != null) {
            for (Extension extension : list3) {
                if (extension == null || !extension.isValid()) {
                    return false;
                }
            }
        }
        List<String> list4 = this.keyIDs;
        if (list4 == null || list4.isEmpty()) {
            return true;
        }
        for (String str : this.keyIDs) {
            if (str == null || str.isEmpty() || !Validator.isValidBase64Format(str, 32, 2048)) {
                return false;
            }
        }
        return true;
    }
}
