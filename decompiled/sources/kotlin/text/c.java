package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/c;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f82364a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Regex f82365b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
}
