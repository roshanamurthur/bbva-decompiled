package com.bbva.smsregex.extractor.initializer.helpers;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmsRetrieverClient.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult;", "", "()V", "ERROR", "OK", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult$ERROR;", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult$OK;", "smsregex_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SmsClientResult {

    /* JADX INFO: compiled from: SmsRetrieverClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult$ERROR;", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
    public static final class ERROR extends SmsClientResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ERROR(@NotNull Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }
    }

    /* JADX INFO: compiled from: SmsRetrieverClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult$OK;", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult;", "()V", "smsregex_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OK extends SmsClientResult {

        @NotNull
        public static final OK INSTANCE = new OK();

        public OK() {
            super(null);
        }
    }

    public SmsClientResult() {
    }

    public /* synthetic */ SmsClientResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
