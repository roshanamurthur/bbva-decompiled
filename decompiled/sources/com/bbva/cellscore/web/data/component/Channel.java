package com.bbva.cellscore.web.data.component;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class Channel implements Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChannelType {
        private static final /* synthetic */ ChannelType[] $VALUES;
        public static final ChannelType IN;
        public static final ChannelType OUT;

        static {
            ChannelType channelType = new ChannelType("IN", 0);
            IN = channelType;
            ChannelType channelType2 = new ChannelType("OUT", 1);
            OUT = channelType2;
            $VALUES = new ChannelType[]{channelType, channelType2};
        }

        public ChannelType() {
            throw null;
        }

        public static ChannelType valueOf(String str) {
            return (ChannelType) Enum.valueOf(ChannelType.class, str);
        }

        public static ChannelType[] values() {
            return (ChannelType[]) $VALUES.clone();
        }
    }

    public static Channel create(String str, ChannelType channelType, String str2, String str3, String str4) {
        return new AutoValue_Channel(str, channelType, str2, str3, str4);
    }

    public abstract String bind();

    public abstract String name();

    public abstract String nativeLink();

    public abstract ChannelType type();

    public abstract String webLink();
}
