package com.bbva.ethermobilesdk.token.plugin.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.component.ic.security.factory.InterceptorsFactory;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.plugin.InjectorKt;
import com.bbva.ethermobilesdk.token.plugin.param.GenerateOtpParam;
import com.bbva.ethermobilesdk.token.plugin.util.ParamsValidator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenerateOtpCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/command/GenerateOtpCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/token/plugin/param/GenerateOtpParam;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "GenerateAction", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GenerateOtpCommand extends AbstractCommand<GenerateOtpParam> implements CoroutineScope {

    @NotNull
    public static final String ACTION = "action";

    @NotNull
    public static final String ID = "generateotp";

    @NotNull
    public static final String TIME_WINDOW = "timeWindow";

    @NotNull
    public static final String VALID_UNTIL = "validUntil";

    @NotNull
    public static final String VALUE = "value";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30136p0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: GenerateOtpCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/command/GenerateOtpCommand$GenerateAction;", "", InterceptorsFactory.otpType, "NEXT_OTP", "CHALLENGE", "NEXT_CHALLENGE", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
    public static final class GenerateAction {
        private static final /* synthetic */ GenerateAction[] $VALUES;
        public static final GenerateAction CHALLENGE;
        public static final GenerateAction NEXT_CHALLENGE;
        public static final GenerateAction NEXT_OTP;
        public static final GenerateAction OTP;

        static {
            GenerateAction generateAction = new GenerateAction(InterceptorsFactory.otpType, 0);
            OTP = generateAction;
            GenerateAction generateAction2 = new GenerateAction("NEXT_OTP", 1);
            NEXT_OTP = generateAction2;
            GenerateAction generateAction3 = new GenerateAction("CHALLENGE", 2);
            CHALLENGE = generateAction3;
            GenerateAction generateAction4 = new GenerateAction("NEXT_CHALLENGE", 3);
            NEXT_CHALLENGE = generateAction4;
            $VALUES = new GenerateAction[]{generateAction, generateAction2, generateAction3, generateAction4};
        }

        public GenerateAction() {
            throw null;
        }

        public static GenerateAction valueOf(String str) {
            return (GenerateAction) Enum.valueOf(GenerateAction.class, str);
        }

        public static GenerateAction[] values() {
            return (GenerateAction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: GenerateOtpCommand.kt */
    public static final class a extends Lambda implements Function1<EtherToken, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GenerateOtpParam f30138q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30139r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GenerateOtpParam generateOtpParam, CommandCallback commandCallback) {
            super(1);
            this.f30138q0 = generateOtpParam;
            this.f30139r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EtherToken etherToken) {
            EtherToken it = etherToken;
            Intrinsics.checkNotNullParameter(it, "it");
            GenerateOtpCommand generateOtpCommand = GenerateOtpCommand.this;
            BuildersKt__Builders_commonKt.launch$default(generateOtpCommand, null, null, new c(it, this.f30138q0, this.f30139r0, generateOtpCommand, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public GenerateOtpCommand() {
        super(GenerateOtpParam.class, new ParamsValidator());
        this.f30136p0 = CoroutineScopeKt.MainScope();
    }

    public static final Map access$toMap(GenerateOtpCommand generateOtpCommand, String str, OTP otp) {
        generateOtpCommand.getClass();
        Map mapMutableMapOf = q.mutableMapOf(TuplesKt.to("value", otp.getValue()), TuplesKt.to(VALID_UNTIL, Long.valueOf(otp.getValidUntil())), TuplesKt.to(TIME_WINDOW, Integer.valueOf(otp.getTimeWindow())));
        if (str != null) {
            mapMutableMapOf.put("action", str);
        }
        return mapMutableMapOf;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30136p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GenerateOtpParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.withClient(callback, new a(params, callback));
    }
}
