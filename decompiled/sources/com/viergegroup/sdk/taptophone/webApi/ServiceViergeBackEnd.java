package com.viergegroup.sdk.taptophone.webApi;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: loaded from: classes7.dex */
public class ServiceViergeBackEnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f67983a = "https://switchvg.viergegroup.com/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Retrofit f67984b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f67985c = "";

    public class a implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().addHeader("Authorization", ServiceViergeBackEnd.f67985c).build());
        }
    }

    public static Retrofit getRetrofitInstance(int i10) {
        f67983a = "https://switchvgprod.viergegroup.com";
        if (f67984b == null) {
            synchronized (ServiceViergeBackEnd.class) {
                try {
                    if (f67984b == null) {
                        try {
                            OkHttpClient.Builder builder = new OkHttpClient.Builder();
                            builder.addInterceptor(new a());
                            if (i10 == 1) {
                                f67984b = new Retrofit.Builder().baseUrl(f67983a).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(builder.build()).build();
                            } else {
                                f67984b = new Retrofit.Builder().baseUrl(f67983a).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build();
                            }
                        } catch (IllegalArgumentException e5) {
                            throw e5;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67984b;
    }

    public static void setToken(String str) {
        f67985c = str;
    }
}
