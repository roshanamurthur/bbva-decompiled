package com.bbva.ethermobile.elogger.p000default;

import android.util.Log;
import com.bbva.ethermobile.elogger.LocalTracerObject;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalTracer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobile/elogger/default/LocalTracer;", "Lcom/bbva/ethermobile/elogger/default/LogPrinter;", "Lcom/bbva/ethermobile/elogger/LocalTracerObject;", LogKeysKt.TRACE, "", "performTrace", "Lcom/bbva/ethermobile/elogger/default/LocalTracerConfig;", "config", "<init>", "(Lcom/bbva/ethermobile/elogger/default/LocalTracerConfig;)V", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final class LocalTracer implements LogPrinter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LocalTracerConfig f29251a;

    /* JADX INFO: compiled from: LocalTracer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            try {
                iArr[LoggerLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggerLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggerLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggerLevel.WTF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoggerLevel.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalTracer(@NotNull LocalTracerConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f29251a = config;
    }

    @Override // com.bbva.ethermobile.elogger.p000default.LogPrinter
    public void performTrace(@NotNull LocalTracerObject trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        String tag = trace.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String();
        if (tag == null) {
            tag = this.f29251a.getTag();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[LoggerLevel.INSTANCE.from(trace.getLevel()).ordinal()]) {
            case 1:
                trace.getMessage();
                break;
            case 2:
                trace.getMessage();
                break;
            case 3:
                trace.getMessage();
                break;
            case 4:
                Log.w(tag, trace.getMessage());
                break;
            case 5:
                Log.wtf(tag, trace.getMessage());
                break;
            case 6:
                trace.getMessage();
                break;
        }
    }
}
