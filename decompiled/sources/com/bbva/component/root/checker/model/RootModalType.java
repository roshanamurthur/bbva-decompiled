package com.bbva.component.root.checker.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RootModalType.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/component/root/checker/model/RootModalType;", "", "()V", "NonRestrictive", "None", "Restrictive", "Lcom/bbva/component/root/checker/model/RootModalType$NonRestrictive;", "Lcom/bbva/component/root/checker/model/RootModalType$None;", "Lcom/bbva/component/root/checker/model/RootModalType$Restrictive;", "component-root-checker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RootModalType {

    /* JADX INFO: compiled from: RootModalType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/root/checker/model/RootModalType$NonRestrictive;", "Lcom/bbva/component/root/checker/model/RootModalType;", "()V", "component-root-checker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NonRestrictive extends RootModalType {

        @NotNull
        public static final NonRestrictive INSTANCE = new NonRestrictive();

        public NonRestrictive() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RootModalType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/root/checker/model/RootModalType$None;", "Lcom/bbva/component/root/checker/model/RootModalType;", "()V", "component-root-checker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class None extends RootModalType {

        @NotNull
        public static final None INSTANCE = new None();

        public None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RootModalType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/root/checker/model/RootModalType$Restrictive;", "Lcom/bbva/component/root/checker/model/RootModalType;", "()V", "component-root-checker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Restrictive extends RootModalType {

        @NotNull
        public static final Restrictive INSTANCE = new Restrictive();

        public Restrictive() {
            super(null);
        }
    }

    public RootModalType() {
    }

    public /* synthetic */ RootModalType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
