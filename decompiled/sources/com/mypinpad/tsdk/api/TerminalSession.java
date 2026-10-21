package com.mypinpad.tsdk.api;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener;
import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import com.mypinpad.tsdk.api.models.TransactionParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/api/TerminalSession;", "", "", "deactivate", "()V", "Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "transactionParameters", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "Lcom/mypinpad/tsdk/api/callbacks/OnUiMessage;", "onUiMessage", "Lcom/mypinpad/tsdk/api/callbacks/PinPadLaunchRequestListener;", "pinPadLaunchRequestListener", "Lcom/mypinpad/tsdk/api/callbacks/TransactionResult;", "Lcom/mypinpad/tsdk/api/callbacks/OnTransactionResult;", "onTransactionResult", "", "startTransaction", "(Lcom/mypinpad/tsdk/api/models/TransactionParameters;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/api/callbacks/PinPadLaunchRequestListener;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "getValidUntil", "()J", GenerateOtpCommand.VALID_UNTIL}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TerminalSession {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f51632a;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r5 = ((r0 ^ 123) | (r0 & 123)) << 1;
            r7 = -((r0 & (-124)) | ((~r0) & 123));
            r1 = (r5 ^ r7) + ((r5 & r7) << 1);
            com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            if ((r1 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            r5 = (r0 ^ 80) + ((r0 & 80) << 1);
            r7 = (r5 ^ (-1)) + (r5 << 1);
            com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a = r7 % 128;
            r7 = r7 % 2;
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            r2 = r2.startTransaction(r3, r4, r5, r6);
            r3 = com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a;
            r4 = r3 & 69;
            r3 = r3 | 69;
            r5 = (r4 & r3) + (r3 | r4);
            r3 = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        
            if ((r5 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransaction");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        
            if (r8 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        
            if (r8 == null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            if ((r7 & 4) == 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.String startTransaction$default(com.mypinpad.tsdk.api.TerminalSession r2, com.mypinpad.tsdk.api.models.TransactionParameters r3, kotlin.jvm.functions.Function1 r4, com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            /*
                int r0 = com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a
                r1 = r0 & 73
                r0 = r0 | 73
                int r1 = r1 + r0
                int r0 = r1 % 128
                int r1 = r1 % 2
                if (r1 != 0) goto L14
                r1 = 91
                int r1 = r1 / 0
                if (r8 != 0) goto L62
                goto L16
            L14:
                if (r8 != 0) goto L62
            L16:
                r7 = r7 & 4
                r8 = 0
                if (r7 == 0) goto L4c
                r5 = r0 ^ 123(0x7b, float:1.72E-43)
                r7 = r0 & 123(0x7b, float:1.72E-43)
                r5 = r5 | r7
                int r5 = r5 << 1
                r7 = r0 & (-124(0xffffffffffffff84, float:NaN))
                int r1 = ~r0
                r1 = r1 & 123(0x7b, float:1.72E-43)
                r7 = r7 | r1
                int r7 = -r7
                r1 = r5 ^ r7
                r5 = r5 & r7
                int r5 = r5 << 1
                int r1 = r1 + r5
                int r5 = r1 % 128
                com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a = r5
                int r1 = r1 % 2
                if (r1 != 0) goto L4b
                r5 = r0 ^ 80
                r7 = r0 & 80
                int r7 = r7 << 1
                int r5 = r5 + r7
                r7 = r5 ^ (-1)
                int r5 = r5 << 1
                int r7 = r7 + r5
                int r5 = r7 % 128
                com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a = r5
                int r7 = r7 % 2
                r5 = r8
                goto L4c
            L4b:
                throw r8
            L4c:
                java.lang.String r2 = r2.startTransaction(r3, r4, r5, r6)
                int r3 = com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.f51632a
                r4 = r3 & 69
                r3 = r3 | 69
                r5 = r4 & r3
                r3 = r3 | r4
                int r5 = r5 + r3
                int r3 = r5 % 128
                int r5 = r5 % 2
                if (r5 == 0) goto L61
                return r2
            L61:
                throw r8
            L62:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Super calls with default arguments not supported in this target, function: startTransaction"
                r2.<init>(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.api.TerminalSession.DefaultImpls.startTransaction$default(com.mypinpad.tsdk.api.TerminalSession, com.mypinpad.tsdk.api.models.TransactionParameters, kotlin.jvm.functions.Function1, com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String");
        }
    }

    void deactivate();

    @JvmName(name = "getValidUntil")
    long getValidUntil();

    @NotNull
    String startTransaction(@NotNull TransactionParameters transactionParameters, @NotNull Function1<? super UiMessage, Unit> onUiMessage, @Nullable PinPadLaunchRequestListener pinPadLaunchRequestListener, @NotNull Function1<? super TransactionResult, Unit> onTransactionResult);
}
