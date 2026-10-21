package com.mastercard.sonic.controller;

import android.content.Context;
import bi.j;
import bi.k;
import bi.l;
import bi.m;
import com.mastercard.sonic.R;
import com.mastercard.sonic.StatusCode;
import com.mastercard.sonic.analytics.mixpanel.MixPanelAnalyticsManager;
import com.mastercard.sonic.analytics.mixpanel.model.TrackEvent;
import com.mastercard.sonic.hapticsmanager.HapticsManager;
import com.mastercard.sonic.listeners.OnCompleteListener;
import com.mastercard.sonic.listeners.OnPrepareListener;
import com.mastercard.sonic.model.SonicMerchant;
import com.mastercard.sonic.sonicasset.SonicAsset;
import com.mastercard.sonic.sonicasset.SonicAssetFactory;
import com.mastercard.sonic.sonicasset.SonicUpgradeManager;
import com.mastercard.sonic.utils.FileDirUtils;
import com.mastercard.sonic.utils.SharedPreferenceUtils;
import com.mastercard.sonic.utils.Status;
import com.mastercard.sonic.utils.Utils;
import com.mastercard.sonic.widget.SonicView;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007R$\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/mastercard/sonic/controller/SonicController;", "", "Lcom/mastercard/sonic/controller/SonicType;", "sonicType", "", "sonicCue", "Lcom/mastercard/sonic/controller/SonicEnvironment;", "sonicEnvironment", "Lcom/mastercard/sonic/model/SonicMerchant;", "merchant", "", "isHapticsEnabled", "Landroid/content/Context;", "context", "Lcom/mastercard/sonic/listeners/OnPrepareListener;", "onPrepareListener", "", "prepare", "Lcom/mastercard/sonic/widget/SonicView;", "sonicView", "Lcom/mastercard/sonic/listeners/OnCompleteListener;", "onCompleteListener", "play", "<set-?>", "f", "Z", "isPlaying", "()Z", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSonicController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SonicController.kt\ncom/mastercard/sonic/controller/SonicController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
public final class SonicController {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f51427w = {androidx.camera.core.impl.utils.c.e(SonicController.class, "isHapticsSupportedByDevice", "isHapticsSupportedByDevice()Z", 0), androidx.camera.core.impl.utils.c.e(SonicController.class, "mStatusCode", "getMStatusCode()I", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Status f51428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Status f51429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Status f51430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Regex f51431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FileDirUtils f51432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isPlaying;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SonicAnimationController f51434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SonicSoundController f51435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SonicUpgradeManager f51436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferenceUtils f51437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MixPanelAnalyticsManager f51438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SonicType f51439l;
    public Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f51440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SonicMerchant f51441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f51442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SonicEnvironment f51443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ReadWriteProperty f51444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ReadWriteProperty f51445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f51446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public HapticsManager f51447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f51448v;

    /* JADX INFO: compiled from: SonicController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SonicType.values().length];
            try {
                iArr[SonicType.SOUND_AND_ANIMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SonicType.ANIMATION_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SonicType.SOUND_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.PLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51450q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(0);
            this.f51450q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51429b = Status.PLAYED;
            this.f51450q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51452q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0) {
            super(0);
            this.f51452q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51429b = Status.ERROR;
            this.f51452q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51454q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(0);
            this.f51454q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51430c = Status.PLAYED;
            this.f51454q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51456q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.f51456q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51430c = Status.ERROR;
            this.f51456q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51458q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> function0) {
            super(0);
            this.f51458q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51428a = Status.PLAYED;
            this.f51458q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51460q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0) {
            super(0);
            this.f51460q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SonicController.this.f51428a = Status.ERROR;
            this.f51460q0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnPrepareListener f51462q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(OnPrepareListener onPrepareListener) {
            super(0);
            this.f51462q0 = onPrepareListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws JSONException {
            SonicController.this.b(this.f51462q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnPrepareListener f51464q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(OnPrepareListener onPrepareListener) {
            super(0);
            this.f51464q0 = onPrepareListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws JSONException {
            SonicController.this.b(this.f51464q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SonicController.kt */
    public static final class i extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnPrepareListener f51466q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(OnPrepareListener onPrepareListener) {
            super(0);
            this.f51466q0 = onPrepareListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws JSONException {
            SonicController.this.b(this.f51466q0);
            return Unit.INSTANCE;
        }
    }

    public SonicController() {
        Status status = Status.NOT_READY;
        this.f51428a = status;
        this.f51429b = status;
        this.f51430c = status;
        this.f51431d = new Regex("[^A-Za-z0-9]");
        this.f51432e = FileDirUtils.INSTANCE;
        Delegates delegates = Delegates.INSTANCE;
        this.f51444r = delegates.notNull();
        this.f51445s = delegates.notNull();
        this.f51446t = true;
        this.f51448v = true;
    }

    public static /* synthetic */ void play$default(SonicController sonicController, SonicView sonicView, OnCompleteListener onCompleteListener, int i10, Object obj) throws JSONException {
        if ((i10 & 1) != 0) {
            sonicView = null;
        }
        sonicController.play(sonicView, onCompleteListener);
    }

    public final void a(OnCompleteListener onCompleteListener) {
        Status status;
        Status status2;
        int iIntValue;
        Status status3;
        Status status4 = this.f51428a;
        Status status5 = Status.READY;
        if (status4 == status5 || (status = this.f51429b) == status5) {
            return;
        }
        Status status6 = Status.PLAYED;
        SonicUpgradeManager sonicUpgradeManager = null;
        if ((status4 == status6 || status4 == Status.NOT_REQUIRED) && ((status == status6 || status == Status.NOT_REQUIRED) && ((status2 = this.f51430c) == status6 || status2 == Status.NOT_REQUIRED))) {
            Integer numValueOf = Integer.valueOf(StatusCode.SUCCESS);
            numValueOf.intValue();
            if (!this.f51446t) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : 801;
        } else {
            Status status7 = Status.ERROR;
            iIntValue = 905;
            if ((status4 != status7 && status4 != Status.NOT_REQUIRED) || ((status != status7 && status != Status.NOT_REQUIRED) || ((status3 = this.f51430c) != status7 && status3 != Status.NOT_REQUIRED))) {
                if (status4 == status7) {
                    iIntValue = 906;
                } else if (status == status7) {
                    iIntValue = StatusCode.ERROR_WHILE_PLAYING_ANIMATION;
                } else if (this.f51430c == status7) {
                    iIntValue = StatusCode.ERROR_WHILE_PLAYING_HAPTICS;
                }
            }
        }
        this.f51445s.setValue(this, f51427w[1], Integer.valueOf(iIntValue));
        onCompleteListener.onComplete(c());
        this.isPlaying = false;
        String str = this.f51442p;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCueVersion");
            str = null;
        }
        j(str);
        SonicUpgradeManager sonicUpgradeManager2 = this.f51436i;
        if (sonicUpgradeManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
        } else {
            sonicUpgradeManager = sonicUpgradeManager2;
        }
        if (sonicUpgradeManager.getSonicAssetDownloadManager().getIsValidCueName() || this.f51440n != null) {
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCueName");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(OnPrepareListener onPrepareListener) throws JSONException {
        Status status;
        Status status2 = this.f51428a;
        Status status3 = Status.NOT_READY;
        if (status2 == status3 || (status = this.f51429b) == status3) {
            return;
        }
        Status status4 = Status.READY;
        Context context = null;
        String str = null;
        if ((status2 == status4 || status2 == Status.NOT_REQUIRED) && (status == status4 || status == Status.NOT_REQUIRED)) {
            SharedPreferenceUtils sharedPreferenceUtils = this.f51437j;
            if (sharedPreferenceUtils == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferenceUtils");
                sharedPreferenceUtils = null;
            }
            String str2 = this.f51440n;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCueName");
            } else {
                str = str2;
            }
            this.f51442p = sharedPreferenceUtils.getExistingAnimationVersion(str);
            onPrepareListener.onPrepared(StatusCode.SUCCESS);
        } else if (this.f51446t) {
            this.f51446t = false;
            FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
            Context context2 = this.m;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context2;
            }
            fileDirUtils.clearStoredData$sonic_sdk_release(context);
            h(onPrepareListener);
        } else {
            Status status5 = Status.ERROR;
            if ((status2 == status5 || status2 == Status.NOT_REQUIRED) && (status == status5 || status == Status.NOT_REQUIRED)) {
                onPrepareListener.onPrepared(901);
            } else if (status2 == status5) {
                onPrepareListener.onPrepared(902);
            } else if (status == status5) {
                onPrepareListener.onPrepared(903);
            } else if (this.f51430c == status5) {
                onPrepareListener.onPrepared(StatusCode.ERROR_WHILE_PREPARING_HAPTICS);
            }
        }
        if (this.isPlaying) {
            Status status6 = Status.PLAYED;
            if (status6 == this.f51429b && status6 == this.f51428a) {
                return;
            }
            this.isPlaying = false;
        }
    }

