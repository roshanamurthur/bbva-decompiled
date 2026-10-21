package com.bbva.glomohybrid.cellsweb.presentation.livedata;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.ui.snackbar.CountrySnackbarsFactory;
import com.bbva.glomoutils.flow.FlowExtensionsKt;
import com.bbva.networkmonitor.component.NetworkMonitorDataManager;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkMonitorLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/livedata/NetworkMonitorLiveData;", "", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "toLiveData", "Lcom/bbva/networkmonitor/component/NetworkMonitorDataManager;", "networkMonitorDataManager", "<init>", "(Lcom/bbva/networkmonitor/component/NetworkMonitorDataManager;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkMonitorLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkMonitorLiveData.kt\ncom/bbva/glomohybrid/cellsweb/presentation/livedata/NetworkMonitorLiveData\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n53#2:25\n55#2:29\n50#3:26\n55#3:28\n107#4:27\n*S KotlinDebug\n*F\n+ 1 NetworkMonitorLiveData.kt\ncom/bbva/glomohybrid/cellsweb/presentation/livedata/NetworkMonitorLiveData\n*L\n14#1:25\n14#1:29\n14#1:26\n14#1:28\n14#1:27\n*E\n"})
public final class NetworkMonitorLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final NetworkMonitorDataManager f31656a;

    public NetworkMonitorLiveData(@Nullable NetworkMonitorDataManager networkMonitorDataManager) {
        this.f31656a = networkMonitorDataManager;
    }

    @NotNull
    public final LiveData<SnackbarState> toLiveData() {
        NetworkMonitorDataManager networkMonitorDataManager = this.f31656a;
        final Flow flowOrEmpty = FlowExtensionsKt.orEmpty(networkMonitorDataManager != null ? networkMonitorDataManager.networkMonitor() : null);
        return FlowLiveDataConversions.asLiveData$default(new Flow<SnackbarState>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.livedata.NetworkMonitorLiveData$toLiveData$$inlined$map$1

            /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.livedata.NetworkMonitorLiveData$toLiveData$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NetworkMonitorLiveData.kt\ncom/bbva/glomohybrid/cellsweb/presentation/livedata/NetworkMonitorLiveData\n*L\n1#1,222:1\n54#2:223\n15#3,4:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f31658p0;

                /* JADX INFO: renamed from: com.bbva.glomohybrid.cellsweb.presentation.livedata.NetworkMonitorLiveData$toLiveData$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.livedata.NetworkMonitorLiveData$toLiveData$$inlined$map$1$2", f = "NetworkMonitorLiveData.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f31659p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f31660q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f31659p0 = obj;
                        this.f31660q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f31658p0 = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f31660q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f31660q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f31659p0;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f31660q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        SnackbarState show = !((Boolean) obj).booleanValue() ? new SnackbarState.Show(CountrySnackbarsFactory.INSTANCE.networkNotAvailableSnackbar()) : SnackbarState.Hide.INSTANCE;
                        anonymousClass1.f31660q0 = 1;
                        if (this.f31658p0.emit(show, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SnackbarState> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowOrEmpty.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
