package com.bbva.glomo.router;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouterWelcome.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/router/WelcomeAction;", "", "()V", "Bottom", "Link", "None", "Top", "Lcom/bbva/glomo/router/WelcomeAction$Bottom;", "Lcom/bbva/glomo/router/WelcomeAction$Link;", "Lcom/bbva/glomo/router/WelcomeAction$None;", "Lcom/bbva/glomo/router/WelcomeAction$Top;", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class WelcomeAction {

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/WelcomeAction$Bottom;", "Lcom/bbva/glomo/router/WelcomeAction;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bottom extends WelcomeAction {

        @NotNull
        public static final Bottom INSTANCE = new Bottom();

        public Bottom() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/WelcomeAction$Link;", "Lcom/bbva/glomo/router/WelcomeAction;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Link extends WelcomeAction {

        @NotNull
        public static final Link INSTANCE = new Link();

        public Link() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/WelcomeAction$None;", "Lcom/bbva/glomo/router/WelcomeAction;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class None extends WelcomeAction {

        @NotNull
        public static final None INSTANCE = new None();

        public None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomo/router/WelcomeAction$Top;", "Lcom/bbva/glomo/router/WelcomeAction;", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Top extends WelcomeAction {

        @NotNull
        public static final Top INSTANCE = new Top();

        public Top() {
            super(null);
        }
    }

    public WelcomeAction() {
    }

    public /* synthetic */ WelcomeAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
