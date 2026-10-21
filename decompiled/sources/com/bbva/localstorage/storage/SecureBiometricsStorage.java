package com.bbva.localstorage.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.camera2.internal.compat.u;
import androidx.fragment.app.FragmentActivity;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.PlatformCipherProvider;
import com.bbva.ethermobilesdk.cipher.biometrics.BiometricsCipher;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.localstorage.backup.NoBackupProperties;
import com.bbva.localstorage.exception.SecureBiometricStorageException;
import com.bbva.localstorage.extension.AuthenticateResultKt;
import com.bbva.localstorage.extension.ExceptionKt;
import com.bbva.localstorage.extension.ThrowableKt;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.localstorage.model.BiometricsStorageData;
import com.bbva.localstorage.model.SecureKeyOperation;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.io.File;
import java.security.KeyStore;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureBiometricsStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\f\u0012\b\b\u0002\u00105\u001a\u00020\f¢\u0006\u0004\b6\u00107J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\rJ1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000fJ1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0011J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0012J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016J'\u0010!\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J+\u00102\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b1\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/bbva/localstorage/storage/SecureBiometricsStorage;", "Lcom/bbva/localstorage/storage/StorageSecure;", "", "key", "", "value", "Lcom/bbva/localstorage/model/BiometricsStorageData;", "biometricsStorageData", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", SetCommand.ID, "(Ljava/lang/String;ILcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;ZLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;JLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;FLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "(Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInt", "getBoolean", "getLong", "getFloat", "", "keys", RemoveCommand.ID, "secureKey", "removeAlias", "handleBackup$local_storage_release", "()V", "handleBackup", "isSecureHardware", "Landroid/content/Context;", "context", "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", Constants.authenticationType, "isBiometricAvailable", "Lcom/bbva/ethermobilesdk/cipher/biometrics/BiometricsCipher;", "biometricsCipher", "isSecureHardware$local_storage_release", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/cipher/biometrics/BiometricsCipher;Lcom/bbva/biometrics/authenticator/data/AuthenticationType;)Z", "data", "textToProtect", "protectWithSecureKey$local_storage_release", "(Lcom/bbva/ethermobilesdk/cipher/biometrics/BiometricsCipher;Lcom/bbva/localstorage/model/BiometricsStorageData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "protectWithSecureKey", "textToUnprotect", "unprotectWithSecureKey$local_storage_release", "unprotectWithSecureKey", "fileName", "ignoreBackup", "syncChanges", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSecureBiometricsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecureBiometricsStorage.kt\ncom/bbva/localstorage/storage/SecureBiometricsStorage\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,358:1\n43#2,8:359\n43#2,8:367\n43#2,8:375\n43#2,8:383\n*S KotlinDebug\n*F\n+ 1 SecureBiometricsStorage.kt\ncom/bbva/localstorage/storage/SecureBiometricsStorage\n*L\n83#1:359,8\n139#1:367,8\n239#1:375,8\n258#1:383,8\n*E\n"})
public final class SecureBiometricsStorage implements StorageSecure {

