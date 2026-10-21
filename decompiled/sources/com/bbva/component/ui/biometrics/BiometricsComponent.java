package com.bbva.component.ui.biometrics;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import i5.d;
import i5.e;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricsComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\n\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\bJ&\u0010\u000b\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\bJ&\u0010\f\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\bJ&\u0010\r\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000e¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ui/biometrics/BiometricsComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "", "value", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "description", "negativeButtonText", "", "setDeviceCredentialAllowed", "setConfirmationRequired", "Landroid/content/Context;", "context", "id", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "component-ui-biometrics_release"}, k = 1, mv = {1, 4, 0})
public final class BiometricsComponent extends ReactiveComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<BiometricResult> F0 = new ActionSpec<>("authentication");
    public final String E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f28239p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f28240q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f28241r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f28242s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f28243t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f28244u0;
    public final c v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f28245w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final b f28246x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Context f28247y0;

    /* JADX INFO: compiled from: BiometricsComponent.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/biometrics/BiometricsComponent$Companion;", "", "()V", "ON_AUTHENTICATION", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/component/ui/biometrics/BiometricResult;", "getON_AUTHENTICATION", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "component-ui-biometrics_release"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<BiometricResult> getON_AUTHENTICATION() {
            return BiometricsComponent.F0;
        }
    }

    /* JADX INFO: compiled from: BiometricsComponent.kt */
    public static final class a extends Lambda implements Function2<Integer, String, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            BiometricsComponent.access$fire(BiometricsComponent.this, new BiometricResult.Error(num.intValue(), str));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricsComponent.kt */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BiometricsComponent.access$fire(BiometricsComponent.this, BiometricResult.Failed.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricsComponent.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BiometricsComponent.access$fire(BiometricsComponent.this, BiometricResult.Success.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public BiometricsComponent(@NotNull Context context, @NotNull String str) {
        this.f28247y0 = context;
        this.E0 = str;
        newProperty("title", new Consumer() { // from class: i5.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f69505p0.title((Map) obj);
            }
        });
        newProperty(NotificationMessage.NOTIF_KEY_SUB_TITLE, new Consumer() { // from class: i5.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f69506p0.subtitle((Map) obj);
            }
        });
        newProperty("description", new Consumer() { // from class: i5.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f69507p0.description((Map) obj);
            }
        });
        newProperty("negativeButtonText", new d(this, 0));
        newProperty("isDeviceCredentialAllowed", new e(this, 0));
        newProperty("isConfirmationRequired", new m4.a(this, 1));
        this.v0 = new c();
        this.f28245w0 = new a();
        this.f28246x0 = new b();
    }

    public static final void access$fire(BiometricsComponent biometricsComponent, BiometricResult biometricResult) {
        biometricsComponent.fire(F0, biometricResult);
    }

    public final String a(Map<String, ? extends Map<String, String>> map) {
        String strLoadString = PropertiesHelper.loadString(this.f28247y0, PropertiesHelper.Property.from(map.get("text")));
        Intrinsics.checkExpressionValueIsNotNull(strLoadString, "PropertiesHelper.loadString(context, property)");
        return strLoadString;
    }

    public final void authenticate(@NotNull FragmentActivity activity) {
        Biometrics.Builder confirmationRequired = new Biometrics.Builder().setTitle(this.f28239p0).setSubtitle(this.f28240q0).setDescription(this.f28241r0).setNegativeButtonText(this.f28242s0).setConfirmationRequired(this.f28244u0);
        if (Build.VERSION.SDK_INT >= 29) {
            confirmationRequired.setDeviceCredentialAllowed(this.f28243t0);
        }
        confirmationRequired.build().show(activity, this.v0, this.f28245w0, this.f28246x0);
    }

    public final void description(@NotNull Map<String, ? extends Map<String, String>> value) {
        this.f28241r0 = a(value);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getE0() {
        return this.E0;
    }

    public final void negativeButtonText(@NotNull Map<String, ? extends Map<String, String>> value) {
        this.f28242s0 = a(value);
    }

    public final void setConfirmationRequired(boolean value) {
        this.f28244u0 = value;
    }

    public final void setDeviceCredentialAllowed(boolean value) {
        this.f28243t0 = value;
    }

    public final void subtitle(@NotNull Map<String, ? extends Map<String, String>> value) {
        this.f28240q0 = a(value);
    }

    public final void title(@NotNull Map<String, ? extends Map<String, String>> value) {
        this.f28239p0 = a(value);
    }
}
