package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bk.p;
import ci.a;
import com.adobe.marketing.mobile.EventDataKeys;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mypinpad.tsdk.isolation.y2;
import dk.e;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0081\u0001B\n\b\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0001J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014J\u001b\u0010\"\u001a\u00020\u00022\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u00022\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0000¢\u0006\u0004\b#\u0010!J)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0000¢\u0006\u0004\b'\u0010(J\u0016\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010*H\u0002J\b\u0010-\u001a\u00020\u0002H\u0002J\b\u0010.\u001a\u00020\u0002H\u0002J4\u00106\u001a\u00020\u0002*\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002000/2\n\u00104\u001a\u000602j\u0002`32\u0006\u00105\u001a\u00020\nH\u0002J\f\u00107\u001a\u00020\n*\u00020\u0001H\u0002J\u0010\u00109\u001a\u00020+*\u0006\u0012\u0002\b\u000308H\u0002J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u001e\u0010<\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002J.\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010=\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010>2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002J?\u0010E\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020A0D2\u0006\u0010B\u001a\u00020A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002¢\u0006\u0004\bE\u0010FJ3\u0010H\u001a\u00020A2\u0006\u0010G\u001a\u00020A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002¢\u0006\u0004\bH\u0010IJ\u001c\u0010J\u001a\u00020\u00022\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0018\u0010L\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020K2\u0006\u0010=\u001a\u00020\nH\u0002J\u000f\u0010M\u001a\u0004\u0018\u00010K*\u00020KH\u0082\u0010J(\u0010J\u001a\u00020\u00022\n\u0010N\u001a\u0006\u0012\u0002\b\u0003082\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0016\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u000108*\u0006\u0012\u0002\b\u00030\u001eH\u0002J\u0013\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u000108*\u00020KH\u0082\u0010J\u0012\u0010P\u001a\u00020O*\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0002J,\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010OH\u0002J\u0014\u0010R\u001a\u00020\u00022\n\u0010N\u001a\u0006\u0012\u0002\b\u000308H\u0002J'\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014\"\b\b\u0000\u0010%*\u00020S2\u0006\u0010T\u001a\u00028\u0000H\u0002¢\u0006\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010_\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0012\u0004\u0012\u00020+0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010a\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010b\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR\"\u0010j\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010d\"\u0004\bl\u0010fR\"\u0010m\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR \u0010o\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u0002000^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010`R\u0011\u0010q\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\bp\u0010dR\u001e\u0010u\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003080r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001e\u0010y\u001a\u00020\n*\u00020\b8BX\u0082\u0004¢\u0006\f\u0012\u0004\bw\u0010x\u001a\u0004\bv\u0010\fR\u0018\u0010z\u001a\u00020+*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u000b\u0010}\u001a\u00020|8\u0002X\u0082\u0004R\u000b\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¨\u0006\u0082\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "", "install$kotlinx_coroutines_core", "()V", EventDataKeys.Acquisition.ACQUISITION_TYPE_INSTALL, "uninstall$kotlinx_coroutines_core", "uninstall", "Lkotlinx/coroutines/Job;", "job", "", "hierarchyToString$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "hierarchyToString", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "info", "enhanceStackTraceWithThreadDumpAsJson", "", "dumpCoroutinesInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "Ljava/io/PrintStream;", "out", "dumpCoroutines", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "Lkotlin/coroutines/Continuation;", TypedValues.AttributesType.S_FRAME, "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", ExifInterface.GPS_DIRECTION_TRUE, "completion", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "Lkotlin/Function1;", "", "getDynamicAttach", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "toStringRepr", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "isFinished", "dumpCoroutinesSynchronized", "frames", "printStackTrace", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "updateState", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "realCaller", "owner", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStackTraceFrame", "createOwner", "probeCoroutineCompleted", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "weakRefCleanerThread", "Ljava/lang/Thread;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "sanitizeStackTraces", "Z", "getSanitizeStackTraces$kotlinx_coroutines_core", "()Z", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "setEnableCreationStackTraces$kotlinx_coroutines_core", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "callerInfoCache", "isInstalled$kotlinx_coroutines_debug", "isInstalled", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "<init>", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,620:1\n150#1:638\n151#1,4:640\n156#1,5:645\n150#1:650\n151#1,4:652\n156#1,5:657\n1#2:621\n1#2:639\n1#2:651\n766#3:622\n857#3,2:623\n1208#3,2:625\n1238#3,4:627\n1855#3,2:665\n350#3,7:673\n1819#3,8:680\n603#4:631\n603#4:644\n603#4:656\n603#4:662\n1295#4,2:663\n37#5,2:632\n37#5,2:634\n37#5,2:636\n1627#6,6:667\n1735#6,6:688\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n245#1:638\n245#1:640,4\n245#1:645,5\n252#1:650\n252#1:652,4\n252#1:657,5\n245#1:639\n252#1:651\n110#1:622\n110#1:623,2\n111#1:625,2\n111#1:627,4\n307#1:665,2\n416#1:673,7\n506#1:680,8\n154#1:631\n245#1:644\n252#1:656\n287#1:662\n288#1:663,2\n211#1:632,2\n212#1:634,2\n213#1:636,2\n355#1:667,6\n558#1:688,6\n*E\n"})
public final class DebugProbesImpl {

