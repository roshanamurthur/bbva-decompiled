package com.noknok.android.uaf.framework.service;

import com.fido.uaf.ver0100.engine.UafEngine;
import com.fido.uaf.ver0100.types.UafException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.StrictTypeAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class UafVersionSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Version, SupportedMessage> f63610a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UafProcessor.UafRequestTask f63611b;
    public static final Map<Version, List<Version>> FC_VERSION_SET = new HashMap<Version, List<Version>>() { // from class: com.noknok.android.uaf.framework.service.UafVersionSelector.1
        {
            put(new Version((short) 1, (short) 0), Collections.singletonList(new Version((short) 1, (short) 0)));
            put(new Version((short) 1, (short) 1), Collections.singletonList(new Version((short) 1, (short) 1)));
        }
    };
    public static final Map<String, List<Version>> AS_UPV_SET = new HashMap<String, List<Version>>() { // from class: com.noknok.android.uaf.framework.service.UafVersionSelector.2
        {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Version((short) 1, (short) 0));
            arrayList.add(new Version((short) 1, (short) 1));
            put("UAFV1TLV", arrayList);
        }
    };

    public static class SupportedMessage {
        public final List<Authenticator> authenticators = new ArrayList();
        public ExtensionManager extensionManager;
        public final UafEngine uafEngine;
        public Object uafMessage;

        public SupportedMessage(UafEngine uafEngine) {
            this.uafEngine = uafEngine;
        }
    }

    public UafVersionSelector(UafProcessor.UafRequestTask uafRequestTask) {
        this.f63611b = uafRequestTask;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    public List<SupportedMessage> getAvailableMessages() {
        SupportedMessage supportedMessage = (SupportedMessage) this.f63610a.get((Version) Collections.max(getSupportedMessageMap().keySet()));
        for (Authenticator authenticator : supportedMessage.uafEngine.getAuthenticators(this.f63611b, supportedMessage.uafMessage)) {
            AuthenticatorInfo authnrInfo = authenticator.getAuthnrInfo();
            ArrayList arrayList = new ArrayList(AS_UPV_SET.get(authnrInfo.assertionScheme));
            arrayList.retainAll(this.f63610a.keySet());
            Version version = (Version) Collections.max(arrayList);
            ArrayList arrayList2 = new ArrayList(FC_VERSION_SET.get(version));
            arrayList2.retainAll(authnrInfo.asmVersions);
            if (!arrayList2.isEmpty()) {
                authenticator.setVersion((Version) Collections.max(arrayList2));
                ((SupportedMessage) this.f63610a.get(version)).authenticators.add(authenticator);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SupportedMessage supportedMessage2 : this.f63610a.values()) {
            if (supportedMessage2.authenticators.size() > 0) {
                arrayList3.add(supportedMessage2);
            }
        }
        if (this.f63611b.mCheckPolicy || !arrayList3.isEmpty()) {
            return arrayList3;
        }
        Logger.e("UafVersionSelector", "Authenticators with supported versions were not found.");
        throw new UafException(Outcome.NO_MATCH);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<com.noknok.android.client.asm.api.uaf.json.Version, com.noknok.android.uaf.framework.service.UafVersionSelector$SupportedMessage>] */
    public Map<Version, SupportedMessage> getSupportedMessageMap() {
        Map<Version, SupportedMessage> map = this.f63610a;
        if (map != null) {
            return map;
        }
        this.f63610a = new HashMap();
        ArrayList arrayList = new ArrayList();
        UafEngine uafEngine = new UafEngine();
        try {
            for (JsonElement jsonElement : (JsonArray) JsonParser.parseString(this.f63611b.mUafMessage)) {
                JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("header");
                if (jsonElement2 == null || !jsonElement2.isJsonObject()) {
                    throw new UafException(Outcome.PROTOCOL_ERROR, "Invalid message header.");
                }
                Version version = (Version) StrictTypeAdapter.GsonBuilder().create().fromJson(jsonElement2.getAsJsonObject().get("upv"), Version.class);
                if (version == null || !version.isValid()) {
                    throw new UafException(Outcome.PROTOCOL_ERROR, "Invalid UPV.");
                }
                if (arrayList.contains(version)) {
                    throw new UafException(Outcome.PROTOCOL_ERROR, "Duplicate UPV.");
                }
                arrayList.add(version);
                if (FC_VERSION_SET.containsKey(version)) {
                    SupportedMessage supportedMessage = new SupportedMessage(uafEngine);
                    supportedMessage.uafMessage = supportedMessage.uafEngine.parseRequest(jsonElement);
                    this.f63610a.put(version, supportedMessage);
                }
            }
            if (!this.f63610a.isEmpty()) {
                return this.f63610a;
            }
            Logger.e("UafVersionSelector", "Messages with supported versions were not found.");
            throw new UafException(Outcome.NOT_COMPATIBLE);
        } catch (JsonParseException e5) {
            Logger.e("UafVersionSelector", "Failed to parse json", e5);
            throw new UafException(Outcome.PROTOCOL_ERROR);
        } catch (ClassCastException e7) {
            Logger.e("UafVersionSelector", "UAF message object is not JSON array", e7);
            throw new UafException(Outcome.PROTOCOL_ERROR);
        }
    }

    public void resetSupportedMessageMap() {
        this.f63610a = null;
    }
}
