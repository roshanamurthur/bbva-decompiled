package uk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScopesHolderForClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function0<MemberScope> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScopesHolderForClass<MemberScope> f93877p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ScopesHolderForClass<MemberScope> scopesHolderForClass) {
        super(0);
        this.f93877p0 = scopesHolderForClass;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MemberScope invoke() {
        ScopesHolderForClass<MemberScope> scopesHolderForClass = this.f93877p0;
        return (MemberScope) scopesHolderForClass.f80228b.invoke(scopesHolderForClass.f80229c);
    }
}
