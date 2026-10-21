package com.bbva.smsregex.extractor.initializer.helpers;

import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmsRetrieverContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/bbva/smsregex/extractor/initializer/helpers/SmsRetrieverContract;", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult;", "senderPhoneNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smsregex_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SmsRetrieverContract {

    /* JADX INFO: compiled from: SmsRetrieverContract.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object start$default(SmsRetrieverContract smsRetrieverContract, String str, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            return smsRetrieverContract.start(str, continuation);
        }
    }

    @Nullable
    Object start(@Nullable String str, @NotNull Continuation<? super SmsClientResult> continuation);
}
