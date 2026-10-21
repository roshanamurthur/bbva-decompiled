package com.bbva.glomohybrid.login.model.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlideMenuState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState;", "", "()V", "Invisible", "Visible", "Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState$Invisible;", "Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState$Visible;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SlideMenuState {

    /* JADX INFO: compiled from: SlideMenuState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState$Invisible;", "Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState;", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Invisible extends SlideMenuState {

        @NotNull
        public static final Invisible INSTANCE = new Invisible();

        public Invisible() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SlideMenuState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState$Visible;", "Lcom/bbva/glomohybrid/login/model/ui/SlideMenuState;", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Visible extends SlideMenuState {

        @NotNull
        public static final Visible INSTANCE = new Visible();

        public Visible() {
            super(null);
        }
    }

    public SlideMenuState() {
    }

    public /* synthetic */ SlideMenuState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
