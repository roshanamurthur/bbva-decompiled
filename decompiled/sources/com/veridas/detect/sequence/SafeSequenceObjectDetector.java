package com.veridas.detect.sequence;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.DetectionRequestException;
import com.veridas.detect.FinishDetectorException;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SafeSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/veridas/detect/sequence/SafeSequenceObjectDetector;", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "a", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "getContext", "()Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "context", "b", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "getSequenceObjectDetector", "()Lcom/veridas/detect/sequence/SequenceObjectDetector;", "sequenceObjectDetector", "<init>", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/detect/sequence/SequenceObjectDetector;)V", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SafeSequenceObjectDetector implements SequenceObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequentialAnalysisContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector sequenceObjectDetector;

    /* JADX INFO: compiled from: SafeSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/veridas/detect/sequence/SafeSequenceObjectDetector$Builder;", "", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "value", "context", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "sequenceObjectDetector", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "component1", "component2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "getContext", "()Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "setContext", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;)V", "b", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "getSequenceObjectDetector", "()Lcom/veridas/detect/sequence/SequenceObjectDetector;", "setSequenceObjectDetector", "(Lcom/veridas/detect/sequence/SequenceObjectDetector;)V", "<init>", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/detect/sequence/SequenceObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SequentialAnalysisContext context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SequenceObjectDetector sequenceObjectDetector;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, SequentialAnalysisContext sequentialAnalysisContext, SequenceObjectDetector sequenceObjectDetector, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sequentialAnalysisContext = builder.context;
            }
            if ((i10 & 2) != 0) {
                sequenceObjectDetector = builder.sequenceObjectDetector;
            }
            return builder.copy(sequentialAnalysisContext, sequenceObjectDetector);
        }

        @NotNull
        public final SequenceObjectDetector build() {
            SequentialAnalysisContext sequentialAnalysisContext = this.context;
            if (sequentialAnalysisContext == null) {
                throw new IllegalArgumentException("The context argument can't be null.".toString());
            }
            SequenceObjectDetector sequenceObjectDetector = this.sequenceObjectDetector;
            if (sequenceObjectDetector != null) {
                return new SafeSequenceObjectDetector(sequentialAnalysisContext, sequenceObjectDetector);
            }
            throw new IllegalArgumentException("The sequence object objectDetector argument can't be null.".toString());
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SequentialAnalysisContext getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SequenceObjectDetector getSequenceObjectDetector() {
            return this.sequenceObjectDetector;
        }

        @NotNull
        public final Builder context(@NotNull SequentialAnalysisContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.context = value;
            return this;
        }

        @NotNull
        public final Builder copy(@Nullable SequentialAnalysisContext context, @Nullable SequenceObjectDetector sequenceObjectDetector) {
            return new Builder(context, sequenceObjectDetector);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.context, builder.context) && Intrinsics.areEqual(this.sequenceObjectDetector, builder.sequenceObjectDetector);
        }

        @Nullable
        public final SequentialAnalysisContext getContext() {
            return this.context;
        }

        @Nullable
        public final SequenceObjectDetector getSequenceObjectDetector() {
            return this.sequenceObjectDetector;
        }

        public int hashCode() {
            SequentialAnalysisContext sequentialAnalysisContext = this.context;
            int iHashCode = (sequentialAnalysisContext == null ? 0 : sequentialAnalysisContext.hashCode()) * 31;
            SequenceObjectDetector sequenceObjectDetector = this.sequenceObjectDetector;
            return iHashCode + (sequenceObjectDetector != null ? sequenceObjectDetector.hashCode() : 0);
        }

        @NotNull
        public final Builder sequenceObjectDetector(@NotNull SequenceObjectDetector value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.sequenceObjectDetector = value;
            return this;
        }

        public final void setContext(@Nullable SequentialAnalysisContext sequentialAnalysisContext) {
            this.context = sequentialAnalysisContext;
        }

        public final void setSequenceObjectDetector(@Nullable SequenceObjectDetector sequenceObjectDetector) {
            this.sequenceObjectDetector = sequenceObjectDetector;
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", sequenceObjectDetector=" + this.sequenceObjectDetector + ")";
        }

        public Builder(@Nullable SequentialAnalysisContext sequentialAnalysisContext, @Nullable SequenceObjectDetector sequenceObjectDetector) {
            this.context = sequentialAnalysisContext;
            this.sequenceObjectDetector = sequenceObjectDetector;
        }

        public /* synthetic */ Builder(SequentialAnalysisContext sequentialAnalysisContext, SequenceObjectDetector sequenceObjectDetector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : sequentialAnalysisContext, (i10 & 2) != 0 ? null : sequenceObjectDetector);
        }
    }

    public SafeSequenceObjectDetector(@NotNull SequentialAnalysisContext context, @NotNull SequenceObjectDetector sequenceObjectDetector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sequenceObjectDetector, "sequenceObjectDetector");
        this.context = context;
        this.sequenceObjectDetector = sequenceObjectDetector;
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean finish() throws FinishDetectorException {
        SequentialAnalysisContext sequentialAnalysisContext = this.context;
        if (!sequentialAnalysisContext.getInitialized()) {
            throw new IllegalStateException("This sequence detector has not yet been initialized".toString());
        }
        try {
            boolean zFinish = this.sequenceObjectDetector.finish();
            if (zFinish) {
                sequentialAnalysisContext.setInitialized(false);
            }
            return zFinish;
        } catch (Exception e5) {
            throw new FinishDetectorException(e5);
        }
    }

    @NotNull
    public final SequentialAnalysisContext getContext() {
        return this.context;
    }

    @NotNull
    public final SequenceObjectDetector getSequenceObjectDetector() {
        return this.sequenceObjectDetector;
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean initialize() throws InitializeDetectorException {
        SequentialAnalysisContext sequentialAnalysisContext = this.context;
        if (!(!sequentialAnalysisContext.getInitialized())) {
            throw new IllegalStateException("This sequence detector has already been initialized".toString());
        }
        try {
            boolean zInitialize = this.sequenceObjectDetector.initialize();
            if (zInitialize) {
                sequentialAnalysisContext.setInitialized(true);
            }
            return zInitialize;
        } catch (Exception e5) {
            throw new InitializeDetectorException(e5);
        }
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) throws DetectionRequestException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!this.context.getInitialized()) {
            throw new IllegalStateException("This sequence detector not yet been initialized".toString());
        }
        try {
            return this.sequenceObjectDetector.request(request);
        } catch (Exception e5) {
            throw new DetectionRequestException(e5);
        }
    }
}