    @NotNull
    private static final StackTraceElement ARTIFICIAL_FRAME;

    @NotNull
    public static final DebugProbesImpl INSTANCE;

    @NotNull
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache;

    @NotNull
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;

    @NotNull
    private static final SimpleDateFormat dateFormat;

    @Nullable
    private static final Function1<Boolean, Unit> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;

    @NotNull
    private static final DebugProbesImpl$Installations$kotlinx$VolatileWrapper installations$kotlinx$VolatileWrapper;
    private static boolean sanitizeStackTraces;

    @NotNull
    private static final DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper sequenceNumber$kotlinx$VolatileWrapper;

    @Nullable
    private static Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", TypedValues.AttributesType.S_FRAME, "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {

        @JvmField
        @NotNull
        public final Continuation<T> delegate;

        @JvmField
        @NotNull
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(@NotNull Continuation<? super T> continuation, @NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = continuation;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        @NotNull
        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineCreation();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        installations$kotlinx$VolatileWrapper = new DebugProbesImpl$Installations$kotlinx$VolatileWrapper(null);
        sequenceNumber$kotlinx$VolatileWrapper = new DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper(null);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb2, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) CollectionsKt___CollectionsKt.firstOrNull((List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String str2 = debugCoroutineInfoImpl.get_state();
            StringBuilder sbD = c.d(str);
            k.e(sbD, getDebugString(job), ", continuation is ", str2, " at line ");
            sbD.append(stackTraceElement);
            sbD.append('\n');
            sb2.append(sbD.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            StringBuilder sbD2 = c.d(str);
            sbD2.append(getDebugString(job));
            sbD2.append('\n');
            sb2.append(sbD2.toString());
            str = str + '\t';
        }
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> createOwner(Continuation<? super T> completion, StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(completion, new DebugCoroutineInfoImpl(completion.getContext(), frame, DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper.sequenceNumber$FU.incrementAndGet(sequenceNumber$kotlinx$VolatileWrapper)));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final void dumpCoroutinesSynchronized(PrintStream out) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (CoroutineOwner coroutineOwner : SequencesKt___SequencesKt.sortedWith(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(getCapturedCoroutines()), new Function1<CoroutineOwner<?>, Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull CoroutineOwner<?> coroutineOwner2) {
                return Boolean.valueOf(!DebugProbesImpl.INSTANCE.isFinished(coroutineOwner2));
            }
        }), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t10).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t11).info.sequenceNumber));
            }
        })) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.get_state(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((Intrinsics.areEqual(debugCoroutineInfoImpl.get_state(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.get_state() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.get_state()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object objM5535constructorimpl;
        if (!Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(thread.getStackTrace());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM5535constructorimpl;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i10++;
        }
        Pair<Integer, Integer> pairFindContinuationStartIndex = findContinuationStartIndex(i10, stackTraceElementArr, coroutineTrace);
        int iIntValue = pairFindContinuationStartIndex.component1().intValue();
        int iIntValue2 = pairFindContinuationStartIndex.component2().intValue();
        if (iIntValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i10) - iIntValue) - 1) - iIntValue2);
        int i11 = i10 - iIntValue2;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(stackTraceElementArr[i12]);
        }
        int size = coroutineTrace.size();
        for (int i13 = iIntValue + 1; i13 < size; i13++) {
            arrayList.add(coroutineTrace.get(i13));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i10 = 0; i10 < 3; i10++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i10, actualTrace, coroutineTrace);
            if (iFindIndexOfFrame != -1) {
                return TuplesKt.to(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i10));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.getOrNull(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i10 = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private final Function1<Boolean, Unit> getDynamicAttach() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM5535constructorimpl = Result.m5535constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (Function1) objM5535constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return l.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final CoroutineOwner<?> owner(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> owner) {
        CoroutineStackFrame coroutineStackFrameRealCaller;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (coroutineStackFrameRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameRealCaller);
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i10 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        int i12 = i10 + 1;
        if (!sanitizeStackTraces) {
            int i13 = length - i12;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(stackTrace[i14 + i12]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i12) + 1);
        while (i12 < length) {
            if (isInternalMethod(stackTrace[i12])) {
                arrayList2.add(stackTrace[i12]);
                int i15 = i12 + 1;
                while (i15 < length && isInternalMethod(stackTrace[i15])) {
                    i15++;
                }
                int i16 = i15 - 1;
                int i17 = i16;
                while (i17 > i12 && stackTrace[i17].getFileName() == null) {
                    i17--;
                }
                if (i17 > i12 && i17 < i16) {
                    arrayList2.add(stackTrace[i17]);
                }
                arrayList2.add(stackTrace[i16]);
                i12 = i15;
            } else {
                arrayList2.add(stackTrace[i12]);
                i12++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new Function0<Unit>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DebugProbesImpl.callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
            }
        }, 21, null);
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(CoroutineStackFrame frame, String state) {
        boolean z10;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(frame);
            if (debugCoroutineInfoImplRemove != null) {
                z10 = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                CoroutineStackFrame coroutineStackFrameRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (coroutineStackFrameRealCaller != null) {
                    concurrentWeakMap.remove(coroutineStackFrameRealCaller);
                }
                z10 = true;
            }
            Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(state, (Continuation) frame, z10);
            CoroutineStackFrame coroutineStackFrameRealCaller2 = realCaller(frame);
            if (coroutineStackFrameRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(coroutineStackFrameRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final void updateState(Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.getContext() == EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING)) {
                CoroutineStackFrame coroutineStackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, state);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, frame, state);
        }
    }

    @JvmName(name = "dumpCoroutines")
    public final void dumpCoroutines(@NotNull PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DebugCoroutineInfo invoke(@NotNull DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @NotNull
    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            CoroutineContext context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.INSTANCE);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.INSTANCE);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sbD = a.d("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.INSTANCE);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            sbD.append(lValueOf);
            sbD.append(",\n                    \"dispatcher\": ");
            sbD.append(stringRepr2);
            sbD.append(",\n                    \"sequenceNumber\": ");
            sbD.append(debugCoroutineInfo.getSequenceNumber());
            sbD.append(",\n                    \"state\": \"");
            sbD.append(debugCoroutineInfo.getState());
            sbD.append("\"\n                } \n                ");
            arrayList3.add(kotlin.text.e.trimIndent(sbD.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{y2.b(new StringBuilder(Constant.BRACKET_OPEN), CollectionsKt___CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST), arrayList.toArray(new Thread[0]), arrayList2.toArray(new CoroutineStackFrame[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    @NotNull
    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DebuggerInfo invoke(@NotNull DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @NotNull
    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(@NotNull DebugCoroutineInfo info, @NotNull List<StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    @NotNull
    public final String enhanceStackTraceWithThreadDumpAsJson(@NotNull DebugCoroutineInfo info) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb2 = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? toStringRepr(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(kotlin.text.e.trimIndent(sb2.toString()));
        }
        return y2.b(new StringBuilder(Constant.BRACKET_OPEN), CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST);
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    @NotNull
    public final String hierarchyToString$kotlinx_coroutines_core(@NotNull Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (CoroutineOwner coroutineOwner : arrayList) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb2, "");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void install$kotlinx_coroutines_core() {
        Function1<Boolean, Unit> function1;
        if (DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.incrementAndGet(installations$kotlinx$VolatileWrapper) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    @JvmName(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.get(installations$kotlinx$VolatileWrapper) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(@NotNull Continuation<? super T> completion) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        if (!(ignoreCoroutinesWithEmptyContext && completion.getContext() == EmptyCoroutineContext.INSTANCE) && owner(completion) == null) {
            return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return completion;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@NotNull Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@NotNull Continuation<?> frame) {
        updateState(frame, "SUSPENDED");
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z10) {
        enableCreationStackTraces = z10;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z10) {
        ignoreCoroutinesWithEmptyContext = z10;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z10) {
        sanitizeStackTraces = z10;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        Function1<Boolean, Unit> function1;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed".toString());
        }
        if (DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.decrementAndGet(installations$kotlinx$VolatileWrapper) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (CoroutineOwner) coroutineStackFrame;
    }

    private final void updateState(CoroutineOwner<?> owner, Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }
}
