package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.DisplayPNGCharacteristicsDescriptor;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AuthenticatorRegistrationAssertion {

    @Expose
    public String assertion;

    @Expose
    public String assertionScheme;

    @Expose
    public List<Extension> exts;

    @Expose
    public List<DisplayPNGCharacteristicsDescriptor> tcDisplayPNGCharacteristics;

    public AuthenticatorRegistrationAssertion(String str, String str2, List<Extension> list) {
        this.assertionScheme = str;
        this.assertion = str2;
        this.exts = list;
    }
}
