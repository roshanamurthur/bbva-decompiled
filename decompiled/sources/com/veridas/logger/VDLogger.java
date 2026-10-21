package com.veridas.logger;

import android.content.Context;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VDLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/veridas/logger/VDLogger;", "", "()V", "Companion", "common-logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VDLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentLoggerList f67224a = new ConcurrentLoggerList();

    /* JADX INFO: compiled from: VDLogger.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J \u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J9\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001eJ1\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001fJ\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0007J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J9\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d\"\u00020\u0001H\u0007¢\u0006\u0002\u0010 J1\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d\"\u00020\u0001H\u0007¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/veridas/logger/VDLogger$Companion;", "", "()V", "loggers", "Lcom/veridas/logger/ConcurrentLoggerList;", "addLogger", "", "logger", "Lcom/veridas/logger/Logger;", "loggerFactory", "Lcom/veridas/logger/LoggerFactory;", ExifInterface.GPS_DIRECTION_TRUE, "loggerFactoryClass", "Ljava/lang/Class;", "loggerFactoryClassName", "", "Lkotlin/reflect/KClass;", "endSession", "isSuccessful", "", "getNumberOfLoggers", "", LogKeysKt.LOG, LogKeysKt.TAG, "Lcom/veridas/logger/Logger$Tag;", "message", "params", "Landroid/os/Bundle;", "args", "", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "startSession", "context", "Landroid/content/Context;", "common-logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nVDLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VDLogger.kt\ncom/veridas/logger/VDLogger$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1855#2,2:223\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n1855#2,2:233\n1855#2,2:235\n1855#2,2:237\n1855#2,2:239\n*S KotlinDebug\n*F\n+ 1 VDLogger.kt\ncom/veridas/logger/VDLogger$Companion\n*L\n109#1:223,2\n121#1:225,2\n132#1:227,2\n143#1:229,2\n155#1:231,2\n165#1:233,2\n176#1:235,2\n187#1:237,2\n199#1:239,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void addLogger(@NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            VDLogger.f67224a.add(logger);
        }

        @JvmStatic
        public final void endSession(boolean isSuccessful) {
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().endSession(isSuccessful);
            }
            VDLogger.f67224a.clear();
        }

        @JvmStatic
        public final int getNumberOfLoggers() {
            return VDLogger.f67224a.size();
        }

        @JvmStatic
        public final void log(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message);
            }
        }

        @JvmStatic
        public final void startSession(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().startSession(context);
            }
        }

        @JvmStatic
        public final void addLogger(@NotNull LoggerFactory loggerFactory) {
            Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
            VDLogger.f67224a.add(loggerFactory.create());
        }

        @JvmStatic
        public final <T extends LoggerFactory> void addLogger(@NotNull KClass<T> loggerFactoryClass) throws VDLoggerException {
            Intrinsics.checkNotNullParameter(loggerFactoryClass, "loggerFactoryClass");
            KFunction primaryConstructor = KClasses.getPrimaryConstructor(loggerFactoryClass);
            if (primaryConstructor != null) {
                if (!(!primaryConstructor.getParameters().isEmpty())) {
                    R rCall = primaryConstructor.call(new Object[0]);
                    Intrinsics.checkNotNull(rCall, "null cannot be cast to non-null type com.veridas.logger.LoggerFactory");
                    addLogger((LoggerFactory) rCall);
                    return;
                }
                throw new VDLoggerException(VDLoggerKt.EX_NO_EMPTY_CONSTRUCTOR);
            }
            throw new VDLoggerException(VDLoggerKt.EX_NO_PRIMARY_CONSTRUCTOR);
        }

        @JvmStatic
        public final void log(@NotNull String tag, @NotNull String message, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(params, "params");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, params);
            }
        }

        @JvmStatic
        public final <T extends LoggerFactory> void addLogger(@NotNull Class<T> loggerFactoryClass) throws IllegalAccessException, InstantiationException, VDLoggerException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(loggerFactoryClass, "loggerFactoryClass");
            try {
                Constructor<T> constructor = loggerFactoryClass.getConstructor(new Class[0]);
                Intrinsics.checkNotNullExpressionValue(constructor, "getConstructor(...)");
                T tNewInstance = constructor.newInstance(new Object[0]);
                Intrinsics.checkNotNull(tNewInstance, "null cannot be cast to non-null type com.veridas.logger.LoggerFactory");
                addLogger(tNewInstance);
            } catch (NoSuchMethodException unused) {
                throw new VDLoggerException(VDLoggerKt.EX_NO_EMPTY_CONSTRUCTOR);
            }
        }

        @JvmStatic
        public final void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(args, "args");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, params, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void log(@NotNull Logger.Tag tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message);
            }
        }

        @JvmStatic
        public final void addLogger(@NotNull String loggerFactoryClassName) throws IllegalAccessException, InstantiationException, VDLoggerException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(loggerFactoryClassName, "loggerFactoryClassName");
            try {
                Class<?> cls = Class.forName(loggerFactoryClassName);
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                if (ArraysKt___ArraysKt.contains(interfaces, LoggerFactory.class)) {
                    Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<com.veridas.logger.LoggerFactory>");
                    addLogger(cls);
                    return;
                }
                throw new VDLoggerException(VDLoggerKt.EX_CLASS_DOES_NOT_IMPLEMENT_CORRECT_INTERFACE);
            } catch (ClassNotFoundException unused) {
                throw new VDLoggerException(VDLoggerKt.EX_CLASS_NOT_FOUND);
            }
        }

        @JvmStatic
        public final void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Bundle params) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(params, "params");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, params);
            }
        }

        @JvmStatic
        public final void log(@NotNull Logger.Tag tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(args, "args");
            Iterator<Logger> it = VDLogger.f67224a.iterator();
            while (it.hasNext()) {
                it.next().log(tag, message, params, Arrays.copyOf(args, args.length));
            }
        }
    }

    @JvmStatic
    public static final void addLogger(@NotNull Logger logger) {
        INSTANCE.addLogger(logger);
    }

    @JvmStatic
    public static final void endSession(boolean z10) {
        INSTANCE.endSession(z10);
    }

    @JvmStatic
    public static final int getNumberOfLoggers() {
        return INSTANCE.getNumberOfLoggers();
    }

    @JvmStatic
    public static final void log(@NotNull Logger.Tag tag, @NotNull String str) {
        INSTANCE.log(tag, str);
    }

    @JvmStatic
    public static final void startSession(@NotNull Context context) {
        INSTANCE.startSession(context);
    }

    @JvmStatic
    public static final void addLogger(@NotNull LoggerFactory loggerFactory) {
        INSTANCE.addLogger(loggerFactory);
    }

    @JvmStatic
    public static final void log(@NotNull Logger.Tag tag, @NotNull String str, @NotNull Bundle bundle) {
        INSTANCE.log(tag, str, bundle);
    }

    @JvmStatic
    public static final <T extends LoggerFactory> void addLogger(@NotNull Class<T> cls) throws IllegalAccessException, InstantiationException, VDLoggerException, InvocationTargetException {
        INSTANCE.addLogger(cls);
    }

    @JvmStatic
    public static final void log(@NotNull Logger.Tag tag, @NotNull String str, @NotNull Bundle bundle, @NotNull Object... objArr) {
        INSTANCE.log(tag, str, bundle, objArr);
    }

    @JvmStatic
    public static final void addLogger(@NotNull String str) throws IllegalAccessException, InstantiationException, VDLoggerException, InvocationTargetException {
        INSTANCE.addLogger(str);
    }

    @JvmStatic
    public static final void log(@NotNull Logger.Tag tag, @NotNull String str, @NotNull Object... objArr) {
        INSTANCE.log(tag, str, objArr);
    }

    @JvmStatic
    public static final <T extends LoggerFactory> void addLogger(@NotNull KClass<T> kClass) throws VDLoggerException {
        INSTANCE.addLogger(kClass);
    }

    @JvmStatic
    public static final void log(@NotNull String str, @NotNull String str2) {
        INSTANCE.log(str, str2);
    }

    @JvmStatic
    public static final void log(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        INSTANCE.log(str, str2, bundle);
    }

    @JvmStatic
    public static final void log(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle, @NotNull Object... objArr) {
        INSTANCE.log(str, str2, bundle, objArr);
    }

    @JvmStatic
    public static final void log(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        INSTANCE.log(str, str2, objArr);
    }
}
