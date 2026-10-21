package com.bbva.cellscore.channel.model.channel;

import com.bbva.cellscore.channel.model.Channel;

/* JADX INFO: loaded from: classes2.dex */
public class PrivateChannel<T> extends Channel<T> {
    public PrivateChannel(String str) {
        super(str, Channel.Type.REPLAY);
        setAutoClean(true);
        setSaveOnDestroy(false);
    }

    @Override // com.bbva.cellscore.channel.model.Channel
    public PrivateChannel<T> cloneWithName(String str) {
        return new PrivateChannel<>(this, str);
    }

    public PrivateChannel(PrivateChannel<T> privateChannel, String str) {
        super(privateChannel, str);
    }
}
