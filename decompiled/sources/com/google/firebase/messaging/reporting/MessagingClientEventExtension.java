package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagingClientEventExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MessagingClientEventExtension f48695b = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagingClientEvent f48696a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MessagingClientEvent f48697a = null;

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.f48697a);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.f48697a = messagingClientEvent;
            return this;
        }
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f48696a = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return f48695b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.f48696a;
        return messagingClientEvent == null ? MessagingClientEvent.getDefaultInstance() : messagingClientEvent;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.f48696a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
