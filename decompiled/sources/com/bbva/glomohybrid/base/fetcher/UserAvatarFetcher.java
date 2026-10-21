package com.bbva.glomohybrid.base.fetcher;

import android.graphics.Bitmap;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomoutils.BitmapExtensionsKt;
import com.bbva.glomoutils.network.ImageFetcher;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserAvatarFetcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/base/fetcher/UserAvatarFetcher;", "", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "config", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "get", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "host", "Lcom/bbva/glomoutils/network/ImageFetcher;", "imageFetcher", "<init>", "(Ljava/lang/String;Lcom/bbva/glomoutils/network/ImageFetcher;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class UserAvatarFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f31309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ImageFetcher f31310b;

    /* JADX INFO: compiled from: UserAvatarFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher", f = "UserAvatarFetcher.kt", i = {}, l = {20}, m = "get", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f31311p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f31313r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31311p0 = obj;
            this.f31313r0 |= Integer.MIN_VALUE;
            return UserAvatarFetcher.this.get(null, null, this);
        }
    }

    public UserAvatarFetcher(@NotNull String host, @NotNull ImageFetcher imageFetcher) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(imageFetcher, "imageFetcher");
        this.f31309a = host;
        this.f31310b = imageFetcher;
    }

    public final Object a(LandingConfiguration landingConfiguration, Continuation<? super Bitmap> continuation) {
        String avatar = landingConfiguration.getAvatar();
        if (avatar == null) {
            return null;
        }
        Object objFetch = this.f31310b.fetch(this.f31309a + avatar, continuation);
        return objFetch == ek.a.getCOROUTINE_SUSPENDED() ? objFetch : (Bitmap) objFetch;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object get(@NotNull UserProfileConfiguration userProfileConfiguration, @Nullable LandingConfiguration landingConfiguration, @NotNull Continuation<? super UserAvatarModel> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31313r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31313r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f31311p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31313r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            if (userProfileConfiguration.getRememberedUser() == null || landingConfiguration == null) {
                return null;
            }
            aVar.f31313r0 = 1;
            objA = a(landingConfiguration, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        Bitmap bitmap = (Bitmap) objA;
        return new UserAvatarModel(bitmap, BitmapExtensionsKt.base64(bitmap));
    }
}
