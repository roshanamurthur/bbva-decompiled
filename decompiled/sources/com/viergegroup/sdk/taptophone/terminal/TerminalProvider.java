package com.viergegroup.sdk.taptophone.terminal;

import android.content.Context;
import com.esotericsoftware.kryo.serializers.d;
import com.esotericsoftware.kryo.serializers.e;
import com.mypinpad.tsdk.api.Terminal;
import com.mypinpad.tsdk.api.TerminalSdk;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure;
import com.mypinpad.tsdk.api.models.Endpoint;
import com.mypinpad.tsdk.api.models.PinPadConfiguration;
import com.mypinpad.tsdk.api.models.authorization.ClientCredentialsGrant;
import com.viergegroup.sdk.taptophone.BuildConfig;
import com.viergegroup.sdk.taptophone.config.CurrencyCustomFormattingConfigKt;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/viergegroup/sdk/taptophone/terminal/TerminalProvider;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "terminal", "Lcom/mypinpad/tsdk/api/Terminal;", "getTerminal", "()Lcom/mypinpad/tsdk/api/Terminal;", "terminalFuture", "Ljava/util/concurrent/CompletableFuture;", "disposeTerminal", "", "setup", "authorizationGrant", "Lcom/mypinpad/tsdk/api/models/authorization/ClientCredentialsGrant;", "pinPadConfiguration", "Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f67601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CompletableFuture<Terminal> f67602b;

    public static final class a extends Lambda implements Function2<Terminal, TerminalCreationFailure, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Terminal terminal, TerminalCreationFailure terminalCreationFailure) {
            Terminal terminal2 = terminal;
            TerminalCreationFailure terminalCreationFailure2 = terminalCreationFailure;
            TerminalProvider terminalProvider = TerminalProvider.this;
            if (terminal2 != null) {
                CompletableFuture completableFuture = terminalProvider.f67602b;
                if (completableFuture != null) {
                    completableFuture.complete(terminal2);
                }
            } else if (terminalCreationFailure2 != null) {
                CompletableFuture completableFuture2 = terminalProvider.f67602b;
                if (completableFuture2 != null) {
                    completableFuture2.completeExceptionally(new Exception("Terminal creation failed: " + terminalCreationFailure2.getCause(), terminalCreationFailure2.getException()));
                }
            } else {
                CompletableFuture completableFuture3 = terminalProvider.f67602b;
                if (completableFuture3 != null) {
                    completableFuture3.completeExceptionally(new IllegalArgumentException("Invalid response to terminal creation"));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public TerminalProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f67601a = context;
    }

    public final void disposeTerminal() {
        CompletableFuture<Terminal> completableFuture;
        Terminal terminal;
        synchronized (this) {
            try {
                CompletableFuture<Terminal> completableFuture2 = this.f67602b;
                if (completableFuture2 != null && completableFuture2.isDone() && (completableFuture = this.f67602b) != null && !completableFuture.isCompletedExceptionally() && (terminal = getTerminal()) != null) {
                    terminal.dispose();
                }
                CompletableFuture<Terminal> completableFuture3 = this.f67602b;
                if (completableFuture3 != null) {
                    completableFuture3.cancel(false);
                }
                this.f67602b = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final Terminal getTerminal() {
        CompletableFuture<Terminal> completableFuture = this.f67602b;
        if (completableFuture != null) {
            return (Terminal) completableFuture.get();
        }
        return null;
    }

    public final void setup(@NotNull ClientCredentialsGrant authorizationGrant, @NotNull PinPadConfiguration pinPadConfiguration) {
        Intrinsics.checkNotNullParameter(authorizationGrant, "");
        Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
        synchronized (this) {
            if (this.f67602b != null) {
                return;
            }
            e.b();
            this.f67602b = d.b();
            Unit unit = Unit.INSTANCE;
            Context context = this.f67601a;
            TerminalSdk.Configuration configuration = new TerminalSdk.Configuration(pinPadConfiguration, CurrencyCustomFormattingConfigKt.getCurrencyCustomFormattingConfig(), false, 0, 0, 0, 0, 0.0f, false, false, false, 2044, null);
            Endpoint endpoint = BuildConfig.ENDPOINT;
            Intrinsics.checkNotNullExpressionValue(endpoint, "");
            TerminalSdk.createTerminal(context, configuration, endpoint, authorizationGrant, new a());
        }
    }
}