    @Deprecated
    @NotNull
    public static final String REQUIRE_PREFS_INIT = "SharedPreferences must be initialized correctly";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f35016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NoBackupProperties f35017d;

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {200}, m = "getBoolean", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35018p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35020r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35018p0 = obj;
            this.f35020r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.getBoolean(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {222}, m = "getFloat", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35021p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35023r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35021p0 = obj;
            this.f35023r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.getFloat(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {189}, m = "getInt", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35024p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35026r0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35024p0 = obj;
            this.f35026r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.getInt(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {211}, m = "getLong", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35027p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35029r0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35027p0 = obj;
            this.f35029r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.getLong(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {174}, m = "getString", n = {}, s = {})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35030p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35032r0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35030p0 = obj;
            this.f35032r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.getString(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {334}, m = "protectWithSecureKey$local_storage_release", n = {}, s = {})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35033p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35035r0;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35033p0 = obj;
            this.f35035r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.protectWithSecureKey$local_storage_release(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {0, 0}, l = {138}, m = SetCommand.ID, n = {"key", "$this$set_u24lambda_u246"}, s = {"L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f35036p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SecureBiometricsStorage f35037q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f35038r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f35040t0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35038r0 = obj;
            this.f35040t0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.set((String) null, (String) null, (BiometricsStorageData) null, this);
        }
    }

    /* JADX INFO: compiled from: SecureBiometricsStorage.kt */
    @DebugMetadata(c = "com.bbva.localstorage.storage.SecureBiometricsStorage", f = "SecureBiometricsStorage.kt", i = {}, l = {347}, m = "unprotectWithSecureKey$local_storage_release", n = {}, s = {})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35041p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f35043r0;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35041p0 = obj;
            this.f35043r0 |= Integer.MIN_VALUE;
            return SecureBiometricsStorage.this.unprotectWithSecureKey$local_storage_release(null, null, null, this);
        }
    }

    public SecureBiometricsStorage(@NotNull Context context, @NotNull String fileName, boolean z10, boolean z11) throws Exception {
        SharedPreferences sharedPreferencesCreate;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f35014a = z10;
        this.f35015b = z11;
        this.f35017d = new NoBackupProperties(context, fileName);
        LoggerKt.log("Init secure biometrics storage");
        try {
            sharedPreferencesCreate = EncryptedSharedPreferences.create(fileName, MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC), context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(\n            file…heme.AES256_GCM\n        )");
        } catch (Exception e5) {
            if (!ExceptionKt.canRecover(e5)) {
                throw e5;
            }
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            keyStore.load(null);
            KeyGenParameterSpec keyGenParameterSpec = MasterKeys.AES256_GCM_SPEC;
            keyStore.deleteEntry(keyGenParameterSpec.getKeystoreAlias());
            if (Build.VERSION.SDK_INT >= 24) {
                context.deleteSharedPreferences(fileName);
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(fileName, MODE_PRIVATE)");
                SharedPreferences.Editor editor = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.clear();
                if (this.f35015b) {
                    editor.commit();
                } else {
                    editor.apply();
                }
                new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), u.f(fileName, ".xml")).delete();
            }
            sharedPreferencesCreate = EncryptedSharedPreferences.create(fileName, MasterKeys.getOrCreate(keyGenParameterSpec), context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(\n            file…heme.AES256_GCM\n        )");
        }
        this.f35016c = sharedPreferencesCreate;
    }

