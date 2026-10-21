package com.bbva.plugin.analyticsdata;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsSourceConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Assets", "FilePath", "Identifier", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$Assets;", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$Identifier;", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$FilePath;", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public abstract class AnalyticsSourceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: compiled from: AnalyticsSourceConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$Assets;", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "filePath", "", "(Ljava/lang/String;)V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Assets extends AnalyticsSourceConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Assets(@NotNull String filePath) {
            super(filePath, null);
            Intrinsics.checkNotNullParameter(filePath, "filePath");
        }
    }

    /* JADX INFO: compiled from: AnalyticsSourceConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$FilePath;", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "filePath", "", "(Ljava/lang/String;)V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FilePath extends AnalyticsSourceConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilePath(@NotNull String filePath) {
            super(filePath, null);
            Intrinsics.checkNotNullParameter(filePath, "filePath");
        }
    }

    /* JADX INFO: compiled from: AnalyticsSourceConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig$Identifier;", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "identifier", "", "(Ljava/lang/String;)V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Identifier extends AnalyticsSourceConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Identifier(@NotNull String identifier) {
            super(identifier, null);
            Intrinsics.checkNotNullParameter(identifier, "identifier");
        }
    }

    public AnalyticsSourceConfig(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