    public final int c() {
        return ((Number) this.f51445s.getValue(this, f51427w[1])).intValue();
    }

    public final void d(SonicView sonicView, Function0<Unit> function0) {
        SonicAnimationController sonicAnimationController = this.f51434g;
        if (sonicAnimationController != null) {
            sonicAnimationController.play(sonicView, new a(function0), new b(function0));
        } else {
            this.f51429b = Status.ERROR;
            function0.invoke();
        }
    }

    public final void e(Function0<Unit> function0) {
        HapticsManager hapticsManager = this.f51447u;
        if (hapticsManager == null) {
            this.f51430c = Status.NOT_REQUIRED;
            function0.invoke();
        } else {
            Intrinsics.checkNotNull(hapticsManager);
            hapticsManager.play(new c(function0), new d(function0));
        }
    }

    public final void f(SonicView sonicView, OnCompleteListener onCompleteListener) {
        if (this.isPlaying) {
            onCompleteListener.onComplete(904);
            this.f51445s.setValue(this, f51427w[1], 904);
            String str = this.f51442p;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCueVersion");
                str = null;
            }
            j(str);
            return;
        }
        Status status = this.f51429b;
        Status status2 = Status.PLAYED;
        if (status == status2) {
            status = Status.READY;
        }
        this.f51429b = status;
        Status status3 = this.f51428a;
        if (status3 == status2) {
            status3 = Status.READY;
        }
        this.f51428a = status3;
        Status status4 = this.f51430c;
        if (status4 == status2) {
            status4 = Status.READY;
        }
        this.f51430c = status4;
        Status status5 = Status.READY;
        if (status3 != status5 && status != status5) {
            onCompleteListener.onComplete(StatusCode.ERROR_NOT_PREPARED);
            return;
        }
        this.isPlaying = true;
        if (status == status5 && status3 == status5) {
            if (sonicView == null) {
                this.f51429b = Status.ERROR;
                a(onCompleteListener);
                return;
            } else {
                d(sonicView, new bi.a(this, onCompleteListener));
                g(new bi.b(this, onCompleteListener));
                e(new bi.c(this, onCompleteListener));
                return;
            }
        }
        if (status != status5 || status3 == status5) {
            if (status3 != status5 || status == status5) {
                return;
            }
            g(new bi.f(this, onCompleteListener));
            e(new bi.g(this, onCompleteListener));
            return;
        }
        if (sonicView == null) {
            this.f51429b = Status.ERROR;
            a(onCompleteListener);
        } else {
            d(sonicView, new bi.d(this, onCompleteListener));
            e(new bi.e(this, onCompleteListener));
        }
    }

    public final void g(Function0<Unit> function0) {
        SonicSoundController sonicSoundController = this.f51435h;
        if (sonicSoundController != null) {
            sonicSoundController.play(new e(function0), new f(function0));
        } else {
            this.f51428a = Status.ERROR;
            function0.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    public final void h(OnPrepareListener onPrepareListener) throws JSONException {
        SonicAnimationController sonicAnimationController;
        SonicSoundController sonicSoundController;
        try {
            SonicUpgradeManager sonicUpgradeManager = this.f51436i;
            Context context = null;
            if (sonicUpgradeManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
                sonicUpgradeManager = null;
            }
            sonicUpgradeManager.getVersionConfigManager().readFromStoredVersionConfigFile();
            SonicAssetFactory.Companion companion = SonicAssetFactory.INSTANCE;
            FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
            Context context2 = this.m;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            String sonicAssetPlayConfigFilePathActive = fileDirUtils.getSonicAssetPlayConfigFilePathActive(context2);
            Context context3 = this.m;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context3 = null;
            }
            SonicAsset sonicAssetCreateSonicAsset = companion.createSonicAsset(sonicAssetPlayConfigFilePathActive, context3);
            try {
                sonicAssetCreateSonicAsset.setPlayConfigFromFile();
                SonicType sonicType = this.f51439l;
                if (sonicType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                    sonicType = null;
                }
                SonicType sonicType2 = SonicType.SOUND_AND_ANIMATION;
                if (sonicType == sonicType2) {
                    g gVar = new g(onPrepareListener);
                    if (this.f51434g == null) {
                        this.f51434g = new SonicAnimationController();
                    }
                    sonicAnimationController = this.f51434g;
                    if (sonicAnimationController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSonicAnimationController");
                        sonicAnimationController = null;
                    }
                    sonicAnimationController.prepare(sonicAssetCreateSonicAsset, new bi.h(this, gVar), new bi.i(this, gVar));
                } else {
                    SonicType sonicType3 = this.f51439l;
                    if (sonicType3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                        sonicType3 = null;
                    }
                    if (sonicType3 == SonicType.ANIMATION_ONLY) {
                        g gVar2 = new g(onPrepareListener);
                        if (this.f51434g == null) {
                            this.f51434g = new SonicAnimationController();
                        }
                        sonicAnimationController = this.f51434g;
                        if (sonicAnimationController == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSonicAnimationController");
                            sonicAnimationController = null;
                        }
                        sonicAnimationController.prepare(sonicAssetCreateSonicAsset, new bi.h(this, gVar2), new bi.i(this, gVar2));
                    }
                }
                SonicType sonicType4 = this.f51439l;
                if (sonicType4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                    sonicType4 = null;
                }
                if (sonicType4 == sonicType2) {
                    h hVar = new h(onPrepareListener);
                    if (this.f51435h == null) {
                        this.f51435h = new SonicSoundController();
                    }
                    sonicSoundController = this.f51435h;
                    if (sonicSoundController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSonicSoundController");
                        sonicSoundController = null;
                    }
                    sonicSoundController.prepareSound(sonicAssetCreateSonicAsset, new l(this, hVar), new m(this, hVar));
                } else {
                    SonicType sonicType5 = this.f51439l;
                    if (sonicType5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                        sonicType5 = null;
                    }
                    if (sonicType5 == SonicType.SOUND_ONLY) {
                        h hVar2 = new h(onPrepareListener);
                        if (this.f51435h == null) {
                            this.f51435h = new SonicSoundController();
                        }
                        sonicSoundController = this.f51435h;
                        if (sonicSoundController == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSonicSoundController");
                            sonicSoundController = null;
                        }
                        sonicSoundController.prepareSound(sonicAssetCreateSonicAsset, new l(this, hVar2), new m(this, hVar2));
                    }
                }
                boolean zIsHapticsSupportedForCue = sonicAssetCreateSonicAsset.isHapticsSupportedForCue();
                Utils.Companion companion2 = Utils.INSTANCE;
                Context context4 = this.m;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context4 = null;
                }
                boolean zDeviceHapticSupport = companion2.deviceHapticSupport(context4);
                KProperty<?>[] kPropertyArr = f51427w;
                KProperty<?> kProperty = kPropertyArr[0];
                Boolean boolValueOf = Boolean.valueOf(zDeviceHapticSupport);
                ReadWriteProperty readWriteProperty = this.f51444r;
                readWriteProperty.setValue(this, kProperty, boolValueOf);
                if (!zIsHapticsSupportedForCue || !this.f51448v || !((Boolean) readWriteProperty.getValue(this, kPropertyArr[0])).booleanValue()) {
                    this.f51430c = Status.NOT_REQUIRED;
                    this.f51447u = null;
                    Context context5 = this.m;
                    if (context5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    } else {
                        context = context5;
                    }
                    Intrinsics.checkNotNullExpressionValue(context.getResources().getString(R.string.haptics_not_supported_message, String.valueOf(zIsHapticsSupportedForCue), String.valueOf(this.f51448v), String.valueOf(((Boolean) readWriteProperty.getValue(this, kPropertyArr[0])).booleanValue())), "mContext.resources.getSt…ortedByDevice.toString())");
                    return;
                }
                i iVar = new i(onPrepareListener);
                if (this.f51447u == null) {
                    Context context6 = this.m;
                    if (context6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    } else {
                        context = context6;
                    }
                    this.f51447u = new HapticsManager(context, sonicAssetCreateSonicAsset);
                }
                HapticsManager hapticsManager = this.f51447u;
                Intrinsics.checkNotNull(hapticsManager);
                hapticsManager.prepare(new j(this, iVar), new k(this, iVar));
            } catch (Exception e5) {
                e5.getMessage();
                Status status = Status.ERROR;
                this.f51429b = status;
                this.f51428a = status;
                b(onPrepareListener);
            }
        } catch (Exception e7) {
            e7.getMessage();
            Status status2 = Status.ERROR;
            this.f51429b = status2;
            this.f51428a = status2;
            b(onPrepareListener);
        }
    }

    public final void i(SonicType sonicType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[sonicType.ordinal()];
        if (i10 == 1) {
            Status status = Status.NOT_READY;
            this.f51429b = status;
            this.f51428a = status;
        } else if (i10 == 2) {
            this.f51429b = Status.NOT_READY;
            this.f51428a = Status.NOT_REQUIRED;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f51429b = Status.NOT_REQUIRED;
            this.f51428a = Status.NOT_READY;
        }
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    public final void j(String str) {
        int iC;
        int i10;
        int i11;
        SonicType sonicType;
        SonicType sonicType2;
        String str2;
        String str3;
        Context context;
        MixPanelAnalyticsManager mixPanelAnalyticsManager;
        SharedPreferenceUtils sharedPreferenceUtils = this.f51437j;
        MixPanelAnalyticsManager mixPanelAnalyticsManager2 = null;
        if (sharedPreferenceUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferenceUtils");
            sharedPreferenceUtils = null;
        }
        if (sharedPreferenceUtils.isAnalyticsEnabled()) {
            int i12 = 905;
            if (800 == c() || 904 == c() || 908 == c()) {
                iC = c();
            } else {
                Status status = this.f51428a;
                Status status2 = Status.NOT_REQUIRED;
                if (status != status2 || this.f51429b != Status.ERROR) {
                    if (this.f51429b == status2 && status == Status.ERROR) {
                        iC = 906;
                    } else {
                        i10 = 905;
                    }
                    i11 = WhenMappings.$EnumSwitchMapping$1[this.f51430c.ordinal()];
                    if (i11 != 1) {
                        i12 = 800;
                    } else if (i11 == 2) {
                        i12 = StatusCode.ERROR_WHILE_PLAYING_HAPTICS;
                    }
                    TrackEvent.HapticsAnalytics hapticsAnalytics = new TrackEvent.HapticsAnalytics(this.f51448v, ((Boolean) this.f51444r.getValue(this, f51427w[0])).booleanValue(), i12);
                    sonicType = this.f51439l;
                    if (sonicType == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                        sonicType2 = null;
                    } else {
                        sonicType2 = sonicType;
                    }
                    str2 = this.f51440n;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCueName");
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    Utils.Companion companion = Utils.INSTANCE;
                    context = this.m;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context = null;
                    }
                    TrackEvent trackEvent = new TrackEvent(sonicType2, i10, hapticsAnalytics, str3, str, companion.volumeLevel(context));
                    mixPanelAnalyticsManager = this.f51438k;
                    if (mixPanelAnalyticsManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMixPanelAnalyticsManager");
                    } else {
                        mixPanelAnalyticsManager2 = mixPanelAnalyticsManager;
                    }
                    mixPanelAnalyticsManager2.trackEvent(trackEvent);
                }
                iC = StatusCode.ERROR_WHILE_PLAYING_ANIMATION;
            }
            i10 = iC;
            i11 = WhenMappings.$EnumSwitchMapping$1[this.f51430c.ordinal()];
            if (i11 != 1) {
                i12 = 800;
            } else if (i11 == 2) {
                i12 = StatusCode.ERROR_WHILE_PLAYING_HAPTICS;
            }
            TrackEvent.HapticsAnalytics hapticsAnalytics2 = new TrackEvent.HapticsAnalytics(this.f51448v, ((Boolean) this.f51444r.getValue(this, f51427w[0])).booleanValue(), i12);
            sonicType = this.f51439l;
            if (sonicType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                sonicType2 = null;
            } else {
                sonicType2 = sonicType;
            }
            str2 = this.f51440n;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCueName");
                str3 = null;
            } else {
                str3 = str2;
            }
            Utils.Companion companion2 = Utils.INSTANCE;
            context = this.m;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            TrackEvent trackEvent2 = new TrackEvent(sonicType2, i10, hapticsAnalytics2, str3, str, companion2.volumeLevel(context));
            mixPanelAnalyticsManager = this.f51438k;
            if (mixPanelAnalyticsManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMixPanelAnalyticsManager");
            } else {
                mixPanelAnalyticsManager2 = mixPanelAnalyticsManager;
            }
            mixPanelAnalyticsManager2.trackEvent(trackEvent2);
        }
    }

    @JvmOverloads
    public final void play(@NotNull OnCompleteListener onCompleteListener) throws JSONException {
        Intrinsics.checkNotNullParameter(onCompleteListener, "onCompleteListener");
        play$default(this, null, onCompleteListener, 1, null);
    }

    public final void prepare(@NotNull SonicType sonicType, @NotNull String sonicCue, @NotNull SonicEnvironment sonicEnvironment, @NotNull SonicMerchant merchant, boolean isHapticsEnabled, @NotNull Context context, @NotNull OnPrepareListener onPrepareListener) throws JSONException {
        Context context2;
        SonicMerchant sonicMerchant;
        String str;
        SonicEnvironment sonicEnvironment2;
        Status status;
        Status status2;
        Status status3;
        Intrinsics.checkNotNullParameter(sonicType, "sonicType");
        Intrinsics.checkNotNullParameter(sonicCue, "sonicCue");
        Intrinsics.checkNotNullParameter(sonicEnvironment, "sonicEnvironment");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onPrepareListener, "onPrepareListener");
        String strReplace = this.f51431d.replace(sonicCue, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = strReplace.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String str2 = this.f51440n;
        if (str2 != null && Intrinsics.areEqual(str2, lowerCase) && (((status = this.f51428a) == (status2 = Status.READY) || status == Status.NOT_REQUIRED) && ((status3 = this.f51429b) == status2 || status3 == Status.NOT_REQUIRED))) {
            onPrepareListener.onPrepared(StatusCode.SUCCESS);
            return;
        }
        this.f51439l = sonicType;
        this.m = context;
        this.f51441o = merchant;
        this.f51443q = sonicEnvironment;
        this.f51440n = sonicCue;
        this.f51448v = isHapticsEnabled;
        SonicMerchant sonicMerchant2 = null;
        if (sonicCue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCueName");
            sonicCue = null;
        }
        this.f51432e.setSonicCue(sonicCue);
        if (this.f51437j == null) {
            Context context3 = this.m;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context3 = null;
            }
            this.f51437j = new SharedPreferenceUtils(context3);
        }
        SonicType sonicType2 = this.f51439l;
        if (sonicType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
            sonicType2 = null;
        }
        i(sonicType2);
        Context context4 = this.m;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context4 = null;
        }
        this.f51436i = new SonicUpgradeManager(context4);
        h(onPrepareListener);
        SonicUpgradeManager sonicUpgradeManager = this.f51436i;
        if (sonicUpgradeManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
            sonicUpgradeManager = null;
        }
        sonicUpgradeManager.checkAndUpdateRemoteUpgrade$sonic_sdk_release(lowerCase, isHapticsEnabled);
        SharedPreferenceUtils sharedPreferenceUtils = this.f51437j;
        if (sharedPreferenceUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferenceUtils");
            sharedPreferenceUtils = null;
        }
        String str3 = this.f51440n;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCueName");
            str3 = null;
        }
        this.f51442p = sharedPreferenceUtils.getExistingAnimationVersion(str3);
        SharedPreferenceUtils sharedPreferenceUtils2 = this.f51437j;
        if (sharedPreferenceUtils2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferenceUtils");
            sharedPreferenceUtils2 = null;
        }
        if (sharedPreferenceUtils2.getDistinctId().length() == 0) {
            SharedPreferenceUtils sharedPreferenceUtils3 = this.f51437j;
            if (sharedPreferenceUtils3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSharedPreferenceUtils");
                sharedPreferenceUtils3 = null;
            }
            sharedPreferenceUtils3.setDistinctId();
        }
        MixPanelAnalyticsManager mixPanelAnalyticsManager = this.f51438k;
        if (mixPanelAnalyticsManager != null) {
            SonicMerchant sonicMerchant3 = this.f51441o;
            if (sonicMerchant3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSonicMerchantInfo");
            } else {
                sonicMerchant2 = sonicMerchant3;
            }
            mixPanelAnalyticsManager.setSonicMerchant(sonicMerchant2);
            return;
        }
        Context context5 = this.m;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        } else {
            context2 = context5;
        }
        SonicMerchant sonicMerchant4 = this.f51441o;
        if (sonicMerchant4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicMerchantInfo");
            sonicMerchant = null;
        } else {
            sonicMerchant = sonicMerchant4;
        }
        String str4 = this.f51440n;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCueName");
            str = null;
        } else {
            str = str4;
        }
        String str5 = this.f51442p;
        String str6 = str5 != null ? str5 : null;
        SonicEnvironment sonicEnvironment3 = this.f51443q;
        if (sonicEnvironment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicEnvironment");
            sonicEnvironment2 = null;
        } else {
            sonicEnvironment2 = sonicEnvironment3;
        }
        this.f51438k = new MixPanelAnalyticsManager(context2, sonicMerchant, str, str6, sonicEnvironment2);
    }

    @JvmOverloads
    public final void play(@Nullable final SonicView sonicView, @NotNull final OnCompleteListener onCompleteListener) throws JSONException {
        Intrinsics.checkNotNullParameter(onCompleteListener, "onCompleteListener");
        SonicUpgradeManager sonicUpgradeManager = this.f51436i;
        SonicUpgradeManager sonicUpgradeManager2 = null;
        if (sonicUpgradeManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
            sonicUpgradeManager = null;
        }
        if (sonicUpgradeManager.getRemoteUpgradeFound()) {
            SonicUpgradeManager sonicUpgradeManager3 = this.f51436i;
            if (sonicUpgradeManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
                sonicUpgradeManager3 = null;
            }
            if (sonicUpgradeManager3.getSonicAssetDownloadManager().getAssetDownloadCompleted()) {
                SonicType sonicType = this.f51439l;
                if (sonicType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSonicType");
                    sonicType = null;
                }
                i(sonicType);
                SonicUpgradeManager sonicUpgradeManager4 = this.f51436i;
                if (sonicUpgradeManager4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
                    sonicUpgradeManager4 = null;
                }
                sonicUpgradeManager4.getSonicAssetDownloadManager().setAssetDownloadCompleted$sonic_sdk_release(false);
                SonicUpgradeManager sonicUpgradeManager5 = this.f51436i;
                if (sonicUpgradeManager5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSonicUpgradeManager");
                } else {
                    sonicUpgradeManager2 = sonicUpgradeManager5;
                }
                sonicUpgradeManager2.setRemoteUpgradeFound(false);
                h(new OnPrepareListener() { // from class: com.mastercard.sonic.controller.SonicController.play.1
                    @Override // com.mastercard.sonic.listeners.OnPrepareListener
                    public void onPrepared(int statusCode) {
                        OnCompleteListener onCompleteListener2 = onCompleteListener;
                        SonicController sonicController = SonicController.this;
                        if (statusCode == 800 || statusCode == 801) {
                            sonicController.f(sonicView, onCompleteListener2);
                            return;
                        }
                        FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
                        Context context = sonicController.m;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mContext");
                            context = null;
                        }
                        fileDirUtils.clearStoredData$sonic_sdk_release(context);
                        onCompleteListener2.onComplete(905);
                    }
                });
                return;
            }
        }
        f(sonicView, onCompleteListener);
    }
}
