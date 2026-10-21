package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    public static final class a implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48741a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f48742b = FieldDescriptor.of("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f48743c = FieldDescriptor.of("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f48744d = FieldDescriptor.of("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f48745e = FieldDescriptor.of("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f48746f = FieldDescriptor.of("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) throws IOException {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f48742b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f48743c, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f48744d, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f48745e, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f48746f, rolloutAssignment.getTemplateVersion());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        a aVar = a.f48741a;
        encoderConfig.registerEncoder(RolloutAssignment.class, aVar);
        encoderConfig.registerEncoder(com.google.firebase.remoteconfig.interop.rollouts.a.class, aVar);
    }
}
