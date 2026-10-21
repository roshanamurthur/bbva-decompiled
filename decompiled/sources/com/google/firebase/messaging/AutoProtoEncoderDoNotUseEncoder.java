package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class a implements ObjectEncoder<MessagingClientEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48521a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48522b = androidx.collection.f.b(1, FieldDescriptor.builder("projectNumber"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48523c = androidx.collection.f.b(2, FieldDescriptor.builder("messageId"));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48524d = androidx.collection.f.b(3, FieldDescriptor.builder("instanceId"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48525e = androidx.collection.f.b(4, FieldDescriptor.builder("messageType"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f48526f = androidx.collection.f.b(5, FieldDescriptor.builder("sdkPlatform"));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f48527g = androidx.collection.f.b(6, FieldDescriptor.builder("packageName"));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f48528h = androidx.collection.f.b(7, FieldDescriptor.builder("collapseKey"));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f48529i = androidx.collection.f.b(8, FieldDescriptor.builder("priority"));

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f48530j = androidx.collection.f.b(9, FieldDescriptor.builder("ttl"));

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f48531k = androidx.collection.f.b(10, FieldDescriptor.builder("topic"));

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f48532l = androidx.collection.f.b(11, FieldDescriptor.builder("bulkId"));
        public static final FieldDescriptor m = androidx.collection.f.b(12, FieldDescriptor.builder("event"));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final FieldDescriptor f48533n = androidx.collection.f.b(13, FieldDescriptor.builder("analyticsLabel"));

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final FieldDescriptor f48534o = androidx.collection.f.b(14, FieldDescriptor.builder("campaignId"));

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FieldDescriptor f48535p = androidx.collection.f.b(15, FieldDescriptor.builder("composerLabel"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48522b, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(f48523c, messagingClientEvent.getMessageId());
            objectEncoderContext.add(f48524d, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(f48525e, messagingClientEvent.getMessageType());
            objectEncoderContext.add(f48526f, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(f48527g, messagingClientEvent.getPackageName());
            objectEncoderContext.add(f48528h, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(f48529i, messagingClientEvent.getPriority());
            objectEncoderContext.add(f48530j, messagingClientEvent.getTtl());
            objectEncoderContext.add(f48531k, messagingClientEvent.getTopic());
            objectEncoderContext.add(f48532l, messagingClientEvent.getBulkId());
            objectEncoderContext.add(m, messagingClientEvent.getEvent());
            objectEncoderContext.add(f48533n, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(f48534o, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(f48535p, messagingClientEvent.getComposerLabel());
        }
    }

    public static final class b implements ObjectEncoder<MessagingClientEventExtension> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48536a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48537b = androidx.collection.f.b(1, FieldDescriptor.builder("messagingClientEvent"));

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f48537b, ((MessagingClientEventExtension) obj).getMessagingClientEventInternal());
        }
    }

    public static final class c implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f48538a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48539b = FieldDescriptor.of("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(f48539b, ((ProtoEncoderDoNotUse) obj).getMessagingClientEventExtension());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, c.f48538a);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, b.f48536a);
        encoderConfig.registerEncoder(MessagingClientEvent.class, a.f48521a);
    }
}
