package com.google.firebase.logger;

import ai.a;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.processing.f;
import androidx.core.app.NotificationCompat;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b&\u0018\u0000 (2\u00020\u0001:\u0004)(*+J;\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J;\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J;\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\nJ\u001c\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J;\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u001c\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J;\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u001c\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "", "format", "", "args", "", "throwable", "", "verbose", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", NotificationCompat.CATEGORY_MESSAGE, BuildConfig.BUILD_TYPE, "info", "warn", "error", "Lcom/google/firebase/logger/Logger$Level;", "level", LogKeysKt.LOG, "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", LogKeysKt.TAG, "", "b", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "c", "Lcom/google/firebase/logger/Logger$Level;", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "minLevel", "Companion", "AndroidLogger", "FakeLogger", "Level", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,196:1\n26#2:197\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n*L\n78#1:197\n*E\n"})
public abstract class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, Logger> f48516d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Level minLevel;

    /* JADX INFO: compiled from: Logger.kt */
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public static final class AndroidLogger extends Logger {

        /* JADX INFO: compiled from: Logger.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.google.firebase.logger.Logger
        public final int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = a.i(objArrCopyOf, objArrCopyOf.length, format, "format(format, *args)");
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i10 == 1) {
                String tag = getTag();
                return th2 != null ? Log.v(tag, format, th2) : Log.v(tag, format);
            }
            if (i10 == 2) {
                String tag2 = getTag();
                return th2 != null ? Log.d(tag2, format, th2) : Log.d(tag2, format);
            }
            if (i10 == 3) {
                String tag3 = getTag();
                return th2 != null ? Log.i(tag3, format, th2) : Log.i(tag3, format);
            }
            if (i10 == 4) {
                String tag4 = getTag();
                return th2 != null ? Log.w(tag4, format, th2) : Log.w(tag4, format);
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String tag5 = getTag();
            return th2 != null ? Log.e(tag5, format, th2) : Log.e(tag5, format);
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "()V", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", "getLogger", LogKeysKt.TAG, "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "setupFakeLogger", "Lcom/google/firebase/logger/Logger$FakeLogger;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n73#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z10, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z10, level);
        }

        @JvmStatic
        @NotNull
        public final Logger getLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.f48516d;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(minLevel, "minLevel");
                androidLogger = new AndroidLogger(tag, enabled, minLevel, null);
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, androidLogger);
                if (objPutIfAbsent != null) {
                    androidLogger = objPutIfAbsent;
                }
            }
            Intrinsics.checkNotNullExpressionValue(androidLogger, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return (Logger) androidLogger;
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, enabled, minLevel);
            Logger.f48516d.put(tag, fakeLogger);
            return fakeLogger;
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u001c\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0013H\u0007¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "Lcom/google/firebase/logger/Logger$Level;", "level", "", "format", "", "", "args", "", "throwable", "", LogKeysKt.LOG, "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "", "clearLogMessages", "message", "", "hasLogMessage", "Lkotlin/Function1;", "predicate", "hasLogMessageThat", LogKeysKt.TAG, "enabled", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
    @VisibleForTesting
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1747#2,3:197\n1747#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    public static final class FakeLogger extends Logger {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ArrayList f48520e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            super(tag, z10, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.f48520e = new ArrayList();
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.f48520e.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            ArrayList arrayList = this.f48520e;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) message, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        @VisibleForTesting
        public final boolean hasLogMessageThat(@NotNull Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            ArrayList arrayList = this.f48520e;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0043  */
        /* JADX WARN: Instruction removed from duplicated block: B:10:0x0043, please report this as an issue */
        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
            String str;
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = a.i(objArrCopyOf, objArrCopyOf.length, format, "format(format, *args)");
            }
            if (throwable != null) {
                str = level + ' ' + format + ' ' + Log.getStackTraceString(throwable);
                if (str == null) {
                    str = level + ' ' + format;
                }
            } else {
                str = level + ' ' + format;
            }
            System.out.println((Object) f.d("Log: ", str));
            this.f48520e.add(str);
            return str.length();
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "", "priority", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i10) {
            this.priority = i10;
        }

        /* JADX INFO: renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    public Logger(String str, boolean z10, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this.tag = str;
        this.enabled = z10;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.debug(str, objArr, th2);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.error(str, objArr, th2);
    }

    @JvmStatic
    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return INSTANCE.getLogger(str, z10, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.info(str, objArr, th2);
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return INSTANCE.setupFakeLogger(str, z10, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.verbose(str, objArr, th2);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.warn(str, objArr, th2);
    }

    public final int a(Level level, String str, Object[] objArr, Throwable th2) {
        if (!this.enabled || (this.minLevel.getPriority() > level.getPriority() && !Log.isLoggable(this.tag, level.getPriority()))) {
            return 0;
        }
        return log(level, str, objArr, th2);
    }

    @JvmOverloads
    public final int debug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    @JvmOverloads
    public final int error(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @JvmOverloads
    public final int info(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable);

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setMinLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.minLevel = level;
    }

    @JvmOverloads
    public final int verbose(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    @JvmOverloads
    public final int warn(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.debug(str, th2);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.error(str, th2);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.info(str, th2);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.verbose(str, th2);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.warn(str, th2);
    }

    @JvmOverloads
    public final int debug(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    @JvmOverloads
    public final int error(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    @JvmOverloads
    public final int info(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    @JvmOverloads
    public final int verbose(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    @JvmOverloads
    public final int warn(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    @JvmOverloads
    public final int debug(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.DEBUG, format, args, throwable);
    }

    @JvmOverloads
    public final int error(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.ERROR, format, args, throwable);
    }

    @JvmOverloads
    public final int info(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.INFO, format, args, throwable);
    }

    @JvmOverloads
    public final int verbose(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.VERBOSE, format, args, throwable);
    }

    @JvmOverloads
    public final int warn(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.WARN, format, args, throwable);
    }

    @JvmOverloads
    public final int debug(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return a(Level.DEBUG, msg, new Object[0], throwable);
    }

    @JvmOverloads
    public final int error(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return a(Level.ERROR, msg, new Object[0], throwable);
    }

    @JvmOverloads
    public final int info(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return a(Level.INFO, msg, new Object[0], throwable);
    }

    @JvmOverloads
    public final int verbose(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return a(Level.VERBOSE, msg, new Object[0], throwable);
    }

    @JvmOverloads
    public final int warn(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return a(Level.WARN, msg, new Object[0], throwable);
    }
}
