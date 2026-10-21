package com.bbva.glomohybrid.base.datasource;

import androidx.camera.core.impl.utils.c;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.delegate.Delegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RateYourAppDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/datasource/RateYourAppDataSource;", "", "", "incrementNeverTimesClicked$Base_release", "()V", "incrementNeverTimesClicked", "", "<set-?>", "a", "Lcom/bbva/localstorage/delegate/Delegate;", "getNeverTimesClicked", "()I", "setNeverTimesClicked", "(I)V", "neverTimesClicked", "<init>", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRateYourAppDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateYourAppDataSource.kt\ncom/bbva/glomohybrid/base/datasource/RateYourAppDataSource\n+ 2 LocalStorage.kt\ncom/bbva/localstorage/LocalStorageKt\n*L\n1#1,18:1\n31#2,6:19\n*S KotlinDebug\n*F\n+ 1 RateYourAppDataSource.kt\ncom/bbva/glomohybrid/base/datasource/RateYourAppDataSource\n*L\n7#1:19,6\n*E\n"})
public final class RateYourAppDataSource {

    @NotNull
    public static final String ID = "rate-your-app-datasource";

    @NotNull
    public static final String KEY_NEVER_TIMES_CLICKED = "key-never-times-clicked";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate neverTimesClicked;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31230b = {c.e(RateYourAppDataSource.class, "neverTimesClicked", "getNeverTimesClicked()I", 0)};

    public RateYourAppDataSource() {
        Delegate<?> delegate = LocalStorage.INSTANCE.get(Reflection.getOrCreateKotlinClass(Integer.class), KEY_NEVER_TIMES_CLICKED, 0, false);
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        this.neverTimesClicked = delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getNeverTimesClicked() {
        return ((Number) this.neverTimesClicked.getValue(this, f31230b[0])).intValue();
    }

    public final void incrementNeverTimesClicked$Base_release() {
        setNeverTimesClicked(getNeverTimesClicked() + 1 + getNeverTimesClicked());
    }

    public final void setNeverTimesClicked(int i10) {
        this.neverTimesClicked.setValue(this, f31230b[0], Integer.valueOf(i10));
    }
}
