package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* JADX INFO: loaded from: classes10.dex */
public class HeartBeatConsumerComponent {

    public class a implements HeartBeatConsumer {
    }

    public static Component<?> create() {
        return Component.intoSet(new a(), (Class<a>) HeartBeatConsumer.class);
    }
}
