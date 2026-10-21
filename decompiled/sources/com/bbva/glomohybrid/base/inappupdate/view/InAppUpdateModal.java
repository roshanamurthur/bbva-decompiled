package com.bbva.glomohybrid.base.inappupdate.view;

import ad.d;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InAppUpdateModal.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\b\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal;", "", EnableHandler.ID, "", "getEnable", "()Z", "setEnable", "(Z)V", "intents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "show", "", "Intent", UUIDPreferences.TYPE_KEY, "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InAppUpdateModal {

    /* JADX INFO: compiled from: InAppUpdateModal.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent;", "", "()V", "Install", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent$Install;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: InAppUpdateModal.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent$Install;", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Install extends Intent {

            @NotNull
            public static final Install INSTANCE = new Install();

            public Install() {
                super(null);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: InAppUpdateModal.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Type;", "", "", "getFragmentTag", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Simple", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Type$Simple;", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: compiled from: InAppUpdateModal.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Type$Simple;", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Type;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Simple extends Type {

            @NotNull
            public static final Simple INSTANCE = new Simple();

            public Simple() {
                super("inapp_update_half_modal", null);
            }
        }

        public Type(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.id = str;
        }

        @NotNull
        public final String getFragmentTag() {
            return d.f(new StringBuilder(), this.id, "-fragment");
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    boolean getEnable();

    @NotNull
    Flow<Intent> getIntents();

    void setEnable(boolean z10);

    void show();
}
