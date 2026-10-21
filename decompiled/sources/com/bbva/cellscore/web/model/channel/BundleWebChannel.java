package com.bbva.cellscore.web.model.channel;

import android.os.Bundle;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.adapter.WebChannelAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class BundleWebChannel extends WebChannel<Bundle> implements Channel.RestoreExecutor<Bundle> {
    public BundleWebChannel(String str) {
        super(str, new WebChannelAdapter(), null, null, null);
    }

    @Override // com.bbva.cellscore.web.model.channel.WebChannel, com.bbva.cellscore.channel.model.Channel
    public Channel<Bundle> cloneWithName(String str) {
        return new BundleWebChannel(this, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.cellscore.channel.model.Channel.RestoreExecutor
    public Bundle onRestore(Bundle bundle) {
        return bundle;
    }

    public BundleWebChannel(BundleWebChannel bundleWebChannel, String str) {
        super(bundleWebChannel, str);
    }
}
