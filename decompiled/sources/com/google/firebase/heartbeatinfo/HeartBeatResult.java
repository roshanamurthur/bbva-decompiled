package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import gg.a;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@AutoValue
public abstract class HeartBeatResult {
    public static HeartBeatResult create(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> getUsedDates();

    public abstract String getUserAgent();
}
