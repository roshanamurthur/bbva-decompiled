package com.bbva.cellscore.web.data.component;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ChannelMessage implements Parcelable {
    public static ChannelMessage create(String str, Bundle bundle) {
        return new AutoValue_ChannelMessage(str, bundle);
    }

    public static ChannelMessage empty() {
        return new AutoValue_ChannelMessage("", new Bundle());
    }

    public abstract String channelName();

    public abstract Bundle values();
}
