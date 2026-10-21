package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.model.DeviceDTOModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.extra.DeviceDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScanNewDevicesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ScanNewDevicesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "<init>", "()V", "execute", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "(Lkotlin/Unit;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "scanNewDevices", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanNewDevicesCommand extends AbstractCommand<Unit> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ScanNewDevicesCommand$scanNewDevices$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScanNewDevicesCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ScanNewDevicesCommand$scanNewDevices$1", f = "ScanNewDevicesCommand.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Boolean>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super Result<Boolean>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4956scanNewDevicesIoAF18A;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                this.label = 1;
                objMo4956scanNewDevicesIoAF18A = openPayManager.mo4956scanNewDevicesIoAF18A(this);
                if (objMo4956scanNewDevicesIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4956scanNewDevicesIoAF18A = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4956scanNewDevicesIoAF18A);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Boolean>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ScanNewDevicesCommand$scanNewDevices$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScanNewDevicesCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ScanNewDevicesCommand$scanNewDevices$2", f = "ScanNewDevicesCommand.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nScanNewDevicesCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanNewDevicesCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ScanNewDevicesCommand$scanNewDevices$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1557#2:77\n1628#2,3:78\n*S KotlinDebug\n*F\n+ 1 ScanNewDevicesCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ScanNewDevicesCommand$scanNewDevices$2\n*L\n61#1:77\n61#1:78,3\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        int label;
        final /* synthetic */ ScanNewDevicesCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, ScanNewDevicesCommand scanNewDevicesCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = scanNewDevicesCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                this.label = 1;
                obj = openPaySdk.listDevicesScanned(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OpenPayResult openPayResult = (OpenPayResult) obj;
            if (openPayResult instanceof OpenPayResult.Failure) {
                CommandCallback commandCallback = this.$callback;
                Gson gson = ((AbstractCommand) this.this$0).mGson;
                Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s1483675729(...)");
                CommandExtensionsKt.sendJsonObjectError(commandCallback, gson, ((OpenPayResult.Failure) openPayResult).getError().getErrorBody());
                return Unit.INSTANCE;
            }
            if (!(openPayResult instanceof OpenPayResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CommandCallback commandCallback2 = this.$callback;
            Gson gson2 = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson2, "access$getMGson$p$s1483675729(...)");
            Iterable<DeviceDTO> iterable = (Iterable) ((OpenPayResult.Success) openPayResult).getData();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (DeviceDTO deviceDTO : iterable) {
                String name = deviceDTO.getName();
                String macAddress = deviceDTO.getMacAddress();
                if (macAddress == null) {
                    macAddress = "";
                }
                arrayList.add(new DeviceDTOModel(name, macAddress));
            }
            CommandExtensionsKt.sendJsonArrayEvent(commandCallback2, gson2, arrayList);
            return Unit.INSTANCE;
        }

        public final Object invoke(boolean z10, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ScanNewDevicesCommand() {
        super(Unit.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$1(final ScanNewDevicesCommand scanNewDevicesCommand, final CommandCallback commandCallback, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "<unused var>");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        ActivityContainer mActivityContainer = scanNewDevicesCommand.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand(mActivityContainer, commandCallback, 1001, OpenPayError.ErrorBluetoothPermission, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScanNewDevicesCommand.execute$lambda$1$lambda$0(this.f36430p0, commandCallback, (OpenPayManager) obj, (Activity) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$1$lambda$0(ScanNewDevicesCommand scanNewDevicesCommand, CommandCallback commandCallback, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        scanNewDevicesCommand.scanNewDevices(openPayManager, commandCallback);
        return Unit.INSTANCE;
    }

    private final void scanNewDevices(OpenPayManager openPayManager, CommandCallback callback) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Unit jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, 1002, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScanNewDevicesCommand.execute$lambda$1(this.f36428p0, callback, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 4, null);
    }
}
