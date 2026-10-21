package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final Pair access$firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        Object objLoadBlocking;
        Object objM5535constructorimpl;
        int size = list.size();
        List listMutableListOf = null;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = (Font) list.get(i10);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4054getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.f17925d) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17923b.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17924c.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objLoadBlocking = asyncTypefaceResult.m4028unboximpl();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                objLoadBlocking = platformFontLoader.loadBlocking(font);
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objLoadBlocking, false, 8, null);
                            } catch (Exception e5) {
                                throw new IllegalStateException("Unable to load font " + font, e5);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objLoadBlocking != null) {
                    return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m4081synthesizeTypefaceFxwP2eA(typefaceRequest.m4097getFontSynthesisGVVA2EU(), objLoadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4055getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.f17925d) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17923b.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17924c.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objM5535constructorimpl = asyncTypefaceResult2.m4028unboximpl();
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th3) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                            }
                            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                                objM5535constructorimpl = null;
                            }
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objM5535constructorimpl, false, 8, null);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objM5535constructorimpl != null) {
                    return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m4081synthesizeTypefaceFxwP2eA(typefaceRequest.m4097getFontSynthesisGVVA2EU(), objM5535constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4053getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM4020get1ASDuI8 = asyncTypefaceCache.m4020get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM4020get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m4026isPermanentFailureimpl(asyncTypefaceResultM4020get1ASDuI8.m4028unboximpl()) && asyncTypefaceResultM4020get1ASDuI8.m4028unboximpl() != null) {
                        return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m4081synthesizeTypefaceFxwP2eA(typefaceRequest.m4097getFontSynthesisGVVA2EU(), asyncTypefaceResultM4020get1ASDuI8.m4028unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(font);
                } else {
                    listMutableListOf.add(font);
                }
            }
        }
        return TuplesKt.to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
