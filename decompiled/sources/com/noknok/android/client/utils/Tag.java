package com.noknok.android.client.utils;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class Tag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<JsonWrapper.Key, String> f63479a = new HashMap<>();

    public Tag(String str) {
        if (str != null) {
            for (JsonWrapper.Key key : JsonWrapper.Key.values()) {
                if (str.contains(key.name())) {
                    try {
                        this.f63479a.put(key, str.split(key.name() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)[1].split(ReplenishLogic.ID_SEPARATOR)[0]);
                    } catch (IndexOutOfBoundsException e5) {
                        Logger.e("Tag", "Tag parsing error: Unable to parse view tag.", e5);
                    }
                }
            }
        }
    }

    public String getValue(JsonWrapper.Key key) {
        return this.f63479a.get(key);
    }
}
