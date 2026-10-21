package com.bbva.cellscore.web.model.channel;

/* JADX INFO: loaded from: classes2.dex */
public class JsonChannel extends BundleWebChannel {
    public JsonChannel(String str) {
        super(str);
    }

    public JsonChannel(JsonChannel jsonChannel, String str) {
        super(jsonChannel, str);
    }

    @Override // com.bbva.cellscore.web.model.channel.BundleWebChannel, com.bbva.cellscore.web.model.channel.WebChannel, com.bbva.cellscore.channel.model.Channel
    public JsonChannel cloneWithName(String str) {
        return new JsonChannel(this, str);
    }
}
