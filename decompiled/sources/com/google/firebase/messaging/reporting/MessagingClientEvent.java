package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final MessagingClientEvent f48666p = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MessageType f48670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SDKPlatform f48671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f48675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f48676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f48677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Event f48678l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f48679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f48680o;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f48681a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48682b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48683c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MessageType f48684d = MessageType.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SDKPlatform f48685e = SDKPlatform.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f48686f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f48687g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f48688h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f48689i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f48690j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f48691k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Event f48692l = Event.UNKNOWN_EVENT;
        public String m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f48693n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f48694o = "";

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.f48681a, this.f48682b, this.f48683c, this.f48684d, this.f48685e, this.f48686f, this.f48687g, this.f48688h, this.f48689i, this.f48690j, this.f48691k, this.f48692l, this.m, this.f48693n, this.f48694o);
        }

        public Builder setAnalyticsLabel(String str) {
            this.m = str;
            return this;
        }

        public Builder setBulkId(long j10) {
            this.f48691k = j10;
            return this;
        }

        public Builder setCampaignId(long j10) {
            this.f48693n = j10;
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f48687g = str;
            return this;
        }

        public Builder setComposerLabel(String str) {
            this.f48694o = str;
            return this;
        }

        public Builder setEvent(Event event) {
            this.f48692l = event;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f48683c = str;
            return this;
        }

        public Builder setMessageId(String str) {
            this.f48682b = str;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.f48684d = messageType;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f48686f = str;
            return this;
        }

        public Builder setPriority(int i10) {
            this.f48688h = i10;
            return this;
        }

        public Builder setProjectNumber(long j10) {
            this.f48681a = j10;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.f48685e = sDKPlatform;
            return this;
        }

        public Builder setTopic(String str) {
            this.f48690j = str;
            return this;
        }

        public Builder setTtl(int i10) {
            this.f48689i = i10;
            return this;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j10, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i10, int i11, String str5, long j11, Event event, String str6, long j12, String str7) {
        this.f48667a = j10;
        this.f48668b = str;
        this.f48669c = str2;
        this.f48670d = messageType;
        this.f48671e = sDKPlatform;
        this.f48672f = str3;
        this.f48673g = str4;
        this.f48674h = i10;
        this.f48675i = i11;
        this.f48676j = str5;
        this.f48677k = j11;
        this.f48678l = event;
        this.m = str6;
        this.f48679n = j12;
        this.f48680o = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return f48666p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.m;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.f48677k;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.f48679n;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.f48673g;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.f48680o;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.f48678l;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.f48669c;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.f48668b;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.f48670d;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.f48672f;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.f48674h;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.f48667a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.f48671e;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.f48676j;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.f48675i;
    }
}