    public final boolean a() {
        SharedPreferences sharedPreferences = this.f35016c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getAll().isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object getBoolean(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Boolean>> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f35020r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35020r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object string = aVar.f35018p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f35020r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(string);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                aVar.f35020r0 = 1;
                string = getString(str, biometricsStorageData, aVar);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(string);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boxing.boxBoolean(Boolean.parseBoolean((String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) string)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object getFloat(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Float>> continuation) {
        b bVar;
        Object objM5535constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f35023r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f35023r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object string = bVar.f35021p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f35023r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(string);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                bVar.f35023r0 = 1;
                string = getString(str, biometricsStorageData, bVar);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(string);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boxing.boxFloat(Float.parseFloat((String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) string)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object getInt(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Integer>> continuation) {
        c cVar;
        Object objM5535constructorimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f35026r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f35026r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object string = cVar.f35024p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f35026r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(string);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cVar.f35026r0 = 1;
                string = getString(str, biometricsStorageData, cVar);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(string);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boxing.boxInt(Integer.parseInt((String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) string)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object getLong(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Long>> continuation) {
        d dVar;
        Object objM5535constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f35029r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f35029r0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object string = dVar.f35027p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f35029r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(string);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                dVar.f35029r0 = 1;
                string = getString(str, biometricsStorageData, dVar);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(string);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boxing.boxLong(Long.parseLong((String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) string)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object getString(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<String>> continuation) {
        e eVar;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        Object error;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f35032r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f35032r0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objUnprotectWithSecureKey$local_storage_release = eVar.f35030p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f35032r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objUnprotectWithSecureKey$local_storage_release);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                if (this.f35016c == null) {
                    throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
                }
                handleBackup$local_storage_release();
                BiometricsCipher biometricsCipher = new BiometricsCipher(biometricsStorageData.getBiometrics(), new AndroidKeyStoreProvider(biometricsStorageData.getInvalidateAliasByBiometricEnrollment()));
                SharedPreferences sharedPreferences = this.f35016c;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("preferences");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(str, "2147483647");
                if (string != null && string.length() != 0 && !Intrinsics.areEqual(string, "2147483647")) {
                    Context applicationContext = biometricsStorageData.getActivity().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                    if (isSecureHardware$local_storage_release(applicationContext, biometricsCipher, biometricsStorageData.getAuthenticationType())) {
                        eVar.f35032r0 = 1;
                        objUnprotectWithSecureKey$local_storage_release = unprotectWithSecureKey$local_storage_release(biometricsCipher, biometricsStorageData, string, eVar);
                        if (objUnprotectWithSecureKey$local_storage_release == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        error = new Result.Error(new SecureBiometricStorageException.UnsecuredHardware(null, 1, null));
                    }
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(error);
                    thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl == null) {
                        return objM5535constructorimpl;
                    }
                    return new Result.Error(thM5538exceptionOrNullimpl);
                }
                return new Result.Error(new SecureBiometricStorageException.SecureDataStorageNotFound(null, 1, null));
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnprotectWithSecureKey$local_storage_release);
            error = new Result.Success((String) objUnprotectWithSecureKey$local_storage_release);
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(error);
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        return new Result.Error(thM5538exceptionOrNullimpl);
    }

    public final void handleBackup$local_storage_release() {
        if (this.f35014a) {
            NoBackupProperties noBackupProperties = this.f35017d;
            if (!noBackupProperties.isEmpty() || a()) {
                if (a()) {
                    noBackupProperties.reset();
                    return;
                }
                return;
            }
            SharedPreferences sharedPreferences = this.f35016c;
            if (sharedPreferences == null) {
                throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.clear();
            if (this.f35015b) {
                editor.commit();
            } else {
                editor.apply();
            }
            noBackupProperties.reset();
        }
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @NotNull
    public Result<Boolean> isBiometricAvailable(@NotNull Context context, @NotNull AuthenticationType authenticationType) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(AuthenticateResultKt.toResult(new Biometrics.Builder().build().canAuthenticate(context, authenticationType)));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @NotNull
    public Result<Boolean> isSecureHardware() {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(CipherResultKt.getOrThrow(new BiometricsCipher(new Biometrics.Builder().build(), (PlatformCipherProvider) null, 2, (DefaultConstructorMarker) null).isSecureHardware())));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    public final boolean isSecureHardware$local_storage_release(@NotNull Context context, @NotNull BiometricsCipher biometricsCipher, @NotNull AuthenticationType authenticationType) throws SecureBiometricStorageException.UnsecuredHardware {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biometricsCipher, "biometricsCipher");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(Boolean.valueOf(((Boolean) CipherResultKt.getOrThrow(biometricsCipher.isAvailable(context, authenticationType))).booleanValue() && ((Boolean) CipherResultKt.getOrThrow(biometricsCipher.isSecureHardware())).booleanValue()));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return ((Boolean) objM5535constructorimpl).booleanValue();
        }
        throw new SecureBiometricStorageException.UnsecuredHardware(thM5538exceptionOrNullimpl);
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @NotNull
    public Set<String> keys() {
        SharedPreferences sharedPreferences = this.f35016c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getAll().keySet();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object protectWithSecureKey$local_storage_release(@NotNull BiometricsCipher biometricsCipher, @NotNull BiometricsStorageData biometricsStorageData, @NotNull String str, @NotNull Continuation<? super String> continuation) throws Exception {
        f fVar;
        Object objM5535constructorimpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f35035r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f35035r0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objEncrypt = fVar2.f35033p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar2.f35035r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objEncrypt);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                FragmentActivity activity = biometricsStorageData.getActivity();
                AuthenticationType authenticationType = biometricsStorageData.getAuthenticationType();
                String aliasSecureKey = biometricsStorageData.getAliasSecureKey();
                fVar2.f35035r0 = 1;
                objEncrypt = biometricsCipher.encrypt(activity, str, authenticationType, aliasSecureKey, fVar2);
                if (objEncrypt == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEncrypt);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl((String) CipherResultKt.getOrThrow((CipherResult) objEncrypt));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        ThrowableKt.throwError(thM5538exceptionOrNullimpl, SecureKeyOperation.PROTECT);
        throw new KotlinNothingValueException();
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = this.f35016c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(key);
        if (this.f35015b) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @NotNull
    public Result<Unit> removeAlias(@NotNull String secureKey) {
        Intrinsics.checkNotNullParameter(secureKey, "secureKey");
        CipherResult cipherResultRemoveAlias = new BiometricsCipher(new Biometrics.Builder().build(), (PlatformCipherProvider) null, 2, (DefaultConstructorMarker) null).removeAlias(secureKey);
        if (cipherResultRemoveAlias instanceof CipherResult.Success) {
            return new Result.Success(Unit.INSTANCE);
        }
        if (cipherResultRemoveAlias instanceof CipherResult.Error) {
            return new Result.Error(((CipherResult.Error) cipherResultRemoveAlias).getException());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object set(@NotNull String str, int i10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation) {
        return set(str, String.valueOf(i10), biometricsStorageData, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object unprotectWithSecureKey$local_storage_release(@NotNull BiometricsCipher biometricsCipher, @NotNull BiometricsStorageData biometricsStorageData, @NotNull String str, @NotNull Continuation<? super String> continuation) throws Exception {
        h hVar;
        Object objM5535constructorimpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f35043r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f35043r0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        h hVar2 = hVar;
        Object objDecrypt = hVar2.f35041p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar2.f35043r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objDecrypt);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                FragmentActivity activity = biometricsStorageData.getActivity();
                AuthenticationType authenticationType = biometricsStorageData.getAuthenticationType();
                String aliasSecureKey = biometricsStorageData.getAliasSecureKey();
                hVar2.f35043r0 = 1;
                objDecrypt = biometricsCipher.decrypt(activity, str, authenticationType, aliasSecureKey, hVar2);
                if (objDecrypt == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDecrypt);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl((String) CipherResultKt.getOrThrow((CipherResult) objDecrypt));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        ThrowableKt.throwError(thM5538exceptionOrNullimpl, SecureKeyOperation.UNPROTECT);
        throw new KotlinNothingValueException();
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object set(@NotNull String str, boolean z10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation) {
        return set(str, String.valueOf(z10), biometricsStorageData, continuation);
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object set(@NotNull String str, long j10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation) {
        return set(str, String.valueOf(j10), biometricsStorageData, continuation);
    }

    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object set(@NotNull String str, float f6, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation) {
        return set(str, String.valueOf(f6), biometricsStorageData, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.localstorage.storage.StorageSecure
    @Nullable
    public Object set(@NotNull String str, @Nullable String str2, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation) {
        g gVar;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        Object error;
        String str3;
        SecureBiometricsStorage secureBiometricsStorage;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f35040t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f35040t0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objProtectWithSecureKey$local_storage_release = gVar.f35038r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f35040t0;
        SharedPreferences sharedPreferences = null;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objProtectWithSecureKey$local_storage_release);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                if (this.f35016c != null) {
                    handleBackup$local_storage_release();
                    if (str2 != null && str2.length() != 0) {
                        BiometricsCipher biometricsCipher = new BiometricsCipher(biometricsStorageData.getBiometrics(), new AndroidKeyStoreProvider(biometricsStorageData.getInvalidateAliasByBiometricEnrollment()));
                        Context applicationContext = biometricsStorageData.getActivity().getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                        if (isSecureHardware$local_storage_release(applicationContext, biometricsCipher, biometricsStorageData.getAuthenticationType())) {
                            gVar.f35036p0 = str;
                            gVar.f35037q0 = this;
                            gVar.f35040t0 = 1;
                            objProtectWithSecureKey$local_storage_release = protectWithSecureKey$local_storage_release(biometricsCipher, biometricsStorageData, str2, gVar);
                            if (objProtectWithSecureKey$local_storage_release == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str3 = str;
                            secureBiometricsStorage = this;
                        } else {
                            error = new Result.Error(new SecureBiometricStorageException.UnsecuredHardware(null, 1, null));
                        }
                    } else {
                        error = new Result.Error(new SecureBiometricStorageException.InvalidSecureDataStorage(null, 1, null));
                    }
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(error);
                    thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl == null) {
                        return objM5535constructorimpl;
                    }
                    return new Result.Error(thM5538exceptionOrNullimpl);
                }
                throw new IllegalArgumentException(REQUIRE_PREFS_INIT.toString());
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            secureBiometricsStorage = gVar.f35037q0;
            str3 = gVar.f35036p0;
            ResultKt.throwOnFailure(objProtectWithSecureKey$local_storage_release);
            String str4 = (String) objProtectWithSecureKey$local_storage_release;
            SharedPreferences sharedPreferences2 = secureBiometricsStorage.f35016c;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            boolean z10 = secureBiometricsStorage.f35015b;
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(str3, str4);
            if (z10) {
                editor.commit();
            } else {
                editor.apply();
            }
            error = new Result.Success(Unit.INSTANCE);
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(error);
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        return new Result.Error(thM5538exceptionOrNullimpl);
    }

    public /* synthetic */ SecureBiometricsStorage(Context context, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "secure.storage.irl" : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }
}
