package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.sfmcsdk.InitializationState;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.NamedRunnable;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&J\u0006\u0010(\u001a\u00020\u001eR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/modules/Module;", "", "()V", "MODULE_INSTANCE_REQUESTS", "", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyHandler;", "getMODULE_INSTANCE_REQUESTS$annotations", "getMODULE_INSTANCE_REQUESTS", "()Ljava/util/List;", "initializationState", "Lcom/salesforce/marketingcloud/sfmcsdk/InitializationState;", "getInitializationState", "()Lcom/salesforce/marketingcloud/sfmcsdk/InitializationState;", "setInitializationState", "(Lcom/salesforce/marketingcloud/sfmcsdk/InitializationState;)V", "module", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleInterface;", "getModule", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleInterface;", "setModule", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleInterface;)V", "name", "", "getName", "()Ljava/lang/String;", "getIdentity", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "getState", "Lorg/json/JSONObject;", "initModule", "", "context", "Landroid/content/Context;", "config", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/Config;", "components", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "requestModule", "tearDown", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Module {

    @NotNull
    private final List<ModuleReadyHandler> MODULE_INSTANCE_REQUESTS = new ArrayList();

    @NotNull
    private InitializationState initializationState = InitializationState.NONE;

    @Nullable
    private ModuleInterface module;

    /* JADX INFO: compiled from: Module.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            iArr[InitializationState.READY.ordinal()] = 1;
            iArr[InitializationState.NONE.ordinal()] = 2;
            iArr[InitializationState.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.sfmcsdk.modules.Module$initModule$1, reason: invalid class name */
    /* JADX INFO: compiled from: Module.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, d2 = {"com/salesforce/marketingcloud/sfmcsdk/modules/Module$initModule$1", "Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/NamedRunnable;", "execute", "", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends NamedRunnable {
        final /* synthetic */ SFMCSdkComponents $components;
        final /* synthetic */ Config $config;
        final /* synthetic */ Context $context;
        final /* synthetic */ ModuleReadyListener $listener;

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.sfmcsdk.modules.Module$initModule$1$WhenMappings */
        /* JADX INFO: compiled from: Module.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ModuleIdentifier.values().length];
                iArr[ModuleIdentifier.PUSH.ordinal()] = 1;
                iArr[ModuleIdentifier.CDP.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Config config, Context context, SFMCSdkComponents sFMCSdkComponents, ModuleReadyListener moduleReadyListener, String str, Object[] objArr) {
            super(str, objArr);
            this.$config = config;
            this.$context = context;
            this.$components = sFMCSdkComponents;
            this.$listener = moduleReadyListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: execute$lambda-2, reason: not valid java name */
        public static final void m5507execute$lambda2(AnonymousClass1 this$0, Module this$1, final Config config, ModuleReadyListener listener, final ModuleInterface it) {
            ModuleInterface moduleInterface;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(config, "$config");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(it, "it");
            SFMCSdkLogger.INSTANCE.d(this$0.getName(), new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module$initModule$1$execute$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "~~ " + config.getModuleIdentifier().name() + " Module Initialization Completed ~~";
                }
            });
            int i10 = WhenMappings.$EnumSwitchMapping$0[config.getModuleIdentifier().ordinal()];
            if (i10 == 1) {
                moduleInterface = (PushModuleInterface) it;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                moduleInterface = (CdpModuleInterface) it;
            }
            this$1.setModule(moduleInterface);
            listener.ready(it);
            this$1.setInitializationState(InitializationState.READY);
            synchronized (this$1.getMODULE_INSTANCE_REQUESTS()) {
                for (final ModuleReadyHandler moduleReadyHandler : this$1.getMODULE_INSTANCE_REQUESTS()) {
                    try {
                        moduleReadyHandler.deliverModule(it);
                    } catch (Exception e5) {
                        SFMCSdkLogger.INSTANCE.e(PushModule.TAG, e5, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module$initModule$1$execute$2$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Failure during module " + it + " delivery for " + moduleReadyHandler + '.';
                            }
                        });
                    }
                }
                this$1.getMODULE_INSTANCE_REQUESTS().clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // com.salesforce.marketingcloud.sfmcsdk.components.utils.NamedRunnable
        public void execute() {
            Module.this.setInitializationState(InitializationState.INITIALIZING);
            SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
            String name = getName();
            final Config config = this.$config;
            sFMCSdkLogger.d(name, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module$initModule$1$execute$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "~~ " + config.getModuleIdentifier().name() + " Module Initialization Started ~~";
                }
            });
            final Config config2 = this.$config;
            Context context = this.$context;
            SFMCSdkComponents sFMCSdkComponents = this.$components;
            final Module module = Module.this;
            final ModuleReadyListener moduleReadyListener = this.$listener;
            config2.init(context, sFMCSdkComponents, new ModuleReadyListener() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.b
                @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
                public final void ready(ModuleInterface moduleInterface) {
                    Module.AnonymousClass1.m5507execute$lambda2(this.f64936a, module, config2, moduleReadyListener, moduleInterface);
                }
            });
        }
    }

    @NotNull
    public final ModuleIdentity getIdentity() {
        ModuleIdentity moduleIdentity;
        ModuleInterface moduleInterface = this.module;
        if (moduleInterface == null || (moduleIdentity = moduleInterface.getModuleIdentity()) == null) {
            throw new NotImplementedError("An operation is not implemented: Your module must implement getIdentity().");
        }
        return moduleIdentity;
    }

    @NotNull
    public final InitializationState getInitializationState() {
        return this.initializationState;
    }

    @NotNull
    public final List<ModuleReadyHandler> getMODULE_INSTANCE_REQUESTS() {
        return this.MODULE_INSTANCE_REQUESTS;
    }

    @Nullable
    public final ModuleInterface getModule() {
        return this.module;
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public final JSONObject getState() throws JSONException {
        JSONObject jSONObjectPut;
        ModuleInterface moduleInterface = this.module;
        if (moduleInterface == null || (jSONObjectPut = moduleInterface.getState()) == null) {
            JSONObject jSONObject = new JSONObject();
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.initializationState.ordinal()];
            if (i10 != 2) {
                jSONObjectPut = i10 != 3 ? jSONObject.put("INITIALIZATION_STATUS", "NOT READY") : jSONObject.put("INITIALIZATION_STATUS", "ERROR");
            } else {
                jSONObjectPut = jSONObject.put("INITIALIZATION_STATUS", "NOT IMPLEMENTED OR NOT INITIALIZED");
            }
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject().run {\n    w…\", \"NOT READY\")\n    }\n  }");
        }
        return jSONObjectPut;
    }

    public final void initModule(@NotNull Context context, @NotNull Config config, @NotNull SFMCSdkComponents components, @NotNull ModuleReadyListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            components.getExecutors().getDiskIO().execute(new AnonymousClass1(config, context, components, listener, config.getModuleIdentifier().name() + "_init_thread", new Object[0]));
        } catch (Error e5) {
            SFMCSdkLogger.INSTANCE.w(getName(), e5, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module.initModule.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "An error occurred while initializing module " + Module.this;
                }
            });
        } catch (Exception e7) {
            SFMCSdkLogger.INSTANCE.w(getName(), e7, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module.initModule.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "An exception occurred while initializing module " + Module.this;
                }
            });
        }
    }

    public final void requestModule(@NotNull ModuleReadyListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        final ModuleReadyHandler moduleReadyHandler = new ModuleReadyHandler(listener);
        synchronized (this.MODULE_INSTANCE_REQUESTS) {
            if (WhenMappings.$EnumSwitchMapping$0[this.initializationState.ordinal()] == 1) {
                try {
                    ModuleInterface moduleInterface = this.module;
                    if (moduleInterface != null) {
                        moduleReadyHandler.deliverModule(moduleInterface);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e5) {
                    SFMCSdkLogger.INSTANCE.e(PushModule.TAG, e5, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.modules.Module$requestModule$1$2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Failure during requestPush() delivery for " + moduleReadyHandler + '.';
                        }
                    });
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                this.MODULE_INSTANCE_REQUESTS.add(moduleReadyHandler);
            }
        }
    }

    public final void setInitializationState(@NotNull InitializationState initializationState) {
        Intrinsics.checkNotNullParameter(initializationState, "<set-?>");
        this.initializationState = initializationState;
    }

    public final void setModule(@Nullable ModuleInterface moduleInterface) {
        this.module = moduleInterface;
    }

    public final void tearDown() {
        this.MODULE_INSTANCE_REQUESTS.clear();
        this.module = null;
        this.initializationState = InitializationState.NONE;
    }

    public static /* synthetic */ void getMODULE_INSTANCE_REQUESTS$annotations() {
    }
}
