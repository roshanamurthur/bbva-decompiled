package com.viergegroup.sdk.taptophone.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "", "()V", "Milliseconds", "None", "UiControlled", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$Milliseconds;", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$None;", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$UiControlled;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class HoldStrategy {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$Milliseconds;", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "ms", "", "(J)V", "getMs", "()J", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Milliseconds extends HoldStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67605a;

        public Milliseconds(long j10) {
            super(null);
            this.f67605a = j10;
        }

        /* JADX INFO: renamed from: getMs, reason: from getter */
        public final long getF67605a() {
            return this.f67605a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$None;", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "()V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends HoldStrategy {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy$UiControlled;", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "()V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UiControlled extends HoldStrategy {

        @NotNull
        public static final UiControlled INSTANCE = new UiControlled();

        private UiControlled() {
            super(null);
        }
    }

    private HoldStrategy() {
    }

    public /* synthetic */ HoldStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
