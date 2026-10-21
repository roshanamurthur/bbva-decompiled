package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);
}
