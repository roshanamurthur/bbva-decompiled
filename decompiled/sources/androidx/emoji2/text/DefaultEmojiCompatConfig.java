package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultEmojiCompatConfig {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultEmojiCompatConfigHelper f21240a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public DefaultEmojiCompatConfigFactory(@Nullable DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper) {
            this.f21240a = defaultEmojiCompatConfigHelper == null ? Build.VERSION.SDK_INT >= 28 ? new DefaultEmojiCompatConfigHelper_API28() : new DefaultEmojiCompatConfigHelper_API19() : defaultEmojiCompatConfigHelper;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public EmojiCompat.Config create(@NonNull Context context) {
            ProviderInfo providerInfo;
            FontRequest fontRequest;
            ApplicationInfo applicationInfo;
            PackageManager packageManager = context.getPackageManager();
            Preconditions.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
            Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
            DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper = this.f21240a;
            Iterator<ResolveInfo> it = defaultEmojiCompatConfigHelper.queryIntentContentProviders(packageManager, intent, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    providerInfo = null;
                    break;
                }
                providerInfo = defaultEmojiCompatConfigHelper.getProviderInfo(it.next());
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            }
            if (providerInfo == null) {
                fontRequest = null;
            } else {
                try {
                    String str = providerInfo.authority;
                    String str2 = providerInfo.packageName;
                    Signature[] signingSignatures = defaultEmojiCompatConfigHelper.getSigningSignatures(packageManager, str2);
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signingSignatures) {
                        arrayList.add(signature.toByteArray());
                    }
                    fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                    fontRequest = null;
                }
            }
            if (fontRequest == null) {
                return null;
            }
            return new FontRequestEmojiCompatConfig(context, fontRequest);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper {
        @Nullable
        public ProviderInfo getProviderInfo(@NonNull ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        public Signature[] getSigningSignatures(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        public List<ResolveInfo> queryIntentContentProviders(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @Nullable
        public ProviderInfo getProviderInfo(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @NonNull
        public List<ResolveInfo> queryIntentContentProviders(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @NonNull
        public Signature[] getSigningSignatures(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @Nullable
    public static FontRequestEmojiCompatConfig create(@NonNull Context context) {
        return (FontRequestEmojiCompatConfig) new DefaultEmojiCompatConfigFactory(null).create(context);
    }
}
