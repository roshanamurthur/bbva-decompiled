package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MappedInteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/foundation/interaction/Interaction;", "c", "Lkotlinx/coroutines/flow/Flow;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;", "interactions", "underlyingInteractionSource", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,64:1\n47#2:65\n49#2:69\n50#3:66\n55#3:68\n106#4:67\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n35#1:65\n35#1:69\n35#1:66\n35#1:68\n35#1:67\n*E\n"})
public final class MappedInteractionSource implements InteractionSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MappedInteractionSource$special$$inlined$map$1 f10586c;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1] */
    public MappedInteractionSource(InteractionSource underlyingInteractionSource, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(underlyingInteractionSource, "underlyingInteractionSource");
        this.f10584a = j10;
        this.f10585b = new LinkedHashMap();
        final Flow<Interaction> interactions = underlyingInteractionSource.getInteractions();
        this.f10586c = new Flow<Interaction>() { // from class: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1

            /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n1#1,222:1\n48#2:223\n36#3,23:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10589p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ MappedInteractionSource f10590q0;

                /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f10591p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f10592q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f10591p0 = obj;
                        this.f10592q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, MappedInteractionSource mappedInteractionSource) {
                    this.f10589p0 = flowCollector;
                    this.f10590q0 = mappedInteractionSource;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
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
                    PressInteraction.Release release;
                    PressInteraction.Cancel cancel;
                    Object release2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f10592q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f10592q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f10591p0;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f10592q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        Interaction interaction = (Interaction) obj;
                        boolean z10 = interaction instanceof PressInteraction.Press;
                        MappedInteractionSource mappedInteractionSource = this.f10590q0;
                        if (z10) {
                            PressInteraction.Press pressAccess$mapPress = MappedInteractionSource.access$mapPress(mappedInteractionSource, (PressInteraction.Press) interaction);
                            mappedInteractionSource.f10585b.put(interaction, pressAccess$mapPress);
                            release2 = pressAccess$mapPress;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            cancel = (PressInteraction.Cancel) interaction;
                            PressInteraction.Press press = (PressInteraction.Press) mappedInteractionSource.f10585b.remove(cancel.getPress());
                            if (press != null) {
                                release2 = cancel;
                                release2 = new PressInteraction.Cancel(press);
                            }
                        } else if (interaction instanceof PressInteraction.Release) {
                            release = (PressInteraction.Release) interaction;
                            PressInteraction.Press press2 = (PressInteraction.Press) mappedInteractionSource.f10585b.remove(release.getPress());
                            if (press2 != null) {
                                release2 = interaction;
                                release2 = release;
                                release2 = new PressInteraction.Release(press2);
                            }
                        }
                        release2 = interaction;
                        release2 = release;
                        release2 = interaction;
                        release2 = cancel;
                        anonymousClass1.f10592q0 = 1;
                        if (this.f10589p0.emit(release2, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Interaction> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = interactions.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final PressInteraction.Press access$mapPress(MappedInteractionSource mappedInteractionSource, PressInteraction.Press press) {
        mappedInteractionSource.getClass();
        return new PressInteraction.Press(Offset.m2279minusMKHz9U(press.getPressPosition(), mappedInteractionSource.f10584a), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public Flow<Interaction> getInteractions() {
        return this.f10586c;
    }
}
