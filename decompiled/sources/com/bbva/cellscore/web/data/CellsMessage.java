package com.bbva.cellscore.web.data;

import android.os.Bundle;
import android.os.Parcelable;
import com.bbva.cellscore.web.data.component.ChannelMessage;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class CellsMessage implements Parcelable {
    public static CellsMessage create(String str, String str2, Bundle bundle) {
        return new AutoValue_CellsMessage(str, str2, new ArrayList(), bundle);
    }

    public static CellsMessage empty() {
        return new AutoValue_CellsMessage("", "", new ArrayList(), new Bundle());
    }

    public abstract ArrayList<ChannelMessage> channelMessage();

    public abstract String operation();

    public abstract Bundle params();

    public abstract String route();

    public static CellsMessage create(String str, ArrayList<ChannelMessage> arrayList) {
        return new AutoValue_CellsMessage(str, "", arrayList, new Bundle());
    }
}
