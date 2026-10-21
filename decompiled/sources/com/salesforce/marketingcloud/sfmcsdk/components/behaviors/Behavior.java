package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import com.bbva.semaas.model.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BehaviorType.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00122\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B/\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "", "timestamp", "", Properties.APP_VERSION, "", Properties.APP_NAME, "previousVersion", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getAppVersion", "getPreviousVersion", "getTimestamp", "()J", "AppBackgrounded", "AppForegrounded", "AppVersionChanged", "Companion", "ScreenEntry", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppForegrounded;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppBackgrounded;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppVersionChanged;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$ScreenEntry;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Behavior {

    @NotNull
    public static final String KEY_TIME = "timestamp";

    @Nullable
    private final String appName;

    @Nullable
    private final String appVersion;

    @Nullable
    private final String previousVersion;
    private final long timestamp;

    /* JADX INFO: compiled from: BehaviorType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppBackgrounded;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "timestamp", "", Properties.APP_VERSION, "", Properties.APP_NAME, "(JLjava/lang/String;Ljava/lang/String;)V", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AppBackgrounded extends Behavior {
        public AppBackgrounded(long j10, @Nullable String str, @Nullable String str2) {
            super(j10, str, str2, null, 8, null);
        }
    }

    /* JADX INFO: compiled from: BehaviorType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppForegrounded;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "timestamp", "", Properties.APP_VERSION, "", Properties.APP_NAME, "(JLjava/lang/String;Ljava/lang/String;)V", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AppForegrounded extends Behavior {
        public AppForegrounded(long j10, @Nullable String str, @Nullable String str2) {
            super(j10, str, str2, null, 8, null);
        }
    }

    /* JADX INFO: compiled from: BehaviorType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$AppVersionChanged;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "timestamp", "", Properties.APP_VERSION, "", Properties.APP_NAME, "previousVersion", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AppVersionChanged extends Behavior {
        public AppVersionChanged(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            super(j10, str, str2, str3, null);
        }
    }

    /* JADX INFO: compiled from: BehaviorType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior$ScreenEntry;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/Behavior;", "name", "", "timestamp", "", Properties.APP_VERSION, Properties.APP_NAME, "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ScreenEntry extends Behavior {

        @NotNull
        public static final String KEY_NAME = "screen_name";

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenEntry(@NotNull String name, long j10, @Nullable String str, @Nullable String str2) {
            super(j10, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    public /* synthetic */ Behavior(long j10, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3);
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getPreviousVersion() {
        return this.previousVersion;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    private Behavior(long j10, String str, String str2, String str3) {
        this.timestamp = j10;
        this.appVersion = str;
        this.appName = str2;
        this.previousVersion = str3;
    }

    public /* synthetic */ Behavior(long j10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, (i10 & 8) != 0 ? null : str3, null);
    }
}
