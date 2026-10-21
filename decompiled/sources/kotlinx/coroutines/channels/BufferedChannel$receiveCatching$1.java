package kotlinx.coroutines.channels;

import ek.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM5955receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m5955receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM5955receiveCatchingJP2dKIU$suspendImpl == a.getCOROUTINE_SUSPENDED() ? objM5955receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m5963boximpl(objM5955receiveCatchingJP2dKIU$suspendImpl);
    }
}
