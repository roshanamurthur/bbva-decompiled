package com.noknok.android.uaf.framework.service;

import com.noknok.android.client.asm.api.uaf.json.DisplayPNGCharacteristicsDescriptor;
import com.noknok.android.client.asm.api.uaf.json.Version;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryData {
    public String clientVendor;
    public Version clientVersion;
    public List<Version> supportedUAFVersions = new ArrayList();
    public List<Authenticator> availableAuthenticators = new ArrayList();

    public static class Authenticator {
        public String aaid;
        public String assertionScheme;
        public long attachmentHint;
        public List<Short> attestationTypes;
        public short authenticationAlgorithm;
        public String description;
        public String icon;
        public boolean isSecondFactorOnly;
        public short keyProtection;
        public short matcherProtection;
        public List<String> supportedExtensionIDs;
        public short tcDisplay;
        public String tcDisplayContentType;
        public String title;
        public long userVerification;
        public final List<Version> supportedUAFVersions = new ArrayList();
        public List<DisplayPNGCharacteristicsDescriptor> tcDisplayPNGCharacteristics = null;
    }
}
