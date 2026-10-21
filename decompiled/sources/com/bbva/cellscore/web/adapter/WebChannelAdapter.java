package com.bbva.cellscore.web.adapter;

import android.os.Bundle;
import com.bbva.cellscore.channel.model.Channel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebChannelAdapter implements Channel.ObjectAdapter<Bundle> {
    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Map<String, ?> transform(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                map.put(str, bundle.get(str));
            }
        }
        return map;
    }
}
