package com.bbva.appsflyer;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConversionListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/appsflyer/ConversionEvent;", "", "()V", "AppOpenAttribution", "AttributionFailure", "ConversionDataFail", "ConversionDataSuccess", "Lcom/bbva/appsflyer/ConversionEvent$AppOpenAttribution;", "Lcom/bbva/appsflyer/ConversionEvent$AttributionFailure;", "Lcom/bbva/appsflyer/ConversionEvent$ConversionDataFail;", "Lcom/bbva/appsflyer/ConversionEvent$ConversionDataSuccess;", "appsflyer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ConversionEvent {

    /* JADX INFO: compiled from: ConversionListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/appsflyer/ConversionEvent$AppOpenAttribution;", "Lcom/bbva/appsflyer/ConversionEvent;", "", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "<init>", "(Ljava/util/Map;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
    public static final class AppOpenAttribution extends ConversionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, String> data;

        public AppOpenAttribution(@Nullable Map<String, String> map) {
            super(null);
            this.data = map;
        }

        @Nullable
        public final Map<String, String> getData() {
            return this.data;
        }
    }

    /* JADX INFO: compiled from: ConversionListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/appsflyer/ConversionEvent$AttributionFailure;", "Lcom/bbva/appsflyer/ConversionEvent;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
    public static final class AttributionFailure extends ConversionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        public AttributionFailure(@Nullable String str) {
            super(null);
            this.value = str;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ConversionListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/appsflyer/ConversionEvent$ConversionDataFail;", "Lcom/bbva/appsflyer/ConversionEvent;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
    public static final class ConversionDataFail extends ConversionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        public ConversionDataFail(@Nullable String str) {
            super(null);
            this.value = str;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ConversionListener.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/appsflyer/ConversionEvent$ConversionDataSuccess;", "Lcom/bbva/appsflyer/ConversionEvent;", "", "", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "<init>", "(Ljava/util/Map;)V", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
    public static final class ConversionDataSuccess extends ConversionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, Object> data;

        public ConversionDataSuccess(@Nullable Map<String, Object> map) {
            super(null);
            this.data = map;
        }

        @Nullable
        public final Map<String, Object> getData() {
            return this.data;
        }
    }

    public ConversionEvent() {
    }

    public /* synthetic */ ConversionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
