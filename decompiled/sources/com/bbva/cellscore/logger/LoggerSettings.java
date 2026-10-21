package com.bbva.cellscore.logger;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoggerSettings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/cellscore/logger/LoggerSettings;", "", "()V", "All", "Exclude", "Include", "Nothing", "Lcom/bbva/cellscore/logger/LoggerSettings$All;", "Lcom/bbva/cellscore/logger/LoggerSettings$Nothing;", "Lcom/bbva/cellscore/logger/LoggerSettings$Exclude;", "Lcom/bbva/cellscore/logger/LoggerSettings$Include;", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class LoggerSettings {

    /* JADX INFO: compiled from: LoggerSettings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/cellscore/logger/LoggerSettings$All;", "Lcom/bbva/cellscore/logger/LoggerSettings;", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class All extends LoggerSettings {

        @NotNull
        public static final All INSTANCE = new All();

        public All() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: LoggerSettings.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/cellscore/logger/LoggerSettings$Exclude;", "Lcom/bbva/cellscore/logger/LoggerSettings;", "", "Lcom/bbva/cellscore/logger/LogModule;", "component1", "modules", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/util/List;", "getModules", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Exclude extends LoggerSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<LogModule> modules;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Exclude(@NotNull List<? extends LogModule> modules) {
            super(null);
            Intrinsics.checkNotNullParameter(modules, "modules");
            this.modules = modules;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Exclude copy$default(Exclude exclude, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = exclude.modules;
            }
            return exclude.copy(list);
        }

        @NotNull
        public final List<LogModule> component1() {
            return this.modules;
        }

        @NotNull
        public final Exclude copy(@NotNull List<? extends LogModule> modules) {
            Intrinsics.checkNotNullParameter(modules, "modules");
            return new Exclude(modules);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exclude) && Intrinsics.areEqual(this.modules, ((Exclude) other).modules);
        }

        @NotNull
        public final List<LogModule> getModules() {
            return this.modules;
        }

        public int hashCode() {
            return this.modules.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("Exclude(modules="), this.modules, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: LoggerSettings.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/cellscore/logger/LoggerSettings$Include;", "Lcom/bbva/cellscore/logger/LoggerSettings;", "", "Lcom/bbva/cellscore/logger/LogModule;", "component1", "modules", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/util/List;", "getModules", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Include extends LoggerSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<LogModule> modules;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Include(@NotNull List<? extends LogModule> modules) {
            super(null);
            Intrinsics.checkNotNullParameter(modules, "modules");
            this.modules = modules;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Include copy$default(Include include, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = include.modules;
            }
            return include.copy(list);
        }

        @NotNull
        public final List<LogModule> component1() {
            return this.modules;
        }

        @NotNull
        public final Include copy(@NotNull List<? extends LogModule> modules) {
            Intrinsics.checkNotNullParameter(modules, "modules");
            return new Include(modules);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Include) && Intrinsics.areEqual(this.modules, ((Include) other).modules);
        }

        @NotNull
        public final List<LogModule> getModules() {
            return this.modules;
        }

        public int hashCode() {
            return this.modules.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("Include(modules="), this.modules, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: LoggerSettings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/cellscore/logger/LoggerSettings$Nothing;", "Lcom/bbva/cellscore/logger/LoggerSettings;", "()V", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Nothing extends LoggerSettings {

        @NotNull
        public static final Nothing INSTANCE = new Nothing();

        public Nothing() {
            super(null);
        }
    }

    public LoggerSettings() {
    }

    public /* synthetic */ LoggerSettings(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
