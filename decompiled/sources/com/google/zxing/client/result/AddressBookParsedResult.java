package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class AddressBookParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f49702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f49703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f49705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f49706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f49707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f49708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f49711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f49712l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f49713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f49714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String[] f49715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f49716q;

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.f49712l;
    }

    public String[] getAddresses() {
        return this.f49711k;
    }

    public String getBirthday() {
        return this.f49713n;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f49702b, sb2);
        ParsedResult.maybeAppend(this.f49703c, sb2);
        ParsedResult.maybeAppend(this.f49704d, sb2);
        ParsedResult.maybeAppend(this.f49714o, sb2);
        ParsedResult.maybeAppend(this.m, sb2);
        ParsedResult.maybeAppend(this.f49711k, sb2);
        ParsedResult.maybeAppend(this.f49705e, sb2);
        ParsedResult.maybeAppend(this.f49707g, sb2);
        ParsedResult.maybeAppend(this.f49709i, sb2);
        ParsedResult.maybeAppend(this.f49715p, sb2);
        ParsedResult.maybeAppend(this.f49713n, sb2);
        ParsedResult.maybeAppend(this.f49716q, sb2);
        ParsedResult.maybeAppend(this.f49710j, sb2);
        return sb2.toString();
    }

    public String[] getEmailTypes() {
        return this.f49708h;
    }

    public String[] getEmails() {
        return this.f49707g;
    }

    public String[] getGeo() {
        return this.f49716q;
    }

    public String getInstantMessenger() {
        return this.f49709i;
    }

    public String[] getNames() {
        return this.f49702b;
    }

    public String[] getNicknames() {
        return this.f49703c;
    }

    public String getNote() {
        return this.f49710j;
    }

    public String getOrg() {
        return this.m;
    }

    public String[] getPhoneNumbers() {
        return this.f49705e;
    }

    public String[] getPhoneTypes() {
        return this.f49706f;
    }

    public String getPronunciation() {
        return this.f49704d;
    }

    public String getTitle() {
        return this.f49714o;
    }

    public String[] getURLs() {
        return this.f49715p;
    }

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
        this.f49702b = strArr;
        this.f49703c = strArr2;
        this.f49704d = str;
        this.f49705e = strArr3;
        this.f49706f = strArr4;
        this.f49707g = strArr5;
        this.f49708h = strArr6;
        this.f49709i = str2;
        this.f49710j = str3;
        this.f49711k = strArr7;
        this.f49712l = strArr8;
        this.m = str4;
        this.f49713n = str5;
        this.f49714o = str6;
        this.f49715p = strArr9;
        this.f49716q = strArr10;
    }
}
